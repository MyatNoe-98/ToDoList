<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
 <%@ page import="java.sql.*" %>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="ISO-8859-1">
        <title>My To Do List</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
    </head>

    <body style="background-color:#f0f8ff">
 <% String id=request.getParameter("id");
 try{   
	    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ucsmub", "root","root123");
	    Statement statement = connection.createStatement();
	    String sql="select * from  ucsmub.todo where id=\""+id+"\"";
	    System.out.println(sql);
		ResultSet rs = statement.executeQuery(sql);
		if(rs.next()) {
			
	    
%>
        
        <div class="container col-md-8 col-md-offset-3" style="overflow: auto">
            <h2 style="color:#19334d" align="justify" >Edit To Do</h2>
            <form action="<%=request.getContextPath()%>/edit" method="post">
                <div class="form-group">
                     <input type="hidden" name="id" value="<%=request.getParameter("id") %>">
                </div>
                <div class="form-group">
                    <label for="uname">Title:</label> <input type="text" class="form-control" id="title" value="<%=rs.getString("title") %>" name="title" required>
                </div>

                <div class="form-group">
                    <label for="uname">Date:</label> <input type="text" class="form-control" id="date" value="<%=rs.getString("date") %>" name="date" required>
                </div>
                <div class="form-group">
                    <label>Todo Status</label> 
                    <select class="form-control" name="isDone">
                    <option value="1">In Progress</option>
      				<option value="0">Complete</option>
     				</select>
                </div>
<%}
		rs.close();
 }catch (Exception e) {
	 e.printStackTrace();
       }%>
                <button type="submit" class="btn btn-primary">Save</button>
            </form>
        </div>
        
    </body>

    </html>
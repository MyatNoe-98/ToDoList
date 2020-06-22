<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My To do List</title>
<style>
table{
boder-collapse:collapse;
width:100%;
}
th,td{
text-align:left;
padding:8px;
}
tr:nth-child(even){background-color:#f2f2f2;}
th{background-color:#b0e0e6;
color:#19334d;}
</style>
</head>
<body >
<header>
  
   <div>
    <h2 style="color:#19334d" align="justify" >To Do List</h2>
   </div>

  </nav>
 </header>

   <hr>
   <div style="float:right">
   <a href="<%=request.getContextPath()%>/index.jsp"
     class="nav-link">Logout</a>
     </div>
   <div class="container text-left">

    <a href="<%=request.getContextPath()%>/new.jsp"
     class="btn btn-success"">Add Todo</a>
   </div>
   <br>
   <%try{    
	    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ucsmub", "root","root123");
	    Statement statement = connection.createStatement();
	    ResultSet rs = statement.executeQuery("select * from todo ");
       
%>
   <table class="table table-bordered">
   
    <thead>
     <tr>
      <th>Title</th>
      <th>Target Date</th>
      <th>Todo Status</th>
      <th>Actions</th>
     </tr>
    </thead>
    <tbody>
   <%while (rs.next()) { %> 
   <tr><td><%=rs.getString("title") %></td>
       <td><%=rs.getString("date") %></td>
        <td> 
           <select class="form-control" name="isDone">
           <option value="1">In Progress</option>
		   <option value="0">Complete</option>
     	   </select></td>
         <td><a href="<%=request.getContextPath()%>/edit.jsp?id=<%=rs.getString("id") %>">Edit</a>
        &nbsp;&nbsp;&nbsp;&nbsp; 
        <a href="<%=request.getContextPath()%>/delete.jsp?id=<%=rs.getString("id") %>">Delete</a></td>
   </tr>
 <%} 
 rs.close();
 }catch (Exception e) {
	 e.printStackTrace();
       }%>
</tbody>
</table>
</body>
</html>
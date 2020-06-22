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
      <% String id=request.getParameter("id");%>
          <div class="container col-md-8 col-md-offset-3" style="overflow: auto">
            <h2 style="color:#19334d" align="justify" >Delete 1 item now?</h2>
            <form action="<%=request.getContextPath()%>/delete" method="post">
                <div class="form-group">
                     <input type="hidden" name="id" value="<%=request.getParameter("id") %>">
                </div>
                <button type="submit" class="btn btn-primary">Delete</button>
                <a href="todolist.jsp"
     class="btn btn-success">Cancel</a>
                </form>
                
                </div>
   </body>
</html>
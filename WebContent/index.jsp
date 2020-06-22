<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="ISO-8859-1">
        <title>My To do list</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
        </head>

    <body style="background-color:#f0f8ff">

        
        <div class="container col-md-8 col-md-offset-3" style="overflow: auto" align="center">
            <h1 style="color:#2d5986">Login Form</h1>
            <form action="<%=request.getContextPath()%>/login" method="post">

                <div class="form-group">
                    <label for="uname" >User Name:   </label> <input type="text" class="form-control" id="username" placeholder="User Name" name="username" required>
                </div><br>

                <div class="form-group">
                    <label for="uname">Password:   </label> <input type="password" class="form-control" id="password" placeholder="Password" name="password" required>
                </div><br>
  

                <button style="background-color:lightblue" type="submit" class="btn btn-primary">Login</button>
            </form>
        </div>
        
    </body>

    </html>
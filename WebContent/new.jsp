<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="ISO-8859-1">
        <title>My To Do List</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    </head>

    <body style="background-color:#f0f8ff">

        
        <div class="container col-md-8 col-md-offset-3" style="overflow: auto">
            <h2 style="color:#19334d" align="justify" >Add New Todo</h2>
            <form action="<%=request.getContextPath()%>/new" method="post">

                <div class="form-group">
                    <label for="uname">Title:</label> <input type="text" class="form-control" id="title" placeholder="Title..." name="title" required>
                </div>

                <div class="form-group">
                    <label for="uname">Date:</label> <input type="text" class="form-control" id="date" placeholder="yyyy/mm/dd" name="date" required>
                </div>
                <div class="form-group">
                    <label>Todo Status</label> 
                    <select class="form-control" name="isDone">
                    <option value="1">In Progress</option>
      				<option value="0">Complete</option>
     				</select>
                </div>

                <button type="submit" class="btn btn-primary">Save</button>
            </form>
        </div>
        
    </body>

    </html>
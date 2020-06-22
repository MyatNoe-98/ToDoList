package net.javaguides.todoapp.web;

import java.io.IOException;



import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.javaguides.todoapp.dao.EditDao;


@WebServlet("/edit")
public class EditController extends HttpServlet{
	private EditDao editDao;

    public void init() {
    	editDao = new EditDao();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    	System.out.println("hello");
        response.sendRedirect("index.jsp");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    	
	        try {
	        	System.out.println("hello");
	        	String id = request.getParameter("id");
	        	String title = request.getParameter("title");
			        String date = request.getParameter("date");
			        String status = request.getParameter("isDone");
			        editDao.setId(id);
			        editDao.setTitle(title);
			        editDao.setDate(date);
			        editDao.setStatus(status);
			        editDao.save();
	            	System.out.println(request.getContextPath());
	                RequestDispatcher dispatcher = request.getRequestDispatcher("/todolist.jsp");
	                dispatcher.forward(request, response);
	            
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
    }
  
}


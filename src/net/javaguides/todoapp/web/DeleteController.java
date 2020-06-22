package net.javaguides.todoapp.web;
import java.io.IOException;



import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.javaguides.todoapp.dao.DeleteDao;
@WebServlet("/delete")
public class DeleteController extends HttpServlet{
	

		private DeleteDao deleteDao;

	    public void init() {
	    	deleteDao = new DeleteDao();
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
		        	deleteDao.setId(id);
		        	 deleteDao.save();
		            System.out.println(request.getContextPath());
		            RequestDispatcher dispatcher = request.getRequestDispatcher("/todolist.jsp");
		             dispatcher.forward(request, response);
		            
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
	    }
	  
	}



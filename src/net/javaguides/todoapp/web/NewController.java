package net.javaguides.todoapp.web;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.javaguides.todoapp.dao.NewDao;


@WebServlet("/new")

public class NewController extends HttpServlet{
	
	  //  private static final long serialVersionUID = 1 L; 
	    private NewDao newDao;

	    public void init() {
	    	newDao = new NewDao();
	    }

	    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	    	System.out.println("hello");
	        response.sendRedirect("index.jsp");
	    }

	    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	    	//newDao.save();
		     //   String title = request.getParameter("title");
		    //    String date = request.getParameter("date");
		    //    String status = request.getParameter("isDone");
		    //    NewDao newDao = new NewDao();
		     //   newDao.setTitle(title);
		     //   newDao.setDate(date);
		      //  newDao.setStatus(status);
		        try {
		        	System.out.println("hello");
		        	String title = request.getParameter("title");
				        String date = request.getParameter("date");
				        String status = request.getParameter("isDone");
				       
				        newDao.setTitle(title);
				        newDao.setDate(date);
				        newDao.setStatus(status);
		        	newDao.save();
		            	System.out.println(request.getContextPath());
		                RequestDispatcher dispatcher = request.getRequestDispatcher("/todolist.jsp");
		                dispatcher.forward(request, response);
		            
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
	    }
}
	    

	    
	




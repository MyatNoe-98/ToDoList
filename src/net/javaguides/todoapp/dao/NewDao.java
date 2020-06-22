package net.javaguides.todoapp.dao;
import java.sql.*;
import java.io.Serializable;

public class NewDao {
	
	
	
		    private String title;
		    private String date;
		    private String status;

		    public String getTitle() {
		        return title;
		    }

		    public void setTitle(String title) {
		        this.title = title;
		    }
		    
		    public String getDate() {
		        return date;
		    }

		    public void setDate(String date) {
		        this.date = date;
		    }
		    public String getStatus() {
		        return status;
		    }

		    public void setStatus(String status) {
		        this.status = status;
		    }
		

	    public void save() throws ClassNotFoundException, SQLException {
	       // boolean status = false;
	        System.out.println("i m new.");
	        
	       
	        try { 
	        		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ucsmub", "root","root123");
	        		Statement statement = connection.createStatement();
	        		String sql="insert into ucsmub.todo (title,date,isdone) values (\""+this.getTitle()+"\",\""+this.getDate()+"\",\""+this.getStatus()+"\")";
	        		    	System.out.println(sql);
	        		int result = statement.executeUpdate(sql);
	        		if (result!=0) {
			    		System.out.println("success");
			    	}
			    	
			    	
		    		
		    	}catch(Exception exp) {
		    		System.out.println(exp.getMessage());
		    		if (exp.getClass().getName()=="java.sql.SQLIntegrityConstraintViolationException") {
		    			System.out.println("unsuccessful");
		    		}  		
	    	    }
	      //  return status;
	    }
	}



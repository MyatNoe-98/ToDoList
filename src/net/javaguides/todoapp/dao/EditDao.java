package net.javaguides.todoapp.dao;
import java.sql.*;

import java.io.Serializable;

public class EditDao {
	
	
	        
		    private String title;
		    private String date;
		    private String status;
		    private String id;
		    public String getId() {
		        return id;
		    }

		    public void setId(String id) {
		        this.id = id;
		    }
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
	        System.out.println("i m update.");
	       
	       
	        try { 
	        		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ucsmub", "root","root123");
	        		Statement statement = connection.createStatement();
			    	String sql="update ucsmub.todo set title=\""+this.getTitle()+"\",date=\""+this.getDate()+"\",isdone=\""+this.getStatus()+"\"where id="+id+"";
			    	System.out.println(sql);
			    	int result=statement.executeUpdate(sql); 
			    	if (result!=0) {
			    		System.out.println("success");
			    	}
			    	
		    		
		    	}catch(Exception exp) {
		    		System.out.println(exp.getMessage());
		    	}	    	
		    }   


	    }
	



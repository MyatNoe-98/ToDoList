package net.javaguides.todoapp.dao;
import java.sql.*;

import java.io.Serializable;
public class DeleteDao {
	
		
		
        
	    
	    private String id;
	    public String getId() {
	        return id;
	    }

	    public void setId(String id) {
	        this.id = id;
	    }
	 
	    
	    
	   public void save() throws ClassNotFoundException, SQLException {
       // boolean status = false;
        System.out.println("i m delete.");
       
       
        try { 
        		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ucsmub", "root","root123");
        		Statement statement = connection.createStatement();
        		String sql="delete from  ucsmub.todo where id=\""+id+"\"";
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





      

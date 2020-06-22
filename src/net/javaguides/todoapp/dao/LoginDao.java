package net.javaguides.todoapp.dao;

import java.sql.*;

import net.javaguides.todoapp.model.LoginBean;
//import net.javaguides.todoapp.utils.JDBCUtils;

public class LoginDao {

    public boolean validate(LoginBean loginBean) throws ClassNotFoundException {
        boolean status = false;
        System.out.println("i m validate.");
        
       
        try { 
        		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ucsmub", "root","root123");
        		Statement statement = connection.createStatement();
        		ResultSet resultSet = statement.executeQuery("select * from user ");
        		status=false;
        while(resultSet.next()) {
    		String name=(String)resultSet.getString("name");
    		System.out.println(name);
    		String pwd =resultSet.getString("password");
    		if (resultSet.getString("name").equals(loginBean.getUsername())&&(pwd.equals (loginBean.getPassword())))
    		{status=true;
    		}	    		
    	}
    	
    		
    	
        	

        } catch (SQLException e) {
        	System.out.println(e);
        }
        return status;
    }
}

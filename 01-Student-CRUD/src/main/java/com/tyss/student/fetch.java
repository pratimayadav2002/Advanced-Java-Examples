package com.tyss.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class fetch {
public static void main(String[] args) {
	
	String driver = "org.postgresql.Driver";
	String url = "jdbc:postgresql://localhost:5432/demo_db";
	String user = "postgres";
	String password = "root";
	
	try {
		Class.forName(driver);
		
		Connection con = DriverManager.getConnection(url,user,password);
	    
		Statement stm = con.createStatement();
		
		String fetch = "SELECT * FROM students";
		ResultSet rs = stm.executeQuery(fetch);
		  
		System.out.println("*******students*******");
		
		while(rs.next()) {
			System.out.println("sid : "+rs.getInt("sid"));
			System.out.println("name : "+rs.getString("name"));
			System.out.println("email : "+rs.getString("email"));
			System.out.println("phoneno : "+rs.getLong("phoneno"));
			System.out.println("---------------");
		}

		con.close();
		System.out.println("record fetched and con closed");

	}catch (SQLException e) {
			e.printStackTrace();
	}catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}

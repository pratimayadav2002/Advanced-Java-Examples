package com.tyss.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class save {
public static void main(String[] args) {
	
	String url = "jdbc:postgresql://localhost:5432/demo_db";
	String user = "postgres";
	String password = "root";
	
	try {
		// 1 load the driver
		Class.forName("org.postgresql.Driver");
		System.out.println("driver loaded");
		
		// 2 create a connection
		Connection con = DriverManager.getConnection(url,user,password);
		System.out.println("connection is created");
		
		// 3 creating statement
		Statement stm = con.createStatement();
		System.out.println("statement is created");
				
		// 4 execute the query
	    String insert = "INSERT INTO students VALUES(5,'antima','antima@gmail.com',454645)";
	    stm.execute(insert);
     	System.out.println("query is executed");

		// close connection
	    con.close();
	    System.out.println("connection is close");
		
		
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}catch (SQLException e) {
		e.printStackTrace();
	}
	
		
	
}
}

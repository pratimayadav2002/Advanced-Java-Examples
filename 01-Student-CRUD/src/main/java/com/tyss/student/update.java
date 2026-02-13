package com.tyss.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class update {
public static void main(String[] args) {
	
	String url = "jdbc:postgresql://localhost:5432/demo_db";
	String user = "postgres";
	String password= "root";
	
	// load a driver
	try {
		Class.forName("org.postgresql.Driver");
		System.out.println("driver loaded");

	// create a connection
		Connection con = DriverManager.getConnection(url,user,password);
		System.out.println("connection is created");	
		
	// create a statement
		Statement stm = con.createStatement();
		System.out.println("statement is created");
		
	// execute the query
		String update = "UPDATE students SET phoneno=22222 WHERE sid=5";
		stm.execute(update);
		System.out.println("executed query");
		
	// close the connection
		con.close();
		System.out.println("con close");
		
	} catch (SQLException e) {
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	
}
}

package com.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServlet;

public class ConnectionPool extends HttpServlet{
	
	private static String url="jdbc:postgresql://localhost:5432/shop?user=postgres&password=root";
	private static String driver = "org.postgresql.Driver";
	private static final int pool_size = 4;
	private static List<Connection> connectionPool = new ArrayList();
	
	static {
		for(int i=1; i<=pool_size; i++) {
			connectionPool.add(createConnection());
		}
	}
	
	public static Connection createConnection() {
		Connection connection=null;
		
		try {
			Class.forName(driver);
			
			connection = DriverManager.getConnection(url);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		return connection;
	}
	
	public static Connection giveConnection() {
		if(!connectionPool.isEmpty()) {
			return connectionPool.remove(0);
		}else {
			return createConnection();
		}
	}
	
	
	public static void submitConnection(Connection connection) {
		if(connectionPool.size()<pool_size) {
			connectionPool.add(connection);
		}else {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}

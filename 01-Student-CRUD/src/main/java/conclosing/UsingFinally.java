package conclosing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UsingFinally {
public static void main(String[] args) {
	
	Connection con = null;
	
	String url = "jdbc:postgresql://localhost:5432/demo_db?user=postgres&password=root";
	String driver = "org.postgresql.Driver";

	try {
		Class.forName(driver);
		System.out.println("class is loaded");
		
		con = DriverManager.getConnection(url);
		System.out.println("connection is created");

		Statement stm = con.createStatement();
		System.out.println("statement is created");
		
		String insert = "INSER INTO students VALUES (15,'hema','hema33@gmail.com',12321121)";
		stm.execute(insert);
		System.out.println("query is created");
		
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}catch (SQLException e) {
		e.printStackTrace();
	}finally {
		try {
			if(con!=null) {
				con.close();
				System.out.println("connection is closed");
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	
}
}

package practice2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class executeQuery_methods {
public static void main(String[] args) {
	
	String url = "jdbc:postgresql://localhost:5432/demo_db?user=postgres&password=root";
	String driver = "org.postgresql.Driver";
	
	try {
		Class.forName(driver);
		
		Connection con = DriverManager.getConnection(url);

		Statement stm = con.createStatement();
		
		String fetch = "SELECT * FROM students";
		
	//	stm.executeUpdate(fetch);//Exception
		
		ResultSet res = stm.executeQuery(fetch);
		System.out.println(res);
		
		while (res.next()) {
			System.out.println("Sid : " + res.getInt("sid"));// column label
			System.out.println("Name : " + res.getString(2));// column index
			System.out.println("Email : " + res.getString(3));
			System.out.println("Phone : " + res.getLong(4));
			System.out.println("====================");
		}
		
		con.close();
		System.out.println("connection is close");
		
		
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}catch (SQLException e) {
		e.printStackTrace();
	}
	
	
	
	
}
}

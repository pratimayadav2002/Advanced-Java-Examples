package practice;

// CallableStatement (update) 

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CallProcedure2 {
public static void main(String[] args) {
	
	String url = "jdbc:postgresql://localhost:5432/demo_db?user=postgres&password=root";
	
	String driver = "org.postgresql.Driver";
	
	try {
		
		Class.forName(driver);
		System.out.println("driver is loaded");
		
		Connection con = DriverManager.getConnection(url);

		String sql = "call student_update(?,?,?,?)";
	
		CallableStatement cstm = con.prepareCall(sql);
		
		cstm.setInt(1, 4);
		cstm.setString(2, "lmno");
		cstm.setString(3, "lmno@gmail.com");
		cstm.setLong(4, 10100101l);

		cstm.execute();
		
		System.out.println("CallableStatement is update");
		
		con.close();
		System.out.println("connection is closed");
		
		
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}catch (SQLException e) {
		e.printStackTrace();
	} 
	
	
}
}

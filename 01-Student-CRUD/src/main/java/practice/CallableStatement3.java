package practice;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// CallableStatement (delete)

public class CallableStatement3 {
public static void main(String[] args) {
	
	String url ="jdbc:postgresql://localhost:5432/demo_db?user=postgres&password=root";
	
	String driver = "org.postgresql.Driver";
	
	try {
		Class.forName(driver);
		
		Connection con = DriverManager.getConnection(url);

		String sql = "call student_delete(?)";
		
		CallableStatement cstm= con.prepareCall(sql);
		
		cstm.setInt(1, 2);            
		
		cstm.execute();
		
		System.out.println("record delete in callablestatement");
		con.close();
			
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}catch (SQLException e) {
		e.printStackTrace();
	}
}
}

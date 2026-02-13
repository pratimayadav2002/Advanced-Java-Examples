package practice2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// int executeUpdate () 
// its is only execute non-select query 
// in select query it will throws the exception
// only for DML 

public class executeUpdate_methods {
public static void main(String[] args) {
	
	String url = "jdbc:postgresql://localhost:5432/demo_db?user=postgres&password=root";
	String driver = "org.postgresql.Driver";
	
	try {
		Class.forName(driver);
		
		Connection con = DriverManager.getConnection(url);

		String insert = "INSERT INTO students VALUES(?,?,?,?)";
		
		PreparedStatement pstm = con.prepareStatement(insert);
		
		pstm.setInt(1, 12);
		pstm.setString(2, "abc");
		pstm.setString(3, "abc123@gmail.com");
		pstm.setLong(4, 4545454545l);

		int res = pstm.executeUpdate();
		System.out.println(res + "  record/records inserted ");
		
		con.close();
		System.out.println("connection is closed");
		
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}catch (SQLException e) {
		e.printStackTrace();
	}
	
	
	
	
	
	
}
}

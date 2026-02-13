package practice;

// preparedStatement (insert)

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class preparedStatement {
public static void main(String[] args) {
	
	String url = "jdbc:postgresql://localhost:5432/demo_db?user=postgres&password=root";
	
	try {
		Class.forName("org.postgresql.Driver");
		
		Connection con = DriverManager.getConnection(url);

		String insert = "INSERT INTO students VALUES (?,?,?,?)";
		
		PreparedStatement pstm = con.prepareStatement(insert);
		
		pstm.setInt(1, 555);
		pstm.setString(2, "sonu");
		pstm.setString(3, "sonu@gmail.com");
		pstm.setLong(4, 1234567890l);
		
		pstm.execute();
		System.out.println("record inserted");
		
		con.close();
		
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}catch (SQLException e) {
				e.printStackTrace();
	}
	
	
	
}
}

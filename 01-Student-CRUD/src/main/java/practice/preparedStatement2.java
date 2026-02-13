package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

// preparedStatement (update)

public class preparedStatement2 {
public static void main(String[] args) {

	String url = "jdbc:postgresql://localhost:5432/demo_db?user=postgres&password=root";

	try {
		Class.forName("org.postgresql.Driver");
		
		Connection con = DriverManager.getConnection(url);

		String update = "UPDATE students SET name=?,email=?,phoneno=? WHERE sid=?";
		
		PreparedStatement pstm = con.prepareStatement(update);
		
		pstm.setString(1, "priyanka");
		pstm.setString(2, "priyanka@gmail.com");
		pstm.setLong(3, 344643653563l);
		pstm.setInt(4, 555);

		pstm.executeUpdate();
		System.out.println("record inserted");
		
		con.close();
		
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}catch (SQLException e) {
		e.printStackTrace();
	}
	
	
	

}
}

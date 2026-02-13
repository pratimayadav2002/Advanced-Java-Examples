package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// preparedStatement (delete)

public class preparedStatement3 {
public static void main(String[] args) {
	
	String url = "jdbc:postgresql://localhost:5432/demo_db?user=postgres&password=root";

	try {
		Class.forName("org.postgresql.Driver");
		
		Connection con = DriverManager.getConnection(url);

		String delete = "DELETE FROM students WHERE sid=?";
				
		java.sql.PreparedStatement pstm = con.prepareStatement(delete);
		
		pstm.setInt(1, 111);
		pstm.execute();
		
		System.out.println("record is deleted");
		
		con.close();
		
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
}
}

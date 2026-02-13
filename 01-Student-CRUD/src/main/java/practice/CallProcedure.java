package practice;
// CallableStatement (insert)
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CallProcedure {
public static void main(String[] args) {
	
	String driver = "org.postgresql.Driver";
	
	String url = "jdbc:postgresql://localhost:5432/demo_db?user=postgres&password=root";

	try {
		Class.forName(driver);
		
		Connection con = DriverManager.getConnection(url);

		String sql = "call student_record(?,?,?,?)";
		
		CallableStatement cstm = con.prepareCall(sql);
		
		cstm.setInt(1, 9);
		cstm.setString(2, "monu");
		cstm.setString(3, "monu@gmail.com");
		cstm.setLong(4, 123476543l);
		
		cstm.execute();
		
		System.out.println("record inserted in callablestatement");
		con.close();
		
		
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}catch (SQLException e) {
		e.printStackTrace();
	}
	
	
}
}

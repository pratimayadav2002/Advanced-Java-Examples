package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
	
import conn.ConnectionPool;

@WebServlet("/register")
public class Register extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// read the user data in console
		
	String user = req.getParameter("name");
	String email = req.getParameter("email");
	String pwd = req.getParameter("password");
	
	// get conn
	Connection con = ConnectionPool.giveConnection();
	
	try {
		String insert = "INSERT INTO data VALUES(?,?,?)";

		PreparedStatement stm = con.prepareStatement(insert);
		stm.setString(1, user);
		stm.setString(2, email);
		stm.setString(3, pwd);
		int res = stm.executeUpdate();
		System.out.println("record inserted : "+res);
		System.out.println("username : "+user);
		System.out.println("email : "+email);
		System.out.println("pwd : "+pwd);
		
		ConnectionPool.submitConnection(con);
		
		RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
		req.setAttribute("succ", "registerd successfully");
		rd.forward(req, resp);
		
	} catch (SQLException e) {
		e.printStackTrace();
		RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
		req.setAttribute("error", " already registerd");
		rd.forward(req, resp);
		
	}	
	}
}

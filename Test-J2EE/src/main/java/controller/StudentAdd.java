package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import conn.ConnectionPool;

@WebServlet("/addstudent")
public class StudentAdd extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int sid = Integer.parseInt(req.getParameter("sid"));
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String phone = req.getParameter("phone");
		String std = req.getParameter("std");
		String add = req.getParameter("add");

		Connection con = ConnectionPool.giveConnection();
				
		try {
			String insert = "INSERT INTO student VALUES (?,?,?,?,?,?)";

			PreparedStatement pstm = con.prepareStatement(insert);
			pstm.setInt(1, sid);
			pstm.setString(2, name);
			pstm.setString(3, email);
			pstm.setString(4, phone);
			pstm.setString(5, std);
			pstm.setString(6, add);
			
			int rs = pstm.executeUpdate(); 
			System.out.println("record inserted : "+rs);
			System.out.println(sid + " " + name + " " + email + " " +
	                phone + " " + std + " " + add); 
			
			      
			ConnectionPool.submitConnection(con);
			
			RequestDispatcher rd = req.getRequestDispatcher("list.jsp");
			req.setAttribute("success", "sucessfully");
			rd.forward(req, resp);
			
		}catch(SQLException e) {
			e.printStackTrace();
			RequestDispatcher rd = req.getRequestDispatcher("list.jsp");
			req.setAttribute("error", "something went wrong");
			rd.forward(req, resp);
			
		}
		
		
	}
}

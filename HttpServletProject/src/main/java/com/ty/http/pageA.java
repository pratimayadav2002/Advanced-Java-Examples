package com.ty.http;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/pageA")
public class pageA extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String name = req.getParameter("uname");
		String email = req.getParameter("uemail");
		String pwd = req.getParameter("upwd");
		
		System.out.println(name);
		System.out.println(email);
		System.out.println(pwd);
		
		PrintWriter pw = resp.getWriter();
		pw.print("<html><body><h2>"+ name + ", welcome to httpservlet</h2></body></html>");
	}
}

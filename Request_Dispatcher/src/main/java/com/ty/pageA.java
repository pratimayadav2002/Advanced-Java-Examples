package com.ty;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/page-a")
public class pageA extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	System.out.println("pageA servlet triggered");
	
	String msg = req.getParameter("src");
	
	resp.getWriter().print("<h1>This is pageA</h1>");
	
	if(msg.equalsIgnoreCase("Animal")) {
		resp.sendRedirect("animal");
	}else if (msg.equalsIgnoreCase("Bird")) {
		resp.sendRedirect("bird");
	}else {   	
		resp.sendRedirect("https://www.wikipedia.org/");
	}
	
	}
}

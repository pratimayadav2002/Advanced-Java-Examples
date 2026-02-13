package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/bird")
public class bird extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter pw = resp.getWriter();
		pw.print("<html><body>"
	    		+ "<h1>Birds name</h1>"
	    		+ "<h3>peacock</h3>"
	    		+ "<h3>parrot</h3>"
	    		+ "<h3>pigeon</h3>"
	    		+ "<h3>sparrow</h3>"
	    		+ "</html></body>");
		
	}
}

package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/animal")
public class animal extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    PrintWriter pw = resp.getWriter();
    		pw.print("<html><body>"
    		+ "<h1>Animals name</h1>"
    		+ "<h3>tiger</h3>"
    		+ "<h3>lion</h3>"
    		+ "<h3>dog</h3>"
    		+ "<h3>cat</h3>"
    		+ "</html></body>");
    		
    RequestDispatcher rd = req.getRequestDispatcher("test.html");
//  RequestDispatcher rd = req.getRequestDispatcher("test.html");

    rd.forward(req, resp);
//    rd.include(req, resp);
    
    
	}
}

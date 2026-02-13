package com.ty;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/s1")
public class S1 extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	System.out.println("s1 got req");
	resp.getWriter().print("<h1>welcome to s1</h1>");
	
	req.setAttribute("name", "monu");
	req.setAttribute("age", 32);
	
	student s1 = new student("pratima", 23);
	req.setAttribute("stu", s1);
	
	
	RequestDispatcher rd = req.getRequestDispatcher("demo.jsp");
	rd.forward(req, resp);

}
}

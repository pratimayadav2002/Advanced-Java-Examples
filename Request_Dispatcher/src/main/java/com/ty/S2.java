package com.ty;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/s2")
public class S2 extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	System.out.println("s2 got req");
	resp.getWriter().print("<h1>welcome to s2</h1>");
	
	String name = (String) req.getAttribute("name");
	int age = (int) req.getAttribute("age");
	
	System.out.println(name);
	System.out.println(age);
		
	
	student s1 = (student) req.getAttribute("stu");
	System.out.println("studName : " +s1.getName());
	System.out.println("studAge : " +s1.getAge());
	
	resp.getWriter()
	.print("<h1>Welcome to S2</h1>" 
		     + "<h3>Name : 	" + name + "</h3>" 
		     + "<h3>Age : " + age + "</h3>"
		     + "<h2>------Student--------</h2>"
			 + "<h3>Name : "+s1.getName()+"</h3>"
			 + "<h3>Age : "+s1.getAge()+"</h3>");

}
}

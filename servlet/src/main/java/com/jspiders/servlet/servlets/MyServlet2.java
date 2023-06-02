package com.jspiders.servlet.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet2 extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, 
						HttpServletResponse resp) 
						throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.println("<h1>Hello from MyServlet2</h1>");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, 
						HttpServletResponse resp) 
						throws ServletException, IOException {
		doPost(req, resp);
	}

}

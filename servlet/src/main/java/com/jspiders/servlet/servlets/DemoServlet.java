package com.jspiders.servlet.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/demo")
public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, 
						HttpServletResponse response) 
						throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		writer.println("<h1>Hello from DemoServlet</h1>");
	}

}

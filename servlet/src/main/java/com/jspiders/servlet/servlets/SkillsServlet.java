package com.jspiders.servlet.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/skills")
public class SkillsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, 
						HttpServletResponse response) 
						throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, 
						HttpServletResponse response) 
						throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String[] skills = request.getParameterValues("skills");
		writer.println("<h1>Hello " + firstName + " " 
									+ lastName + "</h1>" );
		writer.println("<h3>Your skillset includes:<h3>");
		for (String skill : skills) {
			writer.println("<h4>" + skill + "</h4>");
		}
	}

}

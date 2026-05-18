package com.newwebapp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("NewWebApp")
public class NewWeb extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter p=resp.getWriter();
		p.println("<html><body style ='padding:40px;'>");
		p.println("<h1 style='color:green;'>Lorem epsum!!!</h2>");
		p.println("<p>Rohith Is in love with his gf</p>");
		p.println("<h1>Pradeep's Milk Dairy has successfully completed 2 years</h2>");
		p.println("</body></html>");
	}

}
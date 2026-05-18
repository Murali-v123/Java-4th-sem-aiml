package com.helloworld;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloWorldApp extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter pr=resp.getWriter();
		pr.println("<html><body style ='padding:40px;'>");
		pr.println("<h1 style='color:green;'>hello world!!!</h2>");
		pr.println("<p>This is first servelet</p>");
		pr.println("<h1>Pradeep's Milk Dairy</h2>");
		pr.println("</body></html>");
	}

}

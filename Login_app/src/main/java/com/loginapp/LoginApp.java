package com.loginapp;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class LoginApp
 */
@WebServlet("/LoginApp")
public class LoginApp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.sendRedirect("login.html");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse res34".equals(password)) {
			pw.println("<html><body>");
			pw.println("<h2>welcom,"+userName+" !</h2>");
			pw.println(" </body></html>");
		}ponse)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName=request.getParameter("username");
		String password=request.getParameter("password");
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		if("admin".equals(userName) && "12
		else {
			pw.println("<html><body>");
			pw.println("<h2>invalid credintals</h2>");
			pw.println(" </body></html>");
		}
	}

}

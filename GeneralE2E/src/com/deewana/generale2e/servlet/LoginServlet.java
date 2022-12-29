package com.deewana.generale2e.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.deewana.generale2e.BO.ProductBO;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int userName = Integer.parseInt(request.getParameter("username"));
		String password = request.getParameter("password");
		PrintWriter out = response.getWriter();

		ProductBO productBO = new ProductBO();
		boolean valid = productBO.validateLoginDetails(userName, password);
		if (valid) {
			RequestDispatcher rd = request.getRequestDispatcher("GetProduct");
			rd.forward(request, response);
		} else {
			RequestDispatcher rd = request.getRequestDispatcher("Home.jsp");
			out.print("<html><h2>Sorry UserName or Password Error!</h2></html>");
			rd.include(request, response);
		}

	}

}

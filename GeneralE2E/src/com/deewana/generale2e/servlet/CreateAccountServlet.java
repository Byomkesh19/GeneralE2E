package com.deewana.generale2e.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.deewana.generale2e.BO.CreateAccountBO;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/CreateAccount")
public class CreateAccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Fetching the fields from the UI
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String emailID = request.getParameter("email");
		long phone = Long.parseLong(request.getParameter("phoneNumber"));
		String gender = request.getParameter("gender");

		// Calling the methods in the Business Layer to Create the account
		CreateAccountBO createAccountBO = new CreateAccountBO();
		int userId = createAccountBO.setAccountDetails(Integer.MIN_VALUE, password, name, emailID, phone, gender);

		// Forwarding the control to the next page
		RequestDispatcher rd = request.getRequestDispatcher("RegistrationSuccessful.jsp");
		request.setAttribute("user", userId);
		request.setAttribute("name", name);
		rd.forward(request, response);
	}

}

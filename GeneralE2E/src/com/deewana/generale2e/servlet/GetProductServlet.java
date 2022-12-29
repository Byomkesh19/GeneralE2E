package com.deewana.generale2e.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.deewana.generale2e.BO.ProductBO;

/**
 * Servlet implementation class GetProduct
 */
@WebServlet("/GetProduct")
public class GetProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductBO productBO=new ProductBO();
		RequestDispatcher rd=request.getRequestDispatcher("showProduct.jsp");
		request.setAttribute("products", productBO.getAllProducts());
		rd.forward(request, response);
	}

}

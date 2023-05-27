package com.wu.crmdemo.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wu.crmdemo.daao.CustomerDAO;

/**
 * Servlet implementation class AddCustomerController
 */
@WebServlet("/AddCustomerController")
public class AddCustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String firstName=request.getParameter("fname");
		String lastName=request.getParameter("lname");
		String email=request.getParameter("email");
		
		//System.out.println(firstName+" "+lastName+" "+email);
		CustomerDAO customerdao=new CustomerDAO();
		customerdao.addCustomer(firstName,lastName,email);
		response.sendRedirect("DisplayCustomerServlet");
		
	}

}

package com.wu.crmdemo.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wu.crmdemo.daao.CustomerDAO;
import com.wu.crmdemo.utility.Customer;

/**
 * Servlet implementation class DisplayCustomerServlet
 */
@WebServlet("/DisplayCustomerServlet")
public class DisplayCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		CustomerDAO customerDAO =new CustomerDAO();
		
		ArrayList<Customer>  customers=customerDAO.getCustomers();
		
		/// populating the request object with customers ArrayList object
		/// and then we will redirect to some view page ---------- list-customer.jsp along with request object
		//System.out.println(customers);
		request.setAttribute("custdata", customers);
		RequestDispatcher rd=request.getRequestDispatcher("list-customer.jsp");  // it allows us to send data/request along with response;
		rd.forward(request, response);
		//response.sendRedirect("list-customer.jsp");  this only direct us to corresponding page but we cannot pass any request along it 
	}

}

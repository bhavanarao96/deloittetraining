package com;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.deloitte.javatraining.dao.CustomerDAO;
import com.deloitte.javatraining.daoimpl.CustomerDAOImpl;
import com.deloitte.javatraining.entity.Customer;

/**
 * Servlet implementation class CustomerSave
 */
public class CustomerSave extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerSave() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		int customerId = Integer.parseInt(request.getParameter("customerId"));
//		String customerName =request.getParameter("customerName");
//		String customerAddress =request.getParameter("customerAddress");
//		int billAmount =Integer.parseInt(request.getParameter("billAmount"));
//		if(customerId<0) {
//			response.sendRedirect("login.html");
//		}
		Customer customer = new Customer();
//		customer.setCustomerId(customerId);
//		customer.setCustomerName(customerName);
//		customer.setCustomerAddress(customerAddress);
//		customer.setBillAmount(billAmount);
		CustomerDAO customerDAOImpl = new CustomerDAOImpl();
		//String res = customerDAOImpl.insertCustomerDetails(customer);
//		boolean res=customerDAOImpl.isCustomerExists(5);
//		Customer customer = customerDAOImpl.findByCustomerID(1);
		List<Customer> allCustomers = customerDAOImpl.listAllCustomers();
		for (Customer c:allCustomers) {
			System.out.println(c);
		}
		//System.out.println(res);
//		RequestDispatcher dispatcher = request.getRequestDispatcher("success.html");
//		dispatcher.forward(request, response);
		//response.getWriter().println("<a href='success.html'>Data stored successfully</a>");
	}
	

}

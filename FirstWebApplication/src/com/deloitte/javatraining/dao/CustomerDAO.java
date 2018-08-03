package com.deloitte.javatraining.dao;

import java.util.List;

import com.deloitte.javatraining.entity.Customer;

public interface CustomerDAO {
	public String insertCustomerDetails(Customer customer);
	public Customer findByCustomerID(int customerId);
	public boolean isCustomerExists(int customerId);
	public boolean deleteCustomer(int customerId);
	public Customer updateCustomerID(int customerId,Customer customer);
	public List<Customer> listAllCustomers();
	
}

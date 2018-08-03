package com.deloitte.javatraining.daoimpl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.deloitte.javatraining.dao.CustomerDAO;
import com.deloitte.javatraining.entity.Customer;

class CustomerDAOImplTest {

	CustomerDAO customerDAO;
	Customer customer;
	@BeforeEach
	void setUp() throws Exception {
		customerDAO = new CustomerDAOImpl();
	}

	@AfterEach
	void tearDown() throws Exception {
		customerDAO = null;
	}

	@Test
	void testInsertCustomerDetails() {
		customer = new Customer(8,"Harith","Delhi",1200);
		assertEquals("Insert successful",customerDAO.insertCustomerDetails(customer));
	}

	@Test
	void testFindByCustomerID() {//check this
		int customerId=3;
		assertEquals(true, customerDAO.findByCustomerID(customerId));
	}

	@Test
	void testIsCustomerExists() {
		int customerId=5;
		assertEquals(true, customerDAO.isCustomerExists(customerId));
	}

	@Test
	void testDeleteCustomer() {
		int customerId=7;
		assertEquals(true, customerDAO.deleteCustomer(customerId));
	}

	@Test
	void testUpdateCustomerID() {
		fail("Not yet implemented");
	}

	@Test
	void testListAllCustomers() {
		fail("Not yet implemented");
	}

}

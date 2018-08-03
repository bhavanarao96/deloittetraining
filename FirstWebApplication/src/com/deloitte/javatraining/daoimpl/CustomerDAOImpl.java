package com.deloitte.javatraining.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.deloitte.javatraining.dao.CustomerDAO;
import com.deloitte.javatraining.dbconnection.DBConnection;
import com.deloitte.javatraining.entity.Customer;

public class CustomerDAOImpl implements CustomerDAO {
	Connection connection = DBConnection.getConnection();
	int result;
	@Override
	public String insertCustomerDetails(Customer customer) {
		try {
		PreparedStatement preparedStatement;
		preparedStatement = connection.prepareStatement("insert into customer values(?,?,?,?)");
		preparedStatement.setInt(1,customer.getCustomerId());
		preparedStatement.setString(2, customer.getCustomerName());
		preparedStatement.setString(3,customer.getCustomerAddress());
		preparedStatement.setInt(4,customer.getBillAmount());
		result = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if (result==0)
			return "Insert failed";
		else
			return "Insert successful";
	}

	@Override
	public Customer findByCustomerID(int customerId) {
		Customer customer = new Customer();
		PreparedStatement statement;
		try {
			statement = connection.prepareStatement("select * from customer where customerID=?");
			statement.setInt(1, customerId);
			ResultSet resultSet = statement.executeQuery();
			resultSet.next();
			customer.setCustomerId(resultSet.getInt(1));
			customer.setCustomerName(resultSet.getString(2));
			customer.setCustomerAddress(resultSet.getString(3));
			customer.setBillAmount(resultSet.getInt(4));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return customer;
	}

	@Override
	public boolean isCustomerExists(int customerId) {
		boolean recordExists=false;
		ResultSet res;
		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement("select * from customer where customerID=?");
		preparedStatement.setInt(1, customerId);
		res = preparedStatement.executeQuery();
		recordExists=res.next();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return recordExists;
	}
	

	@Override
	public boolean deleteCustomer(int customerId) {
		PreparedStatement preparedStatement;
		int rows=0;
		try {
			preparedStatement = connection.prepareStatement("delete from customer where customerID=?");
		preparedStatement.setInt(1, customerId);
		rows=preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(rows==0)
			return false;
		else
			return true;
	}

	@Override
	public Customer updateCustomerID(int customerId, Customer customer) {

		PreparedStatement statement;
		try {
			statement = connection.prepareStatement("update customer set customername = 'Mia' where customerid=?");
			statement.setInt(1, customerId);
			ResultSet resultSet = statement.executeQuery();
			resultSet.next();
			customer.setCustomerId(resultSet.getInt(1));
			customer.setCustomerName(resultSet.getString(2));
			customer.setCustomerAddress(resultSet.getString(3));
			customer.setBillAmount(resultSet.getInt(4));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return customer;
		
	}

	@Override
	public List<Customer> listAllCustomers() {
		List<Customer> c = new ArrayList<Customer>();
		ResultSet rs;
		try {
			PreparedStatement preparedStatement;
			preparedStatement = connection.prepareStatement("select * from customer");
			rs = preparedStatement.executeQuery();
			 while (rs.next()) {
			        int id = rs.getInt(1);
			        String name = rs.getString(2);
			        String address = rs.getString(3);
			        int bill = rs.getInt(4);
			        c.add(new Customer(id,name,address,bill));
			  }
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return c;
	}

}

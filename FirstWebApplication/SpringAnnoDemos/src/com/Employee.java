package com;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	private String employeeName;
	
	@Autowired
	private Address address;
	public Employee() {
		System.out.println("Employee cons called");
	}
	
	public Employee(String employeeName) {
		System.out.println("Employee parameterised cons called");
		this.employeeName = employeeName;
	}
	
	@PostConstruct
	public void display() {
		System.out.println("display init");
	}
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getEmployeeName() {
		return employeeName;
	}


	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", address=" + address + "]";
	}

	
	
}

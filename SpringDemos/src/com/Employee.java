package com;

public class Employee {
	private String employeeName;
	private Address address;
	public Employee() {
		System.out.println("Employee cons called");
	}
	
	public Employee(String employeeName) {
		System.out.println("Employee parameterised cons called");
		this.employeeName = employeeName;
	}
	
	
	public Employee(String employeeName, Address address) {
		System.out.println("both cons called");
		this.employeeName = employeeName;
		this.address = address;
	}

	public Employee(Address address) {
		this.address = address;
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

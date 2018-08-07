package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Employee employee = context.getBean(Employee.class);
		Address address = context.getBean(Address.class);
		
		employee.setEmployeeName("megha");
		//employee.setAddress(address);
//		address.setaID(1);
//		address.setCity("blr");
//		address.setState("Ktaka");
		//System.out.println(address);
		System.out.println(employee);
		Employee e = context.getBean(Employee.class);
		System.out.println(e);
	}
}

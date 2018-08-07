package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {
	public static void main(String[] args) {
		
		Resource resource = new ClassPathResource("beans.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		Employee employee = (Employee)factory.getBean("emp");
		System.out.println(employee);
		Employee e = (Employee)factory.getBean("emp");
		System.out.println(e);
//		Address a = (Address)factory.getBean("add");
//		System.out.println(a);
	}
}

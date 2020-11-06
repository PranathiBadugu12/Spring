package com.org.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.org.app.User;

public class MainFile {
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		User e1 = (User) context.getBean("UserBean");
		Vendor v1 = (Vendor) context.getBean("vendor");
		Customer c1 = (Customer) context.getBean("customer");
		System.out.println(c1);
	}
}

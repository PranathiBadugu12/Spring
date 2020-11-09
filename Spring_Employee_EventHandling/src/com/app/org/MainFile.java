package com.app.org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainFile {
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeController e = context.getBean(EmployeeController.class);
		e.createNewEmployee();
	}
}

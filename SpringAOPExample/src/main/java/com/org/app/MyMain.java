package com.org.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyMain {
public static void main(String args[]) {
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	EmployeeManager employeeMananger = (EmployeeManager)context.getBean("empMan");
	System.out.println(employeeMananger.getEmployeeDetails());
	
//	employeeMananger.printThrowException();
}
}

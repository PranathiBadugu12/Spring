package com.app.org.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.org.Employee;

public class MainFile {
public static void main(String args[]) {
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	Employee emp = (Employee) context.getBean("empMan");
	System.out.println(emp.getSalary());
	
//	employeeMananger.printThrowException();
}
}

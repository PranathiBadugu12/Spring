package com.app.org;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainFile {
	public static void main(String args[]) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		context.start();
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		System.out.println(obj.getMessage());
		context.stop();
	}
}

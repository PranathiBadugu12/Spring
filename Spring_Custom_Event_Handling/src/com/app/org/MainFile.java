package com.app.org;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainFile {
	public static void main(String args[]) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomEventPublisher cvp = (CustomEventPublisher)context.getBean("customEventPublisher");
		cvp.publish();
		cvp.publish();
	}
}

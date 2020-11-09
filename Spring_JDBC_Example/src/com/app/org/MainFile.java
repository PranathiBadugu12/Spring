package com.app.org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainFile {
		public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentJDBCTemplate studentJDBCTemplate=(StudentJDBCTemplate)context.getBean("studentJDBCTemplate");
        System.out.println("--CREATE RECORD----");
        studentJDBCTemplate.create(101, "Eshan", 23);
    }

}
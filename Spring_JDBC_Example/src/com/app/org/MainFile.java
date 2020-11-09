package com.app.org;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainFile {
		public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentJDBCTemplate studentJDBCTemplate=(StudentJDBCTemplate)context.getBean("studentJDBCTemplate");
        System.out.println("--CREATE RECORD----");
        studentJDBCTemplate.create(1,"Eshanp", 23);
        List<Student> students = studentJDBCTemplate.listStudents();
        for(Student s:students) {
        	System.out.println(s.getId()+" "+s.getName()+" "+s.getAge());
        }
    }

}
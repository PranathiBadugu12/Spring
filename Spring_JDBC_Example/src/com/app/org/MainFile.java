package com.app.org;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainFile {
		public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
       // StudentJDBCTemplate studentJDBCTemplate=(StudentJDBCTemplate)context.getBean("studentJDBCTemplate");
//        System.out.println("--CREATE RECORD----");
//        studentJDBCTemplate.create(1,"Eshanp", 213);
//        System.out.println("Before update");
//        List<Student> students = studentJDBCTemplate.listStudents();
//        for(Student s:students) {
//        	System.out.println(s.getId()+" "+s.getName()+" "+s.getAge());
//        }
//        System.out.println("Enter id of student to be updated");
//        Scanner s = new Scanner(System.in);
//        int id = s.nextInt();
//        studentJDBCTemplate.updateStudent(id);
//        
//        System.out.println("After update");
//        students = studentJDBCTemplate.listStudents();
//        for(Student s1:students) {
//        	System.out.println(s1.getId()+" "+s1.getName()+" "+s1.getAge());
//        }
        EmployeeJdbcTemplate employeeJdbcTemplate = (EmployeeJdbcTemplate)context.getBean("employeeJdbcTemplate");
        DepartmentJdbcTemplate departmentJdbcTemplate = (DepartmentJdbcTemplate)context.getBean("departmentJdbcTemplate");
//        departmentJdbcTemplate.create(10, "deptname1");
//        departmentJdbcTemplate.create(20, "deptname2");
//        departmentJdbcTemplate.create(30, "deptname3");
//        employeeJdbcTemplate.create(1, "name1", 10000, 10);
//        employeeJdbcTemplate.create(2, "name2", 10000, 10);
//        employeeJdbcTemplate.create(3, "name3", 10000, 10);
//        1
        List<Employee> emps = employeeJdbcTemplate.listEmployees();
        List<Department> depts = departmentJdbcTemplate.listDepartments();
        for(Employee e: emps) {
        	System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary()+" "+e.getDeptno());
        }
        for(Department d:depts) {
        	System.out.println(d.getDeptno()+" "+d.getDeptname());
        }
        
//        System.out.println("Enter id of student to be updated");
       Scanner s = new Scanner(System.in);
//        int id = s.nextInt();
//        employeeJdbcTemplate.updateEmployee(id);
        boolean flag = true;
        while(flag) {
        System.out.println("What do you want to do?1.insert 2.update 3.delete 4.end");
        switch(s.nextInt()){
        case 1:
        	s.nextLine();
        	System.out.println("entr name,salary,dept");
        	employeeJdbcTemplate.create(101, s.nextLine(), s.nextInt(), s.nextInt());
        	break;
        case 2:
        	System.out.println("Enter id of student to be updated");
        	employeeJdbcTemplate.updateEmployee(s.nextInt());
        	break;
        case 3:
        	System.out.println("Enter id of student to be deleted");
        	employeeJdbcTemplate.deleteEmployee(s.nextInt());
        	break;
        default:
        	System.out.println("end");
        	flag=false;
        }
        }
    }

}
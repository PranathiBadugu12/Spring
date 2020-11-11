package com.app.org;

import java.util.List;
import java.util.Scanner;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentJDBCTemplate implements StudentDAO{
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;
    
    public void setDataSource(DataSource dataSource) {
        this.dataSource=dataSource;
        this.jdbcTemplateObject=new JdbcTemplate(dataSource);
    }

    @Override
    public void create(Integer id, String name, Integer age) {
        String query="insert into Student(name,age) values (?,?)";
        jdbcTemplateObject.update(query,name,age);
        System.out.println("Record inserted into student table ");
    }
    
    public List<Student> listStudents(){
    	String SQL = "select * from student";
    	List<Student> student = jdbcTemplateObject.query(SQL,new StudentMapper());
    	return student;
    }
    
     
    public void updateStudent(Integer id) {
    	System.out.println("What do you want to update 1.name 2.age");
    	Scanner s = new Scanner(System.in);
    	int n = s.nextInt();
    	String query;
    	switch(n) {
    		case 1:
    			s.nextLine();
    			String name = s.nextLine();
    			 query="update Student set name = ? where id = ?";
    			jdbcTemplateObject.update(query,name,id);
    			break;
    		case 2:
    			int age = s.nextInt();
    			 query="update Student set age = ? where id = ?";
    			 jdbcTemplateObject.update(query,age,id);
    			 break;
    		default:
    			System.out.println("Invalid");
    			
    	}
    }
    
}



package com.app.org;

import java.util.List;
import java.util.Scanner;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeJdbcTemplate implements EmployeeDAO{
	 private DataSource dataSource;
	    private JdbcTemplate jdbcTemplateObject;
	    
	    public void setDataSource(DataSource dataSource) {
	        this.dataSource=dataSource;
	        this.jdbcTemplateObject=new JdbcTemplate(dataSource);
	    }

		@Override
		public void create(int id, String name, int salary, int deptno) {
			// TODO Auto-generated method stub
			String query="insert into Employee(id,name,salary,deptno) values (?,?,?,?)";
	        jdbcTemplateObject.update(query,id,name,salary,deptno);
	        System.out.println("Record inserted into student table ");
			
		}
		public List<Employee> listEmployees(){
			String SQL = "select * from Employee";
	    	List<Employee> employees = jdbcTemplateObject.query(SQL,new EmployeeMapper());
	    	return employees;
		}
		public void updateEmployee(Integer id) {
	    	System.out.println("What do you want to update 1.name 2.salary");
	    	Scanner s = new Scanner(System.in);
	    	int n = s.nextInt();
	    	String query;
	    	switch(n) {
	    		case 1:
	    			s.nextLine();
	    			String name = s.nextLine();
	    			 query="update Employee set name = ? where id = ?";
	    			jdbcTemplateObject.update(query,name,id);
	    			break;
	    		case 2:
	    			int salary = s.nextInt();
	    			 query="update Employee set salary = ? where id = ?";
	    			 jdbcTemplateObject.update(query,salary,id);
	    			 break;
	    		default:
	    			System.out.println("Invalid");
	    			
	    	}
	    }
		public void deleteEmployee(int id) {
			String sql = "delete from employee where id = ?";
			jdbcTemplateObject.update(sql,id);
			System.out.println("Deleted successfully");
		}

	    
}

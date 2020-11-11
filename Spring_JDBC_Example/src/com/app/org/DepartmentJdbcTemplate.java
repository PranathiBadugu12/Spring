package com.app.org;

import java.util.List;
import java.util.Scanner;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class DepartmentJdbcTemplate implements DepartmentDAO{
	private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;
    
    public void setDataSource(DataSource dataSource) {
        this.dataSource=dataSource;
        this.jdbcTemplateObject=new JdbcTemplate(dataSource);
    }

	@Override
	public void create(int deptno, String deptname) {
		// TODO Auto-generated method stub
		String query="insert into Department(deptno,deptname) values (?,?)";
        jdbcTemplateObject.update(query,deptno,deptname);
        System.out.println("Record inserted into student table ");
		
	}
	public List<Department> listDepartments(){
		String SQL = "select * from Department";
    	List<Department> departments = jdbcTemplateObject.query(SQL,new DepartmentMapper());
    	return departments;
	}
	public void updateDepartment(int deptid) {
		System.out.println("enter the name of dept");
		Scanner s = new Scanner(System.in);
		s.nextLine();
		String name = s.nextLine();
		String sql = "update Department set deptname = ? where id = ?";
		jdbcTemplateObject.update(sql,deptid);
	}
	
}

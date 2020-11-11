package com.app.org;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeMapper implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet re, int rowNum) throws SQLException {
		
			// TODO Auto-generated method stub
			Employee employee = new Employee();
			employee.setId(re.getInt("id"));
			employee.setName(re.getString("name"));
			employee.setDeptno(re.getInt("deptno"));
			employee.setSalary(re.getInt("salary"));
			return employee;
		

	}

}

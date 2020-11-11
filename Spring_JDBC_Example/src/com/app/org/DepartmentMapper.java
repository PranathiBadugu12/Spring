package com.app.org;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class DepartmentMapper implements RowMapper<Department>{

	@Override
	public Department mapRow(ResultSet re, int rowNum) throws SQLException {
		
			// TODO Auto-generated method stub
			Department department = new Department();
			department.setDeptno(re.getInt("deptno"));
			department.setDeptname(re.getString("deptname"));
			return department;
	}
}

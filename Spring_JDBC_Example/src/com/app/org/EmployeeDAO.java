package com.app.org;

import javax.sql.DataSource;

public interface EmployeeDAO {
	public void setDataSource(DataSource ds);
	public void create(int id,String name,int salary,int deptno);
}

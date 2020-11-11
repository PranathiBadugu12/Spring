package com.app.org;

import javax.sql.DataSource;

public interface DepartmentDAO {
	public void setDataSource(DataSource ds);
	public void create(int deptno,String deptname);
}

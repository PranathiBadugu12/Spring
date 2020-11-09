package com.app.org;

import javax.sql.DataSource;

public interface StudentDAO {
	public void setDataSource(DataSource ds);
	public void create(Integer id,String name,Integer age);
}

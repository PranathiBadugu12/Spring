package com.app.org;

import org.springframework.stereotype.Repository;

@Repository ("employeeDao")
public class EmployeeDAOImpl implements EmployeeDAO{

	
	@Override
	public EmployeeDTO createNewEmployee() {
		// TODO Auto-generated method stub
		
			// TODO Auto-generated method stub
			EmployeeDTO e = new EmployeeDTO();
			e.setId(100);
			e.setFirstName("pr");
			e.setLastName("pp");
			e.setDesignation("lm");
			return e;
		
		
	}
	public void initBean() {
		System.out.println("Init bean for employeedaoImpl");
	}
	public void destroyBean() {
		System.out.println("destroy bean for employeedaoImpl");
	}
	
}

package com.org.app;

import org.springframework.stereotype.Component;

@Component
public class EmployeeManager {
	public String getEmployeeDetails() {
		System.out.println("getEmpDetails");
		return "EMP DETails";
	}
}

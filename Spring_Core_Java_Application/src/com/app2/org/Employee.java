package com.app2.org;

public class Employee extends Person {
	private String empId;
	private Employee() {
		super();
	}
	public Employee(String empId) {
		super();
		this.empId = empId;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + "]";
	}
	
}

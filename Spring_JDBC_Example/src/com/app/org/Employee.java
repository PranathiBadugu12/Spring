package com.app.org;

public class Employee {
	private int id;
	private String name;
	private int salary;
	private int deptno;
	public Employee() {
		super();
	}
	public Employee(int id, String name, int salary, int deptno) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.deptno = deptno;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", deptno=" + deptno + "]";
	}
	
}

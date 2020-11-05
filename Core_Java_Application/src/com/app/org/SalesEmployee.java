package com.app.org;

public class SalesEmployee extends Employee{
	private int sales;
	private double commission;
	private double netSalary;
	
	public SalesEmployee(int empId, String name, double salary, Address address,int sales) {
		super(empId,name,salary,address);
		this.sales = sales;
	}

	public double calculateSalary() {
		if(this.sales < 5000) {
			this.commission = 2;
			this.netSalary = this.getSalary() * 1.02;
		}
		else if(this.sales < 10000) {
			this.commission = 5;
			this.netSalary = this.getSalary() * 1.05;
		}
		else if(this.sales < 15000) {
			this.commission = 7;
			this.netSalary = this.getSalary() * 1.07;
		}
		else {
			this.commission = 10;
			this.netSalary = this.getSalary() * 1.10;
		}
		return this.netSalary;
	}

	@Override
	public String toString() {
		return "SalesEmployee [sales=" + sales + ", commission=" + commission + ", netSalary=" + netSalary + "]";
	}
	
}

package com.app.org;

import java.util.ArrayList;

public class MainClass {
	public static void main(String args[]) {
//		Employee e1 = new Employee();
//		System.out.println(e1.toString());
//		Address a1 = new Address("w","w","w","w");
//		Employee e2 = new Employee(1,"p",1000,a1);
//		System.out.println(e2.toString());
//		
//		ArrayList<Employee> elist = new ArrayList<>();
//		elist.add(new Employee(1,"p",1000,a1));
//		elist.add(new Employee(2,"p",1000,a1));
//		elist.add(new Employee(3,"p",1000,a1));
//		elist.add(new Employee(4,"p",1000,a1));
//		
//		for(Employee e:elist) {
//			System.out.println(e);
//		}
		SalesEmployee s = new SalesEmployee(1,"p",1000,new Address("w","w","w","w"),9000);
		s.calculateSalary();
		System.out.println(s.toString());
		
		
	}

}
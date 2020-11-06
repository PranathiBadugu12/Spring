package com.app.org;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class Student {
	private String name;
	private int age;
	private Qualification qualification;
	
	@Autowired
	public Qualification getQualification() {
		return qualification;
	}
	@Autowired
	public void setQualification(Qualification qualification) {
		this.qualification = qualification;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		System.out.println("setName is called");
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	

	public void setAge(int age) {
		System.out.println("setAge is called");
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", qualification=" + qualification + "]";
	}
}


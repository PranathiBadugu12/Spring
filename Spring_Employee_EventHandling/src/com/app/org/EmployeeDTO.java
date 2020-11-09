package com.app.org;

public class EmployeeDTO {
	private int id;
	private String firstName;
	private String lastName;
	private String designation;
	public EmployeeDTO() {
		System.out.println("Default constructor");
		this.id = 0;
		this.firstName = "pp";
		this.lastName = "pp";
		this.designation = "pp";
		
	}
	public EmployeeDTO(int id, String firstName, String lastName, String designation) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.designation = designation;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "EmployeeDTO [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", designation="
				+ designation + "]";
	}
	
}

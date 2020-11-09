package com.app.org;

import org.springframework.context.ApplicationEvent;

public class EmployeeEvent extends ApplicationEvent{
	private static final long serialVersionUID = 1L;
	private String eventType;
	private EmployeeDTO employee;
	
	public EmployeeEvent(Object source,String eventType,EmployeeDTO employee) {
		super(source);
		this.eventType = eventType;
		this.employee = employee;
		// TODO Auto-generated constructor stub
	}
	
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public void setEmployee(EmployeeDTO employee) {
		this.employee = employee;
	}

	public String getEventType() {
		return eventType;
	}

	public EmployeeDTO getEmployee() {
		return employee;
	}
	

}

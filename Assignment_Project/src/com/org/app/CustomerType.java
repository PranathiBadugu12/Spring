package com.org.app;

public class CustomerType {
	private String type;

	public CustomerType() {
		super();
	}

	public CustomerType(String type) {
		super();
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "CustomerType [type=" + type + "]";
	}
	
}

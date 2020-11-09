package com.app.org;

public class HelloWorld {
	public String message;
	public HelloWorld() {
		System.out.println("Default constructor");
	}
	public HelloWorld(String message) {
		super();
		this.message = message;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "HelloWorld [message=" + message + "]";
	}
	
}

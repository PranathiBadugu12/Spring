package com.org.app;

public class Role {
	private String rolename;
	private String roletype;
	public Role() {
		super();
	}
	public Role(String rolename, String roletype) {
		super();
		this.rolename = rolename;
		this.roletype = roletype;
	}
	public String getRolename() {
		return rolename;
	}
	public void setRolename(String rolename) {
		this.rolename = rolename;
	}
	public String getRoletype() {
		return roletype;
	}
	public void setRoletype(String roletype) {
		this.roletype = roletype;
	}
	@Override
	public String toString() {
		return "Role [rolename=" + rolename + ", roletype=" + roletype + "]";
	}
	
}

package com.org.app;
import java.util.List;

public class User {
	private String email;
	private String password;
	private String phonenumber;
	private Address address;
	private boolean verified;
	private List<Role> roles;
	private boolean enabled;
	
	public User() {
		super();
	}

	public User(String email, String password, String phonenumber, Address address, boolean verified, List<Role> roles,
			boolean enabled) {
		super();
		this.email = email;
		this.password = password;
		this.phonenumber = phonenumber;
		this.address = address;
		this.verified = verified;
		this.roles = roles;
		this.enabled = enabled;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public boolean isVerified() {
		return verified;
	}

	public void setVerified(boolean verified) {
		this.verified = verified;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	@Override
	public String toString() {
		return "User [email=" + email + ", password=" + password + ", phonenumber=" + phonenumber + ", address="
				+ address + ", verified=" + verified + ", roles=" + roles + ", enabled=" + enabled + "]";
	}
	
}

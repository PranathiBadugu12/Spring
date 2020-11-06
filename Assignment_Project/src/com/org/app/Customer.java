package com.org.app;

import java.util.List;

public class Customer extends User{
	private String forename;
	private String surname;
	private List<PaymentDetails> paymentDetails;
	private List<Bookable> favorites;
	private CustomerType customerType;
	public Customer() {
		super();
	}
	public Customer(String email, String password, String phonenumber, String address, boolean verified, List<Role> roles,
			boolean enabled,String forename, String surname, List<PaymentDetails> paymentDetails, List<Bookable> favorites,
			CustomerType customerType) {
		super( email,  password,  phonenumber,  address,  verified,  roles, enabled);
		this.forename = forename;
		this.surname = surname;
		this.paymentDetails = paymentDetails;
		this.favorites = favorites;
		this.customerType = customerType;
	}
	public String getForename() {
		return forename;
	}
	public void setForename(String forename) {
		this.forename = forename;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public List<PaymentDetails> getPaymentDetails() {
		return paymentDetails;
	}
	public void setPaymentDetails(List<PaymentDetails> paymentDetails) {
		this.paymentDetails = paymentDetails;
	}
	public List<Bookable> getFavorites() {
		return favorites;
	}
	public void setFavorites(List<Bookable> favorites) {
		this.favorites = favorites;
	}
	public CustomerType getCustomerType() {
		return customerType;
	}
	public void setCustomerType(CustomerType customerType) {
		this.customerType = customerType;
	}
	@Override
	public String toString() {
		return "Customer [forename=" + forename + ", surname=" + surname + ", paymentDetails=" + paymentDetails
				+ ", favorites=" + favorites + ", customerType=" + customerType + "]";
	}
	
	
}

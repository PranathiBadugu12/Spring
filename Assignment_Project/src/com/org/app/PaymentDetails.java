package com.org.app;

import java.util.Date;

public class PaymentDetails {
	private double amount;
	private String description;
	private Date paymentDate;
	public PaymentDetails() {
		super();
	}
	public PaymentDetails(double amount, String description, Date paymentDate) {
		super();
		this.amount = amount;
		this.description = description;
		this.paymentDate = paymentDate;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
	@Override
	public String toString() {
		return "PaymentDetails [amount=" + amount + ", description=" + description + ", paymentDate=" + paymentDate
				+ "]";
	}
	
}

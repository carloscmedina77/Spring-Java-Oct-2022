package com.carlos.abstractdemo.abstracts;

public abstract class Payment {

	private double amount;
	public Payment() {}
	
	public Payment(double amount) {
		this.amount = amount;
	}
	
	public void paymentDetails() {
		System.out.println("Payment amount:" +this.amount);
	}
	
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}

}

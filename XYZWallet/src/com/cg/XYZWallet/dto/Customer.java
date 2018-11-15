package com.cg.XYZWallet.dto;

public class Customer {
	private String name;
	private String mobileNo;
	private float age;
	private double initialBalance;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}
	
	public double getInitialBalance() {
		return initialBalance;
	}
	public void setInitialBalance(double initialBalance) {
		this.initialBalance = initialBalance;
	}
	
	
}

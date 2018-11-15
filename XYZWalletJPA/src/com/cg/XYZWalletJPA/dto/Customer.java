package com.cg.XYZWalletJPA.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {
	
	@Column
	private String name;
	
	@Id
	@Column(name="mobile_no")
	private String mobileNo;
	
	@Column
	private float age;
	
	@Column(name="init_bal")
	private double initialBalance;
	
	public Customer() {
		super();
	}	

	//-------------------------- Wallet Application --------------------------
		/*******************************************************************************************************
		 - Function Name	:	Customer(String name, String mobileNo, float age, double initialBalance)
		 - Input Parameters	:	String name, String mobileNo, float age, double initialBalance
		 - Return Type		:	
		 - Author			:	CAPGEMINI
		 - Creation Date	:	10/30/2018
		 - Description		:	Constructor use to initialize attributes at time of object creation
		 ********************************************************************************************************/
	
	
	public Customer(String name, String mobileNo, float age, double initialBalance) {
		super();
		this.name = name;
		this.mobileNo = mobileNo;
		this.age = age;
		this.initialBalance = initialBalance;
	}
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

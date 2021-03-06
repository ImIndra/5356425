package com.cg.XYZWalletJPA.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class Transaction {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	int id;
	
	@Column(name="mobile_no")
	String mobile_no;
	
	@Column
	String credit;
	
	@Column
	String debit;
	
	@Column 
	String trans;
	
	@Column
	Double balance;
	
	@Column
	String name;

	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobie_no() {
		return mobile_no;
	}

	public void setMobie_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}

	public String getCredit() {
		return credit;
	}

	public void setCredit(String credit) {
		this.credit = credit;
	}

	public String getDebit() {
		return debit;
	}

	public void setDebit(String debit) {
		this.debit = debit;
	}

	public String getTrans() {
		return trans;
	}

	public void setTrans(String trans) {
		this.trans = trans;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}


	@Override
	public String toString() {
		return "Transaction [id=" + id + ", mobile_no=" + mobile_no
				+ ", credit=" + credit + ", debit=" + debit + ", trans="
				+ trans + ", balance=" + balance + ", name=" + name + "]";
	}
	
	
	
}

package com.cg.XYZWalletJPA.dao;

import java.util.ArrayList;

import com.cg.XYZWalletJPA.dto.Customer;
import com.cg.XYZWalletJPA.dto.Transaction;
import com.cg.XYZWalletJPA.exception.WalletException;

public interface WalletDAO {

	public void createAccount(Customer customer);
	
	public void deposit(String mobileNo, double amount);
	
	public void withdraw(String mobileNo, double amount);
	
	public double checkBalance(String mobileNo);
	
	public void fundTransfer(String sender, String reciever, double amount);
	
	public boolean validateAccount(String mobileNo) throws WalletException;
	
	public void getTransactionList(String mobileNo);
	
}

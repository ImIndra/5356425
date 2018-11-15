package com.cg.XYZWallet.dao;

import com.cg.XYZWallet.dto.Customer;
import com.cg.XYZWallet.exception.WalletException;

public interface WalletDAO {

	public void createAccount(Customer customer);
	
	public void deposit(String mobileNo, double amount);
	
	public void withdraw(String mobileNo, double amount);
	
	public double checkBalance(String mobileNo);
	
	public void fundTransfer(String sender, String reciever, double amount);
	
	public boolean validateAccount(String mobileNo) throws WalletException;
	
}

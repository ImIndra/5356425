package com.cg.XYZWallet.service;

import com.cg.XYZWallet.dto.Customer;
import com.cg.XYZWallet.exception.WalletException;

public interface WalletService {

	public void createAccount(Customer customer);
	
	public void deposit(String mobileNo, double amount);
	
	public void withdraw(String mobileNo, double amount);
	
	public double checkBalance(String mobileNo);
	
	public void fundTransfer(String sender, String reciever, double amount);
	
	
	public boolean validateAccount(String mobileNo) throws WalletException;
	
	public boolean validateName(String name) throws WalletException;
	
	public boolean validateAge(float age) throws WalletException;
	
	public boolean validateMobileNo(String mobileNo) throws WalletException;
	
	public boolean validateAmount(double amount) throws WalletException;
			
}

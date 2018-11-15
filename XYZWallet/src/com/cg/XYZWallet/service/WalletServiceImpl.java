package com.cg.XYZWallet.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.cg.XYZWallet.dao.WalletDAO;
import com.cg.XYZWallet.dao.WalletDAOImpl;
import com.cg.XYZWallet.dto.Customer;
import com.cg.XYZWallet.exception.WalletException;


public class WalletServiceImpl implements WalletService{

	WalletDAO walletDao  = new WalletDAOImpl();
	
	
	@Override
	public void createAccount(Customer customer) {
		// TODO Auto-generated method stub
		walletDao.createAccount(customer);		
	}

	@Override
	public void deposit(String mobileNo, double amount) {
		// TODO Auto-generated method stub
		walletDao.deposit(mobileNo, amount);
		
	}

	@Override
	public void withdraw(String mobileNo, double amount) {
		// TODO Auto-generated method stub
		walletDao.withdraw(mobileNo, amount);
		
	}

	@Override
	public double checkBalance(String mobileNo) {
		// TODO Auto-generated method stub
		return walletDao.checkBalance(mobileNo);
	}

	@Override
	public void fundTransfer(String sender, String reciever, double amount) {
		// TODO Auto-generated method stub
		walletDao.fundTransfer(sender, reciever, amount);
		
	}

	@Override
	public boolean validateName(String name) throws WalletException {
		// TODO Auto-generated method stub
		if(name == null)
			throw new WalletException("Null value found");
		Pattern p = Pattern.compile("[A-Z]{1}[a-z]{1,10}");
		Matcher m = p.matcher(name); 
		if(!m.matches())
			System.out.println("Name invalid!");
		return m.matches();
		
	}

	@Override
	public boolean validateAge(float age)  throws WalletException {
		try{
			// TODO Auto-generated method stub
			if(age == 0)
				throw new WalletException("Age cannot be  null");
			else if(age >100)
				throw new WalletException("Too old to use Wallet");
			else if(age < 0)
				throw new WalletException("Age cannot be a negative number");
			else
				return true;
			
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return false;
	}

	@Override
	public boolean validateMobileNo(String mobileNo) throws WalletException{
		try{
			// TODO Auto-generated method stub
			if(mobileNo == null)
				throw new WalletException("Null value found");
			Pattern p = Pattern.compile("[6789][0-9]{9}");
			Matcher m = p.matcher(mobileNo);
			if(!m.matches())
				System.out.println("Mobile Number Invalid!");
			return m.matches();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return false;
	}

	@Override
	public boolean validateAmount(double amount) throws WalletException {
		// TODO Auto-generated method stub
		if(amount == 0)
			throw new WalletException("Null value found");
		String am = String.valueOf(amount);
		if(!am.matches("\\d{3,9}\\.\\d{0,4}"))
			System.out.println("Invalid Amount!");
		return (am.matches("\\d{3,9}\\.\\d{0,4}"));
	}

	@Override
	public boolean validateAccount(String mobileNo) throws WalletException {
		// TODO Auto-generated method stub
		
		return walletDao.validateAccount(mobileNo);
	}

}

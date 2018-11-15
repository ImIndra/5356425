package com.cg.XYZWalletJPA.ui;

import java.util.Scanner;

import com.cg.XYZWalletJPA.dto.Customer;
import com.cg.XYZWalletJPA.exception.WalletException;
import com.cg.XYZWalletJPA.service.WalletService;
import com.cg.XYZWalletJPA.service.WalletServiceImpl;

public class Main {
	public static void main(String args[]) throws WalletException{
		
		WalletService walletSer = new WalletServiceImpl();
		
		Scanner sc = new Scanner(System.in);
		
		String name,mobileNo;
		float age;
		double amount;
		int ch = 0;
		do{
			System.out.println("1.Add Customer\n2.Deposit amount\n3.Withdraw Amount\n4.Fund transfer\n5.Check balance\n6.Print Transaction\n7.Exit");
			System.out.println("Enter your choice : ");
			ch = sc.nextInt();
			Customer customer;
			switch(ch){
				case 1 :
						customer = new Customer();						
					
						do{
							System.out.println("Enter Username : ");
							name = sc.next();
							if(!walletSer.validateName(name))
								System.err.println("Invalid Username!!");
							else
								break;
						}while(true);
						do{
							System.out.println("Enter mobile no. : ");
							mobileNo = sc.next();
							if(!walletSer.validateMobileNo(mobileNo))
								System.err.println("Invalid Mobile Number!");
							else if(walletSer.validateAccount(mobileNo))
								System.err.println("Account already exist with this number!\nPlease try again!!");
							else
								break;								
						}while(true);
						do{
							System.out.println("Enter age : ");
							age = sc.nextFloat();
							if(walletSer.validateAge(age))
								break;
						}while(true);
						do{
							System.out.println("Enter initial amount : ");
							amount = sc.nextDouble();
							if(!walletSer.validateAmount(amount))
								System.err.println("Invalid Amount!\nAmount should be minimum Rs.500");
							else
								break;							
						}while(true);
						
						
						
						customer.setName(name);
						customer.setMobileNo(mobileNo);
						customer.setAge(age);
						customer.setInitialBalance(amount);
						
						walletSer.createAccount(customer);						
						System.out.println("User added");
					break;
					
				case 2 :
						do{
							System.out.println("Enter your mobile number : ");
							mobileNo = sc.next();
							if(!walletSer.validateMobileNo(mobileNo))
								System.err.println("Invalid Mobile Number!");
							else if(!walletSer.validateAccount(mobileNo))
								System.err.println("Account already exist with this number!\nPlease try again!!");
							else
								break;
						}while(true);
						do{
							System.out.println("Enter the amount you want to deposit");
							amount = sc.nextDouble();
							if(!walletSer.validateAmount(amount))
								System.err.println("Invalid Amount!\nAmount shoulb be minimum Rs.500");														
							else
								break;
							
						}while(true);
						
						walletSer.deposit(mobileNo, amount);					
					
					break;
					
				case 3 :
						do{
							System.out.println("Enter your mobile number : ");
							mobileNo = sc.next();
							if(!walletSer.validateMobileNo(mobileNo))
								System.err.println("Invalid Mobile Number!");
							else if(!walletSer.validateAccount(mobileNo))
								System.err.println("Account already exist with this number!\nPlease try again!!");
							else
								break;
						}while(true);
						do{
							System.out.println("Enter the amount you want to withdraw : ");
							amount = sc.nextDouble();
							if(walletSer.validateMobileNo(mobileNo) && walletSer.validateAmount(amount)){
								if(walletSer.validateAccount(mobileNo))
									break;
							}
						}while(true);
						
						walletSer.withdraw(mobileNo, amount);
						
					break;
				
				case 4 :
						String mobileNoReciever;
						do{
							System.out.println("Enter Sender's mobile number : ");
							mobileNo = sc.next();
							
							System.out.println("Enter the amount you want to transfer : ");
							amount = sc.nextDouble();
							
							System.out.println("Enter receiver's mobile number : ");
							mobileNoReciever = sc.next();
							if(mobileNo.equals(mobileNoReciever)){								
								System.out.println("Both numbers are same!\nPlease enter unique numbers...");
								continue;
							}
							if(walletSer.validateMobileNo(mobileNo) && walletSer.validateMobileNo(mobileNoReciever) && walletSer.validateAmount(amount)){
								if(walletSer.validateAccount(mobileNoReciever) && walletSer.validateAccount(mobileNo))
									break;
							}
						}while(true);
						walletSer.fundTransfer(mobileNo, mobileNoReciever, amount);
											
					break;
					
				case 5 :
						do{
							System.out.println("Enter the moible no. to check balance");
							mobileNo = sc.next();
							if(walletSer.validateMobileNo(mobileNo)){
								if(walletSer.validateAccount(mobileNo))																	
									break;
								else
									System.err.println("Mobile number not found.");
							}
							else{
								System.err.println("Invalid mobile number!");
							}
						}while(true);
						
						System.out.println("Current Amount is Rs."+walletSer.checkBalance(mobileNo));
						
					break;
					
				case 6 :
					do{
						System.out.println("Enter the mobile no. to get transaction");
						mobileNo = sc.next();
						if(walletSer.validateMobileNo(mobileNo)){
							if(walletSer.validateAccount(mobileNo))																	
								break;
							else
								System.err.println("Mobile number not found.");
						}
						else{
							System.err.println("Invalid mobile number!");
						}
					}while(true);
					
					walletSer.getTransactionList(mobileNo);
					break;
					
				case 7 :
						System.out.println("Thanks for using XYZ Wallet");
					break;
				default : System.out.println("Invalid Choice!\n"+"Please Enter a valid Transaction");
			}
			
		}while(ch != 7);
		
	}
}

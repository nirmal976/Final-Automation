package com.inheritance;



public class ChekingAccout extends SavingAccount {

 protected void chekingDetails() {
		SavingAccount.initialbalance = 8500.00;
		SavingAccount.deposit = 600;
		SavingAccount.withdraw = 7000;
		SavingAccount.blance = SavingAccount.initialbalance + SavingAccount.deposit - SavingAccount.withdraw;
		System.out.println("Customer Total Checking Account Money : " + SavingAccount.blance);
	
	
	}
	
	
}

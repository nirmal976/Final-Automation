package com.inheritance;

public class CreditAccount extends ChekingAccout {

	
 protected void creditDetails() {
		
	SavingAccount.initialbalance = 10000.00;
	SavingAccount.withdraw = 1500;
	SavingAccount.blance = SavingAccount.initialbalance + SavingAccount.deposit - SavingAccount.withdraw;
	System.out.println("Customer Total Credit Account Money : " + SavingAccount.blance);
	
	}
}

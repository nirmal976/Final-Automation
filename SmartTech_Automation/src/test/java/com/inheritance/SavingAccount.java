package com.inheritance;

public class SavingAccount {

	static String name;
	static double initialbalance;
	static double deposit;
	static double withdraw;
	static double blance;
	
	protected void openAccount() {
	name = " Nirmal Dey";
	int id = 125000000;
	
	int acc = 958234198;
	
	String address = " 1920 McGraw Ave";
	
	String Customer = "Customer Name :" + name+"\n" + "Customer ID : "+ id  +" \nCustomer address :"+ address + "\nAccount number : "+ acc;
	
	System.out.println("Customer Account Summary Details-------------- \n" + Customer);
	}
	
	protected void sevingDetails() {
		
		initialbalance = 2000;
		deposit = 500;
		withdraw = 100;
		blance = initialbalance + deposit- withdraw;
		System.out.println("\n");
		System.out.println("Customer Total Saving Account Money :"+ blance );
		
		
		
		
		
	}

}

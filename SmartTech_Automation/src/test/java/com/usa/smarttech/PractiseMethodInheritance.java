package com.usa.smarttech;

public class PractiseMethodInheritance {

		static String name;
		static int deposite;
		static int withdraw;
		static int balance;
		
public static void openBusinessAccount() {
	
	name = "British Bangla Insttitute of Management & Technology(BBIMT)";
	String address = "23 Rambabu Road, Mymensingh.";
	String phone = "+88-01797-207191";
	int acc = 598930;
	
	String details = "Institute Name :"+name+"\n"+"Address :"+address+"\n"+ "Phone :"+phone+"\n"+"Account No:"+acc;
	
	System.out.println("Customer Information----------------------\n"+ details);
	
	
}
	public static void main(String[] args) {
		
		PractiseMethodInheritance obj = new PractiseMethodInheritance();
		obj.openBusinessAccount();
		
		
	}
	
	
	
	
	
	
	
	
	
	
}

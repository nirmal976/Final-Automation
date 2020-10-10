package com.usa.smarttech;
 	
public class Mathematics {
		String fname;
	 	String lname;
	 	int salary;

	public static void main(String[] args) {
		String fName = "Nirmal"; //Local variable 
	    String LName =  " Dey";
	    String fullName = fName + LName;   
	    System.out.println("This is a our new employee : "+ fullName);
	    
	    int salary = 112000;
	    int cola = 4000;
	    int leas = 3500;
	    int bnus =  6000;
	    
	    int yearllySalary = salary + cola + leas +bnus;
	    System.out.println("My total salary per enum : "+yearllySalary);

	    int avesalary = yearllySalary / 12;
	    System.out.println("My monthly salary:"+avesalary);
	    
	    double increasesalary= yearllySalary + (yearllySalary* 6/100);
	    
	    System.out.println("Next year salary:"+increasesalary);
	}

}

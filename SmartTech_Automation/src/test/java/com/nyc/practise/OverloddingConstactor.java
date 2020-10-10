package com.nyc.practise;

public class OverloddingConstactor {
	String name,gender;
	long phone;

	OverloddingConstactor(){
		System.out.println("No Information");
				
}
	
	OverloddingConstactor(String n,String g){
		name= n;
		gender=g;
		
	}
	
	OverloddingConstactor(String n,String g, long p){
		name= n;
		gender=g;
		phone = p;
		
	}
	
	void desplayInformation() {
		
		System.out.println("Name: "+name);
		System.out.println("Gender: "+gender);
		System.out.println("Phone: "+phone);
		System.out.println("\n");
	}
}


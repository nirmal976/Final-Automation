package com.nyc.practise;

public class Friends {
	
	 String name,gender; 
	 int age;
	 
	/* void Myfriendlistinfo(String n,String g,int a) {
		 name=n;
		 gender=g;
		 age = a;
	 }*/   
	 
	 Friends (String n,String g,int a){ // Parameterized Constructor 
		 
		 name=n;
		 gender=g;
		 age=a;
		 
		 }
	 
	 // parameterized method related to Friendsdescription
	 
	 void Myfriendlist() {
			System.out.println("Name: "+ name);
			System.out.println("Gender: "+ gender);
			System.out.println("Age: "+ age);
			System.out.println("\n\n");
		 
		 
	 }

	}


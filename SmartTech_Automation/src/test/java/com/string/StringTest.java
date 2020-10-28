package com.string;

public class StringTest {
	//What is String?
	//Ans :String is non primitive data type as well class
	// Why String is immutable?
	// Ans: When we declare the value we can not change
	// To solve this problem java bring two class
	// String Buffer & String Builder
	// String Buffer is mutable class.synchronise 
	// String Builder is mutable class.non- synchronize 
	public static void  stringImutable() {
		String  name = "Smart Tech";
				name = "Inc";
				name ="Nirmal"; // Why String is immutable?
		System.out.println(name);
		
	}
	
	public static void  string1() {
		String obj = new String("UPS");
				obj.concat("Company"); // not working concat method // UPS comming not UPS Company 
				System.out.println("I am from String Class: "+ obj);
	}
	
	public static void StringBuffer() {
		StringBuffer obj = new StringBuffer("UPS");
				obj.append("Company");
				System.out.println("I am String Buffer Class :"+ obj); // UPSCompany
	}
	
	public static void StringBuilder() {
		StringBuffer obj = new StringBuffer("UPS");
				obj.append("Company");
				System.out.println("I am String Builder Class :"+ obj);	//UPSCompany
				}
	
	// How to reverse String
	public static void StringBufferReverse() {
		
		String obj = new String("SmartTech");
		String rev = new StringBuffer(obj).reverse().toString();
		System.out.println("Reverse String Vaue : "+ rev);
	}
	
	public static void getSpecificCar() {
		String obj = new String("SmartTech");
		char ch = obj.charAt(4);
		System.out.println("The Index number of char : " + ch); // we can't create object by data type
	}
	// How to compare two String
	
	public static void compareString() {
		String s1 = "Selenium";
		String s2 = "TestNG";
		//System.out.println(s1==s2); // Expected and actual matching or not// out put true or false
		System.out.println(s1.equals(s2));// either way we can do it
		// if not match give false
	}
	
	// How to split the word
	public static void splitWord() {
		String word = "United State of America";
		String [] wd = word.split("\\s");
		for(String w: wd) {
			System.out.println(w);
		}
	
	
		
	}
	
	public static void uppercaseLowerCase() {
		String obj = new String ("SMARTTECH");
				System.out.println(obj.toLowerCase());
			System.out.println(obj.toUpperCase());
	}
	
	
	
	public static void main(String[] args) {
		/*string1();
		StringBuffer();
		StringBuilder();
		StringBufferReverse(); 
		getSpecificCar();
		compareString();*/
		//splitWord();
		uppercaseLowerCase();
	}
	
}

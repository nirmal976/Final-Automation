package com.string;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;

public class String_practise_Demo1 {
	
	public static void stringDeclare() {
		String name = "Nirmal Dey";
		String name1 = new String ("Nirmal Dey");
		System.out.println(name==name1); 			// false
		System.out.println(name.equals(name1)); 	// true
		
		char [] ch = {'N','i','r','m','a','l'}; 	// Nirmal
		System.out.println(ch);
		 // use of contains method
		System.out.println(name.contains("Dey")); 
		 // or
		boolean bl = name1.contains("Nirmal");		// true
		System.out.println(bl); 					// true
		
	}
	
	public static void stringConcat() {
		String name1 = "Aryan";
		String name2 = " Asmita";
		String fullName = name1.concat(name2);
		System.out.println(fullName); 			// Aryan Asmita
		
		String up = name1.toUpperCase();
		System.out.println("Upper Case :"+up);	// ARYAN
		
		String lo = name2.toLowerCase();
		System.out.println("Lower case :"+lo);	// asmita
		
		System.out.println(name1.startsWith("A")); // true
		System.out.println(name2.endsWith("n")); 	//false
	
	}
	
	public static void stringArray() {
		String [] name= {"Nirmal","Aryan","Soma","Asmita"};
		for(int i=0;i<name.length;i++) {
			System.out.println(name[i]);
		}
		// Repalce 
		 String name1 = new String ("Nirmol");
		String name2 = name1.replace('o', 'a');
		 System.out.println(name2);					//  Nirmal
		
	}
	
	public static void StringBuffer() {
		StringBuffer sb = new StringBuffer("Nirmal Dey");
		sb.append(", Barhatta");
		sb.append(", Netrakona");
		System.out.println(sb);
		sb.setLength(3);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
	}
	
	public static void StringBuilder() {
		
		StringBuilder sbd = new StringBuilder("Asmita jannat");
		sbd.append(", Bronx");
		sbd.append(", New york");
		System.out.println(sbd);
		sbd.setLength(6);
		System.out.println(sbd);
		sbd.reverse();
		System.out.println(sbd);
	}
	
	public static void stringReverse() {
		String name = new String("British Bangal");
		String rev = new StringBuffer(name).reverse().toString();
		System.out.println(rev);
	}
	
	public static void getSpecifier() {
		String name = new String ("Nirmal Dey");
		char ch = name.charAt(7);
		System.out.println(ch);	
	}
	
	public static void splitWord() {
		String name = "Nirmal Kusum Dey";
		String [] wd = name.split("\\s");
		for(String w:wd) {
			System.out.println(w);
		}
	
	}
	public static void removeSpecialSign() {
		String name = new String("Nirmal@@Kusum$$Dey%%");
		name = name.replaceAll("[^a-zA-Z0-9]", " ");
		System.out.println(name); //Nirmal  Kusum  Dey  
		String num = new String("12,501,33.00");
		num = num.replaceAll("[^a-zA-Z0-9]", " ");
		System.out.println(num);
		
	}
	
	public static void removeExtraSpace() {
		String name = new String("I    Like     Lenovo     laptops");
		StringTokenizer st = new StringTokenizer(name," ");
		StringBuffer sb = new StringBuffer();
		while(st.hasMoreElements()) {
			sb.append(st.nextElement()).append(" ");
		}
		System.out.println("After Removing Extra Space : "+ sb);
	}
	public static void getDate() {
		Date date = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		System.out.println(date);
		// + - date
		String days;
		cal.add(Calendar.DAY_OF_YEAR, -8);
		Date obj = cal.getTime();
		SimpleDateFormat format = new SimpleDateFormat("MM/dd/YYYY");
		days= format.format(obj);
		System.out.println(days);
		
		
		
	}
	
	public static void main(String[] args) {
	//	stringDeclare(); 
	//	stringConcat(); 
	//	stringArray();	
	//  StringBuffer();
	//	StringBuilder();
	//	stringReverse();
	//	getSpecifier();
	//	splitWord();
	//	removeSpecialSign();
	//	removeExtraSpace(); 
		getDate();
		
		
}
}
package com.groupStudy;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;

public class StringPractise2 {

	public static void StringValueOf() {
		int value = 20;
		
		String s1 = String.valueOf(value);
		System.out.println(s1+20); // 2020

	}
	
	public static void stringToCharArray() {
		
		String s1 = "Welcome to Bronx";
		char[] ch = s1.toCharArray();
		for(int i =0;i<ch.length;i++) {
			System.out.println(ch[i]);
		}
	}
	
	public static void stringGetByte() {
		String s1= "Nirmal Dey";
		byte [] b = s1.getBytes();
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]); 
		}
		
		
	}
	// remove special sign
	public static void removeSpecialsign() {
		String value = "My$Name@Is%Nirmal* ";
		value = value.replaceAll("[^a-zA-Z0-9]", " ");
		System.out.println(value);
		
		String num = "10,500.99";
		num = num.replaceAll("\\w+ ", " ");
		System.out.println(num);
		
	}
	public static void removeExtraSpace() {
		
		String name = "Smart   tech    it   soluaion In";
		StringTokenizer obj = new StringTokenizer(name, " ");
		StringBuffer sb = new StringBuffer();
		while(obj.hasMoreElements()) {
			sb.append(obj.nextElement()).append(" ");
		}
		
		System.out.println("Remove Extra Space: " + sb);
		
		
	}
	
	// How to find out disable date
	public static void getDate() {
		
		String days;
		Date date = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		System.out.println(date);
		
		cal.add(Calendar.DAY_OF_YEAR, - 25);
		Date obj = cal.getTime();
		SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
		days = format.format(obj);
		System.out.println("After one week date select : "+days);
		
		
		
	}
	
	
	
	// How to find out even and odd number
	// How to find plandrom number
	// How to find prime number
	public static void main(String[] args) {

	//	StringValueOf(); 
		//stringToCharArray();
		//stringGetByte();
		//removeSpecialsign();
		//removeExtraSpace();
		getDate();
		
	}

}

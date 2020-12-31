package com.string;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;

public class StringPractise_Demo1 {

	public static void compareString() {
		String name1 = "British-Bangla"; // Literal String
		String name2 = "British-Bangla";
		// In literal String == compare the value
		System.out.println(name1==name2); // true
		
		String name3 = new String("British Bangla");
		String name4 = new String("British Bangla");
		System.out.println(name3==name4); // false Its not compare value compare object
		//System.out.println(name3.equals(name4));
		
		
		
		System.out.println(name3.equals(name4));
		String name5 = new String("Spice Garden");
			   name5 = new String("BB-Mats");
			   System.out.println(name5==name5); // true
		
	}
	// Remove Special Sign from string
	public static void removeSpecialSign() {
		
		String value = new String("British##Bangla@@Institute%%of&&Technology**");
		value= value.replaceAll("[^a-zA-Z0-9]", " ");
		System.out.println(value);
		
		String num = new String("12,34.56");
		num=num.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(num);
		
	}
	
	// Remove Extra Space from String
	public static void removeExtraSpace() {
		String name = new String("British   Bangla   Institute    Technoogy");
		StringTokenizer obj = new StringTokenizer(name," ");
		StringBuffer sb = new StringBuffer();
		
			while(obj.hasMoreElements()) {
				sb.append(obj.nextElement()).append(" ");	
		}
		System.out.println("Before Removing Space :  "+ name);
		System.out.println("After Removng Space: "+ sb.toString().trim());
	}
	
	public static void getDate() {
		// to get present date
		Date date = new Date(); // java util
		Calendar cal = Calendar.getInstance(); //import java util package
		cal.setTime(date);
		System.out.println(date);
		// To get Back and Future date
		
		String days;
		cal.add(Calendar.DAY_OF_YEAR, 7);
		Date obj = cal.getTime();
		SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");// java text
		days= format.format(obj);
		System.out.println(obj);
				
			
	}
	
	
	
	public static void main(String[] args) {
		
	compareString();
	//removeSpecialSign();
	//removeExtraSpace(); 
		//getDate();
		
		
	}

}

package com.nyc.practise;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFind {

	public static void main(String[] args) {

		Date date = new Date();
		System.out.println("Date is: "+date);
		
		DateFormat dateformat = new SimpleDateFormat();
		
		String currentdate = dateformat.format(date);
		
		System.out.println("Current Date is  :"+currentdate);
		
		
	}

	}

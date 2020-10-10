package com.usa.smarttech;

public class IncrementDecrement {
	public static void main(String[] args) {
		
		int x=30;
		int y;
		
		y=x++;    // post increment (not increase in first time) ,output will 30
		
		System.out.println("post increment value:"+y);
		
		y = x; // increase when again find x  out put will be 31
		
		System.out.println("post increment value:"+y);
		
		int p=10;
		int q;
		
		q= ++p; // pre-increment   (increase the value first) output will 11
				
		System.out.println("pre-increament value:"+q);
		
		q=p; // value will be 11
		
		System.out.println("pre-increament value:"+q);
	
		int a= 15;
		int b;
		
		b= --a; // pre-decrement , output=14
		
		System.out.println("decrement value:"+b);
		
		b= a; //  output=14
		
		System.out.println("decrement value:"+b);		
		
		b= a--; // post decrement , output will be 14
		
		System.out.println("decrement value:"+b);		
		
		b=a; // out put will 13

		System.out.println("decrement value:"+b);		
}
}

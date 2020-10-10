package com.usa.smarttech;

import java.util.Scanner;

public class TriangleArea {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		double base,height,area;
		
		System.out.print("Enter base:");
		base=input.nextDouble();
		
		System.out.print("Enter height:");
		height=input.nextDouble();
		
		area =.5 * base * height;
		
		System.out.println("Area of a Triangle:"+area);
		
		

	}

}

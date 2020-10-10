package com.usa.smarttech;

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		
		double length,width,area;
		
		System.out.print("Enter the length:");
		length=input.nextDouble();
		
		System.out.print("Enter the width:");
		width=input.nextDouble();
		
		area= length * width;
		
		System.out.println("Area of rectangle:"+area);
		
		

	}

}

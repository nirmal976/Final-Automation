package com.usa.smarttech;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		double radius,area;
		
		System.out.print("Enter the radius:");
		radius=input.nextDouble();
		
		area = 3.1416 * radius * radius;
		
		System.out.println("Area of a circle:"+area);

	}

}

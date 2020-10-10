package com.polymorphism;

public class CompileTypePolymorphism {

		void add(int a, int b, int c) {
			System.out.println("The Sum is : "+ (a+b+c));
			
		}
		void add(double a,double b) {
			System.out.println("The sum is : "+ (a+b));
		}
		void add(float a, float b, float c) {
			System.out.println("The Sum is :" + a+b+c);
		}
}

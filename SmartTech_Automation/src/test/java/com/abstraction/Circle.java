package com.abstraction;

public class Circle extends Shape {
	Circle (double r){
		super (r,r);
		 
	 }
	 void area() {
		 
		 double result = Math.PI * dim1*dim2;
		 System.out.println("Area of Circle :"+ result);
	 }


}

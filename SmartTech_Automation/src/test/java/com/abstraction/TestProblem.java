package com.abstraction;

public class TestProblem {

	public static void main(String[] args) {
		Shape shape;
		shape = new Rectangle(12,30);
		shape.area();
		
		shape = new Triangle (10,20);
		shape.area();
		
		shape = new Circle (10);
		shape.area();



	}

}

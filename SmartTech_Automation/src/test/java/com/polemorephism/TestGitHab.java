package com.polemorephism;

public class TestGitHab {
void add(int a,int b) {
		
		System.out.println(a+b);
	}
	
	void add (double a, double b) {
		
		System.out.println(a+b);
	}
	
	void add (int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	void add() {
		
		System.out.println("Nothing to add");
	}
	
	public static void main(String[] args) {
		
		OverloaddingMethod ob1 = new OverloaddingMethod();
		ob1.add();
		ob1.add(5,10);
		ob1.add(10.2,5.8);
		ob1.add(4,3,5);
		
		
	}

}

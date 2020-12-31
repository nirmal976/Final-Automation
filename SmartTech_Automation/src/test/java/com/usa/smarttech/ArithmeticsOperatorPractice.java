package com.usa.smarttech;

public class ArithmeticsOperatorPractice {

	public static void main(String[] args) {
		//In Java there are few arithmetics Operators, +,-,*,/,%
		
		int a = 100;
		int b = 20;
		
		String  x= "HELLO";
		String y = "NIRMAL";
		
		double c = 9.01;
		double d = 10.99;		
		
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b); // Modulo operator returns remainder, for example 100 % 20 would return 0
		
		
		System.out.println(a+b+x+y);//
		System.out.println(a-b+x+y);
		System.out.println(a*b+x+y);
		System.out.println(a/b+x+y);
		System.out.println(x+y+a+b); // logic is left to right execution (not the result HELLONIRMAL120)
		System.out.println(x+y+(a+b)); 
		System.out.println(a+b+x+y+a+x+b+y);
		
		System.out.println(c+d);
		
		System.out.println("The Value of c:"+c);// how we want the output
		System.out.println("The Addition of a+c"+(a+c)); // string concatenation 
		
		System.out.print("I am Nirmal."); //ln means new line. if i remove it will show 2 line in 1 line in the output
		System.out.println("I am enjoying JAVA");
		
		
		//Assignments operators in java are: =, +=, -=, *=, /=, %=
		
		int e = 10;
		int f = 30;
	      
		//e = f ;
	    
		//System.out.println("e output:"+e);
		
		e+=f;
		
		System.out.println("1111e output:"+e);
		
		e-=f;
		
		System.out.println("e output:"+e);
		
		e*=f;
		
		System.out.println("e output:"+e);
		
		e/=f;
		
		System.out.println("e output:"+e);
		
		e%=f;
		
		System.out.println("e output:"+e);
		
		
	//Auto-increment and Auto-decrement Operators ++ and — —
		
		
		int num1=100;
		int num2=200;
		num1++;
		num2--;
		
		System.out.println("output of num1:"+num1);
		
		System.out.println("output of num2:"+num2);
		
		//logical operators in java are: &&, ||, !
		
		boolean b1=true;
		boolean b2=false;
		
		System.out.println("&& output:"+(b1&&b2)); // b1&&b2 will return true if both b1 and b2 are true else it would return false.
		System.out.println("|| output:"+(b1||b2)); // b1||b2 will return false if both b1 and b2 are false else it would return true.
		System.out.println("!(b1&&b2)"+!(b1&&b2)); // !b1 would return the opposite of b1, that means it would be true if b1 is false and it would return false if b1 is true.
		
		
		// if and else condition
		int p=10;
		int q =20;
		
		if(p>q) {
			System.out.println("p is greater");
		}
		else {
			System.out.println("q is greater");
	}
		// comparison operator >,<,>=,<=,==,!=
		
		int n=50;
		int m=60;
		
		if(n==m) {
			System.out.println("n and m are equql");
		}
		else {
			System.out.println("n and m are not equal");
		}
		
		// write  logic to find out highest number
		int a1=100;
		int b11=300;
		int c1=200;
		
		if (a1>b11 & a1>c1) {
			System.out.println("a1 is the greatest");
		}
		else if(b11>c1) {
			System.out.println("b11 is the greatest");
		}
		else {
			System.out.println("c1 is the greast"); // nested if else condition
		}
		
		
	
		
	}
}

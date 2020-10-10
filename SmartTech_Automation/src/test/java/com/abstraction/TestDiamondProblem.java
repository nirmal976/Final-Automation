package com.abstraction;

public class TestDiamondProblem implements CollegeStudents,CollegeLibary{

	public void LibarHours() {
		System.out.println("Libary hours: 10.00 am to 8.00 pm");
		
	}

	public void getbooks() {
		System.out.println("Get Books: The Bang Theorey ");
		
	}

	public void returnBook() {
		System.out.println("Return Books: History of Arab ");
		
	}

	public void getname() {
		System.out.println("Student Name : Aryan ");
		
	}

	public void getid() {
		System.out.println("Student Id : 244050");
		
	}

	public void getsubject() {
		System.out.println("Student Subject : CSE");
		
	}

	public void getcell() {
		System.out.println("Student Cell : 347-744-4245");
		
	}
	public static void main(String[] args) {
		
		TestDiamondProblem obj = new TestDiamondProblem();
		obj.getname();
		obj.getid();
		obj.getsubject();
		obj.getcell();
		obj.LibarHours();
		obj.getbooks();
		obj.returnBook();
	
}

	public void LibaryHours() {
		// TODO Auto-generated method stub
		
	}
	
}

package com.abstraction;

public class Student1 implements CollegeStudents {

	public void getname() {
		System.out.println("Student Name : Aryan Dey");
		
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
		
				Student1 obj = new Student1();
				obj.getname();
				obj.getid();
				obj.getsubject();
				obj.getcell();
}
			
	}


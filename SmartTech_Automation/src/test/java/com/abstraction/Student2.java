package com.abstraction;

public class Student2 implements CollegeStudents  {

	public void getname() {
		System.out.println("Student Name : Asmita Jannat");
		
	}

	public void getid() {
		System.out.println("Student Id : 244051");
		
	}

	public void getsubject() {
		System.out.println("Student Subject : CSE");
		
	}

	public void getcell() {
		System.out.println("Student Cell : 682-227-0557");
	}
	public static void main(String[] args) {
		
		Student2 obj = new Student2();
		obj.getname();
		obj.getid();
		obj.getsubject();
		obj.getcell();
}
}

package com.abstraction;

public interface CollegeStudents {

		void getname();
		void getid();
		void getsubject();
		void getcell();
		
		default void newJava() {
			
		}
}

// relative class Student1, Student2
// interface implements another class

// it also related to colleglibary to test diamond problem
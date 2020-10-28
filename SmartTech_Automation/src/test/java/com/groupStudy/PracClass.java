package com.groupStudy;

import java.util.HashSet;
import java.util.Set;

public class PracClass {

	public static  void setprac() {
		String [] dup = {"Nirmal","Aryan","Nirmal","Asmita"};
		Set <String>  name = new HashSet<>();
		
		for(String value:dup) {
			if(name.add(value)==false) {
				System.out.println("Duplicate Value: "+ value);
			}
					
		}
		
	}
	
	public static void main(String[] args) {
		setprac();

	}

}

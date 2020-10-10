package com.encapsulation;

public class EncapTest {

	public static void main(String[] args) {
		
		Person p1 =new Person();
		/*p1.name ="Nirmal"; // without Encapsulation
		p1.age = 35;
		p1.display();*/
				
		p1.setName("Nirmal");
		System.out.println(p1.getName());
		
		p1.setAge(35);
		System.out.println(p1.getAge());
		
		
	}
	
	
}

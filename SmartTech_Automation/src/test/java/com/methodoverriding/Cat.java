package com.methodoverriding;

public class Cat extends Animal {
	
	public void sound(){
		System.out.println("Cat sound like MIEW");
	}
	
	public static void main (String[] args) {
		
		/*Animal obj = new Cat();
		obj.sound();*/
		
		Cat obj = new Cat();
		obj.sound();
	}

}

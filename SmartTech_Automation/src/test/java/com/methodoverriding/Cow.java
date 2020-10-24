package com.methodoverriding;

public class Cow extends Animal {

	public void sound() {
		System.out.println("Cow Sound like Humba");
	}
	
	public static void main(String[] args) {
		
		//Animal obj = new Cow(); // This Way it work
		//obj.sound();
		
		Cow obj = new Cow();
		obj.sound();
	}
}

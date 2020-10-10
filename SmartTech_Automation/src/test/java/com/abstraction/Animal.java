package com.abstraction;

public interface Animal {

	void eat();
	
	default void newJava() {
}
}

// related to Dog and testDoginterface
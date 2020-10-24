package javaCollection;

import java.util.LinkedList;

public class LinkedListDemo3 {

	public static void main(String[] args) {
		// linkedList Specific method
		
		LinkedList l = new LinkedList();
		l.add("Dog");
		l.add("Cat");
		l.add("Horse");
		l.add("Deer");
		l.add("Elephent");
		System.out.println(l); // [Dog, Cat, Horse, Deer, Elephent]
		
		l.addFirst("Fish");
		l.addLast("Tiger");
		System.out.println(l); // [Fish, Dog, Cat, Horse, Deer, Elephent, Tiger]
		// if i want first and last element
		System.out.println(l.getFirst()); // Fish
		System.out.println(l.getLast());// Tiger
		
		// remove first and last element
		l.removeFirst();
		l.removeLast();
		System.out.println("After removing First and last element :"+ l);
		
		
		
		

	}

}

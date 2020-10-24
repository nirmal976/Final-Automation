package com.encapsulation;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {

	public static void main(String[] args) {

		HashSet hs = new HashSet(); // default capacity 16 , load factor 0.75
		//HashSet hs = new HashSet(100);// initial capacity 100
		
	   //	HashSet hs = new HashSet(100,(float) 0.95 );
		
		//HashSet <Integer>hs = new HashSet<Integer>(100); // if we want specific data
		 // How to add object/elements in HashSet
		hs.add(100);
		hs.add("Aryan");
		hs.add(10.99);
		hs.add('A');
		hs.add(true);
		hs.add(null);
		
		System.out.println(hs); // [null, 10.99, A, 100, Aryan, true]
		
		hs.remove(10.99);
		System.out.println("After Removing the obj :"+ hs);
		
		// contains
		System.out.println(hs.contains("Aryan"));// true
		System.out.println(hs.contains("aryan"));// false
		System.out.println(hs.isEmpty());
		
		// Reading object /elements from HashSet using for -- eachloop
		
		/*for(Object e: hs) {
			System.out.println(e);}*/
		
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
			
			
		}
		
	

}

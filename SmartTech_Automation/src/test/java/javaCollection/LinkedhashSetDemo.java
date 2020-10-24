package javaCollection;

import java.util.LinkedHashSet;

public class LinkedhashSetDemo {

	public static void main(String[] args) {
		
	//	LinkedHashSet <Integer> lset = new LinkedHashSet<Integer>();
		LinkedHashSet  lset = new LinkedHashSet();
		
		lset.add(100);
		lset.add(200);
		lset.add(300);
		lset.add(400);
		lset.add(500);
		
		System.out.println(lset); // insertion order Preserve
		
		// all the HashSet method also work here
		
		for(Object e:lset) {
			System.out.println(e);
		}
		
		
		
		
	}
}

package javaCollection;

import java.util.HashSet;

public class HashSetDemo1 {

	public static void main(String[] args) {
		
		HashSet hs = new HashSet(); // default capacity 16 and load factor 0.75
		//HashSet hs = new HashSet(100); // initial capacity 100

		//HashSet hs = new HashSet(100,(float)0.90); //  load factor 0.90 or 90%
		
	//	HashSet<Integer> hs = new HashSet<Integer>();
		
		// add objects/elements into HashSet
		hs.add(100);
		hs.add("Nirmal");
		hs.add(20.99);
		hs.add('A');
		hs.add(false);
		hs.add(null);
		
		System.out.println(hs);// [null, A, 100, false, Nirmla, 20.99] insertion order not preserve

		hs.remove(20.99);
		System.out.println("After Removing Element : "+hs);
		
		System.out.println(hs.contains("Nirmal")); //true
		System.out.println(hs.contains("BBIT"));//false
		
		System.out.println(hs.isEmpty());// false
		
		// Read all from HashSet
		
		for(Object e:hs) {
			System.out.println(e);
		}
		
		
	}

}

package javaCollection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("X");
		al.add("Y");
		al.add("Z");
		al.add("A");
		al.add("B");
		al.add("C");
		
		ArrayList al_dup = new ArrayList(); // addAll
		al_dup.addAll(al);
		System.out.println(al_dup);
		
		al_dup.removeAll(al);// removeAll
		System.out.println(al_dup);
		
		// sort an arrayList ---- Collections.sort()
		System.out.println("Elements in the arraylist :"+al); // [X, Y, Z, A, B, C]
		
		Collections.sort(al);
		
		System.out.println("Elements in the arraylist after sorting :"+al); // [A, B, C, X, Y, Z]
		
		// Reverse order or descending order
		Collections.sort(al,Collections.reverseOrder());
		System.out.println("Elements in the arraylist after Reversing :"+al);//[Z, Y, X, C, B, A]	
		
		
		// shuffling-- Collections .shuffle()
		
		Collections.shuffle(al);
		System.out.println("Elements in the arraylist after Shufling :"+ al);
		
	
		
		
	}

}

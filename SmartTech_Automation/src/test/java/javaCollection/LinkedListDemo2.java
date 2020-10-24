package javaCollection;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo2 {

	public static void main(String[] args) {

		LinkedList l = new LinkedList();
		
		l.add("X");
		l.add("y");
		l.add("z");
		l.add("A");
		l.add("B");
		l.add("C");
		// addall data from another linkedList
		LinkedList new_l = new LinkedList();
		new_l.addAll(l);
		System.out.println(new_l); // [X, y, z, A, B, C]
		
		// remove data
		new_l.removeAll(l);
		System.out.println(new_l); // []
		
		// sorting and shuffling 
		System.out.println("Before sorting : "+ l); // Before sorting : [X, y, z, A, B, C]
		Collections.sort(l);
		System.out.println("After sorting : "+ l); // After sorting : [A, B, C, X, y, z]
		
		Collections.sort(l,Collections.reverseOrder());
		System.out.println("After reverse order : "+ l); // After reverse order : [z, y, X, C, B, A]
		// shuffling 
		Collections.shuffle(l);
		System.out.println("After shuffling  : "+ l);// [X, y, B, A, C, z]
		
	
		
	}

}

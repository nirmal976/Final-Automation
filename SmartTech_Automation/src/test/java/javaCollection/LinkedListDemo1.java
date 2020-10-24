package javaCollection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1 {

	public static void main(String[] args) {
		// Declare LinkeList
		// LinkedList l = new LinkedList();
		
		//if we  only store homogeneous data like this 
		//LinkedList <Integer> l = new LinkedList<Integer>();
	   //  LinkedList <String> l = new LinkedList<String>(); 
		
		LinkedList l = new LinkedList();
		// add element 
		l.add(100);
		l.add("Nirmal");
		l.add(20.99);
		l.add(true);
		l.add(null);
		
		System.out.println(l);
		
		// Find size
		System.out.println(l.size());
		
		// remove
		l.remove(3); // index
		// l.remove('A'); // without index direct value not support  
		System.out.println("After Removig :"+ l);
		
		// Insert /Adding element in the middle of the LinkedList
		l.add(3, "Java");
		System.out.println("After inserting Elements : "+ l);//[100, Nirmal, 20.99, Java, null]
		// Retrieve the value/object
		System.out.println(l.get(3));
		
		// Replace the value
		l.set(4, "X");
		System.out.println("After Changing the Value :"+ l);
		// contains
		System.out.println(l.contains("Java")); // true
		System.out.println(l.contains("Python")); // false
		
		// isEmpty() 
		System.out.println(l.isEmpty()); // false
		// read the data from  LinkedList 
		
		//  reading elements from ll using for loop
		
		//for(int i= 0; i<l.size();i++) {
			//System.out.println(l.get(i));
		//}
		
		
		// //  reading elements from ll using for each loop
		//for(Object e:l) {
		//	System.out.println(e);
	//	}
		
		
		//   reading elements from ll using iterator Method 
		
		Iterator it = l.iterator();
				while(it.hasNext()) {
					System.out.println(it.next());
				}
		
		
	}

}

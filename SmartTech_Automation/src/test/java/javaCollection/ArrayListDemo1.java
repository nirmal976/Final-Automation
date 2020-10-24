package javaCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo1 {
	
	public static void main(String[] args) {
		//Declare Array list and import java.util
		// ArrayList al = new ArrayList(); // It can store Heterogeneous data and duplicate elements thats means different types of object and data type 
		//ArrayList <Integer> al = new ArrayList<Integer>();// Homogeneous data means specific datatype
		//ArrayList <String> al = new ArrayList<String>(); // String Type data specific
		
		// we can call Parent of Array list
	//	List al = new ArrayList(); //  import java.util.List
		
		ArrayList<Comparable> al = new ArrayList();
		
		// Add new elements to the ArrayList
		al.add("100");
		al.add("Nirmal");
		al.add("15.5");
		al.add('A');
		al.add(true);
		System.out.println(al); // out put will [100, Nirmal, 15.5, A, true]
		
		// How many elements are inside the array we can use . size()
		al.size();
		System.out.println("Number of elements in array list :" +al.size()); // 5
		// remove
		al.remove(1);// here 1 is index
		//al.remove("Nirmal"); // here Nirmal is elemet
		System.out.println("After remove output :"+al);
		// insert a new element ; add(index.object)
		al.add(2,"Nirmal");
		System.out.println("After the insertion : "+ al);
		// Retrieve specific element
		al.get(2);
		System.out.println("After get specific value : " + al.get(2));
		// change the existing value or replace element
		al.set(2, "Aryan");
		System.out.println("After replacing new element:" + al);
		// search a value on the list
		al.contains("Aryan"); // return true or false
		System.out.println("Search result :" + al);
		
		// isEmpty()
		System.out.println(al.isEmpty()); // false because there is data
		
	//	How we can read the data from ArrayList
		// 1) for loop
		
		/*System.out.println("reading Elements using For loop");
		
		for (int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}*/
		
		
		// 2) for ...each loop
		//System.out.println("Reading Elements using for each loop: ");
	//	for(Object e:al) {
			//System.out.println(e);
	//	}
		
		
		// 3) iterator()-- this s method in collections
		System.out.println("reading elements using iterator method");
		Iterator it = al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}

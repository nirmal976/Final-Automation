package javaCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;

public class CollectinPracDemo1 {
	
	public static void arrayList() {
		
		// Declare Array List
		List<String> city = new ArrayList<>(); 
		city.add("Manhattan");
		city.add("Queens");
		city.add("Brooklyn");
		city.add("Bronx");
		city.add("Staten Island");
		System.out.println("The Size of ArrayList: "+ city.size());
		// How to Reverse
		Collections.reverse(city);
		System.out.println("Reverse Order: "+ city);
		city.add("Westchester County");
		// insertion order not preserve
		Collections.sort(city);
		System.out.println("After Sorting : "+ city); //[Bronx, Brooklyn, Manhattan, Queens, Staten Island, Westchester County]
		// Remove Specific value
		city.remove(5);
		Collections.sort(city);
		System.out.println("Removing After Sorting : "+ city);//[Bronx, Brooklyn, Manhattan, Queens, Staten Island]
		// Duplicate values allowed 
		city.add("Bronx");
		Collections.sort(city);
		System.out.println("After Adding Duplicate Vlue: "+ city);
		// Remove Duplicate Value
		
		city = city.stream().distinct().collect(Collectors.toList());
		System.out.println("Revoming Duplicate Value: "+city);
		// Advance For Loop
		/*for(Object e: city) {
			System.out.println(e);
		}*/
		// Basic for Loop
		/*for(int i = 0;i<city.size();i++)
			System.out.println(city.get(i));*/
		// Iterator 
		Iterator <String> it = city.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
public static void linkedList() {
	List<Integer> li = Arrays.asList(100,200,300,400,500);
	// find the maximum value
	int max = Collections.max(li);
	System.out.println("Finding the Max Value: "+ max);
	// find the minimum valu
	int min = Collections.min(li);
	System.out.println("Find the Min value: "+ min);
	// isEmpty
	System.out.println("Is Empty: "+ li.isEmpty());// false, return boolean 
	
}
 public static void linkedListPrac() {
	 
	 LinkedList <String> name = new LinkedList<>();
	 name.add("Bangladesh");
	 name.add("India");
	 name.add("UK");
	 name.add("USA");
	 System.out.println(name);
	 // Adding a value to the first
	 name.addFirst("Australia"); 
	// Adding a value to thelast
	 name.addLast("South Afica");
	 System.out.println(name);
	 // Remove first and last elements
	 name.removeFirst();
	 name.removeLast();
	 System.out.println(name);// [Bangladesh, India, UK, USA] insertion order preserve
	 
	 //Sorted 
	 Collections.sort(name);
	 System.out.println("After Sorting : "+ name);
	 // reversing
	 Collections.reverse(name);
	 System.out.println("After Reverse: "+ name);
	 name.add("Bangladesh");
	 System.out.println("Adding duplicate value: "+ name);
	 /*for(int i=0;i<name.size();i++) {
		 System.out.println("All data: "+ name.get(i));
	 }*/
	 
	 Iterator <String> it = name.iterator();
	 while(it.hasNext()) {
		 System.out.println(it.next());
	 }	 
			 
 }
	
 public static void vectorList() {
	 List <String> ve = new Vector<>();
	 ve.add("Conception");
	 ve.add("Requirment");
	 ve.add("Design");
	 ve.add("Coding");
	 ve.add("Testing");
	 ve.add("Maintanance");
	 
	 System.out.println(ve);
	 //Know the index
	 System.out.println("Index of Testing : "+ ve.indexOf("Testing"));
	 
	 for(int i=0; i<ve.size();i++)
		 System.out.println(ve.get(i));
	 
 }
	public static void main(String[] args) {
		//arrayList();
	  //linkedList();
		//linkedListPrac();
		vectorList();
	}

}

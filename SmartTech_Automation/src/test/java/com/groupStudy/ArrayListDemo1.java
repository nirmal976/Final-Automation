package com.groupStudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo1 {
	public static void ArrayListprac() {
		//ArrayList arr = new ArrayList();
		
				//ArrayList<Integer> arr = new ArrayList<Integer>();
				
				List <String>  arr = new ArrayList <String>();
				
				arr.add("SmartTech");
				arr.add("Mr.Alam");
				arr.add("72");
				arr.add("A");
				arr.add("QA");
				arr.add("QA");
				System.out.println(arr);
				
				arr.size();
				
				System.out.println("Know the size of ArrayList : "+ arr.size());
				
				arr.remove(5);
				
				System.out.println("After removng: " + arr);
				
				arr.get(3);
				System.out.println("Specific Value :"+ arr.get(3));
				
				arr.set(3, "BB");
				
				System.out.println("Change the value" + arr );
				
				arr.contains("Nirmal");
				System.out.println("After Search :"+ arr.contains("Nirmal"));
				
				for(int i= 0;i<arr.size();i++) {
					System.out.println(arr.get(i));}
	}
	public static void ArrayListprac1() {
		List <String>  arr = new ArrayList <String>();
		
		arr.add("SmartTech");
		arr.add("Mr.Alam");
		arr.add("72");
		arr.add("A");
		arr.add("QA");
		arr.add("QA");
		System.out.println(arr);
		
		arr.size();
		
		System.out.println("Know the size of ArrayList : "+ arr.size());
		arr.remove(5);
		
		System.out.println("After removng: " + arr);
		
		Collections.sort(arr);
		System.out.println("After Sorting: "+ arr); // sort Ascending order
		
		Collections.reverse(arr);
		System.out.println("After Decending Order: "+ arr);
		Collections.shuffle(arr);
		System.out.println("After Shuffle : "+ arr);
		
		//Collections.sort(arr,Collections.reverseOrder()); // sort Descending 
		
		Collections.sort(arr, Collections.reverseOrder());
		
		System.out.println("Sorted by Decending order :"+arr);
	}
	
	public static void ArrayListprac2() {
		
		String arr[]= { "Nirmal", "Aryan", "Asmita"};
		
		for(int i=0; i<arr.length;i++) {
			System.out.println(i);
		}
		
		ArrayList <Integer>al = new ArrayList(Arrays.asList(arr));
		System.out.println(al);
		
	}
	
	public static void main(String[] args) {
		
		//ArrayListprac();
		ArrayListprac1();
	//	ArrayListprac2();
		
	}

}

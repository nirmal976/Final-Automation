package com.groupStudy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionPracTest {

	public static void arrayListtest() {
	
		List <Integer> num = new ArrayList<Integer>();
		//ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(10);
		num.add(20);
		num.add(30);
		num.add(40);
		num.add(50);
		num.add(60);
		
		num.remove(5);
		
		
		num.size();
		System.out.println("The Size of the ArrayList: " +num.size());
		
		Collections.reverse(num);
		System.out.println(num);
		
		for(int i=0;i<5;i++) {
			System.out.println(num.get(i));
		}

	}
	
	
	
	
	public static void main(String[] args) {
		arrayListtest();

	}

}

package javaCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListDemo4 {

	public static void main(String[] args) {
	
		List<String> al = new ArrayList<String>();
		
		// Add new elements to the ArrayList
		al.add("100");
		al.add("Nirmal");
		al.add("15.5");
		al.add("True");
		al.add("True");
		System.out.println(al); // out put will [100, Nirmal, 15.5, A, true]
		//		How remove duplicate value from ArrayList
		al = al.stream().distinct().collect(Collectors.toList());
		System.out.println(al);
	}

}

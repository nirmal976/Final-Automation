package interview.code.prac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Collections_prac {
	
	public static void arraylist() {
		List<Integer> num = new ArrayList<>(); // declare the arraylist 
		num.add(10);
		num.add(40);
		num.add(30);
		num.add(40);
		num.add(20);
	
		System.out.println(num.get(3)); // specific value 
		System.out.println(num); // row
		for(int i=0;i<num.size();i++) {
			System.out.println(num.get(i)); // 
		}
		//Collections.sort(num);
		//System.out.println(num); // sort 
		//Collections.reverse(num);
		//System.out.println(num); // reverse
		Collections.sort(num,Collections.reverseOrder()); // descending order
		System.out.println(num);
		// Remove  the duplicate value
		num= num.stream().distinct().collect(Collectors.toList());
		System.out.println(num);
		
		Set <Integer> dup = new HashSet<>(num); // convert arraylist to Hashset 
		System.out.println(dup);
		
		}
		
	
	public static void main(String[] args) {
		
		arraylist();
		
	}

}

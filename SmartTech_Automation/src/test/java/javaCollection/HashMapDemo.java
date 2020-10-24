package javaCollection;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		// Declare Hashmap 
		//HashMap m = new HashMap();
		HashMap <Integer,String> m = new HashMap<Integer, String>();
		
		m.put(101, "Nirmal");
		m.put(102, "Aryan");
		m.put(103, "Asmita");
		m.put(104,"Soma");
		m.put(105,"Mcgraw Ave");
		m.put(103,"Parkchester"); // old value replace with new value keys are unique
		m.put(106,"Mcgraw Ave"); // value can be duplicate
		
		System.out.println(m);
		
		System.out.println(m.get(105)); //Mcgraw Ave
		
		m.remove(106);
		System.out.println(m);
		
		System.out.println(m.containsKey(102)); // true or false
		System.out.println(m.containsKey(108));
		System.out.println(m.containsValue("Soma"));// true or false
		System.out.println(m.containsValue("Rupon"));
		System.out.println(m.isEmpty());// false
		
		// only key 
		System.out.println(m.keySet());
		System.out.println(m.values());
		// all  the entry
		System.out.println(m.entrySet());
		
		//read individual object
		
		for(Object i:m.keySet()) {
			System.out.println(i);  // all the keys
		}
		
	{}
		for(Object i:m.values()) { // only values
			System.out.println(i);
		}
		
		// all key with values one by one
		
		for(Object i:m.keySet()) {
			System.out.println(i+"   "+ m.get(i));
		}
	
		// Entry method 
		
		for (Map.Entry entry:m.entrySet()){
			System.out.println(entry.getKey()+ "   "+ entry.getValue());
		}
		
		
		
}
}

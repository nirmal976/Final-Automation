package javaCollection;

import java.security.KeyStore.Entry;
import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {

	public static void main(String[] args) {
	//	Hashtable t = new Hashtable(); // capacity 11, load Factor 0.75

		//Hashtable t = new (initial capacity); // create hashtable object some capacity
	//	Hashtable t = new Hashtable(initial capacity(int), (float) fill ratio/load factor);
		
		Hashtable <Integer, String> t = new Hashtable<Integer, String>();
		
		t.put(101, "Nirmal");
		t.put(102, "Aryan");
		t.put(103, "Asmita");
		t.put(104, "XXX");
		//t.put(null, "X"); // null not allowed , java.lang.NullPointerException
		System.out.println(t);
		
		System.out.println(t.get(103));
		
		System.out.println(t.remove(104));
		System.out.println(t.containsKey(102));
		
		System.out.println(t.containsKey(104));
		
		System.out.println(t.contains("Aryan")); 
		System.out.println(t.contains("Soma")); 
		
		System.out.println(t.isEmpty());
		
		System.out.println(t.keySet());
		System.out.println(t.values());
		
		/*for(int k:t.keySet()) {
			System.out.println(k + "     "+ t.get(k));
		}*/
		
		// entry specific methods
		
		for(Map.Entry entry:t.entrySet()) {
		System.out.println(entry.getKey()+ "    "+ entry.getValue());	
		}
		
		
		
		
	}

}

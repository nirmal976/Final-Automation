package javaCollection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo2 {

	public static void main(String[] args) {
		Map <Integer,String> m = new HashMap<Integer, String>();
		
		m.put(101, "Nirmal");
		m.put(102, "Aryan");
		m.put(103, "Asmita");
		m.put(104,"Soma");
		m.put(105,"Mcgraw Ave");
		m.put(103,"Parkchester"); 
		m.put(106,"Mcgraw Ave"); 
		
		for (Entry entry:m.entrySet()){
			System.out.println(entry.getKey()+ "   "+ entry.getValue());
		}
	}

}

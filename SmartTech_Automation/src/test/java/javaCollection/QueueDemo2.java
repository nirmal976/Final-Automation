package javaCollection;

import java.util.LinkedList;

public class QueueDemo2 {

	public static void main(String[] args) {
		LinkedList q = new LinkedList();
		
		//add elements add() or offer()
		q.add("A");
		q.add("B");
		q.add("C");
		q.offer(100); // this is possible here heterogeneous data 
		// Insertion and duplicate value allow 
		System.out.println(q);//  [A, B, C, C]
		// get head element element() or peek()
		System.out.println(q.element()); //  A
		System.out.println(q.peek()); //A
		
		// if the queue is empty than element() return exception 
		// if the queue is empty than peek() return Null
		
		// return and remove element from queue remove() or poll()
		
		//System.out.println(q.remove()); // A
		
		//System.out.println(q); // [B, C, C]
		
		//System.out.println(q.poll()); // A
		//System.out.println(q); //[B, C, C]
		
		// if Queue empty remove() return exception and poll() return NULL

		// just comment values and test 
		
		// reading data 
		/*Iterator itr = q.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}*/
		
		for (Object ele:q) {
			System.out.println(ele);
		}
		

	}


	

}

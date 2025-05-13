package linkedList;

import java.util.LinkedList;
import java.util.List;

public class LinkedListInJava {

	public static void main(String[] args) {
		/*
		 * ArrayList
		 * =======================
		 * LinkedList underline data structure is Dynamic array (shrink and grow)
		 * LinkedList allow duplicate
		 * LinkedList allow random Access(using index)
		 * linkedList allow null value
		 *linkedList will preserve the order of insertion
		 * 
		 * 
		 * 
		 * 
		 * */
		
		
		
		List<Integer> list=new LinkedList<Integer>();
		list.add(12);
		list.add(null);
		list.add(29);
		list.add(null);
		list.add(60);
		System.out.println(list);
		System.out.println(list.get(1));
		
		//difference between arraylist and linkedlist
		
		/*          1)
		 *    linked list underline data structure is doubly linked list
		 *    arraylist Dynamic Array
		 * 
		 * 
		 *         2)
		 *    linked list will occupy more memory(3 nodes)
		 *     arraylist will occupy less array
		 * 
		 *             3)
		 *     when ever there is a continuous operation on deletion we should go for linked list
		 *      when ever there is a continuous operation on deletion then  we should not go for array list
		 * */
	}
}

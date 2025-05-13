package set_interface;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetInterfaceDemo {
	public static void main(String[] args) {
		
		/*
		 * Set
		 * =====================
		 * 
		 * when you represent a group of individual object into a single entity 
		 * where the insertion order is not preserve  ,duplicate will not allowed
		 * then we go for set interface
		 * 1) order is not preserved
		 * 2) duplicate will not allowed
		 * 3) random access there
		 * 
		 * */
		Set<Integer> set=new HashSet<Integer>();
		set.add(12);
		set.add(null);
		set.add(45);
		set.add(50);
		
		System.out.println(set);     //order is not preserved so that we can not access by index 
		
		
          //example
		// here in  the  array we have duplicate values in order to remove the duplicate values  we go for set 
		List<Integer> list1=new ArrayList<Integer>();
		list1.add(30);
		list1.add(30);
		list1.add(null);
		list1.add(30);
		list1.add(50);
		System.out.println("list  having duplicate values:"+list1);
		
		//set
		Set<Integer> set1=new HashSet<Integer>(list1);
		System.out.println(set1);
		
		
	}

}

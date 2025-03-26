package CollectionInJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo2 {
public static void main(String[] args) {
	List<Integer> list=new ArrayList<Integer>();
	list.add(10);
	list.add(2);
	list.add(48);
	list.add(5);
	
	System.out.println("before list :"+list);
	
	/*
	 * collectons
	 * ===============
	 * it is a utility classess that provides methods to work with collection
	 * 
	 * 
	 * */
	//sort
	Collections.sort(list);
	System.out.println("After list ascending :"+list);
	
	//revesre
	Collections.reverse(list);
	System.out.println("After list adescending :"+list);
	
	//min
	System.out.println("min value :" +Collections.min(list));
	
	//max
	System.out.println("max value:"+Collections.max(list));


}
}

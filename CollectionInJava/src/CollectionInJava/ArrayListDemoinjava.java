package CollectionInJava;

import java.util.ArrayList;

public class ArrayListDemoinjava {
	public static void main(String[] args) {
		/*
		 * ArrayList
		 * =======================
		 * 1.arrayList is a improved version of array(Dynamic Array-if we delete the array element its size should reduce similarly if we add element  size should be reduced called dynamic
		 * 2.ArrayList underline data structure is Dynamic array (shrink and grow)
		 * 3.ArrayList allow duplicate
		 * 4.ArrayList allow random Access(using index)
		 * 5.ArrayList allow null value
		 * 6.ArrayList will preserve the order of insertion
		 * 
		 * 
		 * */
		
		ArrayList<Integer> list=new ArrayList<>(); //default capacity is 10 ,if add more than 10 also it will grow if less than 10 are  it will shrink results in dynamic array
		list.add(12);
		list.add(200);
		list.add(200);//duplicate values are allowed
		list.add(null);
		list.add(1);
		list.add(null); //null values are allowed
		list.add(12);
		list.add(200);
		list.add(100);
		list.add(null); 
		list.add(1);
		list.add(null);
		System.out.println(list);
		System.out.println(list.get(2));
		System.out.println(list.get(0));
		System.out.println("size :"+list.size());
		list.remove(2);//remove by index
		Integer i=100;//removby object
		list.remove(i);
		list.clear();
		System.out.println(list);
		
	}

}

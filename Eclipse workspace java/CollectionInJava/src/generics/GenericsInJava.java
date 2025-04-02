package generics;
import java.util.ArrayList;
import java.util.List;

public class GenericsInJava {
	public static void main(String[] args) {
		/*
		 * Generics
		 * ===========
		 * to provide the type safety and avoid the type casting in the collection then we should go for generics 
		 * 
		 * 
		 * */
		char [] arr= {'a','b','c'};//type safety
		char firstEle=arr[0];//without type casting(not required)
		System.out.println(firstEle);
		
		//without generics
		List arr1=new ArrayList();
		arr1.add(12);
		arr1.add(120);
		arr1.add("hello");
		int value=(int) arr1.get(0); //explicit type casting
		System.out.println(value);
		
		//generics
		List<Integer>
 list=new ArrayList<>(); //type safety
		list.add(12);
		list.add(120);
		//list.add(10.67);
		int a= list.get(1);
		System.out.println(a);
		System.out.println(list);
		
	}

}

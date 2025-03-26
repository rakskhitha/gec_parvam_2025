package Com.Collection.java;


import java.util.ArrayList;
import java.util.List;

public class List_in_java {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*
         * List
         * ================
         * it is a child interface of collection
         * it will contain some of the built in method that used inside a list implemented classes only
         * when you represent  aa group of individual object as a single entity where order is preserved and index based access and duplicate is allowed
         * 
         * 
         * 
         * 
         * */
		List list=new ArrayList();
		list.add(2);//0
		list.add("hello");//1
		list.add(10.67);//2
		System.out.println(list);
		String str=(String) list.get(1);
		System.out.println(str);
		double value=(double)list.get(2);
		System.out.println(value);
		
		
		
	}

}
package CollectionInJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo1 {

	
	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<>();
		list.add(12);
		list.add(200);
		list.add(300);
		list.add(400);
		
		//1.for loop
		
		
		for(int i=0;i<list.size();i++) {
			System.out.print("access using for lop"+i+" ");
		}
		
		System.out.println();
		//2.using for each is a enhanced for loop
		
		for(int i:list) {
			System.out.print("access using for each "+i+" ");
		}
		System.out.println();
		
		
		//3.using ForEach -arrow ,consumer
		
		list.forEach(i->System.out.print("access using for Each  "+i+" "));
		System.out.println();
		
		
		//4.access using iterator
		Iterator<Integer> itr=list.iterator();
		while(itr.hasNext()) {
			// System.out.print(itr.next()+" ");
			int i=itr.next();
			System.out.print("access using iterator"+i+" ");
		}
		
		
		
	}
}

package CustomStudentObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StartStudent {
public static void main(String[] args) {
	Student std1=new Student("raksha",3,24);
	Student std2=new Student("ramay",1,25);
	Student std3=new Student("raksha",8,24);
	Student std4=new Student("vishwa",2,21);
	
	
	List<Student> list=new ArrayList<Student>();
	list.add(std1);
	list.add(std2);
	list.add(std3);
//	list.add(std4);//we can also  write it as
	list.add(new Student("vishwa",1,21));
	System.out.println("Before");
	System.out.println(list);
//	list.remove(1);
//	System.out.println("after remove of index 1"+list);
	System.out.println("Roll number acending order");
	Collections.sort(list, (s1,s2)->s1.getRoll_num()-s2.getRoll_num()); //(list,comparator)  using getter and setter functional interface is interface having only one abstract method
	System.out.println("Roll number descending order");
	Collections.sort(list, (s1,s2)->s2.getRoll_num()-s1.getRoll_num()); //(list,comparator)  using getter and setter
	System.out.println("After");
	System.out.println(list);
	
}
}

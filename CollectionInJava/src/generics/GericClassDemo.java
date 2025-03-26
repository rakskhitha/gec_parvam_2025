package generics;
//this is normal class
/*class Student{
	int std_id;
	
	public Student (int std_id) {
		super();
		this.std_id=std_id;
	}
	public int returnvalue() {
		return std_id;
	}
	
}*/

// making normal class into generic 
class Student<T>{
	T std_id;
	
	public Student (T std_id) {
		super();
		this.std_id=std_id;
	}
	public T returnvalue() {
		return std_id;
	}
	
}

public class GericClassDemo {
	public static void main(String[] args) {
		Student std=new Student(12);
	//int value=	std.returnvalue();//normal
	//System.out.println(value);//normal
		
		
		Student<Integer> std1=new Student<>(12);//int value for T
		System.out.println(std1.returnvalue());
		Student<String> std2=new Student<>("student roll number ");// string value for T
		System.out.println(std2.returnvalue());
		
	}
	

}

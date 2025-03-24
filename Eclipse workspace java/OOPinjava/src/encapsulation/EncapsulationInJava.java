package encapsulation;


class Student{
	private String name;
	private int age;
	private double marks;
	
	public Student(String name, int age, double marks) {
		super();
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	
	
}

public class EncapsulationInJava {
	public static void main(String[] args) {
		Student std=new Student("lakshmi",23,90);
	//	std.setName("Lakshmi");
	//	System.out.println(std.getName());
		
		
	}
	

}
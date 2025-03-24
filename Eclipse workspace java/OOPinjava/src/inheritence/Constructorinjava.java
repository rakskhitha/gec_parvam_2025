package inheritence;



class Student1 {
	// states
	public int age;
	public String name;
	public double marks;

	// right click source
	// full args constructor
	public Student1(int age, String name, double marks) {
		System.out.println("full arguemnet constuctor");

		this.age = age;
		this.name = name;
		this.marks = marks;
	}

	// no args constuctor
	public Student1() {
		System.out.println("NO agrs constructor");
	}

	// actions
	public void isplaying() {
		System.out.println(this.name + "playing");

	}

	public void issinging() {
		System.out.println(this.name + "sisnging");
	}

	public void display() {
		System.out.println("NAME :" + this.name);
		System.out.println("age :" + this.age);
		System.out.println("marks" + this.marks);
	}
}

public class Constructorinjava {
	public static void main(String[] args) {
		Student1 std1 = new Student1(22, "raksha", 720.00);
		// std1.display();
		Student1 std2 = new Student1();
		std2.display();

	}

}
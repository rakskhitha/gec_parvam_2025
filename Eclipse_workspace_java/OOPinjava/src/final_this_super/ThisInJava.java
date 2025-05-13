package final_this_super;





class Person1{
	public String name;
	public int age;
	//no args
	public Person1() {
		System.out.println("default constructor");
	}

	
	//all args
	public Person1(String name, int age) {
		this();
		System.out.println("this is all args constructors");
		this.name = name;
		this.age = age;
	}
	public void sayhello() {
		System.out.println("hello ji");
	}
	
	public void display() {
		this.sayhello();
		System.out.println("Name :"+this.name);
		System.out.println("Age :"+this.age);
	}
	
}
public class ThisInJava {


	//1.it used to call  class instance variables
	// * 2.it used to call  class constructor
	// * it used to call class methods
	public static void main(String[] args) {
		{
			 Person1 person=new  Person1("lakshmi",25);
			 person.display();
		}
	}

}
package final_this_super;


class NewAnimal{
	public String name;
	public int age;
	//full args constructior
	public NewAnimal(String name, int age) {
		super();
		System.out.println("this is parent class constructor");
		this.name = name;
		this.age = age;
	}
	public void display() {
		System.out.println("name: "+this.name);
		System.out.println("name: "+this.age);
	}	
	
}


class NewDog extends NewAnimal {
	public String eat;
//constructor
	public NewDog(String name, int age, String eat) {
		super(name, age);
		this.eat = eat;
	}
	public void display() {
		super.display();
		System.out.println("Dog eat "+this.eat);
		System.out.println("name of the dog once again : "+super.name);
		System.out.println("name of the dog once again : "+super.age);
	}
	
}


public class SuperInJava {
public static void main(String[] args) {
	/*
	 * super
	 * ==================
	 * 1.it used to call super class instance variables
	 * 2.it used to call super class constructor
	 * it used to call super class methods
	 * 
	 * */
	NewDog dog =new NewDog("jymmy",45,"panipuri");
	dog.display();
}
}
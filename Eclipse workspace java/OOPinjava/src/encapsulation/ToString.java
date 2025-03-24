package encapsulation;







class Person{
	public String name;
	public int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		 this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
}

public class ToString {
	/*toString
	 * ===========
	 * it is a method that is used to display the objects
	 * */
 public static void main(String[] args) {
	 Person person=new Person("lakshmi",21);
	 System.out.println(person);
	 System.out.println(person.name);
	 System.out.println(person.age);
	 
	 
	
}
}
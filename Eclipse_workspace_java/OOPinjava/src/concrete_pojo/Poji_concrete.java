package concrete_pojo;

class parent2{
	private String name;
	private int age;
	private String address;
	//all constructor
	public parent2(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}
	//no arg constructor
	public parent2() {
		super();
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "parent2 [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
	
	
}



public class Poji_concrete {


public static void main(String[] args) {
	  /*
	   * POJO Class:
	   * ===========
	   * plain old java object(POJO)
	   * rules:
	   * ========
	   * 1.The class is should not extends or implements any class or interface
	   * 2.every fields(states/properties) should be private
	   *3.All-args Constructor
	   * 4.no-args Constructor
	   * 5.toString()
	   * Getter and setter pubilc methods
	   * */
	parent2 par=new parent2("lakshmi",23,"madluru");
	System.out.println(par);
}
}
package interfaceinjava;





//when we donot know the complete implementation of the method we go for the interface 

interface Animal{
	public void makesound();
}

//inorder to provide the body for thre interface i degine a class called dog
class Dog implements Animal{

	@Override
	public  void makesound() {
		// TODO Auto-generated method stub
		System.out.println("dog barks");
	}
	 
}






//other interface example



interface Cats {
	 public void canrun();
}


class Cat implements Cats{

	@Override
	public void canrun() {
		// TODO Auto-generated method stub
		System.out.println("can can run");
		
	}

	
	}
public class InterfaceInJava {
	public static void main(String[] args) {
		/*
		 * 
		 * Interface
		 * 
		 * =========
		 * interface is blue print of class 
		 * methods in the interface is by default abstract(does not have any body)
		 * 
		 * from java8  we can write default and static methods in interface
		 * 
		 * 
		 * =========
		 * syntax:
		 * interface interface_name{
		 *code
		 *}
		 *  =========
		 * example
		 * interface Animal{
		 * public void makesound();
		 * }
		 * */
		//in order to access the method called  makesound() in the main method i c\am creating the object because it is not a static method 
		Dog obj=new Dog();
		obj.makesound();
		
		
		Cat obj1=new Cat();
		obj1.canrun();
	}

}
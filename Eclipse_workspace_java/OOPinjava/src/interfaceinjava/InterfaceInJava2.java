package interfaceinjava;

//for interface we cannot create object so that we can not create a contructors for interface
//therefore no concept of constructor in the interface
//Interface1 obj=new Interface1(); cannot possible
interface 	Interface1{
	public void method(); //abstrsct method no body by class we implements
	//from java 8 we can also add default and static method in the interface when we donot want to touch a class for implememnting the interface
	
	//default and static method hav ebody also no need of class
	public default void defaultmethod() {
		System.out.println("this is default method");
	}	
	
		public static void staticmethod() {
			System.out.println("this is static method");
		}
	
}


//for abstract method method()
class Child1 implements Interface1{
//for default and static we donot get a method but we can acces abstract and default method using this class but canot access static because it can be access by classneme only
	@Override
	public void method() {
		// TODO Auto-generated method stub
		
	}
	
}
public class InterfaceInJava2 {

/*
* default and static method inside interface
* 
* */
	public static void main(String[] args) {
		Child1 obj1=new Child1();
		obj1.method(); //using obj1 of class
		obj1.defaultmethod();//sing obj1 of class
		Interface1.staticmethod();//using class name only we can but here class name is same as interface name Interface1
		
		
		
	}
}
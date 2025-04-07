package final_this_super;


final class Animal{
	
}

//class Dog extends Animal{          //we cannot extend a class we mentioned keyword final to the class
	
//}



//1.method-overriding
class Person{
	public final void walking() {                             //when we use the keyword final so we cannot extends the methods
		System.out.println("the person is walking");
	}
}

//class Mohan extends Person{
//	 public void walking() {
//		 System.out.println("Mohan is walking");
//	 }
//}

public class FinalInJava {
public static void main(String[] args) {
	
	/*
	 * final we cannot change the value 
	 * variable,methods ,class
	 * variable: the variable values canot be changed 
	 * methods: we cannot override final method 
	 * class: we cannot extends the  final class
	 *  */
	
	final double PI=3.14;
	System.out.println(PI);
	//PI=4.56;  we cannot change the variable value we we mentioned keyword final
	//System.out.println(PI);
	
	
}
}
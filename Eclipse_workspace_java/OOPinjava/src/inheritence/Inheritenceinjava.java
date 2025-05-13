package inheritence;



		/*
		 * 
		 * Inheritance:
		 * =============
		 * extending the properties of parent class child class
		 * 
		 * 
		 * 
		 * */




class Parent{
	public void parentmethod() {
		System.out.println("this is parenet method");
		
	}
}
 class Child extends Parent{
	 public void childmethod() {
		 System.out.println("this is child method");
	 }
 }


//if we difine a method in the private access it shows an erroe because private only acces inside a class

 //static method
	 class Child2 extends Parent{
		 public static void childmethod() {
			 System.out.println("this is child method using static");
		 }
	 }









	 public class Inheritenceinjava {
			public static void main(String[] args) {
		/*
		 * 
		 * Inheritance:
		 * =============
		 * extending the properties of parent class to  child class
		 * 
		 * properties (state and actions)
		 * types
		 * ===========
		 * 1.singel level
		 * 2.multi level
		 * 3.heirarchical
		 * 4.hybrid
		 * 5.multiple is not poosible in inheretace  ,so we use interface fwhere multiple is possible in interface
		 * 
		 * 
		 * */
		
		Child obj=new Child();
		obj.childmethod() ;//default method
		obj.parentmethod();//default  method
		Child2.childmethod();//static method
	}

}
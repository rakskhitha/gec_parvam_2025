package polymorphism;


	//1.method-overriding
	class Person{
		public void walking() {
			System.out.println("the person is walking");
		}
	}
	 class Mohan extends Person{
		 public void walking() {
			 System.out.println("Mohan is walking");
		 }
	 }
	 
	 //2. method-overloading --> compile time polyphorphism/static polymorphism

	 class Addition{
		 public void add(int a,int b) {
			 System.out.println("Addition is :"+(a+b));
		 } 
		 public void add(int a,int b,int c) {
			 System.out.println("Addition is :"+(a+b+c));		 
			 
		 }
		
	 }
	 
	 public class PolymorphismInJava {
	  public static void main(String[] args) {
		/*
		 * polymorphism:
		 * ===========
		 * poly->many
		 * morphism->forms
		 * it a mechanism that methods will perform a different  actions based 
		 * on the situation
		 * 1.method-overloading(one class)
		 * 2.method-overriding(two class)
		 * */
		  
		  //1.method overriding /runtime polymorphism
		  Mohan mohan=new Mohan();
		  mohan.walking();
		 
		  //2.method overloading
		  
		  Addition addition=new Addition();
		  addition.add(20, 30);
		  addition.add(10, 20, 30);
	}
	}
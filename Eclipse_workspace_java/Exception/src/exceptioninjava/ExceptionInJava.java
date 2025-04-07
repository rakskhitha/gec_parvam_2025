package exceptioninjava;


import java.io.FileNotFoundException;
import java.io.PrintWriter;



public class ExceptionInJava {


	//recursion
	//public static void display() {
	//	display();
	//}
	
	public static void main(String[] args) {
		
 /*
  * Exception in Java:
  * ====================
  * * there is a unwanted  or un-expected event occur in the program 
  * * when ever there is exception the normal flow will stops.
  * 
  * 2.types
  * ==========
  * 1.checked exception(compile time) -FileNotFoundException
  * 2.unchecked exception(run time) - ArrayIndexOutBoundException
  * 
  * Error:
  * ==========
  * * it is a problem where the programmer can not handle it ex:Stackoverflow error
  * 
  */
		//ERROR
	// ExceptionInJava.display();
		
		
	//	.checked exception
	//	1.try catch
//		2.throw
	try {
 PrintWriter printWriter=new PrintWriter("abc.txt");
 printWriter.println("hello world");
 System.out.println("hello world");
 printWriter.close();
	}catch(FileNotFoundException e) {
		e.printStackTrace();
		System.out.println(e.getMessage());
	
		System.out.println(e);
	}
	
	
	//2. throws
//	 PrintWriter printWriter=new PrintWriter("abc.txt");
//	 printWriter.println("hello world");
//	 System.out.println("hello world");
//	 printWriter.close();
//	
}
	
	
	
}
package exceptioninjava;




public class ExceptionInJava3 {
	public static void validate(int age) {
		if(age<18) {
			throw new ArithmeticException("Invalid age");
		}
		else {
			System.out.println("your age is"+age);
		}
	}
public static void main(String[] args) {
	/*
	 * finally block:
	 * ==================
	 * * this will execute even if the exception occur or not
	 * * where we have to write the closing code like db connection,file close
	 * */
//	try {
//		System.out.println(10/0);
//	}finally {
//		System.out.println("this is finally block");
//	}
	
//	try {
//		System.out.println(10/0);
//	} catch (Exception e) {
//		System.out.println(e);
//	}finally {
//		System.out.println("This is  finally block2");
//	}
	
	try {
		 validate(12);
		//validate(21);
	} catch (Exception e) {
		System.out.println(e);
	}
	
}
}
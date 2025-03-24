package exceptioninjava;


public class ExceptionInJava1 {
	public static void main(String[] args) {
		/*
		 * unchecked exception
		 */
		int a=10;
		int b=0;
		try {
			System.out.println("Result is"+(a/b));
		} catch (ArithmeticException e) {
		System.out.println(e);
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
		System.out.println("Hello World");
	}
	

}
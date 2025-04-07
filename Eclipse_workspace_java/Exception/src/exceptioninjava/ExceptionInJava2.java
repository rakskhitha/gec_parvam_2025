package exceptioninjava;



public class ExceptionInJava2 {
public static void main(String[] args) {
	/*
	 * try with multiple catches
	 * */
	int[]arr=new int[2];
	arr[0]=80;
	arr[1]=30;
	
	try {
		System.out.println(arr[10]);
		System.out.println(10/0);
	} catch (ArrayIndexOutOfBoundsException e) {
	    System.out.println(e);
	}catch(ArithmeticException e) {
		System.out.println(e);
	}
        System.out.println("Hello World");
}
}
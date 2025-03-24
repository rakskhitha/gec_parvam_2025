package introduction_to_java.first_program;

import java.util.Scanner;

public class NonPrimitive {
	public static void main(String[] args) {

	/*
	 * 1. Array 2. String 1.array ====== <datatype>[] arrayname={}; 2.String String
	 * name="";
	 * 
	 */
	
		// int[] array1 = {1,2,3,4,5};
		// System.out.println(array1[4]);

		// String name="Mohan hello";
		// System.out.println(name);

		// int[] array3= {1,2,3,4,5,4,6,78};
		// System.out.println(Arrays.toString(array3));

		// Scanner sc=new Scanner(System.in);
		// sc.next();
		// sc.nextLine();

		/*
		 * student name student age student marks student gender student branch student
		 * address
		 */

		System.out.println("Enter a student name:");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println("Name:" + name);

		System.out.println("Enter a student age:");
		Scanner sc3 = new Scanner(System.in);
		int age = sc3.nextInt();
		System.out.println("Age:" + age);

		System.out.println("Enter a student marks:");
		Scanner sc4 = new Scanner(System.in);
		double marks = sc4.nextDouble();
		System.out.println("Marks:" + marks);

		System.out.println("Enter a student gender:");
		Scanner sc5 = new Scanner(System.in);
		char gender = sc5.nextLine().charAt(0);
		System.out.println("Gender:" + gender);

		System.out.println("Enter a student branch:");
		Scanner sc6 = new Scanner(System.in);
		String branch = sc6.nextLine();
		System.out.println("Branch:" + branch);

		System.out.println("Enter a student address:");
		Scanner sc7 = new Scanner(System.in);
		String address = sc7.nextLine();
		System.out.println("Address:" + address);

	}

}

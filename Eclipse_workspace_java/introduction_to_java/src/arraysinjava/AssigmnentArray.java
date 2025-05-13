package arraysinjava;

import java.util.Scanner;

public class AssigmnentArray {
	public static void main(String[] args) {
		// 1st assignment

//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter the size of the array you want");
//		int size = sc.nextInt();
//		char[] array = new char[size];
//
//		System.out.println("enter the values for the array");
//		for (int i = 0; i < array.length; i++) {
//			System.out.println("enter " + i + "th element");
//			array[i] = sc.next().charAt(0);
//		}
//		System.out.println("the array elements are");
//		for (var ch : array) {
//			System.out.print(ch + " ");
//		}

//2nd assignments
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the row and col of array");
		int row = sc.nextInt();
		int col = sc.nextInt();

		System.out.println("enter the values");
		char[][] arr = new char[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = sc.next().charAt(0);
			}
		}

		System.out.println("array elemmets are");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		sc.close();

}
}
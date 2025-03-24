package loopingstatements;

public class LoopingStatements {
	public static void main(String[] args) {
		/*
		 * for loop while loop do-while loop for each loop ==== for(<datatype>
		 * variable_name :collection){}
		 */

		// for loop
		int[] array = { 1, 2, 3, 4, 5 };
		for (int i = 0; i <= 4; i++) {
			System.out.println(array[i]);
		}

		// while loop

		int j = 0;
		while (j < 101) {
			System.out.println(j);
			j++;
		}

		// do-while loop
		int[] array1 = { 1, 2, 34, 4, 5 };
		int k = 0;
		do {
			System.out.println(array1[k]);
			k++;
		} while (k < 4);

		// for each
		int[] arr = { 100, 200, 300, 400, 500 };
		for (int a : arr) {
			System.out.println(a);
		}

	}

}

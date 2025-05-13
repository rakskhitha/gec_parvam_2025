package arraysinjava;

public class ArrayInJava1D {
	
	public static void main(String[] args) {
		/*
		 * 
		 * Array in JAVA if we wan tto store MULTIPLE values of same datatypes we have
		 * to go for array
		 * 
		 * <datatype> [] array_name = new <datatype>[size];
		 * 
		 * int [] array1 = new int[4];
		 * 
		 * 
		 * 
		 * 
		 * how to declare and initialize the array: ================================
		 * 
		 * int [] array1 ={1,2,3};
		 * 
		 * 
		 * types: ======= 1.1D -> single row
		 * 
		 * int [] array1 = new int[4];
		 * 
		 * 2. 2D -> in the form of table; int [][] array1= new int[4][3]; ---> 4*3=12
		 * elements
		 * 
		 */
		int[] arr = new int[5];
		arr[0] = 30;
		arr[1] = 20;
		arr[2] = 40;
		arr[3] = 50;
		arr[4] = 60;
		// arr[5]=100;//array index is bound exception
		// using this foor loop we can insert the values but same number
		for (int i = 0; i < 4; i++) {
			arr[i] = 10;
		}
		for (var i : arr) {
			// System.out.println(i+" ");
			System.out.print(i + " ");

		}
	
	

}


}
package arraysinjava;
import java.util.Scanner;
public class Array1Duserinput {
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array you want");
		int size =sc.nextInt();
		int [] array=new int[size];
		
		System.out.println("enter the values for the array");
		for(int i=0;i<array.length;i++){
			System.out.println("enter "+i+"th element");
			array[i]=sc.nextInt();
		}
		System.out.println("the array elements are");
		for(int j=0;j<array.length;j++){
		System.out.print(array[j]+" ");

	}
	sc.close();
		
}




}
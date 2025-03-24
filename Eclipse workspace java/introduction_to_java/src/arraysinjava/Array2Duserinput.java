package arraysinjava;
import java.util.Scanner;
public class Array2Duserinput {
	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the row and col of array");
		int row=sc.nextInt();
		int col=sc.nextInt();
		
		System.out.println("enter the values");
		int[][] arr=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]=sc.nextInt() ;
			}
		}
		
		System.out.println("array elemmets are");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
			System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
		}
}




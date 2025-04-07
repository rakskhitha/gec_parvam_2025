package arraysinjava;

public class ArrayInJava2D {
public static void main(String[] args) {
		
		/*
		 * 2d array
		 * 
		 * 
		 * */
		int [][] arr=new int[2][2];
		arr[0][0]=10;
		arr[0][1]=20;
		arr[1][0]=30;
		arr[1][1]=40;
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	
				
		
	}

}






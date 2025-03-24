package controlstatements;

import java.util.Scanner;

public class Switch2 {
	public static void main(String[] args) {

//			char grade='A';
//			switch(grade) {
//			case 'A' -> System.out.println("EXCELLENT");	
//			case 'B' -> System.out.println("GOOD");
//			case 'C' -> System.out.println("AVERAGE");
//			default ->System.out.println("KKEP IT UP");
//			}
//			
//			

		// take user input integer
		// check for weekends
		// 1-5 weekdays and 6-7 weekend else invalid day

		System.out.println("enter the day : ");
		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();
//			switch (day) {
//			case 1->System.out.println("weekdays");
//			case 2->System.out.println("weekdays");
//			case 3->System.out.println("weekdays");
//			case 4->System.out.println("weekdays");
//			case 5->System.out.println("weekdays");
//			case 6->System.out.println("weekend");
//			case 7->System.out.println("weekend");
//			default->System.out.println("invalid day");
//			}

		// other method is used for latest java version
		switch (day) {
		case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
		case 6, 7 -> System.out.println("Weekend");
		default -> System.out.println("Invalid day");
		}
		// other method at last we have to add ;
		// other method is used for latest java version
		String res = switch (day) {
		case 1, 2, 3, 4, 5 -> "Weekday";
		case 6, 7 -> "Weekend";
		default -> "Invalid day";
		};
		System.out.println("the result is :" + res);

	}
}

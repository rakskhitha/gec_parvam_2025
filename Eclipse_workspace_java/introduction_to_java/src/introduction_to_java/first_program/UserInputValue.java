package introduction_to_java.first_program;
import java.util.Scanner;


public class UserInputValue {
public static void main(String[] args) {
	
	
			int stdAge=0;
			System.out.println("Enter the student age");
			Scanner sc= new Scanner(System.in);
			stdAge=sc.nextInt();
			System.out.println("the age of this student is:"+stdAge);
			
			short Age=0;
			System.out.println("Enter the student age");
			Scanner sc1= new Scanner(System.in);
			stdAge=sc1.nextShort();
			System.out.println("the age of this student is:"+Age);
			
			long stdAge1=0;
			System.out.println("Enter the student age");
			Scanner sc2= new Scanner(System.in);
			stdAge1=sc.nextLong();
			System.out.println("the age of this student is:"+stdAge1);
			
			float stdAge4=0;
			System.out.println("Enter the student age");
			Scanner sc4= new Scanner(System.in);
			stdAge4=sc.nextFloat();
			System.out.println("the age of this student is:"+stdAge4);
			
			double stdAge7=0;
			System.out.println("Enter the student age");
			Scanner sc8= new Scanner(System.in);
			stdAge7=sc.nextDouble();
			System.out.println("the age of this student is:"+stdAge7);
			
			boolean stdAge9=true;
			System.out.println("Enter the student age");
			Scanner sc9= new Scanner(System.in);
			stdAge9=sc.nextBoolean();
			System.out.println("the age of this student is:"+stdAge9);
			
			byte stdAge5=0;
			System.out.println("Enter the student age");
			Scanner sc5= new Scanner(System.in);
			stdAge5=sc.nextByte();
			System.out.println("the age of this student is:"+stdAge5);
			
			sc.nextLine();
			
			//character
			System.out.println("Enter your gender");
			Scanner sc6= new Scanner(System.in);
			char gender = sc6.nextLine().charAt(0);
			System.out.println("gender is:"+gender);
			
			
			
			
			
			
	
}
}


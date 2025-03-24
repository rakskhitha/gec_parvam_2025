package ASSIGNMENT;

import java.util.Scanner;

public class BankAccount {
	private int account_number;
	private String  account_holder_name;
	private int balance=500;
	
	public void pr() {
		System.out.println("your total bank balance is :"+balance);
	}
	
	
	public void depo_with() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the ammont you have to deposite");
		int depo=sc.nextInt();
		System.out.println("your total bank balance is :"+(balance+depo));
		
		
		int balance1=(balance+depo);

		if(balance1<=500) {
			System.out.println("you are not able to withdraw the ammount from account since it is allready less than basic minimum deposite it cannot go to negative digits");
		}else {
			Scanner sc1=new Scanner(System.in);
			System.out.println("enter the ammont you have to withdraw");
			int with=sc1.nextInt();
			
			System.out.println("you have withdrawe amount :" +with);
			System.out.println("total balance :"+(balance1-with));
			}
			
		}
		
		public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the bank holder name");
			String name=sc.nextLine();
			System.out.println("the holder name is : "+name);
			System.out.println("enter the account number");
			int no=sc.nextInt();
			System.out.println("the holder name is : "+no);
			
	
			
			
			 BankAccount obj=new  BankAccount();
			 obj.pr();
			obj.depo_with();
		}
}




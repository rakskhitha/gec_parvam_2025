package Stringsinjava;

public class Stringsinjava {



	public static void main(String[] args) {
		/*
		 * String:
		 * =============
		 * it is a group of vcharacters
		 * 
		 * ex: table
		 * need to enclose within ""
		 * 
		 * how to declare the string
		 * ==========================
		 * 1.using string literal
		 * string var_name="stting_name"
		 * 
		 * 2.using new keyword
		 * String var_name= new Strin("string_name");
		 * 
		 * 
		 * */
		
		
		String str1 = "String1";
		
		String str2 = new String("String2");
		String str3 = "String1";
		String str4 = new String("String2");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str1.equals(str2)); // true  check gor values
		System.out.println(str1==str2);// false check for references (adddress)
		System.out.println(str1==str3);//true
		System.out.println(str1.equals(str3)); //true
		System.out.println(str2.equals(str4));//true
		System.out.println(str1==str4);// false 
		
		
		String str5 = new String ("String5");
		//str5.concat("hello); not applicable because string is immutable but we can reassign
		//we cannot chnage the value of the string but we can re assign
		str5=str5.concat("hello"); //we can reassign
		System.out.println(str5);
	}

}
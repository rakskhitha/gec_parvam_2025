package Stringsinjava;

public class StringMethodinjava {


	public static void main(String[] args) {
		
		/*
		 * String Methods
		 * 
		 * 1.equals
		 * 2. equalsignorecase
		 * 3.==
		 * 4.concat
		 * 5.toUpperCase()
		 * 6.toLowerCase()
		 * 7.trim
		 * 8.startsWith
		 * 9.endsWith
		 * 10.strip
		 * 11.isBlank()
		 * 12.compare
		 * 
		 * 
		 * 
		 * 
		 * */
		
		String str1= new String ("Hello World");
		String str2= new String ("hello world");
		//1.equals
		System.out.println("equals : "+str1.equals(str2));
		
		//2.equals ignore case
		System.out.println("equalsignorecase:"+str1.equalsIgnoreCase(str2));
		
		//3. ==
		System.out.println("=="+str1==str2);
		
		//4.concat
		System.out.println(str1.concat(" ").concat("hi"));
		
		//5 toUpperCase
		System.out.println(str1.toUpperCase());
		
		//6.toLowerCase()
		System.out.println(str2.toLowerCase());
		
		//7.trim
		String str3= new String ("              hello world");
		System.out.println(str3.trim());
		
		//8.strip
		System.out.println(str3.strip());
		
		//9.isBlank()
		System.out.println(str3.isBlank());
		
		//10.compare
		System.out.println(str2.compareTo("Hello world"));
		
		
		//11.endswith
		System.out.println(str1.endsWith("World")); //case sensitive
		
		//12.startswith
		System.out.println(str1.startsWith("hello"));
	}

}
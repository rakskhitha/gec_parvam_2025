package com.functionalinterface;

@FunctionalInterface
interface Interface2{
	public void display();
}

@FunctionalInterface
interface Interface3{
	public int stirng(String s);
}

public class FunctionInterfaceInJava1 {
	public static void main(String[] args) {
		//int a = 10;
		Interface2 i = ()->System.out.println("Hello world");
		i.display();
		
		Interface3 i3 = s->s.length();
		int res  =i3.stirng("Hello world");
		System.out.println("Result is : "+res);
	}
}

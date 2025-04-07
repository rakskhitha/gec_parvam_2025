package Functionsinjava.function;

public class Functionsinjava {



	// 1.
	//a. PR
	public int add(int a,int b) {
		return a+b;
	}
	//b. NPR
	public int NoP() {
		return 420;
	}
	//c. PNR
	public void PNoR(int a,int b) {
		 System.out.println(a+b);
	}
	//d.NPNR
	public void NPNR() {
		 System.out.println("no parameter  no returns");
	}
	public static void main(String[] args) {
		/*
		 * 
		 * Functions/methods in java; ==========================
		 * 
		 * <access_modifier> return type function name(parameters){
		 * 
		 * 
		 * //code }
		 * 
		 * example: public void add(int a, int b){ syso(a+b); }
		 * 
		 * 
		 * two types of functions 1.builtin -next(),nextLine(),println(),equals()
		 * 
		 * 2.user defined
		 * 
		 * ===============
		 *   a.function return a value not accepting parameter;
		 *   b.function return a value and accept a parameter 
		 *   c.function not return a value but accept parameter
		 *   d.function not return a value also not accepts a parameter
		 * 
		 * 
		 */
		
		 Functionsinjava obj1=new  Functionsinjava();
		//a.
		int res=obj1.add(20,30);
		System.out.println("result : "+res);
		//b
		System.out.println(obj1.NoP());
		
		//c.
		obj1.PNoR(2,5);
		
		//d.
		obj1.NPNR() ;
		
		
		
	}
}
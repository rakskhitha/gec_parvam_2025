package Functionsinjava.function;

public class Functionsinjava1 {


	//1.public function:
	//-> anywhere
	public void publicFunction() {
		System.out.println("this si a public functions");
		
	}
	
	//2. private function
	//within class
	private void PrivateFunction() {
		System.out.println("This is private function");
	}
	
	//3.default function
	// within package
	void defaultfunction() {
		System.out.println("this is default function");
	}
	
	//4.protected function
	//within in package and subclass of other package
	protected void ProtectedFunction() {
		System.out.println("this is protected function");
	}
  
	//5.static function
	//no need of creating object to access
	public static void StaticFunction() {
		System.out.println("this is a static function");
	}
	
	public static void main(String[] args) {
		 Functionsinjava1 obj=new  Functionsinjava1();
		obj.publicFunction();
		obj.PrivateFunction();
		obj.ProtectedFunction();
		obj.defaultfunction();
		 Functionsinjava1.StaticFunction();
		
		
	}
	
	
}
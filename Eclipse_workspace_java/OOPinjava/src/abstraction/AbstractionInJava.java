package abstraction;




//1.interface
interface Animal{
	public void eat();
}

class Lion implements Animal{

	@Override
	public void eat() {
		System.out.println(" veg lion eats plant");
		
	}
	
}



//2.abstrct class

abstract class Vehicle{
	//ab method
	public abstract void start();
	//non ab
	public void stop() {
		System.out.println("vehicle is stoped");
		
	}
}
class Vehicle1 extends Vehicle{

	@Override
	public void start() {
	System.out.println("vehiclr started");
		
	}
	
}


public class AbstractionInJava {
/*
* Abstraction:
* ================
* it is a process of hiding the implementation and showing only the essential resources.
* 2.ways:
* =========
* 1.Interface(100%)
* 2.abstract class(0-100%)
* 
*/
	public static void main(String[] args) {
		Lion ani=new Lion();
		ani.eat();
		
		Vehicle ve=new Vehicle1();
		ve.start();
		ve.stop();
		
		
		
	}
}
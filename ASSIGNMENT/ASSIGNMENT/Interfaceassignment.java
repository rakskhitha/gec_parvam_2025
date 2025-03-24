package ASSIGNMENT;


interface Animal{
	public void eat();
	public void makesound();
}


class Dog implements Animal{

	@Override
	public void eat() {
	System.out.println("dog eats chips");
	}

	@Override
	public void makesound() {
	System.out.println("dog sounds like bow bow");
	}
	
}

class Cat implements Animal{

	@Override
	public void eat() {
		System.out.println("cat eats rat");
		
	}

	@Override
	public void makesound() {
		System.out.println("cat sounds like mewow mewow");
	}
	
}



public class Interfaceassignment {
public static void main(String[] args) {
	Dog dog=new Dog() ;
	dog.eat();
	dog.makesound();
	
	
	Cat cat =new Cat();
	cat.eat();
	cat.makesound();
}
}

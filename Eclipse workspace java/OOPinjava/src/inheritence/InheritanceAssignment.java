package inheritence;

interface interfaceA {
	public void methodA() ;

}

class Childs implements interfaceA{

	@Override
	public void methodA() {
		// TODO Auto-generated method stub
		System.out.println("this is interface clsass");
	}
	
}



interface interfaceB {
	public void methodB() ;

}

class Childss implements interfaceB{

	@Override
	public void methodB() {
		System.out.println("this is interface clsass");
		
	}
	
}

class Parentss{
	public void methodc() {
		System.out.println("this si parent class");
	}
}


class Childss1 extends Parentss implements interfaceA, interfaceB{
	public void methodd() {
		System.out.println("this si child class");
	}

	@Override
	public void methodA() {
		System.out.println("this is child class");
		
	}

	@Override
	public void methodB() {
		System.out.println("this is child class");
		
	}

	
	
}

public class InheritanceAssignment {
	public static void main(String[] args) {
		
		Childss1 obj =new Childss1();
		obj.methodA();
		obj.methodB();
		obj.methodc();
		obj.methodd();
		
	}
}

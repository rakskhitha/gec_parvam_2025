package inheritence;


interface Grandparent9{
	public void grandparentemethod() ;
}

class Interface2 implements Grandparent9{

	@Override
	public void grandparentemethod() {
		// TODO Auto-generated method stub
		
	}
	
}


class Parent5{
	public void parentmethod() {
		System.out.println("this is hybrid parent method");
	}
}


class Child5 extends Parent5 implements Grandparent9{
	public void child5method() {
		System.out.println("this is child method");
	}

	@Override
	public void grandparentemethod() {
		// TODO Auto-generated method stub
		
	}
}




public class Hybrid {
public static void main(String[] args) {
	Child5 obj=new Child5();
	obj.child5method();
	obj.parentmethod();
	obj.grandparentemethod();
}
}
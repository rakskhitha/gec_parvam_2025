package inheritence;




class Parent2{
	public void parent2method() {
		System.out.println("this is a  parent method");
	}
}


class Chlid3 extends Parent2 {

    public void child3method() {
    	System.out.println("this is first child");
    }

}



class Chlid4 extends Parent2 {

    public void child4method() {
    	System.out.println("this is second child");
    }

}


public class Heirarchical {
	public static void main(String[] args) {
		
		Chlid3 obj1=new Chlid3();
		obj1.child3method();
		obj1.parent2method();
		
		Chlid4 obj2= new Chlid4();
		obj2.child4method();
		obj2.parent2method();
		
	}

}
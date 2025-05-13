

package inheritence;








class Grandparent{
	public void grandparentmethod() {
		System.out.println("this is granparent method");
	}
}



class Parent1 extends Grandparent{
	public void parentmethod() {
		System.out.println("this is parent method");
	}
}


class Child1 extends Parent1{
	public void childmethod() {
		System.out.println("this is child method");
	}
}






public class Multilevel {
	
	
	public static void main(String[] args) {
		
		Child1 obj=new  Child1();
		
		obj.parentmethod();
		obj.childmethod();
		obj.grandparentmethod();
	}

}
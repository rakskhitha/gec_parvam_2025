package interfaceinjava;


//multiple interface can acheve here cannot acheive in inheritence

//interface A{
//	public void methodA();
//}
//
//interface B{
//	public void methodB();
//}
//class Child implements A,B{
//
//	@Override
//	public void methodB() {
//		System.out.println("this is method A");
//		
//		
//		
//	}
//
//	@Override
//	public void methodA() {
//		System.out.println("this is method B");
//		
//	}
//	
//}



//interface having same name here add can achieve in interface but cannot acces in inheritence 
interface AA{
	public void add();
}

interface BB{
	public void add();
}
class Child implements AA,BB{

	@Override
	public void add() {
		System.out.println("two interface have same method method ");
		
	}

	
	}


public class InterfaceInJava1 {
	public static void main(String[] args) {
		Child obj=new Child();
//		obj.methodA();
//		obj.methodB();
		obj.add();
	}

}
package inheritence;


interface interfacese1{
	public void method();
}

class Class1 implements interfacese1{
	public void methode() {
		System.out.println("this is interfaces1 class ");
	}

	@Override
	public void method() {
		// TODO Auto-generated method stub
		
	}	
}

interface interfacese2{
	public void method();	
}

class Class2 implements interfacese2{
	public void methode() {
		System.out.println("this is interfaces2 class ");
	}

	@Override
	public void method() {
		System.out.println("this is interfaces2 class ");
		
	}	
}

interface interfacese3 extends interfacese1, interfacese2{
	public void method();
	
}
class Class3 implements interfacese3{
	public void methode() {
		System.out.println("this is interfaces3 class ");
	}

	@Override
	public void method() {
		// TODO Auto-generated method stub
		
	}	
}

 class chil extends Class3{
	public void methodf() {
		System.out.println("this is chilld1");
	}
}

 class chill extends Class3{
	public void methodg() {
		System.out.println("this is chilld2");
	}
}

public class InheritenceAssignment1 {
	public static void main(String[] args) {
		
		chill obj=new chill();
		obj.methode();
		obj.methodg();
		
		chil obj1=new chil();
		obj1.methodf();
		obj1.methode();
		
		
	}

}

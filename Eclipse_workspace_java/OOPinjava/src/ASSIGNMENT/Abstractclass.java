
package ASSIGNMENT;


abstract class Employee{

String name="Raksha";

public abstract  void calculateSalary();



}


class FullTimeEmployee extends Employee{

	@Override
	public void calculateSalary() {
		System.out.println("the fulltime employee employee name "+name);
	}
	
}

class PartTimeEmployee extends Employee{

	@Override
	public void calculateSalary() {
		System.out.println("the second subclass parttime employee"+name);
		
	}
	
}




public class Abstractclass {
public static void main(String[] args) {
	
	FullTimeEmployee fst=new FullTimeEmployee();
	fst.calculateSalary();
	PartTimeEmployee sec=new PartTimeEmployee();
	sec.calculateSalary();
	
}


}














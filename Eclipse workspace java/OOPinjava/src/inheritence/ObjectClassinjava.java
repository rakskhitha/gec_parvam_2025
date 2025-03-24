package inheritence;





//only one public class is present that is for main method  but we can have multiple class inside a package which are default  donot having the public keyword as declred below

//default modifier also caleed package private
class Student{
	//states
	public int age=23;
	public String name="Rakshitha";
	public double marks=230.45;
	
	//actions
	public void isplaying() {
		System.out.println(this.name+"playing");
		
	}
	public void issinging() {
		System.out.println(this.name+"sisnging");
	}
}
public class ObjectClassinjava {
	public static void main(String[] args) {
		/*
		 * class:
		 * ==============
		 * class will represents state and behavior of an object
		 * state -->property
		 * behavior-action
		 * 
		 * object:
		 * =========
		 *Object is a implementation of a class(state and action)
		 *example:
		 *=========
		 *Student
		 *
		 *property:
		 *=====
		 *USN 
		 *name 
		 * branch
		 * 
		 *
		 * action
		 * ==========
		 * 
		 * isplaying();
		 * issinging();
		 * 
		 * how to declare class and object
		 * ========================
		 * class clas_name{
		 * state
		 * action
		 * }
		 * ex
		 * ==
		 * class Student{
		 * property;
		 *  
		 *public int age=30;
		 *action:
		 *
		 * 
		 * public void isplaying(){
		 * syso("yes he is playing")
		 * }
		 * }
		 * 
		 * 
		 * 
		 * 
		 * 
		 * object
		 * ==========
		 * <datatype> variable_name=new <datatype>;
		 *  examle
		 *  ============
		 *  Student std1=new Student1();
		 * 
		 * */
		
		//Student1
		Student obj=new Student();//calls default constructor if do not declare a constructo by default java virtual  machine
		System.out.println(obj.age);
		System.out.println(obj.marks);
		System.out.println(obj.name);
		obj.isplaying();
		obj.issinging();
		
		// Student2
		Student obj1=new Student();//calls default constructor if do not declare a constructo by default java virtual  machine
		System.out.println(obj1.age);
		System.out.println(obj1.marks);
		System.out.println(obj1.name);
		obj1.isplaying();
		obj1.issinging();
		
		
	}

}
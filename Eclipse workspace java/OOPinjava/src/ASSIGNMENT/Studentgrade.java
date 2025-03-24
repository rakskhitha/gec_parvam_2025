package ASSIGNMENT;

class Student{
	private String name;
	private  int rollnumber;
	private  int  marks=50;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollnumber() {
		return rollnumber;
	}
	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
	public void pass() {
		if(marks>=40) {
			System.out.println("student is passed");
		}
	}
	
	
	
}



public class Studentgrade {
	public static void main(String[] args) {
		Student std=new Student();
		std.setName("Raksha");
	System.out.println(std.getName());	
	std.setRollnumber(035);
	System.out.println(std.getRollnumber());
	std.pass();
		
	}

}

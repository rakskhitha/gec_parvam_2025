package CustomStudentObject;






public class Student {
	
	private String name;
	private int roll_num;
	private int age;
	
	//constructor
	public Student(String name, int roll_num, int age) {
		super();
		this.name = name;
		this.roll_num = roll_num;
		this.age = age;
	}
	//to string
	@Override
	public String toString() {
		return "Student [name=" + name + ", roll_num=" + roll_num + ", age=" + age + "]";
	}
	
	//getter and setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll_num() {
		return roll_num;
	}

	public void setRoll_num(int roll_num) {
		this.roll_num = roll_num;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

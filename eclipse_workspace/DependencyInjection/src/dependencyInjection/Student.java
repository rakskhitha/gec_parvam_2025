package dependencyInjection;

public class Student {
	private int Id;
	private String name;
	private Address address;
	
	//no args for setter injection
	public Student() {
		super();
	}
	
	
	//full agrs for constructor injection
	public Student(int id, String name, Address address) {
		super();
		Id = id;
		this.name = name;
		this.address = address;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	

}

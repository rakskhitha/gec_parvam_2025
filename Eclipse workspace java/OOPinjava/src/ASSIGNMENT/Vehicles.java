package ASSIGNMENT;


class Vehicle {
	String brand="rolex";
	float speed=80;
		
}
class Car extends Vehicle 
{
	 int numDoor=4;
	 public void method() {
		 System.out.println("brand :"+brand);
		 System.out.println("speed :"+speed+"km/hr");
		 System.out.println("number of doors :"+numDoor);
	 }
}

public class Vehicles {
	public static void main(String[] args) {
		Car car=new Car();
		car.method();
	}

}

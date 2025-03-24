package ASSIGNMENT;

class Rectangle{
public void calculatearea() {
		System.out.println("the area of rectanglr is 2(l*b)");
	}
	
	
}


class Circle extends Rectangle{
	
public void calculatearea() {
	System.out.println("the area of circle is 2*3.14*r*r");
		
	}
}


public class Shape {
public static void main(String[] args) {
	Circle cir=new Circle();
	cir.calculatearea();
	
}
}

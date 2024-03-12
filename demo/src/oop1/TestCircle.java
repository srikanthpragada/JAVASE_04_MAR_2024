package oop1;

class Circle {
	private double radius;
	
	// Constructor 
	public Circle(double r) {
		radius = r;
	}
	
	public double getArea() {
		return  Math.PI * radius * radius;
	}
	
}

public class TestCircle {

	public static void main(String[] args) {
		 Circle c1 = new Circle(15);
		 System.out.println(c1.getArea());
        
	}

}

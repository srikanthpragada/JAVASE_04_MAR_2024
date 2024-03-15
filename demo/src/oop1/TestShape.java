package oop1;

class Shape {
	private int x, y;
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void print() {
		System.out.println(this.x);
		System.out.println(this.y);
	}
}

class Circle extends Shape {
	private double radius;

	public Circle(int x, int y, double radius) {
		super(x, y);
		this.radius = radius;
	}

	@Override
	public void print() {
		super.print();
		System.out.println(this.radius);
	}
	
	public double area() {
		return Math.PI * this.radius * this.radius;
	}
}

public class TestShape {

	public static void main(String[] args) {
		 Shape s = new Circle(10,20, 7.5); // Upcasting
		 s.print();
		 
		 //Circle c = s;
		 
		  
	}

}

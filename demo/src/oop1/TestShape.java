package oop1;

abstract class Shape {
	private int x, y;
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void print() {
		System.out.println(this.x);
		System.out.println(this.y);
	}
	
	final public int getX() {
		return this.x;
	}
	
	abstract public double area();
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
	
	@Override 
	public double area() {
		return Math.PI * this.radius * this.radius;
	}
}

class Square extends Shape {
	private double side;

	public Square(int x, int y, double side) {
		super(x, y);
		this.side = side;
	}

	@Override
	public void print() {
		super.print();
		System.out.println(this.side); 
	}
	
	@Override 
	public double area() {
		return this.side * this.side;
	}
}


public class TestShape {
	public static void main(String[] args) {
		 Shape s = new Circle(10,20, 7.5); // Upcasting
		 s.print();  // runtime polymorphism 
		 System.out.println(s.area());  // runtime polymorphism 
		 
		 
		 s = new Square(10,20,10);
		 s.print(); // runtime polymorphism
		 System.out.println(s.area());   // runtime polymorphism 
		 
		 
//		 if(s instanceof Circle) {
//		     Circle c = (Circle) s;    // Downcasting
//		 }
		 
		  
		 if (s instanceof Square sq) {
			 
			 
		 }
		  
	}

}

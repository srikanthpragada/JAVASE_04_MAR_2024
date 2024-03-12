package oop1;

public class Product {
	// Instance variables
	private String name;
	private double price;

	//constructor
	public Product(String n, double p) {
		name = n;
		price = p;
	}

	// Methods
	public void print() {
		System.out.println(name);
		System.out.println(price);
	}
	
	public double getSellingPrice() {
		return  price + price * 0.12;
	}
	
	public double getPrice() {
		return  price;
	}
}

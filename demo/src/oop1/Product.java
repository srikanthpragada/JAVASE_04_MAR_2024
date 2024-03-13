package oop1;

public class Product {
	// Instance variables
	private String name;
	private double price;
	private double taxRate = 0.12;

	// constructor
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	// Methods
	public void print() {
		System.out.println(this.name);
		System.out.println(this.price);
	}

	public double getSellingPrice() {
		return this.price + this.price * this.taxRate;
	}

	public double getPrice() {
		return this.price;
	}
}

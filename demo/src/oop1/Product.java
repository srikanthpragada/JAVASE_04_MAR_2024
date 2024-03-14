package oop1;


public class Product {
	// Instance variables
	private String name;
	private double price;
	
	// Class variable or static variable
	private static double taxRate = 0.12;

	public static double getTaxRate() {
		return  Product.taxRate; 
    }
	
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
		return this.price + this.price * Product.taxRate;
	}

	public double getPrice() {
		return this.price;
	}
}

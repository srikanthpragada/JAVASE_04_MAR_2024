package oop1;

public class TestProduct {

	public static void main(String[] args) {
		 Product p; // object reference 
		 
		 p = new Product(); // object 
		 p.init("Logitech Mouse", 10000);
		 p.print();
		 
		 Product p2 = new Product();
		 p2.init("iPhone 15 Pro",100000);
		 p2.print();

		 System.out.println(p2.getSellingPrice());
	}

}

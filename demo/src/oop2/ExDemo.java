package oop2;

public class ExDemo {

	public static void main(String[] args) {
		int a = 10;
		String s = "0";

		try {
			int b = Integer.parseInt(s);
			int c = a / b;
			System.out.println(c);
		} catch (ArithmeticException ex) {
			System.out.println("Sorry! Zero is not valid!");
		}
//		catch(NumberFormatException ex) {
//			System.out.println("Invalid Number!");
//		}
		finally {
			System.out.println("Finally!");
		}

		System.out.println("The End!");
	}

}

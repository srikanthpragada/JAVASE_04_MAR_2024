package basics;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("Enter number :");
		int num = s.nextInt(); // read int from keyboard

		if (num % 2 == 0)
			System.out.println("Even");
		else
			System.out.println("Odd");
	}
}

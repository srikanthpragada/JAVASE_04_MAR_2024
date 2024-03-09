package basics;

import java.util.Scanner;

public class PrintArrayReverse {

	public static void main(String[] args) {
		int a[] = new int[5];

		Scanner s = new Scanner(System.in);

		for (int i = 0; i < a.length; i++) {
			System.out.print("Enter number :");
			a[i] = s.nextInt();
		}

		for(int i = a.length - 1; i >= 0; i --)
			System.out.println(a[i]);
	}

}

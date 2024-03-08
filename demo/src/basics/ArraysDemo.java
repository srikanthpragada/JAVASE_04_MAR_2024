package basics;

public class ArraysDemo {

	public static void main(String[] args) {
		// int a[] = new int[10];

		int a[] = { 10, 22, 33, 44, 55 };

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		// Enhanced for loop 
		for(var n : a)
			System.out.println(n);

	}

}

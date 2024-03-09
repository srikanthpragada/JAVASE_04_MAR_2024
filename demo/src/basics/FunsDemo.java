package basics;

public class FunsDemo {

	public static int sum(int... values) {
		int total = 0;
		for (int n : values)
			total += n;

		return total;
 
	}

	public static void wish(String message, String... names) {
      // to be done 
	}

	public static int add(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		System.out.println(add(10, 20));

		System.out.println(sum(1, 2, 3, 4));
		System.out.println(sum(10, 20, 40));
		System.out.println(sum());

		wish("Hi", "Scott", "Mike", "Bill");

	}

}

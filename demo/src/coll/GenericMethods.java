package coll;

public class GenericMethods {

//	public static void print(int[] values) {
//		for (var n : values)
//			System.out.println(n);
//	}
//
//	public static void print(String[] values) {
//		for (var n : values)
//			System.out.println(n);
//	}
	
	public static <T> void print(T [] values) {
		for (T n : values)
			System.out.println(n);
	}

	public static void main(String[] args) {
		print(new Integer[] { 10, 20, 30, 40 });
		print(new String[] { "Abc", "Xyz", "Pqr" });

	}

}

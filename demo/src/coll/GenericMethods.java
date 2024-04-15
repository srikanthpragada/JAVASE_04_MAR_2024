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
	
	public static <T extends Comparable<T>> 
	                     int count(T [] values, T value) {
		 int c = 0;
		 
		 for(T v : values) {
			 if (v.compareTo(value) == 0)
				 c++;
		 }
		 
		 return c;
	}
	
		

	public static void main(String[] args) {
		Integer [] nums = new Integer[] { 10, 20, 30, 40, 20};
		
//		print(nums);
//		print(new String[] { "Abc", "Xyz", "Pqr" });

		System.out.println(count(nums, 20));
		
	}

}

package coll;

import java.util.Arrays;

public class StreamsDemo1 {

	public static void main(String[] args) {
		int [] nums = {10,20,30,45,54,32,11,4};
		
		Arrays.stream(nums)
		      .filter( v -> v % 2 == 0)   // Predicate (boolean test(T v))
		      .sorted()
		      .limit(3)
		      //.forEach( v -> System.out.println(v) ); // Consumer (void accept(T v))
		      .forEach(System.out::println);  // method reference
	

		Arrays.stream(nums)
		      .dropWhile( n -> n % 2 == 0)
		      .forEach(System.out::println);
		
	
		
	}

}

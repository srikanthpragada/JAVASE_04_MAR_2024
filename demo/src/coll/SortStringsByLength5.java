package coll;

import java.util.Arrays;
import java.util.Comparator;

public class SortStringsByLength5 {
	
	public static int compare(String s1, String s2) {
		return s1.length()  - s2.length();
	}

	public static void main(String[] args) {
		String[] names = { "Joe", "Larry", "Micheal", "Ellison", "Li", "Dave" };

		// Method Reference 
		Arrays.sort(names, SortStringsByLength5::compare);

		for (var n : names)
			System.out.println(n);

	}

}

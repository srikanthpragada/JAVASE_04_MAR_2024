package coll;

import java.util.Arrays;
import java.util.Comparator;

public class SortStringsByLength3 {

	public static void main(String[] args) {
		String[] names = { "Joe", "Larry", "Micheal", "Ellison", "Li", "Dave" };

		// Lambda Expression 
		Arrays.sort(names, (s1, s2) -> s1.length() - s2.length());

		for (var n : names)
			System.out.println(n);

	}

}

package coll;

import java.util.Arrays;
import java.util.Comparator;

public class SortStringsByLength2 {

	public static void main(String[] args) {
		String[] names = { "Joe", "Larry", "Micheal", "Ellison", "Li", "Dave" };

		// Anonymous inner class 
		Arrays.sort(names, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.length() - s2.length();
			}
		});

		for (var n : names)
			System.out.println(n);

	}

}

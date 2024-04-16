package coll;

import java.util.Arrays;
import java.util.Comparator;

public class SortStringsByLength4 {

	public static void main(String[] args) {
		String[] names = { "Joe  ", "Larry  ", "  Micheal", "Ellison", "Li", "Dave" };

		// Lambda Block 
		Arrays.sort(names, (s1, s2) -> {
			var fs = s1.strip(); 
			var ss = s2.strip();
			
			return fs.length() - ss.length();
		});

		for (var n : names)
			System.out.println(n);

	}

}

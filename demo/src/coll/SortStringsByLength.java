package coll;

import java.util.Arrays;
import java.util.Comparator;

class CompareByLength implements Comparator<String> {
	@Override
	public int compare(String s1, String s2) {
	     return  s1.length()  - s2.length();
	}
}

public class SortStringsByLength {

	public static void main(String[] args) {
		 String [] names = {"Joe", "Larry", "Micheal", "Ellison","Li","Dave"};
		 
		 Arrays.sort(names, new CompareByLength());
	 
		 for(var n : names)
			  System.out.println(n);

	}

}

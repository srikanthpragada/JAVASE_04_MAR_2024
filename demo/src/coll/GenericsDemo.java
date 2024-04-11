package coll;

import java.time.LocalDate;
import java.util.ArrayList;

public class GenericsDemo {

	public static void main(String[] args) {
		 var al = new ArrayList();

		 al.add(10);   // 10 -> Integer
		 al.add("Abc");
		 al.add(LocalDate.now());
		 
		 String s = (String) al.get(0);
		 
		 // Generics 
		 
		 var names = new ArrayList<String>();  // type safety 
		 var marks = new ArrayList<Integer>();
		 
		 names.add("Andy");
		 String n = names.get(0);
		 
		 marks.add(10);
		 
		 
		 
		 
		 
		 
		 
		 
	}

}

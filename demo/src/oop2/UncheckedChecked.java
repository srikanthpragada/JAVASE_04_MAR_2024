package oop2;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class UncheckedChecked {

	public static void main(String[] args) throws FileNotFoundException {
		 String s  = "123";
		 
		 int n = Integer.parseInt(s);  // unchecked ex 

		 FileReader fr = new FileReader("names.txt");  // checked ex
	}

}

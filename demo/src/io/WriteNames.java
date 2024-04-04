package io;

import java.io.FileWriter;
import java.io.IOException;

public class WriteNames {

	public static void main(String[] args) throws IOException {
		String names [] = {"Larry Page", "Steve Jobs", "Al Gore", "Anders Helsberg"};
		
		var fw = new FileWriter("names.txt");
		
		for(var s : names) {
			fw.write(s + "\n");
		}
		
		fw.close();
	}

}

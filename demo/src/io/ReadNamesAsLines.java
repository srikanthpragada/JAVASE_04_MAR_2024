package io;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadNamesAsLines {
	public static void main(String[] args) throws Exception {
		var fr = new FileReader("names.txt");
		var br = new BufferedReader(fr);

		while (true) {
			 var line = br.readLine();
			 if(line == null) // EOF
				 break; 
			 System.out.println(line);
		}

		br.close();
		fr.close();

	}
}

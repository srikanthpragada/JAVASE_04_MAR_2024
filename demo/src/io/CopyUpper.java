package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class CopyUpper {

	public static void main(String[] args) throws Exception {
		var fr = new FileReader("names.txt");
		var fw = new FileWriter("uppernames.txt");
		
		var br = new BufferedReader(fr);

		while (true) {
			 var line = br.readLine();
			 if(line == null) // EOF
				 break; 
			 
			 fw.write(line.toUpperCase() + "\n");
		}

		br.close();
		fr.close();
		fw.close();
	}

}

package io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AppendNames {

	public static void main(String[] args) throws IOException {
        String first = "names.txt";
        String second = "names2.txt";
        
		try (var fw = new FileWriter(first, true); // append mode 
			 var fr = new FileReader(second)) {
		  
			 while(true) {
				 int ch = fr.read();
				 if (ch == -1)
					 break;
				 
				 fw.write(ch);  // write ch from second file into first file
			 }
		}
		
		
	}

}

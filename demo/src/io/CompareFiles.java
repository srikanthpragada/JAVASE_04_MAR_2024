package io;

import java.nio.file.Files;
import java.nio.file.Path;

public class CompareFiles {

	public static void main(String[] args) throws Exception {
		 
		var ff = Files.newBufferedReader(Path.of("langs.txt"));
		var sf = Files.newBufferedReader(Path.of("langs2.txt"));
		
		while(true) {
			var line1 = ff.readLine();
			if (line1 == null) 
				  break;
			
			var line2 = sf.readLine();
			if(line2 == null)
				  break;
			
			if(line1.equals(line2))
				 System.out.println(line1);
		}
		
        ff.close();
        sf.close();
	}

}

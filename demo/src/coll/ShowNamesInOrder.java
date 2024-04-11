package coll;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.TreeSet;

public class ShowNamesInOrder {

	public static void main(String[] args) throws IOException {
		 var path = Path.of("names.txt");
		 var lines = Files.readAllLines(path);
		 
		 var names = new TreeSet<String>(lines);
		 
		 for(var n : names)
			 System.out.println(n);
		 
	}

}

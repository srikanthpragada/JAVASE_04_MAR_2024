package coll;

import java.nio.file.Files;
import java.nio.file.Path;

public class StreamDemo3 {

	public static void main(String[] args) throws Exception {
		var s = Files.lines(Path.of("names.txt"));
		
		
		
		var avg = 
	   	 s.filter(line -> line.strip().length() > 0)
		 .mapToInt(line -> line.length())
		 .average()
		 .getAsDouble();
		 
		//System.out.println(avg);
		
		s = Files.lines(Path.of("names.txt"));
		s.filter(line -> line.length() > avg)
		 .forEach(System.out::println);
		
	}

}

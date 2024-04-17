package coll;

import java.nio.file.Files;
import java.nio.file.Path;

public class StreamDemo2 {

	public static void main(String[] args) throws Exception {
		var s = Files.lines(Path.of("names.txt"));
		
		s.filter(line -> line.strip().length() > 0)
		 .sorted()
		 .forEach(System.out::println);

	}

}

package coll;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedHashSet;

public class CommonLines {

	public static void main(String[] args) throws Exception {
		var first_lines = new LinkedHashSet<String>
		                   (Files.readAllLines(Path.of("langs.txt")));
		
		var second_lines = Files.readAllLines(Path.of("langs2.txt"));

		for (var line : first_lines)
			if (second_lines.contains(line))
				System.out.println(line);

	}

}

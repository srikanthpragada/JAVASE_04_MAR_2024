package coll;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.TreeSet;
import java.util.regex.Pattern;

public class UniqueWords {

	public static void main(String[] args) throws Exception {
		 var path = Path.of("story.txt");
		 
		 var contents = Files.readString(path);
		 
		 var pattern = Pattern.compile("\\W+");  //non-word char
		 
		 var words = pattern.split(contents);
		 
		 var uniqueWords = new TreeSet<String>(Arrays.asList(words));


		 for(var w : uniqueWords)
			 System.out.println(w);
	}

}

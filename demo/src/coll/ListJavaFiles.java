package coll;

import java.nio.file.Files;
import java.nio.file.Path;

public class ListJavaFiles {

	public static void main(String[] args) throws Exception{
		 Files.walk(Path.of("d:\\classroom\\mar4j"))
		      .filter( p -> p.toString().endsWith(".java") && 
		    		        p.toString().indexOf("Demo") >= 0)
		      .forEach(System.out::println);
		 
		 
		 long count = Files.walk(Path.of("d:\\classroom\\mar4j"))
	      .filter(p -> p.toString().endsWith(".java")) 
          .count();
		 
		 System.out.println(count);
	}

}

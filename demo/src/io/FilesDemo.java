package io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesDemo {
	public static void main(String[] args) throws IOException {
		Path p = Path.of("d:\\classroom\\mar4j\\demo\\names.txt");
		System.out.println(p.getClass());
		System.out.println(Files.exists(p));
		
		System.out.println(p.getNameCount());
		System.out.println(p.getName(0));
		
		System.out.println(Files.readString(p));
	}

}

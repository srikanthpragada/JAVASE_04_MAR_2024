package io;

import java.io.FileWriter;
import java.io.IOException;

public class WriteNames2 {

	public static void main(String[] args) throws IOException {
		String names[] = { "Larry Page", "Steve Jobs", "James Gosling", "Al Gore", "Anders Helsberg" };

		// ARM or try with resources 
		try (var fw = new FileWriter("names.txt")) {
			for (var s : names) {
				fw.write(s + "\n");
			}
		}
	}

}

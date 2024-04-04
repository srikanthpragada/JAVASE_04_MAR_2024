package io;

import java.io.FileReader;

public class ReadNames {
	public static void main(String[] args) throws Exception {

		var fr = new FileReader("names.txt");

		while (true) {
			var ch = fr.read();
			if (ch == -1) // EOF
				break;

			System.out.print( (char) ch);
		}

		fr.close();

	}
}

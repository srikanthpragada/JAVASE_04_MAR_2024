package io;

import java.io.BufferedReader;
import java.io.FileReader;

public class PrintLinesWithUpper {

	public static boolean hasUpper(String st) {
		for (int i = 0; i < st.length(); i++) {
			if (Character.isUpperCase(st.charAt(i)))
				return true;
		}
		return false;
	}

	public static void main(String[] args) throws Exception {
		var fr = new FileReader("names.txt");
		var br = new BufferedReader(fr);

		while (true) {
			var line = br.readLine();
			if (line == null) // EOF
				break;

			if (hasUpper(line))
				System.out.println(line);
		}

		br.close();
		fr.close();

	}
}

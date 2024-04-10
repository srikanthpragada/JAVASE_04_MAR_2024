package io;

import java.io.RandomAccessFile;
import java.util.Scanner;

public class ListMarks {

	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		var raf = new RandomAccessFile("marks.dat", "r");

		int startRollno = 40;
		int endRollno = 45;

		raf.seek((startRollno - 1) * 4);

		while (true) {
			try {
				System.out.println(raf.readInt());
				if (startRollno == endRollno)
					break;
				
				startRollno++;
				
			} catch (Exception ex) {
				System.out.println("Reached EOF");
				break;
			}
		}

		raf.close();
	}

}

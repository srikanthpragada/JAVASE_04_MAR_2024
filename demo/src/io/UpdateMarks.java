package io;

import java.io.RandomAccessFile;
import java.util.Scanner;

public class UpdateMarks {

	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		var raf = new RandomAccessFile("marks.dat", "rw");

		while (true) {
			System.out.print("Enter rollno [0 to stop] :");
			int rollno = s.nextInt();
			if (rollno == 0)
				break;

			// calculate pos based on rollno
			int pos = (rollno - 1) * 4;
			try {
				raf.seek(pos);
				System.out.println(raf.readInt());
				System.out.print("Enter new marks :");
				int marks = s.nextInt();
				// Move back to correct position 
				raf.seek(pos);
				raf.writeInt(marks);
				System.out.println("Updated!");
				
			} catch (Exception ex) {
				System.out.println("Invalid Rollno!");
			}
		}

		raf.close();
	}

}

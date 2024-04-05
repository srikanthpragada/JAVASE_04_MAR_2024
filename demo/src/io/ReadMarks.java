package io;

import java.io.RandomAccessFile;

public class ReadMarks {

	public static void main(String[] args) throws Exception {
		 
		var raf = new RandomAccessFile("marks.dat", "r");
		
		for(int i = 1; i <= 50; i ++)
		   System.out.println(raf.readInt());
		

		raf.close();
	}

}

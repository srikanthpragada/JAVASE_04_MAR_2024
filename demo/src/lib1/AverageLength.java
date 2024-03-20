package lib1;

import java.util.Scanner;

public class AverageLength {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int totalLength = 0, count = 0;

		while (true) {
			System.out.print("Enter name [end to stop] :");
			var name = s.nextLine();
			if (name.equals("end"))
				break;
            System.out.println(name.length());
            
			totalLength += name.length();
			count++;
		}
		System.out.println(totalLength / count);
	}
}

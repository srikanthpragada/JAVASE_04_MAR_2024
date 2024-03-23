package lib1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

public class SortDates {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 LocalDate [] dates = new LocalDate[3];
		 var df =  DateTimeFormatter.ofPattern("dd-MM-uuuu");
		 
		 for(int i = 0; i < dates.length ; i ++)
		 {
			 System.out.print("Enter date [dd-mm-yyyy] :");
			 var ds = s.nextLine();
			 dates[i] = LocalDate.parse(ds,df);
		 }

	     Arrays.sort(dates);
    		 
	     for(var d : dates)
	    	 System.out.println(d.format(df));
	}

}

package lib1;

public class CountUpper {

	public static void main(String[] args) {
		 var st = "Hello How Are YOU";
		 
		 int upper = 0;
		 
		 for(int i = 0; i < st.length(); i ++)
		 {
//			 var code = st.codePointAt(i);
//			 if (code >= 65 && code <= 90)
//				  upper ++;
			 
			 if (Character.isUpperCase( st.charAt(i)) )
				   upper ++;
		 }
		 
		 System.out.println(upper);
	}

}

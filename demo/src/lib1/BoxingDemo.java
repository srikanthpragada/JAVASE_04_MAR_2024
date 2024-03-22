package lib1;

public class BoxingDemo {

	public static void main(String[] args) {
		 Object obj;
		 
		 obj = "Abc";
		 System.out.println(obj.getClass());
		 
		 // Autoboxing 
		 obj = new Integer(100);
		 
		 obj = 10; // 10 to Integer 
		 System.out.println(obj.getClass());
		 
		 // Downcasting then autounboxing 
		 int n = (Integer) obj;
		 System.out.println(n);
		 
		 
		 
	}

}

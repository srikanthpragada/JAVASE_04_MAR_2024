package coll;

public class LambdaThread {

	public static void main(String[] args) {
		 
		Runnable obj = () -> System.out.println("In thread");
		System.out.println(obj.getClass());
		
		Thread t1 = new Thread(obj);
		t1.start();
		
	}

}

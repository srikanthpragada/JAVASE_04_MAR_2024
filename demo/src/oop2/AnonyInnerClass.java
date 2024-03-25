package oop2;

interface Task {
	void process();
}

class MyTask implements Task {
	@Override
	public void process() {
		 System.out.println("Processing...");
	}
}

public class AnonyInnerClass {
	public static void main(String[] args) {
		 Task t = new MyTask();
		 t.process();
		 
		 // Anonymous inner class
		 Task t2 = new Task() {
			@Override
			public void process() {
				System.out.println("Processing from inner class");
			}
		 };
		 
		 System.out.println(t2.getClass());
		 t2.process();
		 
		 // Lambda 
		 Task t3 = () -> System.out.println("Lambda!!!!");
		 t3.process();
	}

}

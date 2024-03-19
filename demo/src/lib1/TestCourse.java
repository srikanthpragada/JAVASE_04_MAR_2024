package lib1;

class Course {
	private String title;
	private int fee;
	
	public Course(String title, int fee) {
		this.title= title;
		this.fee = fee;
	}
}

public class TestCourse {

	public static void main(String[] args) {
		 var c1 = new Course("Java", 10000);
		 var c2 = new Course("JavaEE", 20000);
		 var c3 = new Course("Java", 10000);
		 
		 System.out.println(c1 == c3);
		 System.out.println(c1);
		 System.out.println(c1.toString());
		 
	}

}

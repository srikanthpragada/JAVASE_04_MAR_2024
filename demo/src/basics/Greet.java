package basics;

public class Greet {

	public static void main(String[] args) {
		if (args.length > 0)
			System.out.println("Hi " + args[0]);
		else
			System.out.println("Sorry! Please give your name!");

	}

}

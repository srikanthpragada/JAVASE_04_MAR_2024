package oop1;

class Account {
	private int acno;
	private String ahname;
	private double balance;

	public Account(int acno, String ahname) {
		this.acno = acno;
		this.ahname = ahname;
	}

	public Account(int acno, String ahname, double balance) {
		this(acno, ahname); // call another constructor
		this.balance = balance;
	}

	public void deposit(double amount) {
		this.balance += amount;
	}

	public void withdraw(double amount) {
		this.balance -= amount;
	}

	public double getBalance() {
		return this.balance;
	}

}

public class TestAccount {

	public static void main(String[] args) {
		Account a1 = new Account(101, "Bill", 20000);
		a1.deposit(10000);
		System.out.println(a1.getBalance());

		Account a2 = new Account(102, "Scott");
		a2.deposit(5000);

	}

}

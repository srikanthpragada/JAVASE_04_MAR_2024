package oop2;

enum PaymentMode  {
	CASH, NEFT, CARD, UPI
}

class SaleTrans  {
	private int amount;
	private PaymentMode mode;
}


public class EnumDemo {

	public static void main(String[] args) {
          PaymentMode pm;
          
          pm = PaymentMode.UPI;
          
          System.out.println(pm);

	}

}

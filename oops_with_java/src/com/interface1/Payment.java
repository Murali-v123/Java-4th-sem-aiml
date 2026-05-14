package com.interface1;

class Upi implements Paymentmethod{
	@Override
	public void paymenttype() {
		System.out.println("Payment done using Upi");
	}
}

class Credit implements Paymentmethod{
	@Override
	public void paymenttype() {
		System.out.println("Payment done using Credit");
	}
}
public class Payment {
	public static void main(String[] args) {
		Upi u=new Upi();
	}
}

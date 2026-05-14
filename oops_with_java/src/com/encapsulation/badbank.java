package com.encapsulation;

class bank{
	public String holdername;
	public int acntnumber;
	public double balance;
	@Override
	public String toString() {
		return "bank [holdename=" + holdername + ", acntnumber=" + acntnumber + ", balance=" + balance + "]";
	}
	
	
}
public class badbank {
	public static void main(String[] args) {
		bank b1 = new bank();
		b1.holdername="pradeep";
		b1.acntnumber=12345;
		b1.balance=123.43;
		System.out.println(b1);
	}

}

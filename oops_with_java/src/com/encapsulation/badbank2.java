package com.encapsulation;

class bank1 {
	private String holdername;
	private int acntnumber;
	private double balance;

	public String getHoldername() {
		return holdername;
	}

	public void setHoldername(String holdername) {
		this.holdername = holdername;
	}

	public int getAcntnumber() {
		return acntnumber;
	}

	public void setAcntnumber(int acntnumber) {
		this.acntnumber = acntnumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		if (balance < 0) {
			System.out.println("Invalid balance");
		} else {
			this.balance = balance;
		}
	}
	
	public double withdraw(double amount) {
		if(amount<0 || amount>balance) {
			System.out.println("Invalid balance:");
			return 0;
		}
		else {
			this.balance-=amount;
			return amount;
		}
	}
	
	
	//without get or set method
	public void deposit(double amount) {
		if(amount<0 ) {
			System.out.println("Invalid balance:");
		}
		else {
			this.balance+=amount;
		}
	}
	
	
	//without get or set method
	public void printDetails() {
		System.out.println("Holdename:"+this.getHoldername());
		System.out.println("Balance:"+this.getBalance());
		System.out.println("account number:"+this.getAcntnumber());
	}
	

	@Override
	public String toString() {
		return "bank [holdename=" + holdername + ", acntnumber=" + acntnumber + ", balance=" + balance + "]";
	}

}

public class badbank2 {
	public static void main(String[] args) {
		bank1 b1 = new bank1();
		b1.setHoldername("Pradeep");
		b1.setAcntnumber(15243);
		b1.setBalance(453673.33);
		b1.deposit(100000);
		double res=b1.withdraw(123);
		System.out.println("withdraw is: "+res);
		System.out.println(b1);
		b1.printDetails();
	}

}

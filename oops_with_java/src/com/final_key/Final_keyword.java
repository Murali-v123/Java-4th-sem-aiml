package com.final_key;

class Parent{
	public void dispaly() {
		System.out.println("Hello parent method ");
	}
}

class Child extends Parent{
	public void dispaly() {
		System.out.println("Hello parent child ");
	}
}

public class Final_keyword {
	public static void main(String[] args) {
		 final double pi=3.14;
		 //double pi=3.44;//we cannot change value of pi coz of final keyword
		 final double mark;
		 mark=225;
		 //mark=90900;//cannot assign
		 Parent p=new Parent();
		 p.dispaly();
		 Child c=new Child();
		 c.dispaly();
		 
	}
}

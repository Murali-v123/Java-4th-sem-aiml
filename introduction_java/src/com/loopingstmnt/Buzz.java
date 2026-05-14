package com.loopingstmnt;

public class Buzz {
	public static void main(String[] args) {
		int num=30;
		for(int i=1;i<=num;i++) {
			if(i%3==0 && i%5==0)//can also be written as i%15 because 15 is the 1st number can be divided by 3 and 5
				{
				System.out.print(" fizzbuzz ");
			}
			else if(i%3==0) {
				System.out.print(" fizz ");
			}
			else if(i%5==0) {
				System.out.print(" buzz ");
			}
			else {
				System.out.print(i+" ");
			}	
		}
	}
}

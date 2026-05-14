package com.loopingstmnt;

import java.util.Scanner;

public class LoopingStmnt {
	public static void main(String[] args) {
		int num = 30;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}
			System.out.println();
		}
	}
}

class LoopingStmnt1 {
	public static void main(String[] args) {
		int num = 30;
		int i = 1;
		while (i <= num) {
			System.out.println(i);
			i++;
		}
	}
}

class LoopingStmnt2 {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter an value: ");
		int num = obj.nextInt();
		int i = 1;
		do {
			System.out.println(i);
			i++;
		} while (num >= i);
	}
}

class LoopingStmnt3 {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int i = 0;
		do {
			
			System.out.println("enter a value: ");
			i = obj.nextInt();
			
		} while (i<=0);
		
		System.out.println("value is: "+i);

	}
}

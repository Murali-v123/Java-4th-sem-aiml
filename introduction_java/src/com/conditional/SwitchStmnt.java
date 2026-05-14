package com.conditional;

import java.util.Scanner;

public class SwitchStmnt {
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		
		System.out.println("Enter the value:");
		int num=obj.nextInt();
		
		switch (num) {
		case 1,2,3,4,5: {
			System.out.println("weekdays");
			break;
		}

		case 6,7: {
			System.out.println("weekend");
			break;
		}
		default:
			System.out.println(("invalid value: " + num));
			break;
		}
	}

}
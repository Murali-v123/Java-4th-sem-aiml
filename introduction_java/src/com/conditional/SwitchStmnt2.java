package com.conditional;

import java.util.Scanner;

public class SwitchStmnt2 {
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		
		System.out.println("Enter the value:");
		int num=obj.nextInt();
		
		switch (num) {
		case 1: {
			System.out.println("Monday");
			break;
		}
		case 2: {
			System.out.println("tuesday");
			break;
		}
		case 3: {
			System.out.println("wednesday");
			break;
		}
		case 4: {
			System.out.println("thursday");
			break;
		}
		case 5: {
			System.out.println("friday");
			break;
		}
		case 6: {
			System.out.println("staurday");
			break;
		}
		case 7: {
			System.out.println("sunday");
			break;
		}
		default:
			System.out.println(("invalid value: " + num));
			break;
		}
	}

}

class SwitchStmnt3 {
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		
		System.out.println("Enter the value:");
		int num=obj.nextInt();
		
		switch (num) {
		case 1,2,3->System.out.println("weekdays");
		
		case 4,5 ->System.out.println("weekday");

		case 6,7 ->System.out.println("weekend");
		
		default  ->System.out.println("weekend");
		}
	}
}


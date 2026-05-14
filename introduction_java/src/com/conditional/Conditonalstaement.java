package com.conditional;

import java.util.Scanner;

public class Conditonalstaement {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i=10;
		Scanner obj=new Scanner(System.in);
		
		System.out.println("enter the color: ");
		String clr=obj.next();

		
		if(clr.equalsIgnoreCase("red")){
			System.out.println("stop");
		}
		else if(clr.equalsIgnoreCase("yellow")){
			System.out.println("ready");
		}
		else if(clr.equalsIgnoreCase("green")) {
			System.out.println("go");
		}
		else {
			System.out.println("invalid input");
		}
	}
}

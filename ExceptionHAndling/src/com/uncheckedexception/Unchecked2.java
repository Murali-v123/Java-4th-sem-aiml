package com.uncheckedexception;

public class Unchecked2 {
	public static void main(String[] args) {
		String s= "Pradeep";
		try {
			System.out.println(s.charAt(8));
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("close");
	}
}

package com.uncheckedexception;

public class Unchecked {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		try {
			System.out.println(arr[6]);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("close");
	}
}

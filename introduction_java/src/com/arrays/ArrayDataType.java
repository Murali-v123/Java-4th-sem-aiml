package com.arrays;
import java.util.Arrays;

public class ArrayDataType {
	public static void main(String[] args) {
		int[] num=new int[5];
		int[] mynum= {10,20,30};
		String[] st= {"Murali","rohit","pradeep"};
		for(int n:mynum) {
			System.out.println(n);
		}
		for(String s:st) {
			System.out.println(s);
		}
		System.out.println(Arrays.toString(mynum));
		System.out.println(Arrays.toString(num));
		System.out.println(Arrays.toString(st));
	}
}
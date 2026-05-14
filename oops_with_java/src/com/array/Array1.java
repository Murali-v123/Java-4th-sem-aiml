package com.array;

import java.util.Arrays;


public class Array1 {
	public static void main(String[] args) {
		int arr[]=new int[5];
		arr[0]=13;
		arr[1]=3;
		arr[2]=1;
		arr[3]=31;
		arr[4]=131;
		System.out.println(Arrays.toString(arr));
		//for-each loop
		for(int el:arr) {
			System.out.print(el+" ");
		}
	}

}

package com.array;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

public class Array2 {
	public static void main(String[] args) {
		Scanner obj1=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int num=obj1.nextInt();
		int arr[]=new int[num];
		for(int i=0;i<num;i++) {
			System.out.println("Enter the num:"+(i+1));
			arr[i]=obj1.nextInt();
		}
		for(int j:arr) {
			System.out.print("Number:"+j+" ");
		}
		int max=arr[0];
		//type 1
//		for(int i=0;i<num-1;i++) {
//			if(arr[i]<arr[i+1]) {
//				max=arr[i+1];
//			}
//		}
		//type 2
//		for(int ele:arr) {
//			if(ele>max) {
//				max=ele;
//			}	. 	
//		}	.
		//type 3 
		//OptionalInt max2 = to get this shortcut key is ctrl+2,l
		Arrays.stream(arr).max();
		System.out.println("\nMax elemnt is:"+max);
	}
}

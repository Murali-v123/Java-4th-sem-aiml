package com.collections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListInterface2 {
	public static void main(String[] args) {
		List<Integer> arr1=new ArrayList<Integer>(15);
		arr1.add(1);
		arr1.add(2);
		arr1.add(3);
		arr1.add(4);
		arr1.add(5);
		System.out.println(arr1);
		System.out.println();
		System.out.println(arr1.get(1));
		System.out.println();
		arr1.forEach((value)->System.out.println(value));
		System.out.println();
		System.out.println(Collections.min(arr1));
	}
}
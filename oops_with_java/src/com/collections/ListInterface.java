package com.collections;

import java.util.ArrayList;
import java.util.List;

public class ListInterface {
	public static void main(String[] args) {
		List arr1=new ArrayList();
		arr1.add(123);
		arr1.add(true);
		arr1.add("murali");
		arr1.add(3.14);
		arr1.add('m');
		System.out.println(arr1);
		System.out.println(arr1.get(1));
	}
}
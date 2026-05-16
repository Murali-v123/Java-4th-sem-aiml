package com.map;

import java.util.HashMap;
import java.util.Map;

public class MapInterface {
	public static <K, V> void main(String[] args) {
		Map<String, Integer> mp1 =new HashMap<>();
		mp1.put("Pradeep", 23);
		System.out.println(mp1.get("Pradeep"));
	}
}

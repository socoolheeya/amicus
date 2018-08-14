package com.amicus.test;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Test {
	
	public static void main(String args[]) {
		ConcurrentHashMap<String, Object> map = new ConcurrentHashMap<>();
		HashMap<String, Object> mMap = new HashMap<>();
		map.put("test", 1);
		map.put("test2", 2);
		map.put("test3", 3);
		map.put("test4", 4);
		
	}
}

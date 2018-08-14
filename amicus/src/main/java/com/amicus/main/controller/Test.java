package com.amicus.main.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
	
	public static void main(String args[]) {
		for(int a = 0; a < 5; a++) {
			
			List<Integer> list = new ArrayList<>();
			
			for(int i = 0; i < 100; i++) {
				int num = getNumber();
				if(!list.contains(num)) {
					list.add(num);
				}
				if(list.size() == 6) {
					break;
				}
			}
			Collections.sort(list);
			StringBuffer sb = new StringBuffer();
			for(int i = 0; i < list.size(); i++) {
				sb.append(list.get(i)).append(",");
			}
			System.out.println(sb.toString());
		}
	}
	
	public static int getNumber() {
		return (int)(Math.random() * 45) + 1;
	}
}

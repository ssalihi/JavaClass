package com.class33_MapPractice;


import java.util.*;
import java.util.Map.Entry;

public class Task1 {
	/*Write a program to check which employee gets highest salary use hashmap employee name as key and salary amount as the value.
	 *  Output example: John Smith=100000
	 */

	public static void main(String[] args) {
		Map<String, Integer> salaryMap=new HashMap<>();
		salaryMap.put("Sekander", 125000);
		salaryMap.put("Siyar", 130000);
		salaryMap.put("Ahmad", 120000);
		salaryMap.put("Omar", 156000);
		int max=0;
		String key=null;
		for (Map.Entry<String, Integer> enter:salaryMap.entrySet()) {
			if(enter.getValue()>max) {
				max=enter.getValue();
				key=enter.getKey();
			}	
			}
			
		
		System.out.println(max+" belongs to "+key);

	}

}

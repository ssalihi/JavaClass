package com.class33_Map;
import java.util.*;
public class KeyAndValueUsingEntertSet {

	public static void main(String[] args) {
		// create a map to store userDetails(name, salary, department, title)
		
		Map<String, String> userDetailsMap=new HashMap<>();
		
		userDetailsMap.put("Name", "Alex");//first entry
		userDetailsMap.put("Salary", "90000");//second entry 
		userDetailsMap.put("Department", "IT");//third entry
		userDetailsMap.put("Title", "QA Engineer");//fourth entry
		System.out.println(userDetailsMap);
		
		userDetailsMap.entrySet();//return set of entries
		for(Map.Entry entry:userDetailsMap.entrySet()) {
			//System.out.println(entry.getKey());
			//System.out.println(entry.getValue());
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		System.out.println("--------------------------------------------using iterator");
		Iterator<Map.Entry<String, String>> it=userDetailsMap.entrySet().iterator();
        while (it.hasNext()) {
        	Map.Entry<String, String> entry=it.next();//our loop is inside in Map
        	System.out.println(entry.getKey()+":"+entry.getValue());
        }
	}

}

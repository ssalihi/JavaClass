package com.class33_HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task1 {

	public static void main(String[] args) {
		/*how can you remove all duplicates from arraylist
		 * 
		 */
		List<String> aList=new ArrayList<String>();
       aList.add("John");
       aList.add("Jane");
       aList.add("James");
       aList.add("Jasmine");
       aList.add("Jane");
       aList.add("James");
       
       System.out.println("Original :"+aList);
       
       Set<String> list=new HashSet<>(aList);
       System.out.println("With out dubplicate value :"+list);
       
	}

}

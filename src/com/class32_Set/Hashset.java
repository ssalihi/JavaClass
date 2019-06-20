package com.class32_Set;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {

	public static void main(String[] args) {
		HashSet<Integer> hset=new HashSet<Integer>();
		hset.add(12);
		hset.add(32);
		hset.add(34);
		System.out.println(hset.size());
		System.out.println(hset);
		//SET does not keep the order
		System.out.println(hset.contains(32));
		//set interface does not allowed duplicates.
		hset.add(12);
		hset.add(32);
		System.out.println(hset.size());//Still the size if three
	    // to retrieve all values from hashset
		System.out.println("--------------------------advance for loop");
		for (int num:hset) {
			System.out.print(num);
		}
		Iterator <Integer> iterator=hset.iterator();
		while(iterator.hasNext()) {
			
		}
		System.out.println(iterator.next()+" ");
	}

}

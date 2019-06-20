package com.class32_Collection_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Task1 {

	public static void main(String[] args) {
		// Create an ArrayList of Strings and using Collections class sort the values of that ArrayList.
		
		ArrayList <String> name=new ArrayList<String>();
		name.add("C");
		name.add("D");
		name.add("B");
		name.add("A");
		
		System.out.println("Collection before sorting: "+name);
		
		Collections.sort(name);
		System.out.println("Collection after sorting: "+name);
		//Create an array of Strings and using Arrays class  class sort the values of that array of Strings.
		
		int [] numbers= {34,232,12,56,-12,-45};
		Arrays.sort(numbers);
		for (int num:numbers) {
		System.out.print(num+", ");
		}
		System.out.println("-------------------------------string");
		String[] a= {"C", "D","E"};
		Arrays.sort(a);
		for (String n:a) {
			System.out.print(n+" ");
		}
			
		
		/*Create an HashSet of cities and add duplicates into it.
         *Retrieve all values from hashset in 2 different ways.
         *Retrieve all values in alphabetical order.
		 * 
		 */
		HashSet<String> city=new HashSet<String>();
		city.add("Kabul");
		city.add("Jalalabd");
		city.add("Khost");
		city.add("Paktia");
		System.out.println("------------------------------------------------city");
		System.out.println(city.size());
		System.out.println(city);
		System.out.println("------------------------------------advance loop");
		for (String cities:city) {
			System.out.print(cities+" ");
		}
		
		System.out.println("------------------------------------------------enhance loop");
		Iterator<String> n=city.iterator();
		while(n.hasNext()) {
			String h=n.next();
			
		}}
		
	}



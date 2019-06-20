package com.class30_Collection;

import java.util.ArrayList;

public class Task {
	/*Create a generic ArrayList that will store 5 names into it.
	    *Find out whether the given ArrayList is empty or not?
	     *Check whether the specific name is present in an ArrayList or not?
	     *Find the size of your arrayList and print all values from that
		 * 
		 */

	public static void main(String[] args) {
		ArrayList<String> generic=new ArrayList<>();
		generic.add("Ahmad");
		generic.add("Salihi");
		generic.add("Farhan");
		generic.add("Bilal");
		generic.add("Abasin");
		//generic.add(123); this is non-generic ArrayList
		System.out.println(generic.isEmpty());
		System.out.println(generic.size());
		System.out.println(generic.get(4));
		System.out.println("----------------------------------------------------------");
		for (int i=0; i<generic.size(); i++) {
			System.out.println(generic.get(i));
		}

	}

}

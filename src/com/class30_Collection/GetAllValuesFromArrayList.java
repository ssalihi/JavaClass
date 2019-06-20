package com.class30_Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class GetAllValuesFromArrayList {
	public static void main(String[] args) {
		
	
	ArrayList<String> generic=new ArrayList<>();
	generic.add("Ahmad");
	generic.add("Salihi");
	generic.add("Farhan");
	generic.add("Bilal");
	generic.add("Abasin");
	System.out.println(generic);
	// way
	System.out.println("-----------------------------using for for loop to get all values");
	//for (int i=0; i<generic.size(); i++) {
		//System.out.println(generic.get(i));
	//}
	for (int a=0; a<generic.size(); a++) {
	System.out.println("The arraylist is :"+generic.get(a));	
	}
	// 2 way 
	System.out.println("----------------------------2 way using advance loop");
	for (Object value:generic) {
		System.out.println(value);
	}
	System.out.println("-------------------3rd way using iterator ");
	Iterator<String> gen=generic.iterator();
	//boolean check=gen.hasNext(); //hasNext(); method tell if the element is there or not, if there is element it will return true
	while (gen.hasNext()) {
		System.out.println(gen.next());
	}
	
}
}
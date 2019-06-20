package com.class31_Collection_recap;

import java.util.ArrayList;
import java.util.Iterator;

public class Task3 {
/*Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.
 * 
 */
	public static void main(String[] args) {
		ArrayList<String> drink=new ArrayList<String>();
		drink.add("Pepci");
		drink.add("Monster");
		drink.add("Tea");
		drink.add("Milk");
		
		for (int i=0; i<drink.size(); i++) {
			String d=drink.get(i);
			if (d.contains("a") || d.contains("e")) {
				drink.set(i, "water");
			}
		}
		System.out.println(drink);
	}

}

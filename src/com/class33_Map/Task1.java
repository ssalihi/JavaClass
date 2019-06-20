package com.class33_Map;
import java.util.*;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * Create a map of countries with its capital. Print all keys and values from a
		 * country map using for each loop and iterator. Print all values from a country
		 * map using for each loop and iterator.
		 * 
		 */
 Map<String, String> capital=new HashMap<>();
  capital.put("Afghanistan","Kabul");
  capital.put("USA","Washington DC");
  capital.put("Canada","Ottawa");
  System.out.println(capital);
  Set<String> city=capital.keySet();
  for (String ca:city) {
	  System.out.println(ca+":"+capital.keySet());
  }
  System.out.println("---------------------------iterator");
  Iterator<String> it=city.iterator();
  while(it.hasNext()) {
	  System.out.println(it.next());
  }
  Collection<String> cl=capital.values();
  for (String value:cl) {
	  
  }
  System.out.println(cl+" ");
  
  Iterator<String> itValue=cl.iterator();
  while(itValue.hasNext()) {
	  System.out.println(itValue.next());
  }
	}

}

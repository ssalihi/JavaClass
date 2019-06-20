package com.class33_Map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class BestBuyTask {

	public static void main(String[] args) {
		/*
		 * Create a map of Best Buy store. Place item id and item name into it. Example
		 * (7664847 = Printer, 7879885= TV etc ) Print all keys and values from a Best
		 * Buy map using EntrySet
		 */
		Map<Integer, String > item=new LinkedHashMap<>();
		item.put(1000, "PC");
		item.put(500, "Iphone");
		System.out.println(item);
		System.out.println("---------------------------------------------advance loop");
		for (Map.Entry<Integer, String> it:item.entrySet()) {
			System.out.println(it.getKey()+"="+it.getValue());
		}
		System.out.println("--------------------------------------------Iterator");
		 Iterator<Entry<Integer, String>> pc=item.entrySet().iterator();
		 while(pc.hasNext()) {
			 Map.Entry<Integer, String> m=pc.next();
			 System.out.println(m.getKey()+"="+m.getValue());
		 }
	}

}

package com.class31_Collection_recap;

import java.util.ArrayList;
import java.util.Iterator;

public class Task2 {
	/*Create an arrayList of words. Remove every word that ends with “e”.
	 * 
	 */

	public static void main(String[] args) {
		ArrayList<String> word=new ArrayList<String>();
		word.add("sale");
		word.add("fale");
		word.add("add");
		word.add("book");
		Iterator<String> iterat=word.iterator();
		while(iterat.hasNext()) {
			String words=iterat.next();
			if (words.endsWith("e")) {
				iterat.remove();
			}
		}
		System.out.println(word);
		
		ArrayList<String> name=new ArrayList<String>();
		
		name.add("Salihi");
		name.add("Gulab");
		name.add("Afghan");
		name.add("Design");
		name.add("paper");
		
		Iterator <String> it=name.iterator();
		while (it.hasNext()) {
			String a=it.next();
			
			if (a.contains("g")){
				it.remove();
			}
				
			}
		System.out.println(name);
		}
		
		
	}



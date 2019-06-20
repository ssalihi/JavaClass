package com.class30_Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IntegerArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> numbers=new ArrayList();
		numbers.add(10);
		numbers.add(20);
		numbers.add(33);
		numbers.add(100);
		
		numbers.set(2, 3333);//chaning the value of index 2 to we use numbers.set()
		
		for (Integer num:numbers) {
			System.out.println(num);
			
		}
		System.out.println("-------------------------------------for loop");
		for (int i=0; i<numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		System.out.println("-----------------------------Iterator");
    Iterator<Integer> num= numbers.iterator();
    while (num.hasNext())	{
    	System.out.println(num.next());
    }	
	}

}

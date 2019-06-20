package com.class31_Collection_recap;

import java.util.ArrayList;
import java.util.Iterator;

public class Task4 {

	public static void main(String[] args) {
		// Create an arrayList of even numbers from 1 to 50.
		//Using Interator remove any number that is divisible by 5 from that arrayList.
		ArrayList<Integer> num=new ArrayList<Integer>();
		for (int i=1; i<=50; i++) {
			if (i%2==0) {
			num.add(i);
			}
			
		}
		
System.out.println(num);
Iterator <Integer> div=num.iterator();
while(div.hasNext()) {
	int number= div.next();
	if (number%5==0) {
		div.remove();
	}
}
System.out.println(num);
	}

}

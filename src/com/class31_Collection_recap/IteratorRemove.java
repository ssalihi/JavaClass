package com.class31_Collection_recap;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorRemove {

	public static void main(String[] args) {
		// lets create  an arraylist of integers from (1-20). remove all odds using iterator
		ArrayList<Integer> alist=new ArrayList<>();
		for (int i=1; i<=20; i++) {
			alist.add(i);
		}
		System.out.println(alist);
		Iterator<Integer> iterator=alist.iterator();// crtl+shift+o to import iterator method
		while(iterator.hasNext()) {
			int number=iterator.next();
			if(number%2!=0) {
				iterator.remove();
			}
			
		}
		System.out.println(alist);
		/*creates an ArrayList of integers from 1-50. remove all numbers those are divisble by 5 using iterator
		 * 
		 */
		ArrayList <Integer> number=new ArrayList<>();
		for (int a=0; a<50; a++) {
			number.add(a);
		}
		System.out.println(number);
		Iterator <Integer> num=number.iterator();
		while(num.hasNext()) {
			int a=num.next();
			if(a%4!=0) {
				num.remove();
			}
		}
		System.out.println(number);
	}

}

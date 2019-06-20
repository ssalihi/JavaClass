package com.class31_Collection_recap;

import java.util.ArrayList;
import java.util.Iterator;



public class Recap {
public static void main(String[] args) {
	int [] array= {10,10,20,20};
	
	ArrayList<Integer> numbers=new ArrayList<Integer>();
	numbers.add(12);
	numbers.add(0,13);
	numbers.add(0,14);
	numbers.add(1,33);
	System.out.println("---------------------------------------size");
	System.out.println(numbers.size());
	System.out.println("-------------------------------------------------get the number");
	System.out.println(numbers.get(1));//33
	System.out.println(numbers.get(2));//13
	System.out.println(numbers.get(0));//14
	System.out.println(numbers.get(3));//12
	
	System.out.println("-------------------------------------------contain numbers");
	System.out.println(numbers.contains(33));//true or false
	System.out.print("---------------------------1. way using for loop to retriate the numbers");
	for (int i=0; i<numbers.size(); i++) {
		System.out.println(numbers.get(i));
	}
	
	System.out.println("---------------------------2. way using advance for loop to retriate the numbers");
	for (Object a:numbers) {
		System.out.println(a);
	System.out.println("---------------------------3. way using advance iterator");
	Iterator it=numbers.iterator();
	//hasNext()	, next(), remove(),
	while(it.hasNext()) {
	//	int g=(int) it.next();
		System.out.println(it.next());
		
		
	}
	System.out.println("---------------------------4. way while loop");
	int c=0;
	while(numbers.size()>c) {
		int myNum=numbers.get(c);
		System.out.println(myNum);
		c++;
	}
	}
}
}

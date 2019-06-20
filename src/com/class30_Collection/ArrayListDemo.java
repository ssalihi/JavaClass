package com.class30_Collection;

import java.util.ArrayList;// we have to import ArrayList

public class ArrayListDemo {
	

	public static void main(String[] args) {
		ArrayList<String> greetings=new  ArrayList<String>();
		greetings.add("Hello");//[0]
		greetings.add("welcome");//[1]
		greetings.add("Hi");//[2]
		greetings.add("bye");//[3]
		
		greetings.get(1);//getting the value of 1 index
		System.out.println(greetings.get(1));
		System.out.println("the size of arraylist is "+greetings.size());//it use to find the length of ArrayList
		//collection of growable in size
		greetings.add("How are you?");
		greetings.add("How are you?");
		greetings.add("How are you?");
		System.out.println("The size of arraylis is now "+greetings.size());
		System.out.println("---------------------------------------------------------for loop---------");
		for (int i=0; i<greetings.size(); i++) {
		System.out.println(greetings.get(i));
		}
		System.out.println("----------------------------------------Advance loop");
		 for (String greetWord:greetings) {
			 System.out.println(greetWord);
		 }

	}

}

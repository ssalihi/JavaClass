package com.Class14;

public class Task1 {

	public static void main(String[] args) {
		// Create a string that hold sentence write a program to get a new string without any spaces.
		String a= "I love my spring season";
		String b=a.replace(" ", "");
		System.out.println(b);
		// create a String that should be combination of letters, numbers and special characters.
		//Find out how many alpha characters there in String.
		
		String c="I love1223 &^$ Spring#@# 123";
		String d= c.replaceAll("[^A-Za-z]", "");
		System.out.println(d.length());
		// You have String a="Is it saturday! Is it raining! Do we have a Java Class today?"
		//how would you find out how many sentences are in that string?
		String f="Is it saturday? Is it raining? Do we have a Java Class Today";
		String [] array= f.split("?");//only "?" mark is not giving the result so we need to add "\\" before "?" or we use //[!?] this only
		System.out.println("The number of sentences in string is: "+array.length);
		
		String newString = "My name is Sekander the Greatest of all Sekandera in this world"; 
		
	
	}

}

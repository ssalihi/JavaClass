package com.Class15;

import java.util.Scanner;

public class stringPalindrom {

	public static void main(String[] args) {
		// Write a Java Program to find whether a String is palindrom or not? (dad,mom, madam)
Scanner scan=new Scanner (System.in);
System.out.println("Please enter your any word to check if it a palidrome");
String word=scan.nextLine();
String reverse="";
for (int i=word.length()-1; i>=0; i--) {
	reverse=reverse+word.charAt(i);
	
}
if (word.equalsIgnoreCase(reverse)) {
	System.out.println("The word is palidrome");// palidrome is word which is same from reverse
}else {
	System.out.println("The word is not palidrome");
}

	}

}

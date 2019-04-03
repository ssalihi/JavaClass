package com.Class13;

import java.util.Scanner;

public class StringReview {

	public static void main(String[] args) {
		/*
		 * create a string and print it in reverse order (Sunday-yadnuS)
		 * 
		 * 
		 */
		String day = "Sunday";
		for (int a = day.length() - 1; a >= 0; a--) {
			System.out.print(day.charAt(a));
		}
		System.out.println("-------------------------------------");
		/*
		 * create string and if the string is not empty perform the following: if the
		 * string has an odd number of character and has 3 or more chractoer print the
		 * charactor in the middle of string.
		 * 
		 */
		String a = "I love my country";

		if (!(a.isEmpty())) {

			if (a.length() % 2 != 0 && a.length() > 3) {

				System.out.println(a.charAt(a.length() / 2));
			}
		} else {
			System.out.println("the String is empty");
		}
		/*Write program that reads two people's first names and it they expecting boy or girl?
		 * based on the input suggests a name for a baby:
		 * 
		 */
		Scanner scan;
		String mN, fN, gender,babyName;
		 scan=new Scanner(System.in);
		 System.out.println("Pleaser enter mothers name");
		 mN=scan.nextLine();
		 System.out.println("Please enter father name");
		 fN=scan.nextLine();
		 System.out.println("Please enter expected gender");
		 gender=scan.nextLine();
		 if (gender.equalsIgnoreCase("boy")) {
			 babyName=fN.substring(0,fN.length()/2)+mN.substring(mN.length()/2);
			 
		 }else if (gender.equalsIgnoreCase("girl")) {
			 babyName=mN.subSequence(0, mN.length()/2)+fN.substring(fN.length()/2);
		 }else {
			 babyName="No Sugestion";
			 }
		 System.out.println(babyName.toUpperCase());
	}

}

package com.Class6;

import java.util.Scanner;

public class StringSwitch {

	public static void main(String[] args) {
		/*Prompt user to enter their country
		 * Based on the country ---> specifiy favorite food
		 */
Scanner scan;
String country;
String food = null; 

scan=new Scanner(System.in);
System.out.println("Please enter which country you are from");
country=scan.nextLine();

switch (country) {
case "USA":
	food="Burger";
	break;
case "Afghanistan":
	food="Palaw";
	break;
case "Pakistan":
	food="Daal";
	break;
	default:
		
}
System.out.println("My favorite food is "+food);
	}

}

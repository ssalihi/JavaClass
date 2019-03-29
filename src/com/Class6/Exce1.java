package com.Class6;

import java.util.Scanner;

public class Exce1 {

	
		/*ask use to enter their country and capture it.
		 * once values are captured print which language use speaks
		 */
	public static void main(String[] args) {
	    Scanner scan;
		String country;
		String language;
		scan=new Scanner (System.in);
		System.out.println("Please enter name of the country");
		country=scan.nextLine();
		
		switch (country) {
		case "Afghanistan":
			language="Pashto";
			break;
		case "USA":
			language="English";
			break;
		case "Turkey":
			language="Trukish";
			break;
			default:
			language="Unknow";
			
		}
	System.out.println("They speak "+ language);	
	
	
	}

}

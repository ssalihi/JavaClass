package com.class4;

import java.util.Scanner;

public class CityTemp {
/*
 * input city and temp and convert the temp to celsius
 */
	public static void main(String[] args) {
		String  cityName;
		int temp;
		Scanner myScanner=new Scanner(System.in);
		System.out.println("Please city name");
		cityName=myScanner.nextLine();
		System.out.println("Please enter temp");
		temp=myScanner.nextInt();
		//Formula (temp-32)*5/9
		int conTemp=(temp-32)*5/9;
		System.out.println("The temp in the "+cityName+" is "+ conTemp);
		

	}

}

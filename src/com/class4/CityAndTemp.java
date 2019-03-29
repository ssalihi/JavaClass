package com.class4;

import java.util.Scanner;

public class CityAndTemp {
	/*
	 * Ask use to enter city and temp in F
	 * your program should convert F---->C
	 * your program should say "the temp is the city ----is-----
	 */
	public static void main(String[] args) {
		
  String cityName;
  int temp;
  Scanner myScanner=new Scanner(System.in);
  System.out.println("Please enter your city name");
  cityName=myScanner.nextLine();
  System.out.println("Please enter temp of your city");
  temp=myScanner.nextInt();
  //Formula (temp-32)*5/9
  int conTemp=(temp-32)*5/9;
  System.out.println("the temp in the city "+cityName+" is " +conTemp+ " C");
  
  

  
  
  
 
	}

}

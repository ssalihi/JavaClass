package com.Class22_Inheritance;

public class Task1 {
//Write a program that will have a constructor: one with parameters and second without any parameters. 
	//Create a separate Test class where you will execute both of the constructors.
	public static String countryName="USA";
	public static String stateName="Virginia";
	
	public String cityName;
	public int zipCode;
	
	public Task1(String name, int code) {
		cityName=name;
		zipCode=code;
		
		
	}
	
	public void address() {
		String add="I live in "+countryName+" in state of "+stateName+" , city of "+cityName+" and our zip code is "+zipCode+".";
		System.out.println(add);
	}
	//public void address1() {
		//String countryName="Afghansitan";
		//System.out.println("My second address was "+countryName+" in province of "+stateName+cityName);
	//}
}

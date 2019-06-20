package com.Class16;

public class TV {
	static String make;
	static String model;
	static String color;
	static int size, thickness;

	public static void main(String[] args) {
		TV tv=new TV();
		TV.make="Insingnia";
		TV.model="RUKO";
		TV.color="Black";
		TV.size=42;
		TV.thickness=2;
		
		System.out.println("My TV is "+TV.make+TV.model+" and size of my tv is "+TV.size+" and "+TV.thickness);
		TV.HD();
		
		TV.Voice();

	}
	static void HD() {
		System.out.println("My tv is 4K HD");
	}
	static void Voice() {
		System.out.println("My tv is has good sound quality");
	}
	

}

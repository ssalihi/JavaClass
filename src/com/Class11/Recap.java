package com.Class11;

public class Recap {

	public static void main(String[] args) {
		// lets create an array of names thats will hold 5 elements and retrieve all values from it 
		// 1. create an using new keyword
		String [] names= new String[6];
		names[0]="Asel";
		names[1]="Awet";
		names[2]="Arif";
		names[3]="Weqas";
		names[4]="Dzmitri";
		names[5]="Shiva";// will get an runtime exception when trying to access it
		for (int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		//2. create an array using array literal 
		System.out.println("-----------------------------------for loop--------------2nd way ");
		String[] studentsNames= {"Shaban","Bilal","Mehmet", "Zaki","Samir","Frank"};
		for (int i=0; i<=studentsNames.length-1; i++){
		System.out.println(studentsNames[i]);
		}
		//retrieve values using: Advance for loop, for each loop, enhances for loop
		System.out.println("---------------------Advanced loop--------------- retreive values (3rd way)");
		
		// we are specifying the index or length and simply print the entire loop in sequence 
		for (String student:studentsNames) {
		System.out.println(student);
	}
	}
}

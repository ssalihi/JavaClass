package com.Class10;

public class ArrayCreation {

	public static void main(String[] args) {
		             //0, 1, 2, 3
		int [] array= {10,20,30,40};
		System.out.println(array[2]);
      // to find the size of our array to we use the following method (array.lenght)
		System.out.println(array.length);
		// string of names  (5names)
		                 //0,      1,      2,        3,     4
		String[] names= {"Huda", "Neda", "Salgy","Bilal", "Farhan"};
		System.out.println("There are " +names.length+ " names in my array");
		System.out.println(names[4]);
	}

}

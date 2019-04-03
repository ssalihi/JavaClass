package com.Class14;

public class StringSplit {

	public static void main(String[] args) {
		// 
		String str="Welcome to Syntax Students Batch 4";
		String [] array=str.split("S"); 
        System.out.println("The lenght of the array is: " +array.length);// we have 3 string
        for (String substring:array) {
        	System.out.println(substring);
        }
        System.out.println("--------------------------------------------- 2nd way");
        for (int i=0; i<array.length; i++) {
        	System.out.println(array[i]);
        }
	}

}

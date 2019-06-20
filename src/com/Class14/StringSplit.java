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
        
        String str1="I am working for goverment agency";
        String []array1=str1.split("f");
        System.out.println("The lenght of second example is :"+array1.length);
        for (String a:array1) {
        	System.out.println(a);
        }
        
	}

}

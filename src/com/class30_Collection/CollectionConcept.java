package com.class30_Collection;

import java.util.Arrays;

public class CollectionConcept {

	public static void main(String[] args) {
	 int a=10;
	 int b=20;
	 int c=30;
	 
	 int [] array= {10,20,30,40};
	int []intArray=new int [3];
	 intArray[0]=10;
	 intArray[1]=20;
	 intArray[2]=30;
	 //intArray[0]=40;
	 
	 int num= intArray[2];
	 System.out.println(num);
	 System.out.println("--------------------------------");
	 for (int i=0; i<intArray.length; i++) {
		 System.out.print(intArray[i]+" ");
		
	 }
	 System.out.println("-----------------------");
	 System.out.println("the given array is "+Arrays.toString(array));

	}

}

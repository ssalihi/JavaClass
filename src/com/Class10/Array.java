package com.Class10;

public class Array {

	public static void main(String[] args) {
		/*index always starts from zero. the total size of array is the total number of values
		 * our array is a object
		 * array is the collection of the same data 
		 */ 
		int num;
		int [] array1;// declare an array (the most preferred way to declare an array)
		int [] array2;// declare an array (the most preferred way to declare an array)
		int array3[];// declare an array (not preferred way to declare an array)
        array1=new int[4];//(initialize, create an array) we should specify the our value (4), first create our array object 
        // then assigning value
        array1[0]=10;
        array1[1]=20;
        array1[2]=30;
        array1[3]=40;
        // access values (specify element which is stored in given index)
        System.out.println(array1[2]);
        System.out.println("----------------------------2nd way of creating array");
        int[] numbers=new int[3]; // 3 shows the numbers of index
        // when we are out of our limit we will get array index out of bounds exception
        // there will be no error during compilation, but error will be occurred during run time
        numbers[0]=5;
        numbers[1]=10;
        numbers[2]=15;
        System.out.println(numbers[2]);
        System.out.println(numbers[2]+numbers[1]);// 25
        System.out.println(numbers[2]/numbers[0]);//3
        System.out.println("-------------------------------for string");
        String [] a=new String [3];
        a[0]="Hello";
        a[1]="Hi";
        a[2]="Bye";
        System.out.println(a[1]+ " friends");
	}
}

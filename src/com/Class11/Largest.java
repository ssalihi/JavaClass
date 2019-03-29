package com.Class11;

public class Largest {

	public static void main(String[] args) {
		// create an array of integers and find the largest number// this is the interview question for both smallest and largest nbumber
int [] array= {10,20,3006,400,50};
 int max= array[0];// assume that out max number is equals to index [0]
 int min= array[0]; // assume theat our min number is in index [0]
for (int i=0; i<array.length; i++) {
	if (array[i]>max) {
		max=array[i];
		
	}else if (array[i]<min) {
		min=array[i];
	}
}
System.out.println("The largest number " + max);
System.out.println("The smallesest number " + min);
///.. finding the second the largest number
int arr[] = { 10, 4, 7, 8, 9, 2, 18, 26, 21, 20 };
int largest = arr[0];
int secondLargest = arr[0];
for (int i = 0; i < arr.length; i++) {

	if (arr[i] > largest) {
		secondLargest = largest;
		largest = arr[i];

	} else if (arr[i] > secondLargest) {
		secondLargest = arr[i];

	}
}

System.out.println("Second largest number is:" + secondLargest);

	}

}

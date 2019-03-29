package com.Class12;

public class Recap {

	public static void main(String[] args) {
		int [][] arr= {// this is array of arrays 
				{1,2,3},// first array that stored with index 0
				{10,20,30},// 2 array with index 1
				{100,200,300},	// 3 array with index 2
		};
		// how many total arrays 
for (int row=0; row<arr.length; row++) {
	for (int col=0; col<arr[row].length; col++) {
		System.out.print(arr[row][col]+" ");
	}
	System.out.println();
}
System.out.println("----------------For each loop--------------------------2nd Example");
// loop through eaach element inside 2D Array --> each element=array
for (int [] singleArray:arr) {// arr is bigger arrays, we need it to change them to single dimension array from 2D
	for (int numbers:singleArray) {// then we need to 1D to integer or string data types then we execute them
		System.out.print(numbers+" ");
	}
	System.out.println();
}
	}

}

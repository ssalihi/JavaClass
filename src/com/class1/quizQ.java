package com.class1;

public class quizQ {

	public static void main(String[] args) {
		int[] array = { 1, 4, 3, 6, 8, 2, 5};
		int what = array[0];

		// scan the array
		for ( int index=0; index < array.length; index++ )
		{ 
		if ( array[ index ] > what ) 
		what = array[ index ]; 
		}
		System.out.println( what ); 
	}

}

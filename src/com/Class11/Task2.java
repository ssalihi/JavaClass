package com.Class11;

public class Task2 {

	public static void main(String[] args) {
		// Create an array of cars:American Cars, German cars,SK Cars, Italian Car. Then retrieve all values from that array
String [][] cars= {
		{"Ford","GMC","Dodge","Jeep"},
		{"Hyudia","KAI"},
		{"Merceds","BWM","Audi"},
		{"Fiat","Massrati","Alfa Romeo","Ferari"}
};
for (int c=0; c<cars.length; c++) {
	for (int m=0; m<cars[c].length; m++) {
		System.out.print(cars[c][m]+" ");
	}
	System.out.println();
}
//
int[] egArray = { 2, 4, 6, 8, 10, 1, 3, 5, 7, 9 };

for ( int index= 0 ; index < 5 ; index++ )
System.out.print( egArray[ index ] + " " );
}
}



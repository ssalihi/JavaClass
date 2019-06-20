package com.Class9;

public class NestedLoop {
public static void main (String[] args ) {
	// for (initialization; condition; increment/decrement) {
	// for nested loop  for(initialization; condition; increment/decrement){}
	//}
	for (int i=0; i<3; i++) {
		System.out.println("-----I am outer loop----- " +i);// outer loop
	}
		for (int a=0; a<3; a++) {// our inner loop always has depedency on outer loop
			System.out.println("I am inner loop " +a);// inner loop
		}
		//
		for (int i=0; i<3; i++) {
			
		
		for (int a=0; a<3; a++) {// our inner loop always has depedency on outer loop
			System.out.println("I am inner loop " +a);// inner loop
			}
			System.out.println("-----I am outer loop----- "+i);// outer loop
		}
}
}

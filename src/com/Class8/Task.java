package com.Class8;

public class Task {

	public static void main(String[] args) {
		for (int a=1; a<=100; a++) {
			System.out.print(a);
		}
// from 100-1
		System.out.println("...................................2nd exp");
		for (int a=100; a>=1;  a--) {
			System.out.print(a);
		}
		// print odd number form 1-20
		System.out.println(".......................3rd ex");
		for (int a=1; a<=20; a+=2) {
			System.out.print(a);
		}
		//
		System.out.println(".............4th ex");
		for (int a=20; a>=1;  a-=2) {
			System.out.print(a);
		}
		//
		System.out.println("....................5th ex");
		for (int a=20; a<=50; a+=2) {
			System.out.print(a);
		}
		//
		System.out.println("............................6th ex");
		for (int a=50; a>=20; a-=2) {
			System.out.println(a);
		}
		
	}

}

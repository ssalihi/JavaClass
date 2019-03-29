package com.Class8;

public class ForLoop {

	public static void main(String[] args) {
		// initialize  condition/test condition increment and decrement
		for (int i=0;  i<=5;  i++) {
		System.out.println("Good morning "+i);	
		}
		System.out.println(" ---------------------for loop 2nd exmple");
		// I want to print print numbers from 10 to 1
		for(int x=20; x<40; x=x+3)   {        

			   System.out.print(x);

			}
		System.out.println("---------------------3rd example");
		// what is the output
		for (int a=0; a<=20; a+=2) {
			System.out.println(a);
		}
		System.out.println("--------------------------------4th example");
		// I want to print the b
		int y = 0;
		for (int i = 0; i < 10; ++i) {
		y += 1;
		}
		System.out.println(y);
	}
}
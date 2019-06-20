package com.Class7;

public class WhileAndDoWhile {

	public static void main(String[] args) {
		
	int a=11;
	do {// executes first and then check condition
		System.out.println("Hello");
		a++;
	} while (a>15);
	//................................
	int b=10;
	while (b<15) { // check condition first and then execute (Condition should be true)
		System.out.println("Bye");
		b++;
	}
	
	}

}

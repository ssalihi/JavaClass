package com.Class17_2;

public class NestedLoopDemo {

	public static void main(String[] args) {
		NestedLoopDemo demo=new NestedLoopDemo();// we create object of NestedLoopDemp class	
	    demo.printNumber();
	}
void printNumber() {
	for (int i=1; i<=2; i++) {
		for (int j=0; j<=3; j++) {
			System.out.println(i+" "+j);
		}	
		}
}
}

package com.Class6;

import java.util.Scanner;

public class NotOperator {

	public static void main(String[] args) {
		/*Not Operator is reversing our condition (if it false, it shows true or if it is true it shows false)
		 * Not operator sign is (! exclamation mark), put this sign in-front of condition
		 */
		Scanner scan;
		scan=new Scanner(System.in);
		
		
System.out.println(".......................................................................Exp-1");
int x=10;
int y=15;
if (!(x>y)) {
	System.out.println("hello");
	System.out.println("..................................................................Exp-2");
	// if it 50$ per hour
	int offer;
	offer=45;
offer=scan.nextInt();
	if (!(offer>50)) {
		System.out.println(" i will accept the "+ offer+" will accept it");
	} else {
		System.out.println("will reject it");
	}
}
	}

}

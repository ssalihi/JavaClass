package com.Class6;

import java.util.Scanner;

public class ecxer2 {
	public static void main(String[] args) {
	Scanner scan;
	char grade;
	String rate;
	scan=new Scanner(System.in);
	System.out.println("Please enter the grade");
	grade=scan.next().charAt(0);
	
	switch (grade) {
	case 'A':
		rate="Excellent";
		break;
	case 'B':
		rate="Good";
		break;
	case 'C':
		rate="Fair";
		break;
	case 'D':
		rate="very bad";
		break;
		default:
		rate="no rating";
		
	}
	System.out.println("You are "+ rate);
	}
}

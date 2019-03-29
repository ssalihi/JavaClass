package com.class4;

import java.util.Scanner;

public class ScannerClass2 {

	public static void main(String[] args) {
		// ask for the name and print good morning
		Scanner input= new Scanner(System.in);
		System.out.println("Please enter your name");
		String name=input.nextLine();
		System.out.println("Good Morning "+name);
		
		
		

	}

}

package com.Class17_2;

import java.util.Scanner;

public class ScannerMethodwithReturn {
	public static void main(String[] args) {
		ScannerMethodwithReturn obj=new ScannerMethodwithReturn();
		Scanner scan=new Scanner (System.in);
		System.out.println("Please enter two number");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=obj.sum(a,b);
		//System.out.println(obj.sum(a, b));//obj.sum(a,b);
		
		System.out.println(c);
	}
	int sum(int a, int b) {// if we expecting from user we should specify the parameter in void method
		//System.out.println("Sum of two number is="+(a+b))

		return a+b;
		
	}
}

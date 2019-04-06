package com.Class17_3;

import java.util.Scanner;

public class ScannerMethod {
public static void main(String[] args) {
	ScannerMethod obj=new ScannerMethod();
	Scanner scan=new Scanner (System.in);
	System.out.println("Please enter two number");
	int a=scan.nextInt();
	int b=scan.nextInt();
	obj.sum(a, b);
	
	
}
void sum(int a, int b) {// if we expecting from user we should specify the parameter in void method
	System.out.println("Sum of two number is="+(a+b));
}

}

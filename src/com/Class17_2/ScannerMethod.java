package com.Class17_2;

import java.util.Scanner;

public class ScannerMethod {
public static void main(String[] args) {
	ScannerMethod obj=new ScannerMethod();
	Scanner scan=new Scanner (System.in);
	System.out.println("Please enter two number");
	int a=scan.nextInt();
	int b=scan.nextInt();
	obj.sum(a, b);
	System.out.println("Please enter two number");
	int c=scan.nextInt();
	int d=scan.nextInt();
	obj.sum(a, b);
	obj.sub(c,d);
	
	
}
void sum(int a, int b) {// if we expecting from user we should specify the parameter in void method
	System.out.println("Sum of two number is="+(a+b));
}
void sub(int a, int b) {
	System.out.println("Sub of two number is="+(a-b));
}

}

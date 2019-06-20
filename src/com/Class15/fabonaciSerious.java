package com.Class15;

public class fabonaciSerious {

	public static void main(String[] args) {
		// Write a Java Program to print first 10 numbers of Fibonacci series
int a=1;
int b=0;
int c=0;
for (int i=0; i<10; i++) {
	c=a+b;
	a=b;
	b=c;
	System.out.print(a+" ");
	// 
}
int d=1;
int e=0;
int f=0;
for (int j=0; j<20; j++) {
	f=e+d;
	d=e;
	e=f;
	System.out.print(d+" ");
	
}
	}

}

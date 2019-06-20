package com.class34_ExceptionIntro;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		System.out.println("Begining of the code");
		int a= 10;
		int b=0;
		try {
		System.out.println(a/b);
		System.out.println(" Code inside try block");
		} catch (ArithmeticException e) {
			System.out.println("Code inside catch block");// catch block will by only executed if there is exception.
		}
System.out.println("The end of the program");
System.out.println("----------------------------------------------------------------------------------------------");
System.out.println("Begining of the code");
int c= 10;
int d=0;
try {
System.out.println(c/d);
System.out.println(" Code inside try block");
} catch (ArrayIndexOutOfBoundsException e) {
	System.out.println("Code inside catch block");// catch block will by only executed if there is exception.
}
System.out.println("The end of the program");
	}

}

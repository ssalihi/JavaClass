package com.class34_ExceptionIntro;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Task3 {


	/*Create a static method that will return a List of Exceptions.
	*Inside your method create objects of 4 exception classes and store them inside your list.
	*Call your method inside main and print name and details of all Exception objects.
	 * 
	 */
	public static void main(String[] args) {
		List<Exception> exceptionlist=getList();
		System.out.println(exceptionlist.size());
		for (Exception singleException : exceptionlist) {
			System.out.println(singleException.getMessage());
		}
	}
	
	public static List<Exception> getList(){
		List<Exception> list=new ArrayList<>();
		// 1 try catch for Arithematric exception 
		try {
			System.out.println(10/0);	
		}catch (ArithmeticException e) {
			list.add(e);
			
		}
		// 2. try catch for ArrayIndexOutOfBoundsException
		int [] array= {1,2,3,4};
		try {
		System.out.println(array[4]);
		} catch (ArrayIndexOutOfBoundsException ae) {
			list.add(ae);
		}
		// try catch for InputMismatchException
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter number");
		try {
			int num=scan.nextInt();
		} catch (InputMismatchException ime) {
			list.add(ime);
		}
		//4 try catch for NullPointerException
		try {
			String str=null;
			System.out.println(str.length());
		}catch (NullPointerException nle) {
			list.add(nle);
		}
		return list;
		
	}
}

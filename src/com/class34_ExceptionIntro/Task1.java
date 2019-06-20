package com.class34_ExceptionIntro;

import java.util.InputMismatchException;
import java.util.Scanner;
/*How would handle InputMismatchException? Input Mismatch exception when user mismatch value then programmer
 * 
 */
public class Task1 {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		try {
			int num=a.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("Inside catch block");
		}

	}

}

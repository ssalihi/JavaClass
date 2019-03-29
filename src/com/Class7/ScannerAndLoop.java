package com.Class7;
 import java.util.Scanner;
public class ScannerAndLoop {

	public static void main(String[] args) {
		/*Prompt user to ask the name 3 times and print "you are doing______"
		 * 
		 */
Scanner scan;
String name;
scan=new Scanner (System.in);
int a=1;
while (a<=4) {
	System.out.println("Please enter you name");
	name=scan.nextLine();
	System.out.println("You are doing great "+name);
	a++;
	
}
// 
	}

}

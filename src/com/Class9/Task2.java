package com.Class9;

public class Task2 {

	public static void main(String[] args) {

		/*55555
		 * 44444
		 * 333333
		 * 2222
		 * 11111
		 * 
		 */
		for (int c=5; c>0; c--) {
			for (int d=5; d>0; d--) {
				System.out.print(c);
			}
			System.out.println();
		}
System.out.println("--------------------------------------------------------------------");
 for (int r=1; r<=5; r++) {
	 System.out.println("*");
	 if (r==5)
		 break;
	for (int s=1; s<=r; s++) {
		System.out.print("*");
	} 
 }
 System.out.println("----------------------------------------");
 for (int t=1; t<=5; t++) {
	 for (int u=1; u<=t; u++) {
		 System.out.print("*");
	 }
	 System.out.println();
 }
 //
 System.out.println("---------------");
 for (int p=1; p<=4; p++) {
	 for (int l=1; l<=6; l++) {
		 if (p==1 || p==4 || l==1 || l==6) {
			 System.out.print("*");
		 }else {
			 System.out.print(" ");
		 }
		
	 }
	 System.out.println();
 }
	}

}

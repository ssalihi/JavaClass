package com.Class17_3;

public class Examples {

	public static void main(String[] args) {
		/*            ******
		 *            ******
		 *            ******            
		 *            ******   
		 */
		Examples b=new Examples();
        b.star();
	}
void star() {
	for (int a=0; a<4; a++) {
		for (int b=0; b<5; b++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}

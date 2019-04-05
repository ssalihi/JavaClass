package com.Class7;

public class OddNumer {

	public static void main(String[] args) {
		/*print only odd number from 1-20
		 * 
		 */
int num=1;
while (num<=20) {
	
	if (num%2==0) {
		System.out.print(num);
		
	}
	num++;  // put out of if condition
	
}
// print only even numbers from 10 100
 int num2=10;
 while (num2<=100) {
	 if (num2%2==0) {
		 System.out.print(num2+" ");
	 }
	 num2++;
 }
	}

}

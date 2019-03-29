package com.Class5;

public class LogicalOperators {

	public static void main(String[] args) {
		/* if number is between 1-10---> number is small
		 * if number is between 11-100--> number is medium
		 * if number is between 101-1000--> number is large
		 */
int num1=150;
// true AND false--->false
if (num1>=1 && num1<=10) {
	System.out.println("number is small");
}else if (num1>=11 && num1<=100) {
	System.out.println("number is medium");
}else if (num1>=101 && num1<=1000) {
	System.out.println("number is large");
}else {
	System.out.println("number is not our range");
}
	}

}

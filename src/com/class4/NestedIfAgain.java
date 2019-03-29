package com.class4;

public class NestedIfAgain {
/*
 * declare variable for GPA and having diploma
 * if user has diploma congratulations, --->if GPA is higher 3.5--> than hire the person else do not hire
 */
	public static void main(String[] args) {
		double gpa=3.8;
		double expectedGpa=3.5;
		boolean hasDiploma=true;
		if (hasDiploma) {
			System.out.println("Congratulation");
			if (gpa>expectedGpa) {
				System.out.println("you are hired");
			}else {
				System.out.println("unforunaletly we cannot hire you");
			}
		}else {
			System.out.println("Please get you degree");
		}		

	}

}

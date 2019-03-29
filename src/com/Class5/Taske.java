package com.Class5;

import java.util.Scanner;

public class Taske {

	public static void main(String[] args) {
		Scanner input;
		double quiz, midterm, finalscores;
		
		double avScores;
		input=new Scanner(System.in);
		System.out.println("Please enter score");
		
		System.out.println("quiz");
		quiz=input.nextDouble();
		
		System.out.println("midterm");
		midterm=input.nextDouble();
		
		System.out.println("finalscores");
		finalscores=input.nextDouble();
		
		avScores=((quiz+midterm+finalscores)/3);
	
		System.out.println("Average Score is " + avScores);
		
		if (avScores>=90) {
			System.out.println(" your grade is A");
		}else if (avScores>=70  && avScores<90) {
			System.out.println("you are grade is B");
		}else if (avScores>=50 && avScores<70) {
			System.out.println("you are grade C");
		}else {
			System.out.println("you are garde F");
		}
	}

}

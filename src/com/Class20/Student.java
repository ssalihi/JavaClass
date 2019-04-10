package com.Class20;

public class Student {

	public static void main(String[] args) {
	int score;
	Student obj=new Student();
	char grade=obj.getGrade(85);
    System.out.println("My grade in syntax is "+grade);
	}
	
	
	
	char getGrade (int score) {
		char grade=0;
	
	if (score>90) {
		grade='A';
	}else if (90>score&& score>80) {
		grade='B';
	}else if (score<80 && score>70) {
		grade='C';
	} else if (score<70 && score>50) {
		grade='D';
		
	}else {
		grade='F';
	}
	return grade;
	}

}

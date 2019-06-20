package com.Class22_Inheritance;

public class Students {
/*Write a java program of Class Students that takes students name and 3 subject grades.
 *  Inside your class also have a method to Calculate Average Grade. 
 *  Test Student class for 5 different students with different marks. 
 *  Your program should print an average mark of each students name.
 *  NOTE: please male different names for instance and local variables. (edited)
 */
	public static String subject1="Math";
	public static String subject2="English";
	public static String subject3="Physics";
	 int grade1;
	 int grade2;
	 int grade3;
	 String studentName;
	 int averageGrade;
	 public Students(String name, int a, int b, int c) {
		 studentName=name;
		  grade1=a;
		  grade2=b;
		  grade3=c;
		  
		 
	 }
	 
	 public void subjects() {
		  averageGrade=(grade1+grade2+grade3)/3;
		  String a="My name is "+studentName+" and my average garde for "+subject1+" ,"+subject2+" and "+subject3+" is " +averageGrade;
		  System.out.println(a);
	 }
	 
	
	
}

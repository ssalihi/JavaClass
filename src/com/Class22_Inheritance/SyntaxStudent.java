package com.Class22_Inheritance;

public class SyntaxStudent {
/*schoolName
 * batchName
 * studentName
 * studentLastName
 * 
 * method to getStudentDetails
 */
	public static String schoolName="Syntax";
	public static int batchNumber=4;
	
	public String studentName;
	public String studentLastName;
	
	public SyntaxStudent (String name, String lastName) {//constructor
		studentName=name;
		studentLastName=lastName;
		
	}
	
	public void getStudentDetails() {
		String details="I am a student at "+schoolName+" from batch "+batchNumber+" and my name is "+studentName+" "+studentLastName+".";
		System.out.println(details);
	}

}

package com.Class21;

public class Student {
	String studentName;
	int numberOfStudents;
	int studentID;
	
     public static int totalStudents;
	public static void main(String[] args) {
		/*2.  Create a Class called Students
		 * Create three  variables  studentNames,studentID  and  numberOfStudents
		 * Create three objects of the Students Class
		 * Set the value for  studentName ,studentID and increment  the numberOfStudents for each objectPrint out  total number of students
		 */
       Student student1=new Student();
       student1.studentID=1001;
       student1.studentName="Sekander";
       totalStudents++;
       
       
       Student student2=new Student();
       student2.studentID=1002;
       student2.studentName="alex";
       totalStudents++;
       
       Student student3=new Student();
       student3.studentID=1003;
       student3.studentName="Talgat";
       totalStudents++;
       
       Student student4= new Student();
       student3.studentID=1003;
       student3.studentName="Talgat";
       totalStudents++;
       
       
       System.out.println("The total number of students are :"+totalStudents);
       
       
	}

}

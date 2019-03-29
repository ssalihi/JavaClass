package com.Class11;

public class Task1 {

	public static void main(String[] args) {
		//create a 2D array where you will store the following values:Mr,Mrs,Ms,Miss and smith, Jordan,Jackson,Obama
		// After storing values print the following:Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan
		String [][] N= {
				{"Mr","Mrs","Ms","Miss",},
				{"Smith","Obama","Jackson","Jordan",}
				};
		System.out.println(N[0][1]+" "+N[1][0]);//Mrs Smith
		System.out.println(N[0][0]+" "+N[1][1]);// Mrs Obama
		System.out.println(N[0][2]+" "+N[1][2]);// Ms Jackson
		System.out.println(N[0][3]+" "+N[1][3]);//Miss Jordan
		///Create a 2D array that first row will contain 4 names and second row will contain grades
		//Then your program should print name of the student that has as an A and B grades
		System.out.println("----------------------------------------------------2nd task");
		String [][] names= {
				{"Smith","Obama","Jackson","Jordan",},
				{"A","B",}
				};
		System.out.println(names[0][0]+" is grade "+names[1][0]+" student");
		System.out.println(names[0][1]+" is grade "+names[1][1]+" student");
		System.out.println(names[0][2]+" is grade "+names[1][0]+" student");
		System.out.println(names[0][3]+" is grade "+names[1][0]+" student");
	}

}

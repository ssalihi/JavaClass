package com.Class12;

import java.util.Scanner;

public class Task1 {
	/*
	 * Accept username, password and confirm password and check following requirements:
	 * Username and Password cannot be  empty, if so→ message=”Username and Password cannot be empty”.
	 * Password should be minimum 8 characters, if less → message=”Password is too short”.
	 * Password cannot contain username if so, → message=”Password cannot contain username”
	 * Password should match confirmed password, if not  → message “Passwords do not match”.
	 * Only after all requirements met → message “Your username and password has been created”
	 */

	public static void main(String[] args) {
		String Username, Password, Check;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter username and Password");
Username=scan.nextLine();
Password=scan.nextLine();
Check=scan.nextLine();
System.out.println("Please confirm your password");
if (Username.isEmpty() || Password.isEmpty()) {
	System.out.println("The Username and Password cannot be Empty");
 
	if (Password.length()<8){
	
	System.out.println("Password is too short");
	}
 
	if (Password.contains("Username")) {
	System.out.println("Password cannot contain username");
	}
 
	
}if (!Password.equals(Check)) {
	System.out.println("Password do not match");
} else {
	System.out.println("Password match");
}
System.out.println("Your User name and password has been created");
	};
	
	}
	


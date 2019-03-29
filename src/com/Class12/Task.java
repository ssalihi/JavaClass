package com.Class12;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		Scanner scan;
		String userName,password,confirm, message;
        scan=new Scanner (System.in);
        
        System.out.println("Please enter username");
        userName=scan.nextLine();
        
        System.out.println("Please enter Password");
        password=scan.nextLine();
        
        System.out.println("Please confirm your password");
        confirm=scan.nextLine();
        
        if (!(userName.isEmpty() && password.isEmpty())) {
        	if (password.length()>8) {
        		if (password.contains(userName)) {
        			if (password.equals(confirm)) {
        				message="Your Username and password has been created";
        			}else {
        				message="Password do not match";
        			}
        			}else {
        				message="Password can not contain username";
        			}
        		}else {
        			message="Password is too short";
        		}
         }else {
        	 message="Username and password can not be empty";
         }
        System.out.println("message");
        ///
        
	}

}

package com.Class20;

public class Task {

	public static void main(String[] args) {//Main it can not execute the code bcz our JVM does not recoganize the code
		// create a method createEmail().
		//based on provided users name, lastName and email type,
		//your method should return complete address;
		//johnsnow@gmail.com, johnnow@yahoo.com
		Task obj=new Task();
		
		String email=obj.createEmail("Sekander", "Salihi", "gmail");
		System.out.println(email);
		 email=obj.createEmail("patmal", "siyar", "outlook");
		 System.out.println(email);
		
	}
	//return type methodName
	String createEmail(String name, String lastName, String emailType) {
		String email= name+lastName+"@"+emailType+".com";
		return email.toLowerCase();
	}
	
	
		
	}


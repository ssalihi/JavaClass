package com.Class12;

public class StringManipulation3 {

	public static void main(String[] args) {
		String str="Student";
		System.out.println("--------------------------------Find a letter by index numnber");
		char character=str.charAt(4);
		System.out.println(character);// if we want to print our character one by one we for loop
		System.out.println("-------------------------------Print all characters");
        for (int i=0; i<str.length(); i++) {
        	System.out.print(str.charAt(i)+",");
        }
       
       System.out.println();
        System.out.println("-------------------------to verify the index number in string");
        
        String day="Sunday";
        int index=day.indexOf("d");
        System.out.println(index);
        System.out.println("--------------------------------------------------------");
        
        String cen="Syntax Technologies";
        System.out.println(cen.indexOf("Syntax"));//0
        System.out.println(cen.indexOf("Technologies"));//7
        System.out.println(cen.indexOf("w"));//-1
        // 
        System.out.println("-------------------substring--------------------------");
        String sub="Today is Sunday Java Class";
        String newSub=sub.substring(5);
        System.out.println(newSub);
        System.out.println(sub.substring(0,5));// Today
        System.out.println(sub.substring(9,20));//Sunday
        System.out.println(sub.substring(16, 20));//Java
        System.out.println(sub.substring(21));// just from begining of index// class
	}
	

}

package com.Class14;

public class StringManipulation {

	public static void main(String[] args) {
		//1. replace ()
		 String str="I am good tester";
		 String newStr=str.replace("a", "e");
		 System.out.println(newStr);
		 String a=str.replace("good", "great");
		 System.out.println(a);
		 String b=str.replace("tester", "Programmer");
		 System.out.println(b);
		 // 2 example:
		String str1="12Hello -323-4 World 465%^%";
		String c=str1.replaceAll("[0-9]", "");// to replace all number we use this formula
        System.out.println(c);
        String d=c.replaceAll("[A-Za-z]", "");//removing of all alphabets
        System.out.println(d);
        String e=c.replaceAll("[^A-Za-z]", "");// '^' remove everything except charactoer 
        System.out.println(e);
        // 3. Function :toCharArray(): this covert string to array of character
       String f="saturday";
       char [] array=f.toCharArray();
       for (int i=0; i<array.length; i++) {
    	   
       System.out.print(array[i]);
       
       }  
       System.out.println("----------------------------------------------Printing reverse");
       for (int i=array.length-1; i>=0; i--) {
       System.out.print(array[i]);
       }
	}

}

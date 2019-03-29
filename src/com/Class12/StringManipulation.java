package com.Class12;

public class StringManipulation {

	public static void main(String[] args) {
		String str="Syntax";// to find how many char syntax has//every we () see these, it talks about method
         int lengthOfString=str.length();		
       System.out.println(lengthOfString);
       String name="Timmy";
       int lengthOfS=name.length();		
          System.out.println(lengthOfS);
       System.out.println("---------------------------------2n example");
       
       String str1="Syntax Technologies";// count every thing inside "" inculding space, camma and signs
       int lOS=str1.length();
       System.out.println(lOS);
       System.out.println("---------------------------------------3rd example");
       String a="Welcome!! Students!!!";
       int b=a.length();
       System.out.println(b);
       System.out.println("------------------to convert everything to uppercase or lower case");
       String str2="Hello sekander";
       String newString=str2.toUpperCase();
       System.out.println(newString);//HELLO
       
       System.out.println("----------------to lowercase");
       
       String lowerCase=newString.toLowerCase();
       System.out.println(lowerCase);//hello
       // to compare two strings we follow the below method, if strings are equals the output will be true,
       // if it is not equal the output will be false
       System.out.println("----------------------------------------------------------------");
       String str3="Hello";
       String str4="hello";
       boolean equality=str3.equals(str4);
       System.out.println(equality);
       System.out.println("----------------------------by ignoring the cases-------------------------------example");
       
       String expectedBrowser="CHROME";
       String actualBrowser="chrome";
       boolean equals=expectedBrowser.equalsIgnoreCase(actualBrowser);
       System.out.println(equals);
	}

}

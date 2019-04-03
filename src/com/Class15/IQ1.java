package com.Class15;

public class IQ1 {

	public static void main(String[] args) {
		// Swaping of two string
		String str1="Hello";//5
		String str2="World";// length=5
		str1=str1+str2;// HelloWord->10-      5
		str2=str1.substring(0, str1.length()-str2.length());//Hello
		str1=str1.substring(str2.length());// World
		System.out.println("The value of str1="+str1+" and the value of str2="+str2);
System.out.println("-----------------------------------------------------------------------------2nd way");

		str1=str1+str2;
        str2=str1.replaceAll(str2,"");
        str1=str1.replaceAll(str2, "");
        System.out.println(str2);
        System.out.println(str1);
        System.out.println("----------------------------------------------------------------------------2nd example");
        
         String a="Sekander";
        String b="Salihi";
        a=a+b;//SekanderSalihi
        b=a.substring(0, a.length()-b.length());//Sekander
        a=a.substring(b.length());//Salihi
        System.out.println("The value of a="+a+" and the value of b="+b);
        System.out.println("----------------------------------------------------------------------------2nd way");
        a=a+b;
        b=a.replaceAll(b, "");
        a=a.replaceAll(b, "");
        System.out.println(b);
        System.out.println(a);
        		
	}

}

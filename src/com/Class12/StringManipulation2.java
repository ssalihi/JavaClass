package com.Class12;

public class StringManipulation2 {

	public static void main(String[] args) {
	 String str="Good Morning Students";
	 boolean contains=str.contains("Morning");// it is true, bcz Morning contains in str
	 System.out.println(contains);
	 
	 System.out.println("----------------------------------------------");
	 String present="Welcome, Asel";
	 boolean flag=present.contains("Welcome,");// unless it contains the values, it will be printed
	 System.out.println(flag);//true
	 boolean flag1=present.contains("Asel");
	 System.out.println(flag1);	//true	
///
	 System.out.println("-----------------------------------------------------------------");
      String a="Welcome, Mehmet232323232";
      String b="WELCOME";
      boolean flag2=a.toUpperCase().contains(b);
      System.out.println(flag2);
      //
      System.out.println("---------StartWith and Ends With-------------------------------------");
      String r="syntax";
      boolean starts=r.startsWith("s");
      System.out.println(starts);// true, bcz its start with s
      boolean ends=r.endsWith("x");
      System.out.println(ends);
      //
      System.out.println("-----------isEmpty()---------------");// to find if the value is empty or not
      String y="Sekander";
      boolean isEmpty=y.isEmpty();
      System.out.println(isEmpty);

     //
      System.out.println("--------concat() using this operation-----------------");
      String q="Hello ";
      String p="Ali!";
      System.out.println(q+p);
      System.out.println(q.concat(p));
//
      System.out.println("---------");
      String expected="You may qualify for a mulity policy discount!";
      String actual=" You may qualify for a mulity policy discount!";
      System.out.println(expected.equals(actual));
      // to eliminate the above error, we the specific function trim();
      System.out.println("-----------Trim()------------");
      actual=actual.trim();
      System.out.println(expected.equals(actual));
      
	}

}

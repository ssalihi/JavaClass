package com.class4;

import java.util.Scanner;
class Main {
public static void main(String[] args) {
  Scanner info=new Scanner (System.in);
  String name=info.nextLine();
  System.out.println("Enter your name");
  String num1=info.nextLine();
  System.out.println("Enter your mobile number");
  int age=info.nextInt();
  System.out.println("Enter you age");
  System.out.println("Your name is "+name+ ","+" your age is "+age+" and your mobile is "+num1);
}
	
 
}

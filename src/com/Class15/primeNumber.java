package com.Class15;

import java.util.Scanner;

public class primeNumber {

	public static void main(String[] args) {
		// Write a java program to check whether a given number is prime or not?
		// prime number should meet to conditions:divisible by 1 & byitself ONLY
		//2,3,5,7,11,13,17,19,23,.........
		int num;
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter any number to its prime of not");
            num=scan.nextInt();
            boolean prime=true;
      for (int i=2; i<num;i++) {
    	  if (num%i!=0) {
    		  
    	  }
      else {
    	  prime=false;
    	  
    	  }
      }
      System.out.println(prime);
      //
      int i = 10, j = 50;// find the prime number between given range

      while (i < j) {
          boolean flag = true;

          for(int a = 2; a <= i/2; a++) {
              // condition for nonprime number
              if(i % a == 0) {
                  flag = false;
                  break;
              }
          }

          if (flag)
              System.out.print(i + " ");

          i++;
      }
        }
	}


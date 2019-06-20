package com.Class10;

import java.util.Arrays;

public class Task1 {

	public static void main(String[] args) {
		char [] array= {'A', 'B', 'C','D','E','F'};
		System.out.println(Arrays.toString(array));
		System.out.println(array [3]);
		System.out.println("-------------------------2nd way ");
		char [] grade= new char [6];
		grade [0]='A';
		grade [1]='B';
		grade [2]='C';
		grade [3]='D';
		grade [4]='E';
		grade [5]='F';
		System.out.println(grade[4]);
	System.out.println("---------------------------------2nd task");
		String[] names = { "Ahmad", "Faisal", "Sekander", "Hamid" };
		System.out.println(names[2]);
	System.out.println("---------------------------------2nd way");
		String[] persons = new String[4];
		persons[0] = "Ahamd";
		persons[1] = "Ghulam";
		persons[2] = "Farooq";
		persons[3] = "Salihi";
		System.out.println(persons[3]);
   System.out.println("--------------------------------------3rd example");
        String[] words=new String[4];
        words[0]= "Java";
        words[1]= "Saturday";
        words[2]= "day";
        words[3]= "coding";
        System.out.println(words[1]+" is "+words[0]+" "+words[3]+" "+words[2]+".");
   System.out.println("-------------------------------------2nd way");
        String [] word1= {"Java", "Saturday", "Day", "Coding", "is"};
        System.out.println(word1[1]+" "+word1[4]+" "+word1[0]+" "+word1[3]+" "+word1[2]+".");
      System.out.println("-------------------3rd way");   
      //
      String[] name = { "Ahmad", "Faisal", "Sekander", "Hamid", "Salihi", "Siyar" };
      int a=3;
      System.out.println(name[a]);
      System.out.println("--------------------------------------------");
      a+=1;//salihi
      //a+=2 siyar
      System.out.println(name[a]);
      int size=name.length;
      System.out.println(size);
      for (int i=0; i<size; i++) {// to print all name in one execution
      System.out.println(name[i]);
      }
      //
      System.out.println("----------------------------------------for loop for char");
      char [] grad= {'A', 'B', 'C','D','E','F'};
      for (int b=0; b<=grad.length-1; b++) {// we = with adding (-) at end of condition 
    	 System.out.println(grad[b]); 
      }
	}
}

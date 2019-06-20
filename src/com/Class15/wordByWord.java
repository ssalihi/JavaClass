package com.Class15;

public class wordByWord {

	public static void main(String[] args) {
		// TODO Auto-generated met
		String sentence="The maseter is speaking";
		 String reverse="";
		for (int i=sentence.length()-1; i>=0; i--) {
		reverse=reverse+sentence.charAt(i);
		
		}
		String [] words=reverse.split(" ");
		for (int j=words.length-1; j>=0; j--) {
		System.out.print(words[j]+" ");	
		}
		System.out.println("---------------------------------------2nd example");
		
		String a="The Syntax is great course";
		String b="";
		for (int c=a.length()-1; c>=0; c--) {
			b=b+a.charAt(c);
			}
		String[] word=b.split(" ");
		for (int d=word.length-1; d>=0; d--) {
			System.out.print(word[d]+" ");
		}
		
	}

}

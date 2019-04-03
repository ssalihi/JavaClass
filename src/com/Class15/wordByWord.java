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
		
	}

}

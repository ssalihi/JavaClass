package com.Class11;

public class ForEachLoop {

	public static void main(String[] args) {
		int [] numbers= {12,13,14,15,16,17};
		for (int syntax:numbers) {// we can give any variable name (Like syntax)
			System.out.print(syntax+" ");
		}
		System.out.println("-----------------------------------------------------------------");
		
		String [] name= {"Salihi", "Sekander","MMMM"};
		for (String n:name) {
			System.out.println(n+" ");
		}
		int [] num= {1,2,3,4,5,6,7};
		for (int a:num) {
			System.out.println(a+" ");
		}

	}

}

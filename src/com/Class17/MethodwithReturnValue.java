package com.Class17;

public class MethodwithReturnValue {

	public static void main(String[] args) {
		String str="Hello"; 
		String name="Salihi";
		int stringLength=str.length();
		System.out.println(stringLength);
		MethodwithReturnValue obj=new MethodwithReturnValue();
       
		//String str=obj.askHowAreYou("Asel");
		String day=obj.whatIsAday();
		System.out.println("Today is ");
		obj.askHowAreYou(name);
	}
	void askHowAreYou(String name) {//here String is formal parameter and name of parameter list
		System.out.println("How are you "+name);
	}
	String whatIsAday() {
		return "Thursday";
		
	}
	void largest(int a, int b) {
		if (a>b) {                   
			System.out.println("a is larger");
		}else {
			System.out.println("b is larger");
		}	
		}

}

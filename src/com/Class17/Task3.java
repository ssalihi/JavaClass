package com.Class17;

public class Task3 {
public static void main(String[] args) {
	Task3 obj=new Task3();
	obj.palidrome("salihi");
			
}
void palidrome (String name) {
	String reverse="";
	for (int a=name.length()-1; a>=0; a--) {
	reverse=reverse+name.charAt(a);
	 
	}
	if (name.equalsIgnoreCase(reverse)) {
		System.out.println("the name is palidrome");
	}else {
		System.out.println("it is not palidrom");
	}
}


}

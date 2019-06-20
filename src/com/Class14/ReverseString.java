package com.Class14;

public class ReverseString {

	public static void main(String[] args) {
		// revesre string without using a reverse function(the most pupolar interview question)
		// 1. using toCharArray();
		String original="Today is Java Class";
String reverse="";
char [] array=original.toCharArray();
for (int i=array.length-1; i>=0; i--) {
	reverse=reverse+array[i];
	
}

System.out.println("Reversed String is: "+reverse);
System.out.println("------------------------------------------------------reveser string");
String a="Salihi";
for (int l=a.length()-1; l>=0; l--) {
System.out.print(a.charAt(l));	
}
//2. using charAt()
String rev="";
for (int i=original.length()-1; i>=0; i--) {
	rev=rev+original.charAt(i);
	
}
System.out.println(rev);
// 3. is using substring();
String reser="";
for (int i=original.length(); i>0; i--) {
reser=reser+original.substring(i-1, i);
}
System.out.println("Reverse String is: "+reser);
	}

}

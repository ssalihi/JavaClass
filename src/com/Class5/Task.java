package com.Class5;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		
Scanner height;
int tall;
height=new Scanner(System.in);
System.out.println("Please enter height");
tall=height.nextInt();
if (tall>0 && tall<=5) {
	System.out.println("you are too short");
}else if (tall>=5 && tall<=6) {
	System.out.println("you are medium");
}else {
	System.out.println("you are tall");
}
	
}
	}

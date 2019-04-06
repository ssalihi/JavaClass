package com.Class17_2;

public class Task4 {

	public static void main(String[] args) {
	Task4 a=new Task4();
	a.number();
	

	}
	void number () {
		for (int a=1; a<=5; a++) {
			for (int b=1; b<=a; b++) {
				System.out.print(b);
			}
			System.out.println(" ");
		}
	}

}

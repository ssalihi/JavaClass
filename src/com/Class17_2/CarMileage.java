package com.Class17_2;

public class CarMileage {

	public static void main(String[] args) {
		// 999 mileage of car
CarMileage d=new CarMileage();
d.mileage();
	}
	void mileage() {
		for (int a=0; a<=9; a++) {// a loop controls b loop
			
			for (int b=0; b<=9; b++) {// b loop controls c loop or controlled by a loop
				for (int c=0; c<=9; c++)// c loop controlled by b loop
					for (int d=0; d<=9; d++) {
						
						System.out.println(a+""+b+""+c+""+d);	
					}
			}
		}
	}

}

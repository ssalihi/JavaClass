package com.Class17_3;

public class Clock {

	public static void main(String[] args) {
		// 24 hrs, 60 minutes, 60 seconds,
	Clock c=new Clock();
	c.clocks();
	

	}
	void clocks () {
		
	
	for (int h=0; h<24; h++) {
		for (int m=0; m<60; m++) {
		
			if (m<10) {
				System.out.println(h+":0"+m);
			}	else {
				System.out.println(h+":"+m);
			}	
		}
	}
	}
}

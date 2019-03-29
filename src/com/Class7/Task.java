package com.Class7;



public class Task {
	/*create boolean variable workDay and assign to true
	 * create int variable day and assign it to 1
	 * as long as it is workDay print--->"I need a day off" and increment day
	 * day once lday is 6--->you condition should become false
	 */ 

	public static void main(String[] args) {
	boolean workDay=true;
	int day=1;
	
	while (workDay) {
		System.out.println("I need a day off");
		if (day==6) {
			System.out.println("I do not need a day off");
			workDay=false;
		}
		day++;
	}
		
	}
}

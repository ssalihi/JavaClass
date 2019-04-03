package com.class4;

public class NestedIf3 {
  /*
   * store variable to store mortage rate and mortage price.
   * First check if the rate is higher than 4.5, user will not buy a house. otherwise will buy it
   * second if price of the house is larger than 200000 than user will take loan otherwise user will pay cash.
   */
	public static void main(String[] args) {
		double mor=4.7;
		double affordableMor=4.5;
		int price=300000;
		if (mor<affordableMor) {
			System.out.println("User will buy a house");
			if (price<200000) {
				System.out.println("User will pay cash");
			} else {
				System.out.println("User will apply for a loan");
			}
		}else {
			System.out.println("User will not buy a house");
		}
		
	// use to enter number of worked year and annual salary
	// if user worked more than or equals for 5 years than eligible for the bonus, otherwise not eligible
		//if user salary is more than 50000 bonus=5000 other wise b=3000
		int year=5;
		int salary=50000;
		if (year>=5) {
			System.out.println("will get a bonus");
			if (salary>=50000) {
				System.out.println("can get 5000 bonuse");
			}else {
				System.out.println("can get 3000 bonus");
			}	
		}else {
			System.out.println("Will not get a bonus");
		}

	}

}

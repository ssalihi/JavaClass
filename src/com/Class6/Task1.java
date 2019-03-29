package com.Class6;

import java.util.Scanner;

public class Task1 {


		/*write a program that print out if if is good weather to go for any activity.
		 * the weather is good if the temprature is betwen 40 deg and 180 deg
		 * inclusive--> we will go for hiking unless it is raining--> we will not go hiking 
		 * if temprature is between 25 and 40 inclusive--> & snowing--going snowboarding otherwise we are not going snowboarding it is too cold, 
		 * if tem is more than 80,  and sunny--go to the beach otherwise not go the beach. 
		 */
	public static void main(String[] args) {
		Scanner scan;
		boolean snow, rain, sunny;
		int temp;
		String activity;
		scan=new Scanner(System.in);
		System.out.println("Please enter temp");
		temp=scan.nextInt();
		activity=scan.nextLine();
		
		if (temp>=40 && temp<=80){
			System.out.println("Please say it is rain or not");
			rain = scan.nextBoolean();
			if (rain) {
				activity = "watch movie";
			} else {
				activity = "go hiking";
			}
			}else if (temp>=25 && temp<40) {
			System.out.println("please say it is snowing or not");
			snow = scan.nextBoolean();
			if (snow) {
				activity = "snowboarding";
			} else {
				activity = "Do coding";
			}
		} else if (temp > 80) {
			System.out.println("please say it sunny or not");
			sunny = scan.nextBoolean();
			if (sunny) {
				activity="go to the beach";
				}	else {
					activity="do more coding";
				}
				} else {
					System.out.println("please enter different temp");
					activity="Unknown";
					
				}
		System.out.println("I will "+ activity);
			}
				
			
			
		
	}



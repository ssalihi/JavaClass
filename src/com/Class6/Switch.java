package com.Class6;

public class Switch {
	public static void main(String[] args) {
		int day=9;
		String dayName;
		if (day==1) {
			dayName="Mon";
			
		}else if (day==2) {
			dayName="Tue";		
		}else if (day==3) {
			dayName="wed";			
		}else if(day==4) {
			dayName="thur";
		}else if (day==5) {
			dayName="Fri";
			
		}else if (day==6) {
			dayName="Sat";
			
		}else if (day==7) {
			dayName="Sun";
		}else {
			dayName="invalid";
		}
		
	switch (day) {
	case 1: // if we use string we need to put inside double quotes ("") for char single ('')
		dayName="Mon"; 
		break; 
	case 2:
		dayName="Tue";
		break;
	case 3:
		dayName="Wed";
		break;
	case 4: 
		dayName="Thur";
		break; 
	case 5:
		dayName="Fri";
		break;
	case 6:
		dayName="Sat";
		break;
	case 7:
		dayName="sun";
		break;
		default:
		dayName="Invalid"	;
	}
	System.out.println("Today is "+dayName);
	}
}

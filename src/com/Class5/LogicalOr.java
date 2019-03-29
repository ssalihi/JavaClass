package com.Class5;

public class LogicalOr {

	public static void main(String[] args) {
		/*we 7 days a week
		 * if days are from 1-5 -->weekday
		 * if days are from 6-7-->weekend
		 * otherwise "Not a valid day"
		 */
int day=5;
if (day==1 ||day==2 || day==3 || day==4 || day==5) {
	System.out.println("it is a weekday");
}else if (day==6 || day==7) {
	System.out.println("it is weekend");
}else {
	System.out.println("not a valid day");
}
	}

}

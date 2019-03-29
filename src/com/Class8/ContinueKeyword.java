package com.Class8;

public class ContinueKeyword {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i == 2 || i == 3) {
				continue;// take back to the loop.
			}
			System.out.println(i);

		}
		// I want to number from 1 to 20 but skip dividable by 3
		// Continue and break are the keywords which are used in Loop, "continue" skip the attrition and "break" cut the loop
		for (int a = 1; a <= 20; a++) {
			if (a % 3 == 0) {
				continue;
			}
			System.out.print(a);
		}
	}
}

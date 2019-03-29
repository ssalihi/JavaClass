package com.Class12;

public class ForEachin2D {

	public static void main(String[] args) {
		/* create a grocery list: fruits{}
		 *                        vegg  {}
		 *                        dairy  {}
		 * Retrieve all values 2 different loops
		 */    
		String [][] grocery= {
				{"Apple","Orange","Banana","Grapes"},
				{"Spanich","tomato","Onion","Garlic"},
				{"Milk","Cheese","Yogrut","Butter"}
		};
		for(int r=0; r<grocery.length; r++) {
		for (int c=0; c<grocery[r].length; c++) {
			System.out.print(grocery[r][c]+" ");
		}
		System.out.println();
	}
		System.out.println("---------------------for each loop--------------way");
		for (String [] fruit:grocery) {// advance for loop
			for (String Veg:fruit) {
			System.out.print(Veg+" ");
		}
			System.out.println();
	}
	}
}

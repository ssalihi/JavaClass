package com.Class11;

public class RetreivingAllValues {

	public static void main(String[] args) {
		int [][] num= {
			{11,12,13,14},// size of array is 4
			{21,22,23,},// size of array is 3
			{31,32,33,34}// "    "   "    " 4
		    };
       int rows=num.length;// find the number of rows in a 2D array
       System.out.println(rows);
       int columns=num[1].length;//to find the numbers of columns
       System.out.println(columns);
       for (int row=0; row<num.length; row++) {
    	   for (int col=0; col<num[row].length; col++) {
    		  System.out.print(num[row][col]+" " ); 
    	   }
    	   System.out.println();// if we want to print in three seperate lines
       }
       System.out.println("-------------------------------2nd example");
       String [][] food= {
    		   {"burger", "Fries","hot dog","Meat load"},
    		   {"lo mein","freid rice",},
    		   {"Biryani","Korma","Naan","Chick Peas"}
       };
       for (int i=0; i<food.length; i++) {
    	   System.out.print(" I Love ");
    	   for (int j=0; j<food[i].length; j++) {
    	   System.out.print(food[i][j]+" ");
    	   }
    	   System.out.println();
       }
	}

}

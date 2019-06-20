package com.Class11;

public class Task {

	

	public static void main(String[] args) {
		// Create an array of cars and stores 6 elements into it. Using different loops print all values form the array
		String [] cars= {"Toyota", "Mazda","Mercedez","Infinit","Audi"};
		for (String models:cars) {
			System.out.println(models+" ");
			
		}
		System.out.println("-----------------------2nd task");
	
//Create an array of countries. While retrieving all values form an array print the capital for each country. (use 2 different loops)
		String[] array= {"Afghanistan", "USA","India","Norway"};
		for (int i=0; i<array.length; i++) {
			if (array[i].equals("USA")) {
				System.out.println("DC");
			}else if (array[i].equals("Afghanistan")) {
					System.out.println("Kabul");
				}else if (array[i].equals("India")) {
					System.out.println("Delhi");
				}else if (array[i].equals ("Norway")) {
					System.out.println("Oslo");
				}
			
		}
		System.out.println("---------------------------2nd way");
		String[] country= {"Afghanistan", "USA","India","Norway"};		
		for (String coun:country) {
			switch (coun) {
			case "Afghanistan":
			System.out.println("Kabul");
			break;
			case "USA":
				System.out.println("DC");
				break;
			case "India":
				System.out.println("Delhi");
				break;
			case "Norway":
				System.out.println("Oslo");
				break;
			}
		}
		
		System.out.println("------------------------------------3rd task");
		
		// Create an array on integers and calculate the sum of all elements in an array.
		int sum=0;
		int [] numbers= {10,20,30,40,50};
		 for (int i = 0; i < numbers.length; i++) {
	            sum=sum+numbers[i];
		 
				
		 }
		 System.out.println(sum);
		 int add=0;
		 int [][]num= {{1,2,3},
				    {4,5,6},
				    {7,8,9}};
		 for (int r=0; r<num.length; r++) {
			 for (int c=0; c<num[r].length;c++) {
			
			System.out.print(num[r][c]+" ");
			 }
			 System.out.println();
		 }
		 
		}
		
		}
	



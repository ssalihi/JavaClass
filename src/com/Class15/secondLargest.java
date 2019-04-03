package com.Class15;

public class secondLargest {

	public static void main(String[] args) {
		// 
		int arr[]= {1000,146,1,0,86,292,2};
		int min=arr[0];//1000, we initiliazed the our min to the first number of array
		int seL=0;//0, we initiliazed the our secondLargest to the first number of array
		int max=0;//0, we initiliazed the our largest to the first number of array
		
for (int a:arr) {
	if (a>max) {
		max=a;
	}
	if (a<min) {
		min=a;
	}
}
for (int a:arr) {
	if (a>seL && a<max) {
		seL=a;
	
	}
}
System.out.println("Second largest="+ seL);
System.out.println("the Max is="+max);
System.out.println("The min is ="+min);

	}

}

package com.Class15;

public class secondLargest {

	public static void main(String[] args) {
		// 
		int arr[]= {1000,146,1,0,86,-292,2000};
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

System.out.println("the Max is="+max);
System.out.println("The min is ="+min);
System.out.println("Second largest="+ seL);

System.out.println("--------------------------------------------2nd example");
int [] array1= {1,2,3,4,5,6};
int maxNum=0;
int minNum=0;
int secMax=0;

for (int b:array1) {
	if (b>maxNum) {
		maxNum=b;
	} if (b<minNum) {
		minNum=b;
	}
}
for (int b:array1) {
	if (b>secMax && b<maxNum) {
		secMax=b;
	}
}
System.out.println("The Largest is "+ maxNum);
System.out.println("The smallest is "+ minNum);
System.out.println("The Seconc Largest is "+ secMax);
	}

}

package com.Class11;

public class MulitDimentionalArray {

	public static void main(String[] args) {
		// creating 2D array;
		int [] [] d=new int [4][4];// total we 16 elements (4*4=16)
		d[0][0]=12;
		d[0][1]=13;
		d[0][2]=14;
		d[0][3]=15;
		// 2nd row
		d[1][0]=1;
		d[1][1]=2;
		d[1][2]=3;
		d[1][3]=4;
		//3rd row
		d[2][0]=5;
		d[2][1]=10;
		d[2][2]=15;
		d[2][3]=20;
		// 4th row
		d[3][0]=100;
		d[3][1]=200;
		d[3][2]=300;
		d[3][3]=400;
		System.out.println(d[3][2]);// 300
		System.out.println(d[1][2]);//3
		// second way of 2D array
System.out.println("----------------------------------------------------------------2nd way");
int [][] c= {
		{12,13,14,15},
		{1,2,3,4,},
		{5,10,15,20},
		{100,200,300,400}
        };
System.out.println(c[3][1]);//200
System.out.println(c[0][0]);//12
// print of string in 2D arrays
System.out.println("-------------------------------------------print of string in 2D arrays");
String [][] groups= {
		{"Sekander","Siyar","Alex","Sahil","Seit","Talgat"},
		{"Bilal","Shaban","Asmit","Sasha","Olga","Moe"}
		};
System.out.println(groups[0][0]);// Sekander
System.out.println(groups[0][1]+" "+groups[1][0]);//Siyar, Bilal
	}

}

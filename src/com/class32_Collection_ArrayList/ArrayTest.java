package com.class32_Collection_ArrayList;

public class ArrayTest {

	public static void main(String[] args) {
		int [] intArra= {10,11,12,12};
		String [] strigArray= {"hello", "Bye"};
		//can we place object into array?
		Visa visa1=new Visa ("Visa Platinum");
		Visa visa2=new Visa ("Visa Platinum");
		Visa visa3=new Visa ("Visa Platinum");
		
		AX ax1=new AX("AX Platinum");
		AX ax2=new AX("AX Platinum");
		AX ax3=new AX("AX Platinum");
		
		Visa[] visaArray= {visa1, visa2, visa3};
		//Visa[] visaArray= {visa1, visa2, visa3,ax1,ax2,ax3};// we cannot store AX object into Visa array
		CreditCard[] visaArr={visa1, visa2, visa3,ax1,ax2,ax3};// we can store object of sub-class in on array by using parent class 
		Object [] objectArray= {1,"g",'e',visa1,true,98.09,-128};//we are storing object by typing primitive variables
		

	}

}

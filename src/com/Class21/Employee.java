package com.Class21;

public class Employee {
int eID,salary;
static String CEO="Sumair";

	public static void main(String[] args) {
		Employee emp1=new Employee();
		emp1.eID=1001;
		emp1.salary=60;
		
		emp1.print();
		
		Employee emp2=new Employee();
		emp2.eID=1002;
		emp2.salary=50;
		
        emp2.print();
	}
	public void print() {
		System.out.println("Systax CEO is "+CEO+" and his ID is "+eID+ " and his salary is "+salary);
		
	}

}

package com.class24_Overridding;

public class TestEmployee {

	public static void main(String[] args) {
		Employee emp=new Employee();
		FullTimeEmployee ft=new FullTimeEmployee();// first three of four letters of class name+ctrl+space
		Contractor con=new Contractor();
		emp.getPaid();//employee get salary 
		ft.getPaid();//full time employee gets paid salary + bonus
		con.getPaid();//

	}

}

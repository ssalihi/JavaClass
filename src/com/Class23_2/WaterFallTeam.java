package com.Class23_2;

import com.Class23.Employee;//importing the class 

public class WaterFallTeam extends Employee {
	public static void main(String[] args) {
		WaterFallTeam wt=new WaterFallTeam();
		wt.salary1=90000;// can access protected values in different packages through inheritance 
		//wt.salary;// default values cannot be access in different package
	}

}

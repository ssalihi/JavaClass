package com.class29_Interface;

public class TestShape {

	public static void main(String[] args) {
		Circle circle=new Circle();
		circle.caculateArea(10);
		circle.calculateParimiter(10);
		square sq=new square();
		System.out.println("--------------------------------Caclulating area and parimeter of square");
		sq.caculateArea(12);
		sq.calculateParimiter(12);

	}

}

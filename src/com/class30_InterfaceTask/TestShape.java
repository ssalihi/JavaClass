package com.class30_InterfaceTask;



public class TestShape {

	
		public static void main(String[] args) {
			Circle circle=new Circle();
			circle.caculateArea(10);
			circle.calculateParimiter(10);
			circle.whoAmI();
			
			Shape obj1=new Circle();
			obj1.caculateArea(5);
			obj1.calculateParimiter(5);
			//obj1.whoAmI(); not avaiable 
			
			System.out.println("--------------------------------Caclulating area and parimeter of square");
			square sq=new square();
		
			sq.caculateArea(12);
			sq.calculateParimiter(12);
			

		}

	

	}



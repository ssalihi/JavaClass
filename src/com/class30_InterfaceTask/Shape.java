package com.class30_InterfaceTask;
/*
 * Create an Interface ‘Shape’ with undefined methods as calculateArea and calculatePerimiter. 
 * Create 2 child classes: Circle & Square that should have an implementation of area and perimiter calculation. 
 * Test your code
 */
	public interface Shape {
	void caculateArea(double num);
	void calculateParimiter(double num);

	}
	class Circle implements Shape{

		public void caculateArea(  double num) {// we our method dynamic and can hold any value
		
			double area=3.14*num*num;
			System.out.println("the area of circel is = "+area);
			
		}

		public void calculateParimiter(double num) {
			
			double pari=2*(3.14*num);
			System.out.println("the parimiter of circle is = "+pari);	
		}	
		public void whoAmI() {
			System.out.println("I am a circle");
		}
	}
	class square implements Shape{

		@Override
		public void caculateArea(double num) {
			
			double area=num*num;
			System.out.println("the area of square is ="+area);
			
		}
		public void calculateParimiter(double num) {
			
		    double pari=4*num;
		    System.out.println("the parimeter of square is ="+pari);
			
		}
		
	}



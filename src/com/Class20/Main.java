package com.Class20;


	class Main {
		int negate(int a){
		  int b=0;
		  if (a>0){
		    b=a*(-1);
		   
		  }else {
		    b=a*(-1);
		  }
		  return b;
			
		}
		
		//test case below (dont change):
		public static void main(String[] args){
		  Main obj=new Main();
		  obj.negate(1);
			System.out.println(obj.negate(8)); //should be -8
			System.out.println(obj.negate(-2)); //should be 2
		}
	}


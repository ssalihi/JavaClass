package com.Class7;

public class CompoundOperators1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		a=a+10;
		System.out.println(a); // the answer is 20
		int b=100;
		b=b+100;
		System.out.println(b); // the answer is 200		

		int c=100;
		c+=100;// is same to c=c+100
		System.out.println(c); // the answer is 200
		c+=35; //c=c+200
		System.out.println(c);
		
		int d=30;
		d-=10;//d=d-10
		System.out.println(d);
		d+=50; //d=d+50;
		System.out.println(d); //70
		
		d/=5; //d=d/5;
		System.out.println(d);
		d%=4;
		System.out.println(d);
		d%=2; //d=%4;
		System.out.println(d);
	}

}

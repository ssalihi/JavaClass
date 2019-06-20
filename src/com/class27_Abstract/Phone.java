package com.class27_Abstract;

public abstract class Phone {
public void madeCall() {
	System.out.println("Phone can make a call");
}
public void sendTest() {
	System.out.println("Phone can send test");
}
public abstract void unlockPhone();
public abstract void viewPicture();	

}

class iPhone extends Phone{// this is concrete class which inherited from abstract class or implemented by interface and providing
	//implementation of all unimplemented /abstract class

	@Override
	public void unlockPhone() {
		System.out.println("To unlock the Iphone we use faceID or finger print");
		
	}

	@Override
	public void viewPicture() {
		System.out.println("To view pictures on Iphone can go to photos");
		
	}
	
}
class Samsung extends Phone{
@Override
	public void unlockPhone() {
		System.out.println("to unlock samsung we need to enter password");
		
	}

	@Override
	public void viewPicture() {
		System.out.println("to view picture in samsum go to gallery");
		
	}
}

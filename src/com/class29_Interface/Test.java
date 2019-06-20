package com.class29_Interface;

public class Test {
public static void main(String[] args) {
	WebDriver driver=new ChromDriver();
	driver.closeBrowser();
	driver.findElement();
	driver.openBrowser();
	driver.maximizeWindows();
	driver.takesScreenShot();
	driver.m2();
	TakesScreenShot.m1();// we can have access static method by using it class name where it is defined.
}
}


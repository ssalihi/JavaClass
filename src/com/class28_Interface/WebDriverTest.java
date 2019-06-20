package com.class28_Interface;

public class WebDriverTest {

	public static void main(String[] args) {
		WebDriver obj1=new ChromeDriver();
		obj1.openBrowser();
		obj1.closeBrowser();
		obj1.maximizeBrowser();
		obj1.findElements();
	
		System.out.println("-------------------------------------------------");
		WebDriver obj2=new FireFoxDriver();
		obj2.openBrowser();
		obj2.closeBrowser();
		obj2.maximizeBrowser();
		obj2.findElements();
	
		
	}
}

package com.class29_Interface;

public class FireFoxDriver extends Browser implements WebDriver, Report {

	@Override
	public void openBrowser() {
		System.out.println("opening browser");	
	}
	@Override
	public void closeBrowser() {
		System.out.println("close browser");
			
	}
	@Override
	public void maximizeWindows() {
		System.out.println("maximize browser");	
	}

	@Override
	public void findElement() {
		System.out.println("find element browser");
			
	}
	@Override
	public void refreshBrowser() {
		System.out.println("find element browser");
		
	}
	@Override
	public void getReport() {
		System.out.println("report from firefox browser");
		
	}
	@Override
	public void takesScreenShot() {
		System.out.println("taking screen shot in firefox browser");
		
	}

}

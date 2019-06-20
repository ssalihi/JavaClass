package com.class29_Interface;

public class ChromDriver extends Browser implements WebDriver, Report {
@Override
	public void openBrowser() {
		System.out.println("Opening chrome browser");
		
	}
@Override
	public void closeBrowser() {
		System.out.println("closing chrome browser");
		
	}

	@Override
	public void maximizeWindows() {
		System.out.println("maxmize chrome browser");
		
	}

	@Override
	public void findElement() {
		System.out.println("find element chrome browser");
		
	}
	@Override
	public void refreshBrowser() {
		System.out.println("refresh chrome browser");
		
	}
	@Override
	public void getReport() {
		System.out.println("report from chrome browser");
		
	}
	@Override
	public void takesScreenShot() {
		System.out.println("taking screen shot in chrome");
		
	}

}

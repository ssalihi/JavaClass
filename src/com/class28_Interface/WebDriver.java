package com.class28_Interface;

public interface WebDriver {
void openBrowser();
void closeBrowser();
void maximizeBrowser();
void findElements();

}
class ChromeDriver implements WebDriver{

	public void openBrowser() {
		System.out.println(" we can use WebDriver with any system");
		
	}

	public void closeBrowser() {
		System.out.println(" we can use close browser with any system");
		
	}
	public void maximizeBrowser() {
		System.out.println(" we can use close browser with any system");
	
		
	}
	public void findElements() {
		System.out.println(" we can use find emlments with any system");	
	}
	
}
class FireFoxDriver implements WebDriver{

	public void openBrowser() {
		System.out.println(" we can use WebDriver with any system");
		
	}
	public void closeBrowser() {
		System.out.println(" we can use close browser with any system");
		
	}

	public void maximizeBrowser() {
		System.out.println(" we can use find emlments with any system");
		
	}
	public void findElements() {
		System.out.println(" we can use find emlments with any system");
		
	}
	
}

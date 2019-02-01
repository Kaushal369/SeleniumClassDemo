package com.qa.selenium.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenGooleApplication {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.google.com/"); //this method is used to open an application in respective defined browser.
		
		driver.close();  //this method is used to close the current opened browser by selenium.
		
	}

}

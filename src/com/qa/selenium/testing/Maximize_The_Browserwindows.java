package com.qa.selenium.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Maximize_The_Browserwindows {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.google.com/");
		driver.manage().window().maximize();   // maximize() is used to maximize size of current browser window.
		driver.close();
	}

}

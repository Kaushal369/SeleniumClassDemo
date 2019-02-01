package com.qa.selenium.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenEmptyChromeAndInternetExpoler {

	public static void main(String[] args) {
	 
		/*System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		*/
		System.setProperty("webdriver.IE.driver", "./driver/InternetExpoler.exe");
		WebDriver driver = new InternetExplorerDriver();
		
	}

}

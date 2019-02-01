package com.qa.selenium.testing;

<<<<<<< HEAD
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
=======
import org.openqa.selenium.WebDriver;
>>>>>>> team01
import org.openqa.selenium.firefox.FirefoxDriver;

public class Maximize_The_Browserwindows {

	public static void main(String[] args) {
<<<<<<< HEAD
		try {
			WebDriver driver = new FirefoxDriver();

			driver.get("http://google.com/");
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();

			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			driver.findElement(By.name("q")).sendKeys("selenium");

			List<WebElement> elements = driver.findElements(By.xpath(".//ul[@role='listbox']/li"));

			System.out.println(elements.size());

			for (WebElement element : elements) {
				if (element.getText().equalsIgnoreCase("selenium download")) {
					element.click();
					break;
				}
			}

			driver.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
=======
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.google.com/");
		driver.manage().window().maximize();   // maximize() is used to maximize size of current browser window.
		driver.close();
>>>>>>> team01
	}

}

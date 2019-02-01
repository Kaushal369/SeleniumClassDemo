package com.qa.selenium.testing;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Yahoo_auto_suggestion {

	public static void main(String[] args) {
			try
			{
				WebDriver driver = new FirefoxDriver();
				driver.get("https://yahoo.com/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.manage().deleteAllCookies();
				driver.findElement(By.xpath(".//*[@id='uh-search-box']")).sendKeys("selenium");
				
			List<WebElement> list =	driver.findElements(By.xpath(".//ul[contains(@id,'yui_3_18_0_3') or @role='listbox' ]/li"));
			
			System.out.println(list.size());
			
			for(WebElement element :list)
			{
				if(element.getText().equalsIgnoreCase("selenium download"))
				{
					element.click();
					break;
				}
			}
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
			
		
	}

}

package com.qa.selenium.testing;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Maximize_The_Browserwindows {

	public static void main(String[] args) {

		try {
			WebDriver driver = new FirefoxDriver();

			driver.get("http://google.com/");
			driver.manage().window().maximize(); // maximize() is used to maximize size of current browser window.
			driver.close();
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

}

package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class {
	public static WebDriver driver;
	
	public static void invoke_Url() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.calculator.net/");
		driver.manage().window().maximize();
	}
	
	public void teardown() {
		
		driver.quit();
	}

}

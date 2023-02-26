package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class MultiplicationPage {
	
	WebDriver driver;
	
	public MultiplicationPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[1]")
	WebElement num_4;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[2]")
	WebElement num_2;
	
	@FindBy(xpath = "//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[3]")
	WebElement num_3;
	
	@FindBy(xpath = "//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[2]")
	WebElement num_5;
	
	@FindBy(xpath = "//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[4]")
	WebElement multi;
	
	public void value_one() {
		
		num_4.click();
		num_2.click();
		num_3.click();
	}
	
	public void operator_multi() {
		
		multi.click();
	}
	public void value_two() {
		
		num_5.click();
		num_2.click();
		num_5.click();
		
	}
}

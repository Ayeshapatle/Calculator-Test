package com.page;

import org.checkerframework.checker.units.qual.min;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class SubstractionPage {

	
	@FindBy(xpath = "//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[4]/span[1]")
	WebElement num_0;
	
	@FindBy(xpath = "//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[2]")
	WebElement num_2;
	
	@FindBy(xpath = "//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[3]")
	WebElement num_3;
	
	@FindBy(xpath = "//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[1]")
	WebElement num_4;
	
	@FindBy(xpath = "//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[2]")
	WebElement num_8;
	
	@FindBy(xpath = "//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[3]")
	WebElement num_9;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[4]")
	WebElement minus;
	
	public void value_seven() {
		
		num_2.click();
		num_3.click();
		num_4.click();
		num_8.click();
		num_2.click();
		num_3.click();
		
	}
	
	public void operator_minus() {
		
		minus.click();
	}
	
	public void value_eight() {
		
		minus.click();
		num_2.click();
		num_3.click();
		num_0.click();
		num_9.click();
		num_4.click();
		num_8.click();
		num_2.click();
		num_3.click();
	}
}

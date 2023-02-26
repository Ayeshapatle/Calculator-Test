package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AdditionPage {
	
	@CacheLookup
	@FindBy(xpath = "//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[4]")
	WebElement minus;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[2]")
	WebElement num_2;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[3]")
	WebElement num_3;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[1]")
	WebElement num_4;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[2]")
	WebElement num_5;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[4]")
	WebElement add;
	
	
	public void value_five() {
		
		minus.click();
		num_2.click();
		num_3.click();
		num_4.click();
		num_2.click();
		num_3.click();
		num_4.click();
	}
	
	public void operator_add() {
		
		add.click();
	}
	
	public void value_six() {
		
		num_3.click();
		num_4.click();
		num_5.click();
		num_3.click();
		num_4.click();
		num_5.click();
	}
	

}

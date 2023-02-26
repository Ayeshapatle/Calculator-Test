package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.base.Base_Class;

public class DivisionPage {

	
	@FindBy(xpath = "//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[1]")
	WebElement ele_4;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[4]/span[1]")
	WebElement num_0;
	
	@FindBy(xpath = "//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[2]")
	WebElement num_2;
	
	@FindBy(xpath = "//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[4]/span[4]")
	WebElement div;

	public void value_three() {

		ele_4.click();
		num_0.click();
		num_0.click();
		num_0.click();

	}

	public void operator_div() {
		div.click();
	}

	public void value_four() {

		num_2.click();
		num_0.click();
		num_0.click();
	}
}

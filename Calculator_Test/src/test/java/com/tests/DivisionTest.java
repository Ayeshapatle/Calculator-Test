package com.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Base_Class;
import com.page.DivisionPage;

public class DivisionTest extends Base_Class {

	DivisionPage dp;

	@BeforeMethod
	public void setUp() {

		invoke_Url();
	}

	@Test
	public void perform_divison() {

		dp = PageFactory.initElements(driver, DivisionPage.class);
		dp.value_three();
		dp.operator_div();
		dp.value_four();
	}

	@AfterMethod
	public void close() {

		teardown();
	}

}

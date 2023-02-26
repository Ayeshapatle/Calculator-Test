package com.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Base_Class;
import com.page.SubstractionPage;

public class SubstractionTest extends Base_Class {

	@BeforeMethod
	public void setUp() {

		invoke_Url();
	}

	@Test
	public void perform_substraction() {

		SubstractionPage sp = PageFactory.initElements(driver, SubstractionPage.class);
		sp.value_seven();
		sp.operator_minus();
		sp.value_eight();
	}

	@AfterMethod
	public void close() {
		teardown();

	}
}

package com.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Base_Class;
import com.page.MultiplicationPage;

public class MultiplicationTest extends Base_Class {

	@BeforeMethod
	public void setUp() {

		invoke_Url();
	}

	@Test
	public void perform_multiplication() {

		MultiplicationPage mp = PageFactory.initElements(driver, MultiplicationPage.class);
		mp.value_one();
		mp.operator_multi();
		mp.value_two();
	}

	@AfterMethod
	public void close() {

		teardown();
	}

}

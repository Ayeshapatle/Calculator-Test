package com.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Base_Class;
import com.page.AdditionPage;

public class AdditionTest extends Base_Class {

	@BeforeMethod
	public void setUp() {

		invoke_Url();
	}

	@Test
	public void perform_addition() {

		AdditionPage ap = PageFactory.initElements(driver, AdditionPage.class);
		ap.value_five();
		ap.operator_add();
		ap.value_six();
	}

	@AfterMethod
	public void close() {

		teardown();
	}

}

package com.demo.SeleniumWebDriver;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DressesShopTest {
	
	private FirefoxDriver driver;


	@Before
	public void setUp() {
		driver = new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
	
	
	@After
	public void tearDown() {
		driver.close();
	}
	
	
	@Test
	public void verifySortedOrder() {
		//Given
		HomePage home = new HomePage(driver);
		PageWithWomenDresses pageWithWomenDresses = home.filterWomenDresses();
		//When
		ResultPage resultPage = pageWithWomenDresses.sortByPriceLowestFirst();
		//Then
	    Assert.assertTrue(resultPage.isSorted());
		}
	
	@Test
	public void verifyColorFilter() {
		//Given
		HomePage home = new HomePage(driver);
		PageWithWomenDresses pageWithWomenDresses = home.filterWomenDresses();	
		//When-Then
		Assert.assertTrue(pageWithWomenDresses.applyColorFilter());
	}
	

}

package com.demo.SeleniumWebDriver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultPage {

	private FirefoxDriver driver;

	@FindBy(xpath = "//*[@id='center_column']/h1/span[1]")
	private WebElement headerDresses;

	@FindBy(xpath = "//div[@class='right-block']/*/span[@class='price product-price']")
	private List<WebElement> productList;

	public ResultPage(FirefoxDriver driver) {
		init(driver);
	}

	public boolean isSorted() {
		new Actions(driver).moveToElement(headerDresses).click().perform();
		List<Double> productsPrices = new ArrayList<Double>();
		for (WebElement iter : productList) {
			productsPrices.add(Double.parseDouble(iter.getText().substring(iter.getText().indexOf('$') + 1)));
		}
		List<Double> initialProductsPrices = productsPrices;
		Collections.sort(productsPrices);

		return initialProductsPrices.equals(productsPrices);
	}

	public void init(final FirefoxDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}

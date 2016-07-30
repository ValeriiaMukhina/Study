package com.demo.SeleniumWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ListOfLinksOnWikipedia {

	public static void main(String[] args) {

		// Create a new instance of the FireFox driver
		WebDriver driver = new FirefoxDriver();
		// Launch the URL
		String URL = "https://en.wikipedia.org/wiki/Main_Page";
		driver.get(URL);

		List<WebElement> links = driver.findElements(By.tagName("a"));

		int numberOfLinks = links.size();

		System.out.println("There are " + numberOfLinks + " links on the Main Wikipedia page");

		for (int i = 0; i < numberOfLinks; i++) {
			String linkText = links.get(i).getText();
			System.out.println(i + 1 + " " + linkText);

		}

		driver.quit();
	}

}

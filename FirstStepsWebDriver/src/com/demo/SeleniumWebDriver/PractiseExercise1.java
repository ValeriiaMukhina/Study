package com.demo.SeleniumWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PractiseExercise1 {

	public static void main(String[] args) {

		// Create a new instance of the FireFox driver
		WebDriver driver = new FirefoxDriver();

		String URL = "https://en.wikipedia.org";
		driver.get(URL);

		String pageTitle = driver.getTitle();

		System.out.println("Page title is: "+ pageTitle + ". Length of the title is: " + pageTitle.length());

		String currentURL = driver.getCurrentUrl();

		if (currentURL == URL) {
			System.out.println("URL match. Verification is successful");
		} else {
			System.out.println("Verification failed. Current URL is: " + currentURL + ". Expected URL is: " + URL);
		}

		int lengthOfPageSource = driver.getPageSource().length();
		System.out.println("Total length of the page source is " + lengthOfPageSource);

		driver.quit();

	}

}

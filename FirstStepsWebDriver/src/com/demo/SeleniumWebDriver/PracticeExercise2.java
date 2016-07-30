package com.demo.SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PracticeExercise2 {

	public static void main(String[] args) {
		// Create a new instance of FireFox browser

		WebDriver driver = new FirefoxDriver();

		String URL = "https://en.wikipedia.org";
		driver.get(URL);

		driver.findElement(By.linkText("Help")).click();

		driver.navigate().back();

		driver.navigate().forward();

		driver.navigate().to(URL);

		driver.navigate().refresh();

		driver.quit();

	}

}

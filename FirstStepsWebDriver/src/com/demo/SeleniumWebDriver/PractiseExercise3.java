package com.demo.SeleniumWebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PractiseExercise3 {

	public static void main(String[] args) throws InterruptedException {
		// Create new instance of a browser

		WebDriver driver = new FirefoxDriver();

		Dimension windowSize = new Dimension(500, 600);
		driver.manage().window().setSize(windowSize);
		
		Thread.sleep(4000);
		Point position = new Point(200, 150);
		driver.manage().window().setPosition(position);
		Thread.sleep(4000);
		driver.manage().window().maximize();
		Thread.sleep(4000);
		// Close the browser
		driver.quit();

	}

}

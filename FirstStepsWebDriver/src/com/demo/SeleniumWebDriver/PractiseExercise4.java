package com.demo.SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PractiseExercise4 {

	public static void main(String[] args) throws InterruptedException {
		// Create a new instance of the FireFox driver
		WebDriver driver = new FirefoxDriver();
		// Launch the Diary
		driver.get("http://www.diary.ru/");
		// Type Login
		driver.findElement(By.id("usrlog2")).sendKeys("TesterJavaTraining");
		// Type Password
		driver.findElement(By.id("usrpass2")).sendKeys("q1w2e3r4");
		// Click on the Submit button
		driver.findElement(By.xpath("//input[@type='submit'][@value='Войти']")).click();
		Thread.sleep(5000);
		driver.quit();
	}
}

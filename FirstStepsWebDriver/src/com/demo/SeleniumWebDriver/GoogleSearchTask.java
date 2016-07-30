package com.demo.SeleniumWebDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTask {

	public static void main(String[] args) throws InterruptedException {
		// Create a new instance of the Chrome driver
		String exePath = "C:\\Users\\Valeriia_Mukhina\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		String URL = ("http://www.google.com/");
		driver.get(URL);

		WebElement searchField = driver.findElement(By.id("lst-ib"));
	//	String searchKey = "selenium automation testing";
		String searchKey ="осциллограф";
		searchField.sendKeys(searchKey);
		searchField.submit();
		Thread.sleep(3000);
		String searchResult = "seleniumhq.org";
		Boolean textPresent = driver.getPageSource().contains(searchResult);
		Boolean nextIsPresent = true;
		
	//	int navigationCount = driver.findElements(By.xpath("//*[@id='nav']/tbody/tr/td")).size();
		System.out.println(nextIsPresent);
	
	while(nextIsPresent) {

		if (textPresent) {
			String cur = driver.findElement(By.className("cur")).getText();
			System.out.println("Text found on page: "+cur);
			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			try {
				FileUtils.copyFile(scrFile, new File("SearchResult_Found.png"));
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
		else{
		
			Thread.sleep(3000);
			WebElement linkNext = driver.findElement(By.id("pnnext"));
			nextIsPresent= linkNext.isDisplayed();
			linkNext.click();

		}
		
		
	}	
		
		
		driver.quit();

	}

}

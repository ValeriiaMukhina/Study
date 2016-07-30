package com.demo.SeleniumWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTask {

	public static void main(String[] args) {
		// Create a new instance of the Chrome driver
		String exePath = "C:\\Users\\Valeriia_Mukhina\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		String URL = ("http://www.diary.ru/");
		driver.get(URL);

		driver.quit();

	}

}

package com.demo.SeleniumWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IELaunch {

	public static void main(String[] args) {
		String exePath = "C:\\Users\\Valeriia_Mukhina\\IEDriverServer_x64_2.53.1\\IEDriverServer.exe";

		System.setProperty("webdriver.ie.driver", exePath);
		WebDriver driver = new InternetExplorerDriver();

		String URL = ("http://www.diary.ru/");
		driver.get(URL);

		driver.quit();

	}

}

package com.demo.SeleniumWebDriver;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TaskWithScreenshot {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		String URL = "https://en.wikipedia.org/wiki/Main_Page";
		driver.get(URL);

		WebElement didYouKnowContainer = driver.findElement(By.id("Did_you_know..."));
		Point pointDidYouKnowContainer = didYouKnowContainer.getLocation();
		Dimension dimensionDidYouKnowContainer = didYouKnowContainer.getSize();

		WebElement inTheNews = driver.findElement(By.id("In_the_news"));
		Point pointInTheNews = inTheNews.getLocation();
		Dimension dimensionInTheNews = inTheNews.getSize();

		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// now save the screenshot to a file some place

		try {

			BufferedImage img = ImageIO.read(scrFile);
			BufferedImage destDidYouKnow = img.getSubimage(pointDidYouKnowContainer.getX(),
					pointDidYouKnowContainer.getY(), dimensionDidYouKnowContainer.getWidth(),
					dimensionDidYouKnowContainer.getHeight());
			BufferedImage destInTheNews = img.getSubimage(pointInTheNews.getX(), pointInTheNews.getY(),
					dimensionInTheNews.getWidth(), dimensionInTheNews.getHeight());

			// now copy the screenshot to desired location using copyFile
			// //method
			FileUtils.copyFile(scrFile, new File("MainWikipediaPage.png"));
			ImageIO.write(destDidYouKnow, "png", new File("DidYouKnow.png"));
			ImageIO.write(destInTheNews, "png", new File("InTheNews.png"));

		}

		catch (IOException e) {
			System.out.println(e.getMessage());

		}
		driver.quit();
	}

}

package com.demo.SeleniumWebDriver;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	private FirefoxDriver driver;
	
    @FindBy(xpath= "//*[@id='block_top_menu']/ul/li[1]/a")
    private WebElement menuWomen;
    
    @FindBy(xpath= "//*[@id='block_top_menu']/ul/li[1]/ul/li[2]/a")
    private WebElement menuDresses;

	public HomePage(FirefoxDriver driver) {
		init(driver);
	}

	public PageWithWomenDresses filterWomenDresses() {
		//WebElement menuWomen = driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li[1]/a"));
		Actions build = new Actions(driver);
		build.moveToElement(menuWomen).build().perform();
		//WebElement menuDresses = driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li[1]/ul/li[2]/a"));
		menuDresses.click();
		return new PageWithWomenDresses(driver);
	}
	
	 public void init(final FirefoxDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

}

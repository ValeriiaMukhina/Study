package com.demo.SeleniumWebDriver;


import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageWithWomenDresses {

	private FirefoxDriver driver;


	@FindBy(xpath = "//*[@id='ul_layered_id_attribute_group_3']/li/label/a")
	private List<WebElement> colorFilter;

	@FindBy(xpath = "//div[@id='enabled_filters']/ul/li/a/i")
	private WebElement enableFilters;

	@FindBy(xpath = "//ul[@class='product_list grid row']/li")
	private List<WebElement> productList;

	By enableFiltersBy = By.xpath("//div[@id='enabled_filters']/ul/li/a/i");

	public PageWithWomenDresses(FirefoxDriver driver) {
		init(driver);
	}

	public ResultPage sortByPriceLowestFirst()  {
		Select selectProductSort = new Select(driver.findElementById("selectProductSort"));
		selectProductSort.selectByVisibleText("Price: Lowest first");
		return new ResultPage(driver);
	}

	

	public boolean applyColorFilter() {
		// Initialize maps with color filter links and corresponding product
		// counts
		Map<String, Integer> colorFilterMap = new HashMap<String, Integer>();
		Map<String, Integer> filteredProductsMap = new HashMap<String, Integer>();

		for (WebElement iter : colorFilter) {
			int value = Integer
					.parseInt(iter.getText().substring(iter.getText().indexOf('(') + 1, iter.getText().indexOf(')')));
			String key = iter.getAttribute("href");
			colorFilterMap.put(key, value);
		}

		for (Map.Entry<String, Integer> item : colorFilterMap.entrySet()) {
			// Iterations
			driver.navigate().to(item.getKey());
			WebDriverWait wait = new WebDriverWait(driver, 40);
			wait.until(ExpectedConditions.elementToBeClickable(enableFilters));

			int countOfProducts = productList.size();

			filteredProductsMap.put(item.getKey(), countOfProducts);
			enableFilters.click();
			wait.until(ExpectedConditions.invisibilityOfElementLocated(enableFiltersBy));
		}
		
		return filteredProductsMap.equals(colorFilterMap);

	}

	public void init(final FirefoxDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}

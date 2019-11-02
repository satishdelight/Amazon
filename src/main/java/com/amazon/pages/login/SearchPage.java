package com.amazon.pages.login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.amazon.interfaces.home.SearchPageInterface;

public class SearchPage implements SearchPageInterface{

	@FindBy(id="sort")
	WebElement sortDropDown;
	
	/*
	 * @FindBy(id="noResultsTitle") WebElement noResultTitle;
	 */
	 
	@FindBy(xpath="//div[@class='a-row']")
	WebElement noResultTitle;
	
	@FindBy(xpath="//*[@id='noResultsTitle']")
	WebElement noResultTitle1; 
	
	@FindBy(xpath="//span[@class='a-color-state a-text-bold']")
	WebElement resultTitle;
	
	@FindBy(xpath="//span[@class='celwidget slot=SEARCH_RESULTS template=SEARCH_RESULTS widgetId=search-results index=5']//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']\r\n" + 
			"	")
	WebElement clickProduct;
	
	//span[@class='celwidget slot=SEARCH_RESULTS template=SEARCH_RESULTS widgetId=search-results index=5']//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']
	
	WebDriver driver;
	
	public SearchPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public String noResultFound() {
		return noResultTitle.getText();
	}
	
	public String resultFound() {
		return resultTitle.getText();
	}
	public List<WebElement> searchResults() {
	 List<WebElement> searchResults = driver.findElements(By.xpath("xpathExpression"));
	  return searchResults;
	}
	
	public void filter() {
		// TODO Auto-generated method stub
		Select selectProduct=new Select(sortDropDown);
		selectProduct.selectByVisibleText("Price: Low to High");	
	}

	public void clickShowResuts(String product) {
		// TODO Auto-generated method stub
		
			
	}

	public void clickProduct(String product) {
		// TODO Auto-generated method stub
		
			
	}

	
	public void resultCount() {
		// TODO Auto-generated method stub
		
	}

}

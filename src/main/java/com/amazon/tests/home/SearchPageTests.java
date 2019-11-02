package com.amazon.tests.home;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

import com.amazon.common.utils.BaseTest;
import com.amazon.common.utils.CommonMethods;
import com.amazon.pages.login.HomePage;
import com.amazon.pages.login.SearchPage;

public class SearchPageTests extends BaseTest{
	
	public SearchPageTests() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test
	public void validateNoResult() throws InterruptedException{
		SearchPage searchPageObj=new SearchPage(driver);
		HomePage homePageObj=new HomePage(driver);

		Thread.sleep(10000);
	
		String searchText="asdasdasdaasdasd";
		homePageObj.searchBox(searchText);
		String text=searchPageObj.noResultFound();
		//String expectedText="No results for \""+searchText+"\".";
		String expectedText="No results for "+searchText+".";
		Assert.assertEquals(text, expectedText);
		
		
	}
	

	
//	@Test
//	public void validateResult(){
//		boolean found = false;
//		SearchPage searchPageObj=new SearchPage(driver);
//		HomePage homePageObj=new HomePage(driver);
//
//		String searchText="Laptop";
//		List<WebElement> searchResultList = homePageObj.searchBox(searchText);
//		for(WebElement searchElement: searchResultList) {
//			if(searchElement.getText().equals("Acesr 30")) {
//				found = true;
//				break;
//			}
//		}
//		assertTrue(found,"Ser");
//		String text=searchPageObj.resultFound();
//		String actualText = text.replaceAll("^\"|\"$", "");
//		
//		
//		
//		String expectedText= searchText;
//		Assert.assertEquals(actualText, expectedText);
//		
//	
//	}
//	


}

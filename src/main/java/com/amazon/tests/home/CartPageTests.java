package com.amazon.tests.home;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.amazon.common.utils.BaseTest;
import com.amazon.pages.login.HomePage;
import com.amazon.pages.login.SearchPage;

public class CartPageTests extends BaseTest {
	
	public CartPageTests() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test
	public void validateCartItems() throws InterruptedException{
		
		Thread.sleep(10000);
		
		SearchPage searchPageObj=new SearchPage(driver);
		HomePage homePageObj=new HomePage(driver);
		
		//Add items to cart
		
		
		
		String[]  expected= {"Acer Aspire 5 Slim Laptop, Full HD IPS Display, "
				+ "AMD Ryzen 3 3200U, Vega 3 Graphics, 4GB DDR4, 128GB SSD, "
				+ "Backlit Keyboard, Windows 10 in S Mode, A515-43-R19L",  "apple", "lenovo"};
		List<String> expectedList =  new ArrayList<String>(Arrays.asList(expected));
		
		WebElement cartItem; 
				
		for(String searchItem: expectedList)
		{
			homePageObj.searchBox(searchItem);
			
			if (searchItem =="acer")
			{
				 Thread.sleep(10000);
				 cartItem = driver.findElement(By.xpath("//span[contains(text(),'Acer Aspire 5 Slim Laptop, "
				 		+ "15.6\" Full HD IPS Display, AMD Ryzen 3 3200U, Vega 3 Graphics, 4GB DDR4, 128GB SSD,"
				 		+ " Backlit Keyboard, Windows 10 in S Mode, A515-43-R19L')]"));
			     cartItem.click();
			     Thread.sleep(10000);
			     WebElement addToCart =driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
			     addToCart.click();
			     Thread.sleep(10000);
			     WebElement clickCart= driver.findElement(By.xpath("//a[@id='nav-cart']"));
			     clickCart.click();
			}
			else if (searchItem == "apple")
			{
				 Thread.sleep(10000);
				 cartItem = driver.findElement(By.xpath("//span[contains(text(),'"
				 		+ "Acer Aspire 5 Slim Laptop, 15.6\""
				 		+ " Full HD IPS Display, AMD Ryzen 3 3200U, Vega 3 Graphics, 4GB DDR4, "
				 		+ "128GB SSD, Backlit Keyboard, Windows 10 in S Mode, A515-43-R19L')]"));
				 cartItem.click();
			}
			else 
			{
				 Thread.sleep(10000);
				 cartItem = driver.findElement(By.xpath("//span[contains(text(),'"
				 		+ "Acer Aspire 5 Slim Laptop, "
				 		+ "15.6\" Full HD IPS Display, AMD Ryzen 3 3200U, Vega 3 Graphics, 4GB DDR4, "
				 		+ "128GB SSD, Backlit Keyboard, Windows 10 in S Mode, A515-43-R19L')]"));		
				 cartItem.click();
			}
		}
		
         //String[]  expected= {"apple", "acer", "lenovo"};
         //List<String> expectedList =  new ArrayList<String>(Arrays.asList(expected));
		
		 //expectedList.contains("apple");
		
	     //WebElement cartItem = driver.findElement(By.xpath(""));
	     //cartItem.getText();//Acer laptop
	
		
		List<WebElement> cartItemList = driver.findElements(By.xpath("//div[@data-asin]"));
		for(WebElement cartElement: cartItemList) {
			
			if(expectedList.contains(cartElement.getText()))
			{
				expectedList.remove(cartElement.getText());
			}
			//Apple what needs to be done?
			
			//Lenovo
		}
	
	}
	
	public void addItemToCart(String item) throws InterruptedException
	{
		Thread.sleep(10000);
		String xpath = String.format("//span[contains(text(),'%s')]", item);	
	}
	
}

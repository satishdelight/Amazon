package com.amazon.pages.login;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

import com.amazon.interfaces.home.HomePageInterface;

public class HomePage implements HomePageInterface{
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="nav-upnav")
	WebElement headerNav;
	
	@FindBy(id="twotabsearchtextbox")
	private WebElement twoTabSearchTextbox;
	
	@FindBy(xpath="//input[@value='Go']")
	WebElement clickGoButton;
	
	
	public void clickHeader() {
		// TODO Auto-generated method stub
		headerNav.click();
	}

	public void logo() {
		// TODO Auto-generated method stub
		
	}

	public void searchBox(String searchText) {
		// TODO Auto-generated method stub
		twoTabSearchTextbox.clear();
		twoTabSearchTextbox.sendKeys(searchText);
		clickGoButton.click();
	 
	}

	public void shoesuppliesLink() {
		// TODO Auto-generated method stub
		
	}

	public void menus() {
		// TODO Auto-generated method stub
		
	}

}

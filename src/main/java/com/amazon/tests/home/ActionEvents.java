package com.amazon.tests.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionEvents {
	WebDriver driver;
	@Test
	public void m1(){
		
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumAutomation\\feb_batch\\ParasProject\\drivers\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		(new Actions(driver)).moveToElement(driver.findElement(By.xpath("//span[text()='Account & Lists']"))).build().perform();
		
	}

}

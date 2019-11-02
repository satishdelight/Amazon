package com.amazon.tests.home;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScriptExecutor {
	WebDriver driver;
	@Test
	public void jsExecutor(){
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumAutomation\\feb_batch\\ParasProject\\drivers\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		//List<WebElement> count=driver.findElements(By.xpath("//img"));
		//System.out.println(count.size());
		
		
		//document.images.length - is the command used to count the number of images
		String javascript="var x = document.images.length;alert(x);";
    
		((JavascriptExecutor)driver).executeScript(javascript);
	}

}

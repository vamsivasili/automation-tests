package com.shearcircle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AppTest 
{
	@Test
	public void testGoogle(){
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\vamsi\\maven\\ShearCircleAutomation\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://demoworks.in/php/shearcircle/");
	
	}
	
}

package Mygrp.vijtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */

public class AppTest
{
    
	@Test
	public void a() {
	System.setProperty("webdriver.chrome.driver","C:\\MyData\\GEN\\Sellenium\\webdriver_install\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://google.com");
	}
}

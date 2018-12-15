package com.test.cases;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class testBaidu2 {
	private WebDriver driver;
	private String baseUrl;
	@BeforeClass
	public void setUp() throws Exception {
	driver = new ChromeDriver();
	//driver = new InternetExplorerDriver();
	
	baseUrl = "https://www.baidu.com/";
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test
	@Parameters("test1") 
	public void testCase(String test1) throws Exception {
	driver.get(baseUrl + "/");
	System.out.println("sreach key value:"+ test1);
	driver.findElement(By.id("kw")).sendKeys(test1);
	driver.findElement(By.id("su")).click();
	Thread.sleep(2000);
	String title =driver.getTitle();
	assertEquals(title,test1+"_百度搜索");
	}
	
	@AfterClass
	public void tearDown() throws Exception {
	
		driver.quit();
	}

}
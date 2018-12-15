package com.test.cases1;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class testBaidu {
	
	public static void main(String args[]) throws InterruptedException {
		WebDriver driver;
		String baseUrl;
		String test1 = "test1";

		
		driver = new ChromeDriver();
		//driver = new InternetExplorerDriver();
		
		baseUrl = "https://www.baidu.com/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get(baseUrl + "/");
		System.out.println("sreach key value:"+ test1);
		driver.findElement(By.id("kw")).sendKeys(test1);
		driver.findElement(By.id("su")).click();
		Thread.sleep(2000);
		String title =driver.getTitle();
		System.out.print("title:%s");
		System.out.println(title);
		
	}
}
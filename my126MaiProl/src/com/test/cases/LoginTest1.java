package com.test.cases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;


public class LoginTest1 {

  @BeforeMethod
  public void setUp() throws Exception{

    System.out.println("BeforeMethod1 is running.....");
  }
  
  @Test
  public void testCase1() throws Exception{
	  System.out.println("testCase1 is running.....");
  }

  @AfterMethod
  public void tearDown() throws Exception{
	  System.out.println("AfterMethod1 is running.....");
  }

  
  
}

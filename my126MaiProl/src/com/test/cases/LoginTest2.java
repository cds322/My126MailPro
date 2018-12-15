package com.test.cases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;


public class LoginTest2 {

  @BeforeMethod
  public void setUp() throws Exception{

    System.out.println("BeforeMethod2 is running.....");
  }
  
  @Test
  public void testCase1() throws Exception{
	  System.out.println("testCase2 is running.....");
  }

  @AfterMethod
  public void tearDown() throws Exception{
	  System.out.println("AfterMethod2 is running.....");
  }

  
  
}

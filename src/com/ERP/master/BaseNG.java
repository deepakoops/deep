package com.ERP.master;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BaseNG {
   public static Stocklib s=new Stocklib();
  
  @BeforeTest
  public void beforeTest()
  {
	  s.login("admin", "master");
  }

  @AfterTest
  public void afterTest() 
  {
	  s.logout();
  }

  @BeforeSuite
  public void beforeSuite() throws Exception 
  {
	  s.openurl("http://webapp.qedgetech.com");
  }

  @AfterSuite
  public void afterSuite()
  {
	  s.Appclose();
	  
  }

}

package com.ERP.master;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Pomexe
{
	@Test
	public void Lexe()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://webapp.qedgetech.com");
		driver.manage().window().maximize();
		Loginpage LP=PageFactory.initElements(driver, Loginpage.class);
		LP.adminlog("admin", "master");
		//Pom_home HP=PageFactory.initElements(driver, Pom_home.class);
		//HP.sup( "deepak", "Hyb", "Hyderbad", "india", "manoj", "12345678912", "grrt@gmail.com", "4557898654", "good");
	   // Pom_stockitm st=PageFactory.initElements(driver,Pom_stockitm.class);
	   // st.stitm("shdhah", "p[lo[p", "deep", "rrrrrrr", "10000", "5000", "good");
	    Pom_actionsc pa=PageFactory.initElements(driver, Pom_actionsc.class);
	    
	    pa.stkcat(driver);
	    
	}
	

}

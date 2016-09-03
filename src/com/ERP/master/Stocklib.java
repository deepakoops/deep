package com.ERP.master;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Stocklib
{
	public static Properties pr;
	public static FileInputStream fis;
	public static WebDriver driver;
	public static String expval,actval;
	
	
	
	public String openurl(String url) throws Exception 
	{
		pr=new Properties();
		fis=new FileInputStream("C:\\workspace12\\ERPAUTOMATION\\src\\com\\ERP\\propaties\\erp.properties");
		pr.load(fis);
		expval="Login";
		
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get(url);
		actval=driver.findElement(By.id(pr.getProperty("login"))).getText();
		if (expval.equalsIgnoreCase(actval))
		{
			return "pass";
		}
		else
		{
			return "fail";
			
			
		}
		
		
		
		
		
	}



public String login(String un,String pw)

{
	
	driver.findElement(By.id(pr.getProperty("reset"))).click();
	driver.findElement(By.id(pr.getProperty("uname"))).sendKeys(un);
	driver.findElement(By.id(pr.getProperty("pwd"))).sendKeys(pw);
	driver.findElement(By.id(pr.getProperty("login"))).click();
	return "pass";
	
		
	
	
	
	
	} 
public String stockcat(String dm) {
	Actions a=new Actions(driver);
	a.moveToElement(driver.findElement(By.xpath(pr.getProperty("stockitm")))).build().perform();
	driver.findElement(By.xpath(pr.getProperty("stockcat"))).click();
	driver.findElement(By.xpath(pr.getProperty("stockadd"))).click();
	driver.findElement(By.id(pr.getProperty("catname"))).sendKeys(dm);
	
	
	driver.findElement(By.id(pr.getProperty("catadd"))).click();
	Sleeper.sleepTightInSeconds(3);
	driver.findElement(By.xpath(pr.getProperty("confok"))).click();
	Sleeper.sleepTightInSeconds(2);
	driver.findElement(By.xpath(pr.getProperty("alertok"))).click();
	return "pass";
	
}
public String umang(String id,String des){
	Actions b=new Actions(driver);
	b.moveToElement(driver.findElement(By.xpath(pr.getProperty("stockitem")))).build().perform();
	driver.findElement(By.xpath(pr.getProperty("unmes"))).click();
	driver.findElement(By.xpath(pr.getProperty("uadd"))).click();
	driver.findElement(By.id(pr.getProperty("uomid"))).sendKeys(id);
	driver.findElement(By.id(pr.getProperty("uomdes"))).sendKeys(des);

	driver.findElement(By.id(pr.getProperty("add1"))).click();
	Sleeper.sleepTightInSeconds(2);
	driver.findElement(By.xpath(pr.getProperty("ucok"))).click(); 
	
	String text=driver.findElement(By.xpath(pr.getProperty("uaok"))).getText();
	System.out.println(text);
	Sleeper.sleepTightInSeconds(2);
	driver.findElement(By.xpath(pr.getProperty("uaok"))).click();
	return "pass";
	
	
}

public String supply(String sn,String sns,String add,String c,String co,String cp,String pn,String e,String mn,String no){
	driver.findElement(By.xpath(pr.getProperty("supplier"))).click();
	driver.findElement(By.xpath(pr.getProperty("add"))).click();
	Sleeper.sleepTightInSeconds(3);
	driver.findElement(By.id(pr.getProperty("suppno"))).sendKeys(sn);
	driver.findElement(By.id(pr.getProperty("suppname"))).sendKeys(sns);
	driver.findElement(By.id(pr.getProperty("address"))).sendKeys(add);
	driver.findElement(By.id(pr.getProperty("city"))).sendKeys(c);
	driver.findElement(By.id(pr.getProperty("country"))).sendKeys(co);
	driver.findElement(By.id(pr.getProperty("conpersoin"))).sendKeys(cp);
	driver.findElement(By.id(pr.getProperty("phno"))).sendKeys(pn);
	driver.findElement(By.id(pr.getProperty("email"))).sendKeys(e);
	driver.findElement(By.id(pr.getProperty("mobno"))).sendKeys(mn);
	driver.findElement(By.id(pr.getProperty("notes"))).sendKeys(no);
	driver.findElement(By.id(pr.getProperty("add2"))).click();
	Sleeper.sleepTightInSeconds(2);
	driver.findElement(By.xpath(pr.getProperty("altok"))).click();
	Sleeper.sleepTightInSeconds(2);
	driver.findElement(By.xpath(pr.getProperty("confok"))).click();
	return "pass";
	
	
	
	
}

public String logout() 
{
	driver.findElement(By.xpath(pr.getProperty("logout"))).click();
	Sleeper.sleepTight(2);
	
	
return "successfully logout";
}
public void Appclose() {
	driver.close();
}

}
	
	
	

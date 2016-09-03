package com.ERP.script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Basic_script {

	public static void main(String[] args) 
	{
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://webapp.qedgetech.com");
	String actual=driver.findElement(By.id("btnsubmit")).getText();
	if (actual.equalsIgnoreCase("Login"))
	{
		System.out.println("click on login");
		
	}
	else {
		System.out.println("not click");
	}
	driver.findElement(By.id("btnreset")).click();
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.id("password")).sendKeys("master");
	driver.findElement(By.id("btnsubmit")).click();
	Sleeper.sleepTightInSeconds(2);
	
	
	Actions a=new Actions(driver);
	a.moveToElement(driver.findElement(By.xpath(".//*[@id='mi_a_stock_items']/a"))).build().perform();
	driver.findElement(By.xpath(".//*[@id='mi_a_stock_categories']/a")).click();
	driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a/span")).click();
	driver.findElement(By.id("x_Category_Name")).sendKeys("Dmobile");
	
	
	driver.findElement(By.id("btnAction")).click();
	Sleeper.sleepTightInSeconds(3);
	driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button[1]")).click();
	driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button")).click();
	Sleeper.sleepTightInSeconds(3);
	//suppliers
	driver.findElement(By.xpath(".//*[@id='mi_a_suppliers']/a")).click();
	driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a/span")).click();
	Sleeper.sleepTightInSeconds(3);
	driver.findElement(By.id("x_Supplier_Number")).sendKeys("Supplier-23456");
	driver.findElement(By.id("x_Supplier_Name")).sendKeys("Deepak kumar");
	driver.findElement(By.id("x_Address")).sendKeys("ameerpat");
	driver.findElement(By.id("x_City")).sendKeys("hyderbad");
	driver.findElement(By.id("x_Country")).sendKeys("india");
	driver.findElement(By.id("x_Contact_Person")).sendKeys("manoj");
	driver.findElement(By.id("x_Phone_Number")).sendKeys("123456789");
	driver.findElement(By.id("x__Email")).sendKeys("deep@gmail.com");
	driver.findElement(By.id("x_Mobile_Number")).sendKeys("789476");
	driver.findElement(By.id("x_Notes")).sendKeys("Good");
	driver.findElement(By.id("btnAction")).click();
	Sleeper.sleepTightInSeconds(2);
	driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button[1]")).click();
	Sleeper.sleepTightInSeconds(2);
	driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button")).click();
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	

	

}

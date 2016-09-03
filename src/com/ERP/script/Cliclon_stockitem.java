package com.ERP.script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.Select;

public class Cliclon_stockitem {

	public static void main(String[] args) {
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
driver.findElement(By.xpath(".//*[@id='mi_a_stock_items']/a")).click();
driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a/span")).click();
Sleeper.sleepTightInSeconds(2);
new Select(driver.findElement(By.id("x_Category"))).selectByVisibleText("Test14");
new Select(driver.findElement(By.id("x_Supplier_Number"))).selectByVisibleText("321432");
driver.findElement(By.id("x_Stock_Number")).sendKeys("Stock-567878");
driver.findElement(By.id("x_Stock_Name")).sendKeys("deepak");
new Select(driver.findElement(By.id("x_Unit_Of_Measurement"))).selectByVisibleText("rrrrrrr");
driver.findElement(By.id("x_Purchasing_Price")).sendKeys("5000");
driver.findElement(By.id("x_Selling_Price")).sendKeys("3000");
driver.findElement(By.id("x_Notes")).sendKeys("Thanks");
driver.findElement(By.xpath(".//*[@id='btnAction']")).click();
Sleeper.sleepTightInSeconds(2);
driver.findElement(By.xpath("html/body/div[19]/div[2]/div/div[4]/div[2]/button[1]")).click();







	}

}

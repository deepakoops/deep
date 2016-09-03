package com.ERP.master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Pom_actionsc 
{
	@FindBy(xpath=".//*[@id='mi_a_stock_items']/a")
	WebElement sitm;
	@FindBy(xpath=".//*[@id='mi_a_stock_categories']/a")
	WebElement scat;
	
	
	
	public void stkcat(WebDriver driver,sr)
	{
		Actions ac= new Actions(driver);
		ac.moveToElement(sitm).build().perform();
		scat.click();
		
		
	}
	

}
}

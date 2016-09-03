package com.ERP.master;

import javax.swing.Spring;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Pom_stockitm 
{
	
	@FindBy(xpath=".//*[@id='mi_a_stock_items']/a")
    WebElement sitm;
	@FindBy(xpath=".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a/span")
	WebElement add;
	@FindBy(id="x_Category")
	WebElement cat;
	@FindBy(id="x_Supplier_Number")
	WebElement supno;
	@FindBy(id="x_Stock_Number']")
	WebElement stno;
	@FindBy(id="x_Stock_Name")
	WebElement stnm;
	@FindBy(id="x_Unit_Of_Measurement")
	WebElement uom;
	@FindBy(id="x_Purchasing_Price")
	WebElement pprice;
	@FindBy(id="x_Selling_Price")
	WebElement sprice;
	@FindBy(id="x_Notes")
	WebElement notes;
	@FindBy(id="btnAction")
	WebElement add1;
	@FindBy(id="html/body/div[19]/div[2]/div/div[4]/div[2]/button[1]")
	WebElement ok;
	@FindBy(id="html/body/div[17]/div[2]/div/div[4]/div[2]/button")
	WebElement altok;
	
	
	
	public void stitm(String catval,String sn,String snm,String u,String pp,String sp,String nt)
	{
		sitm.click();
		add.click();
		Select sl=new Select(cat);
		sl.selectByVisibleText(catval);
		Select s=new Select(supno);
		s.selectByVisibleText(sn);
		stnm.sendKeys(snm);
		Select um=new Select(uom);
		um.selectByVisibleText(u);
		pprice.sendKeys(pp);
		sprice.sendKeys(sp);
		notes.sendKeys(nt);;
		add1.click();
		Sleeper.sleepTightInSeconds(3);
		altok.click();
		
		
		
	}
	
	
	


}

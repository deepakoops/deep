package com.ERP.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.FindBy;

public class Pom_home {
	@FindBy(xpath=".//*[@id='mi_a_suppliers']/a")
	WebElement suppliers;
	@FindBy(xpath=".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a/span")
	WebElement add;
	@FindBy(id="x_Supplier_Number")
	WebElement supno;
	
	@FindBy(id="x_Supplier_Name")
	WebElement suppname;
	@FindBy(id="x_Address")
	WebElement address;
	@FindBy(id="x_City")
	WebElement city;
	@FindBy(id="x_Country")
	WebElement country;
	@FindBy(id="x_Contact_Person")
	WebElement cpersion;
	@FindBy(id="x_Phone_Number")
	WebElement phno;
	@FindBy(id="x__Email")
	WebElement email;
	@FindBy(id="x_Mobile_Number")
	WebElement mobno;
	@FindBy(id="x_Notes")
	WebElement note;
	@FindBy(id="btnAction")
	WebElement add1;
	@FindBy(xpath="html/body/div[.]/div[2]/div/div[4]/div[2]/button[1]")
	WebElement ok;
	@FindBy(xpath="html/body/div[.]/div[2]/div/div[4]/div[2]/button")
	WebElement ok1;
	
	public void sup(String sn,String ads,String cty,String cnty,String cp,String pno,String eml,String mno,String nt)
	{
		suppliers.click();
		add.click();
        Sleeper.sleepTight(5000);
        suppname.sendKeys(sn);
		address.sendKeys(ads);
		city.sendKeys(cty);
		country.sendKeys(cnty);
		cpersion.sendKeys(cp);
		phno.sendKeys(pno);
		email.sendKeys(eml);
		mobno.sendKeys(mno);
		note.sendKeys(nt);
		add1.click();
		Sleeper.sleepTight(3);
		ok.click();
		Sleeper.sleepTight(2000);
		ok1.click();
		
		
	}
	
	
	
	
	
	
	

	
	

}

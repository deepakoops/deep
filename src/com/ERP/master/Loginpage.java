package com.ERP.master;

import javax.swing.Spring;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage 
{
	@FindBy(id="username")
	WebElement uname;
	@FindBy(id="password")
	WebElement pwd;
	@FindBy(id="btnsubmit")
	WebElement login;
	@FindBy(id="btnreset")
	WebElement reset;
	
	public void adminlog(String un,String pw) 
	{
		reset.click();
		uname.sendKeys(un);
		pwd.sendKeys(pw);
		login.click();
		
		
	}

}

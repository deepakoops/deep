package com.ERP.master;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExeNG extends BaseNG 
{
	@Test(dataProvider="udata")
	public void uom(String uid,String udes){
		
		s.umang(uid, udes);
		

		
	}
	@DataProvider
	public Object[][] udata()
	{
		Object[][] ojb=new Object[3][2];
		ojb[0][0]="deep34536";
		ojb[0][1]="selenium34";
		ojb[1][0]="deep3457736";
		ojb[1][1]="selenium345";
		ojb[2][0]="deep34536";
		ojb[2][1]="selenium348";
				
		return ojb;
		
		
	}
	/*
	public Object[][] stockitm() 
	{
		Object[][] objt=new Object[2][1];
		objt[0][0]="mobile";
		objt[1][0]="mobile";
		return objt;
	}
	*/
	

}

package com.ERP.master;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFAnchor;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exelib {

	public static void main(String[] args) throws Exception 
	{
		Stocklib s=new Stocklib();
		String res=s.openurl("http://webapp.qedgetech.com");
		System.out.println(res);
		res=s.login("admin","master");
		System.out.println(res);
		res=s.stockcat("dmobile");
		System.out.println(res);
		res =s.umang("deepak000510","gdluck");
		System.out.println(res);
	    res=s.supply("deep12345", "deepak", "Ameerpet", "hyb", "india","manoj", "43563838", "gfhhf@gmail.com", "1324673823", "good");
        System.out.println(res);
		
       res=s.logout();
       System.out.println(res);
        
     
        
        
			
		}
		
	}



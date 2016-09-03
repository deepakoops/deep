        package com.ERP.master;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Xcelsheet {

	public static void main(String[] args) throws Exception
	{
		Stocklib dr=new Stocklib();
		
		dr.openurl ("http://webapp.qedgetech.com");
		dr.login("admin", "master");
	
		
		 FileInputStream fis=new FileInputStream("C:\\workspace12\\ERPAUTOMATION\\src\\com\\ERP\\testData\\UOM.xlsx");
	        XSSFWorkbook wb=new XSSFWorkbook(fis);
	        XSSFSheet ws=wb.getSheet("sheet1");
	        int rc=ws.getLastRowNum();
	        System.out.println(rc);
	        
	        for (int i = 1; i <=rc; i++) 
	        {
	        	XSSFRow wr=ws.getRow(i); 
	        	
	        	XSSFCell wc=wr.getCell(0);
	        	XSSFCell wc1=wr.getCell(1);
	        	
	        	XSSFCell wc2=wr.createCell(2);
	        	
	        	
	        	String uid=wc.getStringCellValue();
	        	String udesc=wc1.getStringCellValue();
	        	
	        	String res=dr.umang(uid, udesc);
	        	
	        	wc2.setCellValue(res);
	        	
	        	
	        	
	        	
	        	 
				
			}
	        
	        
	        FileOutputStream fo=new FileOutputStream("C:\\workspace12\\ERPAUTOMATION\\src\\com\\ERP\\results\\uomres.xlsx");
	        
	        wb.write(fo);
	        wb.close();
	        

	}

}

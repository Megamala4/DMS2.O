package com.Configurations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import _01.MainPageClass.CommonMasterData;
import _01.MainPageClass.RunningClass;

public class doucmentconfig extends RunningClass{

	@SuppressWarnings("deprecation")
	@Test
	public void A() throws Exception {

		CommonMasterData CP = new CommonMasterData(driver);
		
		for (int i = 2; i <= 2; i++) {
			String username = xls1.getCellData("LOGINPAGE ", "Admin", i);
			String password = xls1.getCellData("LOGINPAGE", "Password", i);
			Login(username, password);
			
			
			String department = xls1.getCellData("LOGINPAGE", "department", i);
			String document = xls1.getCellData("LOGINPAGE", "document", i);
			String documenttype = xls1.getCellData("LOGINPAGE", "documenttype ", i);
			String doucmentnoconfig = xls1.getCellData("LOGINPAGE", "doucmentnoconfig", i);
			String doucmentnumber = xls1.getCellData("LOGINPAGE", "doucmentnumber", i);
			String versionNumber = xls1.getCellData("LOGINPAGE", "versionNumber", i);

			
			CP.config();
			CP.doucmentnoconfig();
			Actions actions = new Actions(driver);
		    WebElement Move = driver.findElement(By.xpath("//*[contains (text(),'Deparment')]"));
		  	actions.moveToElement(Move).perform();
		    System.out.println("Done Mouse hover on 'PO' from DF");
			CP.create();
			CP.createvalidation();
			CP.department(department);
			CP.document(document);
			CP.documenttype(documenttype);
			CP.documentcofigsingle(doucmentnoconfig);
			CP.doucmentnumber(doucmentnumber);
			CP.versionNumber(versionNumber);
			CP.create();
			
		}
	}
	
}

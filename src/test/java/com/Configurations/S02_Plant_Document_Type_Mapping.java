package com.Configurations;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import _01.MainPageClass.CommonPageClass;
import _01.MainPageClass.RunningClass;

public class S02_Plant_Document_Type_Mapping extends RunningClass {
	@Test
	public void A() throws Exception {
		int RowCount = xls1.getRowCount("Configurations");
		System.out.println(RowCount);
		for (int i = 2; i <= 2; i++) {
//*************************************************************************************************************************************
			CommonPageClass cm = new CommonPageClass(driver);
			String userame = xls1.getCellData("Credentials", "UserName", i);
			String password = xls1.getCellData("Credentials", "Password", i);
			String A = xls1.getCellData("Configuration", "Select Doc Category", i);
//************************************************************************************************************************************			
			Login(userame, password);
			driver.findElement(By.xpath("//*[contains (text(),'Configuration ')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/app-root/div/app-layout/nav/div/ul[2]/li[2]/ul/li[2]/span/a")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//*[contains (text(),'Plant Document Type Mapping')])[3]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[contains (text(),' Create')]")).click();
			Thread.sleep(1000);
		}
	}
}
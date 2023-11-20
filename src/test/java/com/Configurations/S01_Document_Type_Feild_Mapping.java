package com.Configurations;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import _01.MainPageClass.CommonPageClass;
import _01.MainPageClass.RunningClass;//changed

public class S01_Document_Type_Feild_Mapping extends RunningClass {
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
			String B = xls1.getCellData("Configuration", "Select Doc Type", i);
			String E = xls1.getCellData("Configuration", "lotNo", i);
			String F = xls1.getCellData("Configuration", "partNo", i);
			String G = xls1.getCellData("Configuration", "serialNo", i);
			String H = xls1.getCellData("Configuration", "dimensions", i);
			String I = xls1.getCellData("Configuration", "previousColumnID", i);
			String Y = xls1.getCellData("Configuration", "fromDate", i);
			Login(userame, password);
//************************************************************************************************************************************			
			driver.findElement(By.xpath("//*[contains (text(),'Configuration ')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[contains (text(),'Document Type Field Mapping')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[contains (text(),'Configuration ')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@formcontrolname='documentCategory_Id']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@formcontrolname='documentCategory_Id']")).sendKeys(A);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@formcontrolname='documentType_Id']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@formcontrolname='documentType_Id']")).sendKeys(B, Keys.ENTER);
			Thread.sleep(1000);
			cm.CheckBox1();
			cm.CheckBox2();
			driver.findElement(By.xpath("//*[@class='fa fa-angle-right']")).click();
			Thread.sleep(1000);
			cm.Submit1();
			//CreateFun();
		}
	}
}

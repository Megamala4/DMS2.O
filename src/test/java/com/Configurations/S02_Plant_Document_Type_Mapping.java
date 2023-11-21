package com.Configurations;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import _01.MainPageClass.CommonPageClass;
import _01.MainPageClass.PomClass;
import _01.MainPageClass.RunningClass;

public class S02_Plant_Document_Type_Mapping extends RunningClass {
	@Test
	public void A() throws Exception {
		int RowCount = xls1.getRowCount("Configurations");
		System.out.println(RowCount);
		for (int i = 2; i <= 2; i++) {
//*************************************************************************************************************************************
			CommonPageClass cm = new CommonPageClass(driver);
			PomClass pm = new PomClass(driver);
			String userame = xls1.getCellData("Credentials", "UserName", i);
			String password = xls1.getCellData("Credentials", "Password", i);
			String department = xls1.getCellData("Configuration", "Department", i);
			String documentCategory = xls1.getCellData("Configuration", "Select Doc Category", i);
			String DocumentType = xls1.getCellData("Configuration", "Select Doc Type", i);
			String A = xls1.getCellData("Configuration", "", i);

//************************************************************************************************************************************			
			Login(userame, password);
			pm.Configurations_Click();
			pm.Plant_Document_Type_Mapping();
			driver.findElement(By.xpath("(//*[contains(text(),'Plant Document Type Mapping')])[3]")).click();
			cm.Create1();
			pm.Department_Id(department);
			pm.DocumentCategoryId_Click(documentCategory);
//			pm.class="dropdown-btn"
		}
	}
}
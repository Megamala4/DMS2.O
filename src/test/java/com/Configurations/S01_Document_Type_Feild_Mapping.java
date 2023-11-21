package com.Configurations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import _01.MainPageClass.CommonPageClass;
import _01.MainPageClass.PomClass;
import _01.MainPageClass.RunningClass;//changed

public class S01_Document_Type_Feild_Mapping extends RunningClass {
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
			String A = xls1.getCellData("Configuration", "Select Doc Category", i);
			String B = xls1.getCellData("Configuration", "Select Doc Type", i);
//************************************************************************************************************************************			
			Login(userame, password);
			pm.Configurations_Click();
			pm.Document_Type_Feild_Mapping_Click();
			pm.Configurations_Click();
			pm.DocumentCategoryId_Click(A);
			pm.DocumenType_Id(B);
			cm.CheckBox1();
			cm.CheckBox2();
			pm.Switch_Click();
			cm.Submit1();
			CreateFun();
		}
	}
}

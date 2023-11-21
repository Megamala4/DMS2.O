package com.Configurations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import _01.MainPageClass.CommonMasterData;
import _01.MainPageClass.RunningClass;

public class ReviewperiodMagnagement extends RunningClass {
	@SuppressWarnings("deprecation")
	@Test
	public void A() throws Exception {

		CommonMasterData CP = new CommonMasterData(driver);

		for (int i = 2; i <= 2; i++) {
			String username = xls1.getCellData("LOGINPAGE ", "Admin", i);
			String password = xls1.getCellData("LOGINPAGE", "Password", i);
			Login(username, password);

			String department5 = xls1.getCellData("LOGINPAGE", "department5", i);
			String doucment5 = xls1.getCellData("LOGINPAGE", "doucment5", i);
			String doucmenttype5 = xls1.getCellData("LOGINPAGE", "doucmenttype5 ", i);
			String reviewperiod = xls1.getCellData("LOGINPAGE", "reviewperiod", i);
			String timePeriod = xls1.getCellData("LOGINPAGE", "timePeriod", i);
			String reviewExpiryAlertBefore = xls1.getCellData("LOGINPAGE", "reviewExpiryAlertBefore", i);
			CP.config();
			CP.config5();
			Actions actions = new Actions(driver);
			WebElement Move = driver.findElement(By.xpath("//*[contains (text(),'Department')]"));
			actions.moveToElement(Move).perform();
			System.out.println("Done Mouse hover on 'PO' from DF");
			CP.create();
			CP.createvalidation();
			CP.department5(department5);
			CP.doucment5(doucment5);
			CP.doucmenttype5(doucmenttype5);
			CP.reviewperiod(reviewperiod);
			CP.timePeriod(timePeriod);
			CP.reviewExpiryAlertBefore(reviewExpiryAlertBefore);

		}
	}
}

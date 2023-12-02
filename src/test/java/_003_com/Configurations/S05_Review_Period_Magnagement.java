package _003_com.Configurations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import _001.MainPageClass.CommonMasterData;
import _001.MainPageClass.RunningClass;

public class S05_Review_Period_Magnagement extends RunningClass {
	@SuppressWarnings("deprecation")
	@Test
	public void A() throws Exception {
		CommonMasterData CP = new CommonMasterData(driver);
		for (int i = 2; i <= 2; i++) {	
			String username = xls1.getCellData("Credentials", "UserName", i);
			String password = xls1.getCellData("Credentials", "Password", i);
			Login(username, password);
			
			String department5 = xls1.getCellData("Configurations2", "department5", i);
			String doucment5 = xls1.getCellData("Configurations2", "doucment5", i);
			String doucmenttype5 = xls1.getCellData("Configurations2", "doucmenttype5 ", i);
			String reviewperiod = xls1.getCellData("Configurations2", "reviewperiod", i);
			String timePeriod = xls1.getCellData("Configurations2", "timePeriod", i);
			String reviewExpiryAlertBefore = xls1.getCellData("Configurations2", "reviewExpiryAlertBefore", i);
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

package _003_com.Configurations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import _001.MainPageClass.CommonMasterData;
import _001.MainPageClass.RunningClass;

public class S03_Document_version_management extends RunningClass {
	@Test
	public void A() throws Exception {
		CommonMasterData CP = new CommonMasterData(driver);
		for (int i = 2; i <= 2; i++) {
			String username = xls1.getCellData("Credentials", "UserName", i);
			String password = xls1.getCellData("Credentials", "Password", i);
			Login(username, password);
			String department = xls1.getCellData("Configurations2", "department", i);
			String document = xls1.getCellData("Configurations2", "document", i);
			String documentid1 = xls1.getCellData("Configurations2", "documentid1", i);
			String noofdigits = xls1.getCellData("Configurations2", "noofdigits", i);
			CP.config();
			CP.config3();
			Actions actions = new Actions(driver);
			WebElement Move = driver.findElement(By.xpath("//*[contains (text(),'Deparment')]"));
			actions.moveToElement(Move).perform();
			System.out.println("Done Mouse hover on 'PO' from DF");
			CP.create();
			CP.createvalidation();
			CP.department(department);
			CP.document(document);
			CP.documentid(documentid1);
			CP.noofdigits(noofdigits);
		}
	}
}

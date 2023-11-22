package com.Masters;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import _01.MainPageClass.CommonPageClass;
import _01.MainPageClass.RunningClass;

public class M2 extends RunningClass {
	@Test
	public void A() throws Exception {
		int RowCount = xls1.getRowCount("Initiator");
		System.out.println(RowCount);
		for (int i = 2; i <= 2; i++) {
			CommonPageClass cm = new CommonPageClass(driver);
			String userame = xls1.getCellData("Credentials", "UserName", i);
			String password = xls1.getCellData("Credentials", "Password", i);

//*************************************************************************************************************************************
			Login(userame, password);
			driver.findElement(By.xpath("//*[contains (text(),'Masters ')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[contains (text(),'Meta Fields')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[contains (text(),' Create')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@formcontrolname='documentCategory_Id']")).sendKeys("SOP");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@formcontrolname='documentTypes']")).sendKeys("Water Systems");
			Thread.sleep(1000);
			cm.Submit1();
			driver.findElement(By.xpath("//button[contains (text(),'Yes')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@formcontrolname='password']")).sendKeys("321");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[contains (text(),'Submit')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[contains (text(),'Ok')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@class='fa fa-pencil']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@formcontrolname='comments']")).sendKeys("Na");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@formcontrolname='status']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[contains (text(),'Update')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[contains (text(),'Yes')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@formcontrolname='password']")).sendKeys("321");
			Thread.sleep(1000);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[contains (text(),'Submit')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[contains (text(),'Ok')]")).click();
			Thread.sleep(1000);
		}
	}
}

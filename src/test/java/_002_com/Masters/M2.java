package _002_com.Masters;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import _001.MainPageClass.CommonPageClass;
import _001.MainPageClass.RunningClass;

public class M2 extends RunningClass {
	@Test
	public void A() throws Exception {
		int RowCount = xls1.getRowCount("Initiator");
		System.out.println(RowCount);
		for (int i = 2; i <= 2; i++) {
			CommonPageClass cm = new CommonPageClass(driver);
			String userame = xls1.getCellData("Credentials", "UserName", i);
			String password = xls1.getCellData("Credentials", "Password", i);
			String MetaFeild = xls1.getCellData("Masters", "MetaFeild", i);


//*************************************************************************************************************************************
			Login(userame, password);
			driver.findElement(By.xpath("//*[contains (text(),'Masters ')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[contains (text(),'Meta Fields')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[contains (text(),' Create')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@formcontrolname='metaField']")).sendKeys(MetaFeild);
			Thread.sleep(1000);
			cm.Submit1();
			driver.findElement(By.xpath("//button[contains (text(),'Yes')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@formcontrolname='password']")).sendKeys(password);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[contains (text(),'Submit')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[contains (text(),'Ok')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@class='fa fa-pencil']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@formcontrolname='comments']")).sendKeys(password);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@formcontrolname='status']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[contains (text(),'Update')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[contains (text(),'Yes')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@formcontrolname='password']")).sendKeys(password);
			Thread.sleep(1000);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[contains (text(),'Submit')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[contains (text(),'Ok')]")).click();
			Thread.sleep(1000);
		}
	}
}

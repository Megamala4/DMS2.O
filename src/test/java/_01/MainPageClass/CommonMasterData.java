package _01.MainPageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CommonMasterData {
	
	public WebDriver driver;

	public CommonMasterData(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "(//*[@class='navLink'])[2]")
	public WebElement config;
	public void config() throws Exception {
	config.click();
	Thread.sleep(1000);
	}

	@FindBy(how = How.XPATH, using = "//*[contains (text(),'Document Version Management')]")
	public WebElement config3 ;
	public void config3() throws Exception {
	config3.click();
	Thread.sleep(1000);
	}
	
	@FindBy(how = How.XPATH, using = "//*[contains (text(),' Create')]")
	public WebElement create;
	public void create() throws Exception {
		create.click();
	Thread.sleep(1000);
	}
	
	@FindBy(how = How.XPATH, using = "(//*[contains (text(),'Create')])[3]")
	public WebElement createvalidation;
	public void createvalidation() throws Exception {
	createvalidation.click();
	Thread.sleep(1000);
	}
	
	@FindBy(how = How.XPATH, using = "//*[@formcontrolname='departmentId']")
	public WebElement department;
	public void department(String a) throws Exception {
	department.click();
	department.sendKeys(a);
	Thread.sleep(1000);
	}
	
	@FindBy(how = How.XPATH, using = "//*[@formcontrolname='documentCategory']")
	public WebElement document;
	public void document(String a) throws Exception {
		document.click();
		document.sendKeys(a);
	Thread.sleep(1000);
	}
	
	@FindBy(how = How.XPATH, using = "//*[@formcontrolname='documentTypeId']")
	public WebElement documentid;
	public void documentid(String a) throws Exception {
		documentid.click();
		documentid.sendKeys(a);
	Thread.sleep(1000);
	}
	
	@FindBy(how = How.XPATH, using = "//*[@type='number']")
	public WebElement noofdigits;
	public void noofdigits(String a) throws Exception {
		noofdigits.click();
		noofdigits.sendKeys(a);
	Thread.sleep(1000);
	}
	
	@FindBy(how = How.XPATH, using = "//*[contains (text(),'Document No. Configuration')]")
	public WebElement doucmentnoconfig;
	public void doucmentnoconfig() throws Exception {
		doucmentnoconfig.click();
	  Thread.sleep(1000);
	}
	@FindBy(how = How.XPATH, using = "//*[@formcontrolname='documentType']")
	public WebElement documenttype;
	public void documenttype(String a) throws Exception {
	documenttype.click();
	documenttype.sendKeys(a);
	Thread.sleep(1000);
	}
	@FindBy(how = How.XPATH, using = "//*[@formcontrolname='documentNoConfiguration']")
	public WebElement documentcofigsingle;
	public void documentcofigsingle(String a) throws Exception {
		documentcofigsingle.click();
		documentcofigsingle.sendKeys(a);
	Thread.sleep(1000);
	}
	@FindBy(how = How.XPATH, using = "//*[@formcontrolname='documentNumber']")
	public WebElement doucmentnumber;
	public void doucmentnumber(String a) throws Exception {
		doucmentnumber.click();
		doucmentnumber.sendKeys(a);
	Thread.sleep(1000);
	}
	
	@FindBy(how = How.XPATH, using = "//*[@formcontrolname='versionNumber']")
	public WebElement versionNumber;
	public void versionNumber(String a) throws Exception {
		versionNumber.click();
		versionNumber.sendKeys(a);
	Thread.sleep(1000);
	}
	
	
	@FindBy(how = How.XPATH, using = "//*[contains (text(),'Review Period Management')]")
	public WebElement config5 ;
	public void config5() throws Exception {
	config5.click();
	Thread.sleep(1000);
	}

	@FindBy(how = How.XPATH, using = "//*[@formcontrolname='department']")
	public WebElement department5;
	public void department5(String a) throws Exception {
		department5.click();
		department5.sendKeys(a);
	Thread.sleep(1000);
	}
	@FindBy(how = How.XPATH, using = "//*[@formcontrolname='documentCategory_Id']")
	public WebElement doucment5;
	public void doucment5(String a) throws Exception {
		doucment5.click();
		doucment5.sendKeys(a);
	Thread.sleep(1000);
	}
	@FindBy(how = How.XPATH, using = "//*[@formcontrolname='documentType_Id']")
	public WebElement doucmenttype5;
	public void doucmenttype5(String a) throws Exception {
		doucmenttype5.click();
		doucmenttype5.sendKeys(a);
	Thread.sleep(1000);
	}
	@FindBy(how = How.XPATH, using = "//*[@formcontrolname='reviewPeriod']")
	public WebElement reviewperiod;
	public void reviewperiod(String a) throws Exception {
		reviewperiod.click();
		reviewperiod.sendKeys(a);
	Thread.sleep(1000);
	}
	@FindBy(how = How.XPATH, using = "//*[@formcontrolname='timePeriod']")
	public WebElement timePeriod;
	public void timePeriod(String a) throws Exception {
		timePeriod.click();
		timePeriod.sendKeys(a);
	Thread.sleep(1000);
	}
	@FindBy(how = How.XPATH, using = "//*[@formcontrolname='reviewExpiryAlertBefore']")
	public WebElement reviewExpiryAlertBefore;
	public void reviewExpiryAlertBefore(String a) throws Exception {
		reviewExpiryAlertBefore.click();
		reviewExpiryAlertBefore.sendKeys(a);
	Thread.sleep(1000);
	}
	

}

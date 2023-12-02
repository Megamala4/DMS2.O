package _001.MainPageClass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PomClass {
	public WebDriver driver;

	public PomClass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

//******************************************Configurations**
	@FindBy(how = How.XPATH, using = "//*[contains (text(),'Configuration ')]")
	public WebElement ConfigurationsClick;

	public void Configurations_Click() throws Exception {
		ConfigurationsClick.click();
		Thread.sleep(1000);
	}

	@FindBy(how = How.XPATH, using = "//*[contains (text(),'Document Type Field Mapping')]")
	public WebElement Document_Type_Feild_Mapping_Click;

	public void Document_Type_Feild_Mapping_Click() throws Exception {
		Thread.sleep(1000);
		Document_Type_Feild_Mapping_Click.click();
		Thread.sleep(1000);
	}

	@FindBy(how = How.XPATH, using = "//*[@formcontrolname='documentCategory_Id']")
	public WebElement DocumentCategoryId_Click;

	public void DocumentCategoryId_Click(String X) throws Exception {
		Thread.sleep(1000);
		DocumentCategoryId_Click.click();
		Thread.sleep(1000);
		DocumentCategoryId_Click.sendKeys(X, Keys.ENTER);
		Thread.sleep(1000);
	}

	@FindBy(how = How.XPATH, using = "//*[@formcontrolname='documentType_Id']")
	public WebElement DocumenType_Id;

	public void DocumenType_Id(String X) throws Exception {
		Thread.sleep(1000);
		DocumenType_Id.click();
		Thread.sleep(1000);
		DocumenType_Id.sendKeys(X);
		DocumenType_Id.sendKeys(Keys.ENTER);
//		Select s = new Select(DocumenType_Id);
//		s.selectByVisibleText(X);
//		((WebElement) s).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
	}

	@FindBy(how = How.XPATH, using = "//*[@class='fa fa-angle-right']")
	public WebElement Switch_Click;

	public void Switch_Click() throws Exception {
		Thread.sleep(1000);
		Switch_Click.click();
		Thread.sleep(1000);
	}

	@FindBy(how = How.XPATH, using = "/html/body/app-root/div/app-layout/nav/div/ul[2]/li[2]/ul/li[2]/span/a")
	public WebElement Plant_Document_Type_Mapping;

	public void Plant_Document_Type_Mapping() throws Exception {
		Thread.sleep(1000);
		Plant_Document_Type_Mapping.click();
		Thread.sleep(1000);
	}

	@FindBy(how = How.XPATH, using = "//*[@formcontrolname='departmentId']")
	public WebElement Department_Id;

	public void Department_Id(String X) throws Exception {
		Thread.sleep(1000);
		Department_Id.click();
		Thread.sleep(1000);
		Department_Id.sendKeys(X);
		Thread.sleep(1000);
	}

}

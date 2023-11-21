package _01.MainPageClass;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import fr.opensagres.poi.xwpf.converter.pdf.PdfConverter;
import fr.opensagres.poi.xwpf.converter.pdf.PdfOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RunningClass {
	public static WebDriver driver;
	protected static Properties Pro;
	public static Xls_Reader xls1 = new Xls_Reader(
			"C:\\Users\\sheshu.vunnam\\eclipse-workspace5\\DMS2.0 1\\DMS2.0\\src\\test\\resources\\Properties\\Excel\\PROJECTEXCEL.xlsx");

	@BeforeMethod(alwaysRun = true)
	public void URL_Load() throws Exception {
		Properties Pro = new Properties();
		FileInputStream ip = new FileInputStream(
				"C:\\Users\\sheshu.vunnam\\eclipse-workspace5\\DMS2.0 1\\DMS2.0\\src\\test\\resources\\Properties\\config.properties");
		Pro.load(ip);
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://172.16.5.167:8086/Home/");
		Thread.sleep(2000);
	}

	@SuppressWarnings("deprecation")
	public static void Login(String username, String password) throws Exception {

		try {
			driver.findElement(By.xpath("//button[contains (text(),'Login')]")).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//button[contains(text(),'Login')])[2]")).click();
//		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@formcontrolname='LoginId']")).sendKeys(username);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@formcontrolname='Password']")).sendKeys(password);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		Thread.sleep(1000);

		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		boolean terminate = driver.findElement(By.xpath("//*[@class='btn outLineBtn widthAuto']")).isDisplayed();
		Thread.sleep(1000);
		if (terminate) {
			driver.findElement(By.xpath("//*[contains (text(),'Terminate Other Login')]")).click();
			System.out.println(terminate);
			Thread.sleep(1000);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			Thread.sleep(1000);
		}
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[contains(text(),'Document Management System')]")).click();
		System.out.println("terminating");
		Thread.sleep(1000);
	}

	public static void CreateFun() throws Exception {

		for (int i = 2; i <= 2; i++) {
			String B = xls1.getCellData("Initiator", "Password", i);

			try {
				driver.findElement(By.xpath("(//*[contains (text(),'Yes')])[1]")).click();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				driver.findElement(By.xpath("(//*[contains (text(),'Yes')])[2]")).click();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@formcontrolname='password']")).sendKeys(B);
			Thread.sleep(1000);

			try {
				driver.findElement(By.xpath("//*[contains (text(),'Submit')]")).click();
			} catch (Exception e) {
				e.printStackTrace();
			}
			Thread.sleep(1000); // Admin
			try {
				driver.findElement(By.xpath("(//*[contains (text(),'Submit')])[2]")).click();
			} catch (Exception e) {

				e.printStackTrace();
			}
			Thread.sleep(1000);// Approver
			driver.findElement(By.xpath("//*[contains(text(),'OK') or contains(text(),'Ok')]")).click(); // ok
			Thread.sleep(1000);
		}
	}

	public static void LogOut() throws Exception

	{
		driver.findElement(By.xpath("//*[@class='avatarIcon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[contains (text(),' Quit')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[contains (text(),'Yes')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@class='avatarIcon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[contains (text(),' Logout')]")).click();
		Thread.sleep(1000);
	}

	public static void UpdateFun() throws Exception {

		for (int i = 2; i <= 2; i++) {

			String E = xls1.getCellData("Initiator", "Password", i);
			driver.findElement(By.xpath("//*[contains (text(),'Update')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@formcontrolname='comments']")).sendKeys("NA");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@type='checkbox']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[contains (text(),'Update')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//*[contains (text(),'Yes')])[2]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@formcontrolname='password']")).sendKeys(E);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[contains (text(),'Submit')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[contains (text(),'Ok')]")).click();
			Thread.sleep(1000);
		}
	}

	public static void SecondUpdateFun() throws Exception {
		for (int i = 2; i <= 2; i++) {
			String E = xls1.getCellData("Initiator", "Password", i);
			driver.findElement(By.xpath("//*[contains (text(),'Update')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@formcontrolname='comments']")).sendKeys("NA");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@type='checkbox']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[contains (text(),'Update')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//*[contains (text(),'Yes')])[2]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@formcontrolname='password']")).sendKeys("Audree@1");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[contains (text(),'Submit')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[contains (text(),'Ok')]")).click();
			Thread.sleep(1000);
		}
	}

	public static void scrollPagedown() throws Exception {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

	public static void ScrollPageStepDown() throws Exception {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,250)");
	}

	public static void ScrollPageHorizantal() throws Exception {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)");
	}

	public static void AttachFile() throws Exception {
		WebElement Color = driver.findElement(By.xpath("(//*[@type='file'])[1]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 2px solid black;');", Color);
		WebElement AttachFile = driver.findElement(By.xpath("//*[@type='file']"));
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		action.click(AttachFile).perform();
		Thread.sleep(2000);
	}

	public static void UploadFile(String path) throws Exception {
		Robot r = new Robot();
		r.delay(3000);
		StringSelection s = new StringSelection(path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		r.keyPress(KeyEvent.VK_CONTROL);// press on ctrl key
		r.keyPress(KeyEvent.VK_V);// press on ctrl key
		r.delay(3000);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.delay(3000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		r.delay(6000);
		System.out.println("uploaded Successfully");
	}

	public static void Close_Opened_File() throws Exception

	{
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parent = it.next();
		String child = it.next();
		driver.switchTo().window(child);
		driver.close();
		driver.switchTo().window(parent);
		// Test.log(Status.PASS, "userclick on Action");
		Thread.sleep(1000);
		JavascriptExecutor jj = (JavascriptExecutor) driver;
		jj.executeScript("window.scrollTo(0,1000)", "");
		Thread.sleep(1000);
	}

//	public static void DOCXToPDFConverterSampleMin() throws Exception {
//
//		String docPath = "./WordDocument.docx";
//		String pdfPath = "./WordDocument.pdf";
//
//		FileInputStream in = new FileInputStream(new File(docPath));
//		XWPFDocument document = new XWPFDocument(in);
//		PdfOptions options = PdfOptions.create();
//		OutputStream out = new FileOutputStream(new File(pdfPath));
//		PdfConverter.getInstance().convert(document, out, options);
//
//		document.close();
//		out.close();
//
//	}
	@SuppressWarnings("deprecation")
	public static void LoginFun(String username, String password) throws Exception {

		try {
			driver.findElement(By.xpath("//button[contains (text(),'Login')]")).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//button[contains(text(),'Login')])[2]")).click();
//		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@formcontrolname='LoginId']")).sendKeys(username);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@formcontrolname='Password']")).sendKeys(password);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		boolean terminate = driver.findElement(By.xpath("//*[@class='btn outLineBtn widthAuto']")).isDisplayed();
		Thread.sleep(3000);
		if (terminate) {
			driver.findElement(By.xpath("//*[contains (text(),'Terminate Other Login')]")).click();
			System.out.println(terminate);
			Thread.sleep(1000);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			Thread.sleep(1000);
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[contains(text(),'VendorPortal - HETERO LABS LTD [UNIT-V (B)]')]")).click();
		System.out.println("terminating");
		Thread.sleep(1000);
	}

	public static void ScreenShots() throws Exception {
		TakesScreenshot takeScreenShot = (TakesScreenshot) driver;
		File sourceFile = takeScreenShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("C:\\Users\\sharuk.k\\git\\VendorPortal\\VendorPortal\\ScreenShots");
		FileUtils.copyFile(sourceFile, destFile);
		System.out.print("Screenshot Saved Successfully");
	}
}

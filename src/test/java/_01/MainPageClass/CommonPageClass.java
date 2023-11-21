package _01.MainPageClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
//import javax.annotation.RegEx;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CommonPageClass {
	public WebDriver driver;

	public CommonPageClass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

//***************************************** #Region For - MultiSelect DropDown Chevron Click **********************************************

// Multi select chevron Type 1
	@FindBy(how = How.XPATH, using = "//*[@class='ng-arrow-wrapper']")
	public WebElement MultiselectChevron;

	public void MultiselectChevron() throws Exception {
		Thread.sleep(1000);
		MultiselectChevron.click();

	}
	// Multiselect chevron Type 2

	@FindBy(how = How.XPATH, using = "(//*[@class='ng-arrow-wrapper'])[2]")
	public WebElement MultiselectChevron2;

	public void MultiselectChevron2() throws Exception {
		Thread.sleep(1000);
		MultiselectChevron2.click();

	}
	// Multiselect chevron Type 1

	@FindBy(how = How.XPATH, using = "(//*[@class='ng-arrow-wrapper'])[3]")
	public WebElement MultiselectChevron3;

	public void MultiselectChevron3() throws Exception {
		Thread.sleep(1000);
		MultiselectChevron3.click();

	}
	// Multiselect chevron Type 1

	@FindBy(how = How.XPATH, using = "(//*[@class='ng-arrow-wrapper'])[4]")
	public WebElement MultiselectChevron4;

	public void MultiselectChevron4() throws Exception {
		Thread.sleep(1000);
		MultiselectChevron4.click();

	}

	// Multiselect chevron Type 1

	@FindBy(how = How.XPATH, using = "(//*[@class='ng-arrow-wrapper'])[5]")
	public WebElement MultiselectChevron5;

	public void MultiselectChevron5() throws Exception {
		Thread.sleep(1000);
		MultiselectChevron5.click();

	}
	// Multiselect chevron Type 1

	@FindBy(how = How.XPATH, using = "(//*[@class='ng-arrow-wrapper'])[6]")
	public WebElement MultiselectChevron6;

	public void MultiselectChevron6() throws Exception {
		Thread.sleep(1000);
		MultiselectChevron6.click();

	}

	// Multiselect chevron Type 1

	@FindBy(how = How.XPATH, using = "(//*[@class='ng-arrow-wrapper'])[7]")
	public WebElement MultiselectChevron7;

	public void MultiselectChevron7() throws Exception {
		Thread.sleep(1000);
		MultiselectChevron7.click();

	}

//*********************************//Multiselect Chevron second//************************************************************

	@FindBy(how = How.XPATH, using = "//*[@class='dropdown-multiselect__caret']")
	public WebElement MultiselectChevronSecondType;

	public void MultiselectChevronSecondType() throws Exception {
		Thread.sleep(1000);
		MultiselectChevronSecondType.click();

	}

//*********************************//Multiselect  Chevron Third Type\\*************************************************************

	@FindBy(how = How.XPATH, using = "(//*[@class='fa fa-angle-down float-right'])[1]")
	public WebElement ChevronClicking1;

	public void ChevronClicking1() throws Exception {
		ChevronClicking1.click();
		Thread.sleep(1000);

	}

	@FindBy(how = How.XPATH, using = "(//*[@class='fa fa-angle-down float-right'])[2]")
	public WebElement ChevronClicking2;

	public void ChevronClicking2() throws Exception {
		ChevronClicking2.click();
		Thread.sleep(1000);

	}

	@FindBy(how = How.XPATH, using = "(//*[@class='fa fa-angle-down float-right'])[3]")
	public WebElement ChevronClicking3;

	public void ChevronClicking3() throws Exception {
		ChevronClicking3.click();
		Thread.sleep(1000);

	}

	@FindBy(how = How.XPATH, using = "(//*[@class='fa fa-angle-down float-right'])[4]")
	public WebElement ChevronClicking4;

	public void ChevronClicking4() throws Exception {
		ChevronClicking4.click();
		Thread.sleep(1000);

	}

	@FindBy(how = How.XPATH, using = "(//*[@class='fa fa-angle-down float-right'])[5]")
	public WebElement ChevronClicking5;

	public void ChevronClicking5() throws Exception {
		ChevronClicking5.click();
		Thread.sleep(1000);

	}

	@FindBy(how = How.XPATH, using = "(//*[@class='fa fa-angle-down float-right'])[6]")
	public WebElement ChevronClicking6;

	public void ChevronClicking6() throws Exception {
		ChevronClicking6.click();
		Thread.sleep(1000);

	}

	@FindBy(how = How.XPATH, using = "(//*[@class='fa fa-angle-down float-right'])[7]")
	public WebElement ChevronClicking7;

	public void ChevronClicking7() throws Exception {
		ChevronClicking7.click();
		Thread.sleep(1000);

	}

	@FindBy(how = How.XPATH, using = "(//*[@class='fa fa-angle-down float-right'])[8]")
	public WebElement ChevronClicking8;

	public void ChevronClicking8() throws Exception {
		ChevronClicking8.click();
		Thread.sleep(1000);

	}

	@FindBy(how = How.XPATH, using = "(//*[@class='fa fa-angle-down float-right'])[9]")
	public WebElement ChevronClicking9;

	public void ChevronClicking9() throws Exception {
		ChevronClicking9.click();
		Thread.sleep(1000);

	}

	@FindBy(how = How.XPATH, using = "(//*[@class='fa fa-angle-down float-right'])[10]")
	public WebElement ChevronClicking10;

	public void ChevronClicking10() throws Exception {
		ChevronClicking10.click();
		Thread.sleep(1000);
	}

	@FindBy(how = How.XPATH, using = "(//*[@class='fa fa-angle-down float-right'])[11]")
	public WebElement ChevronClicking11;

	public void ChevronClicking11() throws Exception {
		ChevronClicking11.click();
		Thread.sleep(1000);

	}

	@FindBy(how = How.XPATH, using = "(//*[@class='fa fa-angle-down float-right'])[12]")
	public WebElement ChevronClicking12;

	public void ChevronClicking12() throws Exception {
		ChevronClicking12.click();
		Thread.sleep(1000);

	}

	@FindBy(how = How.XPATH, using = "(//*[@class='fa fa-angle-down float-right'])[13]")
	public WebElement ChevronClicking13;

	public void ChevronClicking13() throws Exception {
		ChevronClicking13.click();
		Thread.sleep(1000);

	}

	@FindBy(how = How.XPATH, using = "(//*[@class='fa fa-angle-down float-right'])[14]")
	public WebElement ChevronClicking14;

	public void ChevronClicking14() throws Exception {
		ChevronClicking14.click();
		Thread.sleep(1000);

	}

	@FindBy(how = How.XPATH, using = "(//*[@class='fa fa-angle-down float-right'])[15]")
	public WebElement ChevronClicking15;

	public void ChevronClicking15() throws Exception {
		ChevronClicking15.click();
		Thread.sleep(1000);

	}
//********************************************  #endregion  ********************************************************************

//***************************************** #Region For - Check Boxs **************************************************************

//radio button - 1
	@FindBy(how = How.XPATH, using = "(//*[@type='checkbox'])[1]")
	public WebElement RadioButton1;

	public void CheckBox1() throws Exception {
		RadioButton1.click();
	}

//radio button - 2

	@FindBy(how = How.XPATH, using = "(//*[@type='checkbox'])[2]")
	public WebElement RadioButton2;

	public void CheckBox2() throws Exception {
		RadioButton2.click();
	}

//radio button - 3

	@FindBy(how = How.XPATH, using = "(//*[@type='checkbox'])[3]")
	public WebElement RadioButton3;

	public void CheckBox3() throws Exception {
		RadioButton3.click();
	}

//radio button - 4
	@FindBy(how = How.XPATH, using = "(//*[@type='checkbox'])[4]")
	public WebElement RadioButton4;

	public void CheckBox4() throws Exception {
		RadioButton4.click();
	}

//**************************************** #endregion For - Radio Buttons *************************************************************

//***************************************** #Region For - ADD Buttons *****************************************************************

//Add button - 1
	@FindBy(how = How.XPATH, using = "(//*[contains(text(),' Add')])[1]")
	public WebElement AddButton1;

	public void AddButton1() throws Exception {
		Thread.sleep(1000);
		AddButton1.click();
	}

//Add button - 2

	@FindBy(how = How.XPATH, using = "(//*[contains(text(),' Add')])[2]")
	public WebElement AddButton2;

	public void AddButton2() throws Exception {
		AddButton2.click();
		Thread.sleep(1000);
	}

//Add button - 3

	@FindBy(how = How.XPATH, using = "(//*[contains(text(),' Add')])[3]")
	public WebElement AddButton3;

	public void AddButton3() throws Exception {
		AddButton3.click();
	}

//Add button - 4
	@FindBy(how = How.XPATH, using = "(//*[contains(text(),' Add')])[4]")
	public WebElement AddButton4;

	public void AddButton4() throws Exception {
		AddButton4.click();
	}

//Add button - 5
	@FindBy(how = How.XPATH, using = "(//*[contains(text(),' Add')])[5]")
	public WebElement AddButton5;

	public void AddButton5() throws Exception {
		AddButton5.click();
	}

	// Add button - 10
	@FindBy(how = How.XPATH, using = "(//*[contains(text(),' Add')])[10]")
	public WebElement AddButton10;

	public void AddButton10() throws Exception {
		AddButton10.click();
	}

// Add button - 11

	@FindBy(how = How.XPATH, using = "(//*[contains(text(),' Add')])[11]")
	public WebElement AddButton11;

	public void AddButton11() throws Exception {
		AddButton11.click();
	}

//ADD Button Another Type

	@FindBy(how = How.XPATH, using = "/html/body/app-root/div/div/app-manual-vendor-registration/section/div/div[2]/div/form[1]/div[3]/div/div/div[2]/div[9]/button")
	public WebElement AddButton01;

	public void AddButton01() throws Exception {
		Thread.sleep(1000);
		AddButton01.click();
	}

//**************************************** #endregion For - ADD Buttons **************************************************************

//**************************************** #region For - Eye Buttons *****************************************************************

//Fafa EYE Button Type	

	@FindBy(how = How.XPATH, using = "//*[@class='fa fa-eye view-icon']")
	public WebElement EyeButtonclick1;

	public void EyeButtonclick1() throws Exception {
		EyeButtonclick1.click();

	}

//**************************************************************************************************************************************

// Fafa EYE Button Second Type

	@FindBy(how = How.XPATH, using = "(//*[@class='fa fa-eye'])[1]")
	public WebElement EyeButtonclicks1;

	public void EyeButtonclicks1() throws Exception {
		EyeButtonclicks1.click();
		Thread.sleep(1000);

	}

// Fafa EYE Button Type

	@FindBy(how = How.XPATH, using = "(//*[@class='fa fa-eye'])[2]")
	public WebElement EyeButtonclicks2;

	public void EyeButtonclicks2() throws Exception {
		EyeButtonclicks1.click();

	}

	// Fafa EYE Button Type

	@FindBy(how = How.XPATH, using = "(//*[@class='fa fa-eye'])[3]")
	public WebElement EyeButtonclicks3;

	public void EyeButtonclicks3() throws Exception {
		EyeButtonclicks3.click();

	}

	// Fafa EYE Button Type

	@FindBy(how = How.XPATH, using = "(//*[@class='fa fa-eye'])[4]")
	public WebElement EyeButtonclics4;

	public void EyeButtonclics4() throws Exception {
		EyeButtonclics4.click();

	}

	// Fafa EYE Button Type

	@FindBy(how = How.XPATH, using = "(//*[@class='fa fa-eye'])[5]")
	public WebElement EyeButtonclick5;

	public void EyeButtonclick5() throws Exception {
		EyeButtonclick5.click();

	}

//**************************************** #endregion For - Eye Buttons *****************************************************************

//**************************************** #region For - Removing Buttons ***************************************************************

//Remove Button Type-1

	@FindBy(how = How.XPATH, using = "//*[@class='fa fa-minus-circle']")
	public WebElement RemovingRecord;

	public void RemovingRecord() throws Exception {
		RemovingRecord.click();
	}

	// Remove Button Type-2

	@FindBy(how = How.XPATH, using = "//*[@class='fa fa-close view-icon-red']")
	public WebElement RemovingRecord2;

	public void RemovingRecord2() throws Exception {
		RemovingRecord2.click();
	}

//Eye-Close Button-1

	@FindBy(how = How.XPATH, using = "//*[@class='close']")
	public WebElement CloseRecord;

	public void CloseRecord() throws Exception {
		Thread.sleep(1000);
		CloseRecord.click();
		Thread.sleep(1000);
	}

//**************************************** #endregion For - Removing Buttons *****************************************

//**************************************** #region For - YES Buttons *****************************************

//YES Button  - 1
	@FindBy(how = How.XPATH, using = "(//*[contains(text(),'Yes')])[1]")
	public WebElement YesButton1;

	public void YesButton1() throws Exception {
		YesButton1.click();
		Thread.sleep(1000);
	}

//YES Button  - 2
	@FindBy(how = How.XPATH, using = "(//*[contains(text(),'Yes')])[2]")
	public WebElement YesButton2;

	public void YesButton2() throws Exception {
		YesButton1.click();
	}

//YES Button  - 3

	@FindBy(how = How.XPATH, using = "(//*[contains(text(),'Yes')])[3]")
	public WebElement YesButton3;

	public void YesButton3() throws Exception {
		YesButton3.click();
	}

//**************************************** #endregion For - Yes Buttons *****************************************

//**************************************** #region For - No Buttons *****************************************

//No Button  - 1
	@FindBy(how = How.XPATH, using = "(//*[contains(text(),'No')])[1]")
	public WebElement NoButton1;

	public void NoButton1() throws Exception {
		NoButton1.click();
	}

//No Button  - 2
	@FindBy(how = How.XPATH, using = "(//*[contains(text(),'No')])[2]")
	public WebElement NoButton2;

	public void NoButton2() throws Exception {
		NoButton1.click();
	}

//No Button  - 3

	@FindBy(how = How.XPATH, using = "(//*[contains(text(),'No')])[3]")
	public WebElement NoButton3;

	public void NoButton3() throws Exception {
		NoButton3.click();
	}

//No Button  - 4

	@FindBy(how = How.XPATH, using = "(//*[contains(text(),'No')])[4]")
	public WebElement NoButton4;

	public void NoButton4() throws Exception {
		NoButton4.click();
	}

//No Button 7

	@FindBy(how = How.XPATH, using = "(//*[contains(text(),'No')])[7]")
	public WebElement NoButton7;

	public void NoButton7() throws Exception {
		NoButton7.click();
	}

//**************************************** #endregion For - No Buttons *****************************************

//**************************************** #region For - Ok Buttons *****************************************

// No Button - 1
	@FindBy(how = How.XPATH, using = "(//*[contains(text(),'Ok')])[1]")
	public WebElement OkButton1;

	public void OkButton1() throws Exception {
		OkButton1.click();
	}

// Ok Button - 2
	@FindBy(how = How.XPATH, using = "(//*[contains(text(),'Ok')])[1]")
	public WebElement OkButton2;

	public void OkButton2() throws Exception {
		OkButton1.click();
	}

// Ok Button - 3

	@FindBy(how = How.XPATH, using = "(//*[contains(text(),'Ok')])[3]")
	public WebElement OkButton3;

	public void OkButton3() throws Exception {
		OkButton3.click();
	}
// ****************************************// #endregion For - Ok Buttons //*********************************************************

//*****************************************// #region for Comments //****************************************************************

	@FindBy(how = How.XPATH, using = "//*[@formcontrolname='comments']")
	public WebElement Comments;

	public void Comments(String x) throws Exception {
		// Comments.sendKeys(x);
		Comments.clear();
		Comments.sendKeys(x);
	}
//***********************************// comment Section //***************************************************************

	@FindBy(how = How.XPATH, using = "//*[@class='fa fa-commenting']")
	public WebElement CommentsSection;

	public void CommentsSection() throws Exception {
//	public void CommentView() throws Exception {

		CommentsSection.click();
		Thread.sleep(1000);
	}
//CommentSection Remove	

	@FindBy(how = How.XPATH, using = "//*[@class='fa fa-times float-right mt-1 linkIcon']")
	public WebElement CommentsSectionRemove;

	public void CommentsSectionRemove() throws Exception {
		CommentsSectionRemove.click();
		Thread.sleep(2000);
	}

//***********************************// #endregion comment Section //******************************************************************************

//***********************************// #Create Function //******************************************************************************
	// Create Button - 1

	@FindBy(how = How.XPATH, using = "(//*[contains(text(),'Create')])[1]")
	public WebElement Create1;

	public void Create1() throws Exception {
		Create1.click();
		Thread.sleep(2000);
	}

//***********************************// #End region Create Function //******************************************************************************

//***********************************// Submit Button //********************************************************************************

//Submit Button - 1	

	@FindBy(how = How.XPATH, using = "(//*[contains(text(),'Submit')])[1]")
	public WebElement Submit1;

	public void Submit1() throws Exception {
		Submit1.click();
		Thread.sleep(2000);
	}

// Submit Button - 2

	@FindBy(how = How.XPATH, using = "(//*[contains(text(),'Submit')])[2]")
	public WebElement Submit2;

	public void Submit2() throws Exception {
		Submit2.click();
	}

// Submit Button - 3

	@FindBy(how = How.XPATH, using = "(//*[contains(text(),'Submit')])[3]")
	public WebElement Submit3;

	public void Submit3() throws Exception {
		Submit3.click();
	}

// Submit Button - 4

	@FindBy(how = How.XPATH, using = "(//*[contains(text(),'Submit')])[4]")
	public WebElement Submit4;

	public void Submit4() throws Exception {
		Submit4.click();
	}

//***********************************#endregion Submit Button //*************************************************************************************

//***********************************# Return Button //*************************************************************************************

	// Return Button - 1

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Return')]")
	public WebElement Return;

	public void Return() throws Exception {
		Return.click();
	}
//***********************************// #region for Edit Buttons //***************************************************************

	// Edit Button - 1

	@FindBy(how = How.XPATH, using = "(//*[@class='fa fa-pencil'])[1]")
	public WebElement Edit1;

	public void Edit1() throws Exception {
		Edit1.click();
		Thread.sleep(1000);
	}

	// Edit Button - 2

	@FindBy(how = How.XPATH, using = "(//*[@class='fa fa-pencil'])[2]")
	public WebElement Edit2;

	public void Edit2() throws Exception {
		Edit2.click();
		Thread.sleep(2000);
	}

	// Edit Button - 3

	@FindBy(how = How.XPATH, using = "(//*[@class='fa fa-pencil'])[3]")
	public WebElement Edit3;

	public void Edit3() throws Exception {
		Edit3.click();
	}

	// Edit Button - 4

	@FindBy(how = How.XPATH, using = "(//*[@class='fa fa-pencil'])[4]")
	public WebElement Edit4;

	public void Edit4() throws Exception {
		Edit4.click();
	}

//***********************************// #region for Submit Buttons //***************************************************************

//***********************************// #region for Approve , Re-Submit , Reject Buttons //***************************************************************

// Approve Button - 1

	@FindBy(how = How.XPATH, using = "(//*[contains(text(),'Approve')])[1]")
	public WebElement Approve;

	public void Approve() throws Exception {
		Approve.click();
	}

	// Approve Button - 2

	@FindBy(how = How.XPATH, using = "(//*[contains(text(),'Approve')])[2]")
	public WebElement Approve2;

	public void Approve2() throws Exception {
		Approve2.click();
	}

	// Approve Button - 3

	@FindBy(how = How.XPATH, using = "(//*[contains(text(),'Approve')])[3]")
	public WebElement Approve3;

	public void Approve3() throws Exception {
		Approve3.click();
	}

	// Approve Button - 4

	@FindBy(how = How.XPATH, using = "(//*[contains(text(),'Approve')])[4]")
	public WebElement Approve4;

	public void Approve4() throws Exception {
		Approve4.click();
	}

	// Approve Button - 5

	@FindBy(how = How.XPATH, using = "(//*[contains(text(),'Approve')])[5]")
	public WebElement Approve5;

	public void Approve5() throws Exception {
		Approve5.click();
	}

	// Approve Button - 6

	@FindBy(how = How.XPATH, using = "(//*[contains(text(),'Approve')])[6]")
	public WebElement Approve6;

	public void Approve6() throws Exception {
		Approve6.click();
	}
	// Approve Button - 7

	@FindBy(how = How.XPATH, using = "(//*[contains(text(),'Approve')])[7]")
	public WebElement Approve7;

	public void Approve7() throws Exception {
		Approve7.click();
	}
	// Approve Button - 9

	@FindBy(how = How.XPATH, using = "(//*[contains(text(),'Approve')])[9]")
	public WebElement Approve9;

	public void Approve9() throws Exception {
		Approve9.click();
	}
//**********************************************************************************************************************************************

// Re-Submit Button - 2

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Re-Submit ')]")
	public WebElement Resubmit;

	public void Resubmit() throws Exception {
		Resubmit.click();
	}

	// Reject Button - 1

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Reject')]")
	public WebElement Reject;

	public void Reject() throws Exception {
		Reject.click();
		Thread.sleep(1000);
	}

//***********************************// #endregion for Approve , Re-Submit , Reject Buttons //***************************************************************

// Reject Button - 1

	@FindBy(how = How.XPATH, using = "//*[@formcontrolname='password']")
	public WebElement Password;

	public void Password(String x) throws Exception {
		Password.sendKeys(x);
		Password.clear();
		Password.sendKeys(x);
		Thread.sleep(2000);
	}
//***********************************// #region for Export Excel Button //***************************************************************

// Export Excel Button

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Export Excel')]")
	public WebElement ExportExcelButton;

	public void ExportExcelButton() throws Exception {
		ExportExcelButton.click();
		Thread.sleep(1000);
	}

//***********************************// #region for Export Excel Button //***************************************************************

//***********************************// #region for Place Holder  //***************************************************************

// Export Excel Button

	@FindBy(how = How.XPATH, using = "//*[@placeholder='Search']")
	public WebElement PlaceHolder;

	public void PlaceHolder(String x) throws Exception {
		PlaceHolder.sendKeys(x, Keys.ENTER);
		Thread.sleep(1000);
	}

// ***********************************// #region for Export Excel//// Button*************************************

// ***********************************// #region for Text Boxes*************************************************

	@FindBy(how = How.XPATH, using = "(//*[@type='text'])[1]")
	public WebElement TextBox;

	public void TextBox(String x) throws Exception {
		TextBox.click();
		TextBox.sendKeys(x);
		Thread.sleep(1000);
	}

	@FindBy(how = How.XPATH, using = "(//*[@type='text'])[2]")
	public WebElement TextBox2;

	public void TextBox2() throws Exception {
		TextBox2.click();
		Thread.sleep(1000);
	}

	@FindBy(how = How.XPATH, using = "(//*[@type='text'])[3]")
	public WebElement TextBox3;

	public void TextBox3() throws Exception {
		TextBox3.click();
		Thread.sleep(1000);
	}

	@FindBy(how = How.XPATH, using = "(//*[@type='text'])[4]")
	public WebElement TextBox4;

	public void TextBox4() throws Exception {
		TextBox4.click();
		Thread.sleep(1000);
	}

	@FindBy(how = How.XPATH, using = "(//*[@type='text'])[5]")
	public WebElement TextBox5;

	public void TextBox5() throws Exception {
		TextBox5.click();
		Thread.sleep(1000);
	}

	@FindBy(how = How.XPATH, using = "(//*[@type='text'])[6]")
	public WebElement TextBox6;

	public void TextBox6() throws Exception {
		TextBox6.click();
		Thread.sleep(1000);
	}

	@FindBy(how = How.XPATH, using = "(//*[@type='text'])[7]")
	public WebElement TextBox7;

	public void TextBox7() throws Exception {
		TextBox7.click();
		Thread.sleep(1000);
	}

	@FindBy(how = How.XPATH, using = "(//*[@type='text'])[8]")
	public WebElement TextBox8;

	public void TextBox8(String x) throws Exception {
		TextBox8.sendKeys(x);
		Thread.sleep(1000);
	}

	@FindBy(how = How.XPATH, using = "(//*[@type='text'])[9]")
	public WebElement TextBox9;

	public void TextBox9() throws Exception {
		TextBox9.click();
		Thread.sleep(1000);
	}

	@FindBy(how = How.XPATH, using = "(//*[@type='text'])[10]")
	public WebElement TextBox10;

	public void TextBox10() throws Exception {
		TextBox10.click();
		Thread.sleep(1000);
	}

	@FindBy(how = How.XPATH, using = "(//*[@type='text'])[11]")
	public WebElement TextBox11;

	public void TextBox11() throws Exception {
		TextBox11.click();
		Thread.sleep(1000);
	}

// ***********************************// #End-region for Text Boxes**********************************************

//***********************************//Vendor Registration Feilds***************************************************************

	@FindBy(how = How.XPATH, using = "//*[@class='div-box mt-3']")

	public WebElement openRfqs;

	public void openRfqs() throws Exception {

		openRfqs.click();

		Thread.sleep(1000);

	}

	@FindBy(how = How.XPATH, using = "//*[@class='btn btn-primary xsBtn']")

	public WebElement Actionbutton;

	public void Actionbutton() throws Exception {

		Actionbutton.click();

		Thread.sleep(1000);

	}

	@FindBy(how = How.XPATH, using = "(//*[@type='checkbox'])[2]")

	public WebElement selectbox;

	public void selectbox() throws Exception {

		selectbox.click();

		Thread.sleep(1000);

	}

	@FindBy(how = How.XPATH, using = "//*[@type='date']")

	public WebElement date;

	public void date(String b) throws Exception {

		date.sendKeys(b);

		Thread.sleep(1000);

	}

	@FindBy(how = How.XPATH, using = "(//*[@type='text'])[4]")

	public WebElement QP;

	public void QP(String a) throws Exception {

		QP.sendKeys(a);
		Thread.sleep(1000);
		System.out.print("Quoted Price  -" + QP.getAttribute("text"));

	}

	@FindBy(how = How.XPATH, using = "(//*[@type='text'])[5]")

	public WebElement DP;

	public void DP(String a) throws Exception {

		DP.sendKeys(a);

		Thread.sleep(1000);

	}

	@FindBy(how = How.XPATH, using = "(//*[@type='text'])[6]")

	public WebElement packing;

	public void packing(String a) throws Exception {

		packing.sendKeys(a);

		Thread.sleep(1000);

	}

	@FindBy(how = How.XPATH, using = "(//*[@type='text'])[7]")

	public WebElement freightvalue;

	public void freightvalue(String a) throws Exception {

		freightvalue.sendKeys(a);

		Thread.sleep(1000);

	}

	@FindBy(how = How.XPATH, using = "(//*[@type='text'])[10]")

	public WebElement warranty;

	public void warranty(String a) throws Exception {

		warranty.sendKeys(a);

		Thread.sleep(1000);

	}

	@FindBy(how = How.XPATH, using = "(//*[@class='form-group w150'])[2]")

	public WebElement paymentterms;

	public void paymentterms(String a) throws Exception {

		// Processtype.click();

		Select s = new Select(paymentterms);

		s.selectByVisibleText(a);

		Thread.sleep(500);

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		// Processtype.click();

	}

}

package _003_com.Configurations;
import org.testng.annotations.Test;

import _001.MainPageClass.CommonPageClass;
import _001.MainPageClass.PomClass;
import _001.MainPageClass.RunningClass;

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
			String selectDocCategory = xls1.getCellData("Configurations", "Select Doc Category", i);
			String selectDocType = xls1.getCellData("Configurations", "SelectDoc Type", i);
//************************************************************************************************************************************			
			Login(userame, password);
			pm.Configurations_Click();
			pm.Document_Type_Feild_Mapping_Click();
			pm.Configurations_Click();
			pm.DocumentCategoryId_Click(selectDocCategory);Thread.sleep(2000);
			pm.DocumenType_Id(selectDocType);
			cm.CheckBox1();
			cm.CheckBox2();
			pm.Switch_Click();
			//cm.Submit1(); 
			CreateFun();
		}
	}
}
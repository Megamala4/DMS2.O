package _01_DMS_PositiveFlow_Phase_1A;

import org.testng.annotations.Test;

import _001.MainPageClass.CommonPageClass;
import _001.MainPageClass.RunningClass;

public class S01_RqstForNewDoc_Initiator_Submit extends RunningClass {
	@Test
	public void A() throws Exception {
		int RowCount = xls1.getRowCount("Configurations");
		System.out.println(RowCount);
		for (int i = 2; i <= 2; i++) {
//*************************************************************************************************************************************	
			CommonPageClass cm = new CommonPageClass(driver);
			
		}
	}
}
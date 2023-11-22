package com.Transcations;

import org.testng.annotations.Test;

import _01.MainPageClass.CommonPageClass;
import _01.MainPageClass.RunningClass;

public class S01_Acknowledgment_for_Distributed_Document extends RunningClass {
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
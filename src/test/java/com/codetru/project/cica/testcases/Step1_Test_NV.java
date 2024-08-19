package com.codetru.project.cica.testcases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.codetru.common.BaseTest;
import com.codetru.constants.FrameworkConstants;
import com.codetru.helpers.ExcelHelpers;

public class Step1_Test_NV extends BaseTest {
	
//	 @Test
//	 @Parameters("statex")
	@Test

    public void TC_Product_Information() throws Exception {
        ExcelHelpers excel = new ExcelHelpers();
        excel.setExcelFile(FrameworkConstants.EXCEL_CMS_LOGIN, "Login");
//        getLoginPageCMS().loginSuccessWithCustomerAccount(excel.getCellData(4, "email"), excel.getCellData(4, "password"));
//        getHomePage().Open_Application_Module();
        getStep_1Page_NV().Product_Information();
    }
}

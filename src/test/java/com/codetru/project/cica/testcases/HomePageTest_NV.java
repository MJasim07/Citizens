package com.codetru.project.cica.testcases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.codetru.common.BaseTest;
import com.codetru.constants.FrameworkConstants;
import com.codetru.helpers.ExcelHelpers;

public class HomePageTest_NV extends BaseTest {

	 /*	
	 @Test
    public void TC_Open_Application_Module() throws Exception {
        ExcelHelpers excel = new ExcelHelpers();
        excel.setExcelFile(FrameworkConstants.EXCEL_CMS_LOGIN, "Login");
        getLoginPageCMS().loginSuccessWithCustomerAccount(excel.getCellData(4, "email"), excel.getCellData(4, "password"));
        getHomePage().Open_Application_Module();
    }
*/	
	
	 @Parameters({"USERID", "PASSWORD"})
	 @Test
	 public void TC_Open_Application_Module(String userName, String pwd) throws Exception {
//		 ExcelHelpers excel = new ExcelHelpers();
//		 excel.setExcelFile(FrameworkConstants.EXCEL_CMS_LOGIN, "Login");
         getLoginPage().loginSuccessWithCustomerAccount(userName, pwd);
		 getHomePage_NV().Open_Application_Module();
	 }
	 
}

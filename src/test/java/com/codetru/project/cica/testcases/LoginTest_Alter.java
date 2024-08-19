package com.codetru.project.cica.testcases;
 
import com.codetru.common.BaseTest;

 
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
 
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
 
@Epic("Regression Test CMS")
@Feature("Login Test")
public class LoginTest_Alter extends BaseTest {
 
 
	@Parameters({"USERID", "PASSWORD"})
    @Test(priority = 1)
    public void TC_LoginSuccessWithCustomerAccount(String userName, String pwd) {
        com.codetru.helpers.ExcelHelpers excel = new com.codetru.helpers.ExcelHelpers();
//        excel.setExcelFile(FrameworkConstants.EXCEL_CMS_LOGIN, "Login");
//        getLoginPage().loginSuccessWithCustomerAccount(excel.getCellData(4, "email"), excel.getCellData(4, "password"));
        getLoginPage().loginSuccessWithCustomerAccount(userName, pwd);
    }
 
 
}
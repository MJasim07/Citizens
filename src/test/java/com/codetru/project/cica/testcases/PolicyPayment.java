package com.codetru.project.cica.testcases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.codetru.common.BaseTest;

public class PolicyPayment extends BaseTest {

	@Parameters({ "USERID", "PASSWORD" })
	@Test
	public void TC_policypayment_module(String userName, String pwd) throws Exception {
		// ExcelHelpers excel = new ExcelHelpers();
		// excel.setExcelFile(FrameworkConstants.EXCEL_CMS_LOGIN, "Login");
		
		getLoginPage().loginSuccessWithCustomerAccount(userName, pwd);
		getHomePage().Open_PolicyPayment_Module();
		getPolicyPaymentModule().Make_a_Payment();
		
		// getCostumer_Module().costumer_module();
	}
}

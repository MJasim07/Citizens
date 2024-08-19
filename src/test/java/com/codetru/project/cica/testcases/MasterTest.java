package com.codetru.project.cica.testcases;

import java.util.List;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.codetru.common.BaseTest;
import com.codetru.constants.FrameworkConstants;
import com.codetru.driver.DriverManager;
import com.codetru.helpers.ExcelHelpers;
import com.codetru.keywords.WebUI;
import com.codetru.pages.NoValidation.HomePage_NV;
import com.codetru.project.cica.CommonPageCICA;
import com.codetru.project.cica.pages.HomePage;
import com.codetru.project.cica.testcases.HomePageTest;
import com.codetru.project.cica.testcases.Step1_Test;

public class MasterTest extends BaseTest {

	@Parameters({ "USERID", "PASSWORD" })
	@Test
	public void stateSelection(String USERID, String PASSWORD) throws Exception {

		ExcelHelpers excel = new ExcelHelpers();
		excel.setExcelFile(FrameworkConstants.EXCEL_CMS_LOGIN, "Login");

		List<String> stateList = HomePage_NV.licenseStateTexts;

		
		for (int i = 1; i < stateList.size(); i++) {
//        getLoginPageCMS().loginSuccessWithCustomerAccount(excel.getCellData(4, "email"), excel.getCellData(4, "password"));
//        getLoginPage().loginSuccessWithCustomerAccount(USERID, PASSWORD);
//        getHomePage().Open_Application_Module();

			WebUI.switchToMainWindow();
//			getHomePage().logout();
//			getLoginPage().login_WithoutPageLoading(USERID, PASSWORD);
			WebUI.logInfoMessage("********** Login ID: " +USERID+ " for State: "+stateList.get(i) +" **********"  );
			getHomePage().HomePageNewApplication();
			getStep_1Page_NV().Product_Information(stateList.get(i));
			getStep_2Page_NV().Proposed_Insured_Information();
			getStep_3Page_NV().Policy_Owner_Information();
			getStep_4Page_NV().Beneficiary_Information();
			getStep_5Page_NV().Existing_Insurance();
			getStep_6Page_NV().Predetermination_Questions();
			getStep_7PageHIPAA_NV().HIPAA_Voice_Authorization();
			getStep_7Page_NV().Remarks();
			getStep_8Page_NV().Disclosure_and_Signature();
			getStep_9Page_NV().Edit_Submit();
			
			if(i % 2 != 0)
			{
				getStep_10PageACH().Make_a_Payment();
			}
			else
			{
				getStep_10Page_NV().Make_a_Payment();
			}

		}
	}

}

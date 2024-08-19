package com.codetru.project.cica.testcases;

import org.testng.annotations.Test;

import com.codetru.common.BaseTest;
import com.codetru.constants.FrameworkConstants;
import com.codetru.helpers.ExcelHelpers;

public class Step8_Test extends BaseTest {
	
	 @Test
    public void TC_Disclosure_and_Signature() throws Exception {
        ExcelHelpers excel = new ExcelHelpers();
        excel.setExcelFile(FrameworkConstants.EXCEL_CMS_LOGIN, "Login");
//        getLoginPageCMS().loginSuccessWithCustomerAccount(excel.getCellData(4, "email"), excel.getCellData(4, "password"));
//        getHomePage().Open_Application_Module();
//        getStep_1Page().Product_Information();
//        getStep_2Page().Proposed_Insured_Information();
//        getStep_3Page().Policy_Owner_Information();
//        getStep_4Page().Beneficiary_Information();
//        getStep_5Page().Existing_Insurance();
//        getStep_6Page().Predetermination_Questions();
//        getStep_7Page().Remarks();
          getStep_8Page().Disclosure_and_Signature();
        
        
        
    }
}

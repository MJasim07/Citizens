package com.codetru.project.cica.pages;

import static com.codetru.keywords.WebUI.getAttributeElement;
import static com.codetru.keywords.WebUI.getTextElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.codetru.driver.DriverManager;
import com.codetru.helpers.PropertiesHelpers;
import com.codetru.keywords.WebUI;
import com.codetru.project.cica.CommonPageCICA;
import com.codetru.utils.DataGenerateUtils;

public class Step_3Page extends CommonPageCICA {
	
	private By policyOwnerInformation_step3 = By.xpath("(//h3[normalize-space()='Policy Owner Information'])[2]");
//	private By NextStep3 = By.xpath("(//ion-button[normalize-space()='Next Step'])[3]");
	private By NextStep3 = By.xpath("//h3[.='Policy Owner Information']/parent::div/following-sibling::ion-row/ion-col[@size='24' and @size-md='6']/ion-button");
	private By step3_Yes = By.xpath("//ion-item/ion-label[.='Yes']/following-sibling::ion-radio[@role='radio']");
	private By step3_No = By.xpath("//ion-item/ion-label[.='No']/following-sibling::ion-radio[@role='radio']");
	private By Error_ProposedOwner_Message = By.xpath("//form[@class='ng-untouched ng-pristine ng-invalid']//div[@class='block-info-app']");
	private By BenificiaryFirstname = By.xpath("//ion-input[@formcontrolname='BeneficiaryFirstName']/input");
	
	private By OwnerFirstName = By.xpath("//ion-input[@formcontrolname='OwnerFirstName']/input");
	private By OwnerMiddleName = By.xpath("//ion-input[@formcontrolname='OwnerMiddleName']/input");
	private By OwnerLastName = By.xpath("//ion-input[@formcontrolname='OwnerLastName']/input");
	private By OwnerEmail = By.xpath("//ion-input[@formcontrolname='OwnerEmail']/input");
	private By OwnerPhone = By.xpath("//ion-input[@formcontrolname='OwnerPhone']/input");
	private By OwnerSSN_RadioButton = By.xpath("(//ion-radio[@value='true'])[3]");
	private By OwnerEIN_RadioButton = By.xpath("(//ion-radio[@value='false'])[3]");
	private By OwnerSSN = By.xpath("//ion-input[@formcontrolname='OwnerSSN']/input");
	private By OwnerAge = By.xpath("//ion-input[@formcontrolname='OwnerAge']/input");
	private By OwnerRelationship = By.xpath("//select[@formcontrolname='OwnerRelation']");
	private By OwnerRelationshipsList = By.xpath("//select[@formcontrolname='OwnerRelation']/option");
	private By OwnerAddress1 = By.xpath("//ion-input[@formcontrolname='OwnerAddress1']/input");
	private By OwnerAddress2 = By.xpath("//ion-input[@formcontrolname='OwnerAddress2']/input");
	private By OwnerZipCode = By.xpath("//ion-input[@formcontrolname='OwnerZipCode']/input");
	private By OwnerCity = By.xpath("//select[@formcontrolname='OwnerCity']");
	private By OwnerCityList = By.xpath("//select[@formcontrolname='OwnerCity']/option");
	private By Owner_FistNameErrorMsg = By.xpath("(//ion-col[@size='24' and @size-md='10'])[2]");
	private By Owner_MiddleNameErrorMsg = By.xpath("(//ion-col[@size='24' and @size-md='4'])[1]");
	private By Owner_LastNameErrorMsg = By.xpath("(//ion-col[@size='24' and @size-md='10'])[3]");
	private By Owner_EmailErrorMsg = By.xpath("(//ion-col[@size='24' and @size-md='8'])[6]");
	private By Owner_PhoneErrorMsg = By.xpath("(//ion-col[@size='24' and @size-md='8'])[7]");
	private By Error_SSN_EIN_Message = By.xpath("(//ion-col[@class = 'md hydrated' and @size-md = '6'])[5]");
	private By Owner_AgeErrorMsg = By.xpath("(//ion-col[@size='24' and @size-md='4'])[2]");
	private By Owner_RelationErrorMsg = By.xpath("(//ion-col[@size='24' and @size-md='8'])[8]");
	private By Owner_Address1ErrorMsg = By.xpath("(//ion-col[@size='24' and @size-md='24'])[4]");
	private By Owner_Address2ErrorMsg = By.xpath("(//ion-col[@size='24' and @size-md='24'])[5]");
	private By ZipCode_SearchButton = By.xpath("(//ion-button[@title='Search'])[2]");
	private By ZipCode_SearchButton_Error = By.xpath("//ion-col[@class='md hydrated']//p[normalize-space()='Please enter a valid Zip Code.']");
	private By ZipCode_Error_Message = By.xpath("(//ion-col[@class = 'md hydrated' and @size-md = '7'])[4]");
	private By Owner_CityErrorMsg = By.xpath("(//ion-col[@size='24' and @size-md='10'])[4]");
	private By Owner_StateErrorMsg = By.xpath("(//ion-col[@size='24' and @size-md='10'])[5]");
	private By tableOfContents = By.xpath("(//ion-button[normalize-space()='Table of Contents'])[3]");
	private By backToList = By.xpath("(//ion-button[normalize-space()='Back to List'])[3]");
	private By step_4 = By.xpath("//h3[contains(text(), 'Step 4 of')]");
	
	//Payor Information
	private By payorFirstName = By.xpath("//ion-input[@formcontrolname='PayorFirstName']/input");
	private By payorMiddleName = By.xpath("//ion-input[@formcontrolname='PayorMiddleName']/input");
	private By payorLastName = By.xpath("//ion-input[@formcontrolname='PayorLastName']/input");
	private By payorEmail = By.xpath("//ion-input[@formcontrolname='PayorEmail']/input");
	private By payorPhone = By.xpath("//ion-input[@formcontrolname='PayorPhone']/input");
	private By payorSSN_RadioButton = By.xpath("//ion-radio-group[@formcontrolname='IsSSNPayor']/descendant::ion-label[text()='SSN']/following-sibling::ion-radio");
	private By payorEIN_RadioButton = By.xpath("//ion-radio-group[@formcontrolname='IsSSNPayor']/descendant::ion-label[text()='EIN']/following-sibling::ion-radio");
	private By payorSSN = By.xpath("//ion-input[@formcontrolname='PayorSSN']/input");
	private By payorAge = By.xpath("//ion-input[@formcontrolname='PayorAge']/input");
	private By payorRelationship = By.xpath("//select[@formcontrolname='PayorRelation']");
	private By payorRelationshipsList = By.xpath("//select[@formcontrolname='PayorRelation']/option");
	private By payorAddress1 = By.xpath("//ion-input[@formcontrolname='PayorAddress1']/input");
	private By payorAddress2 = By.xpath("//ion-input[@formcontrolname='PayorAddress2']/input");
	private By payorCity = By.xpath("//ion-input[@formcontrolname='PayorCity']/input");
	private By payorState = By.xpath("//select[@formcontrolname='PayorState']");
	private By payorZipCode = By.xpath("//ion-input[@formcontrolname='PayorZipCode']/input");
	private By payor_FistNameErrorMsg = By.xpath("//ion-input[@formcontrolname='PayorFirstName']/parent::ion-item/parent::ion-col");
	private By payor_MiddleNameErrorMsg = By.xpath("//ion-input[@formcontrolname='PayorMiddleName']/parent::ion-item/parent::ion-col");
	private By payor_LastNameErrorMsg = By.xpath("//ion-input[@formcontrolname='PayorLastName']/parent::ion-item/parent::ion-col");
	private By payor_EmailErrorMsg = By.xpath("//ion-input[@formcontrolname='PayorEmail']/parent::ion-item/parent::ion-col");
	private By payor_PhoneErrorMsg = By.xpath("//ion-input[@formcontrolname='PayorPhone']/parent::ion-item/parent::ion-col");
	private By payor_Error_SSN_EIN_Message = By.xpath("//ion-input[@formcontrolname='PayorSSN']/parent::ion-item/parent::ion-col");
	private By payor_AgeErrorMsg = By.xpath("//ion-input[@formcontrolname='PayorAge']/parent::ion-item/parent::ion-col");
	private By payor_RelationErrorMsg = By.xpath("//select[@formcontrolname='PayorRelation']/parent::ion-item/parent::ion-col");
	private By payor_Address1ErrorMsg = By.xpath("//ion-input[@formcontrolname='PayorAddress1']/parent::ion-item/parent::ion-col");
	private By payor_Address2ErrorMsg = By.xpath("//ion-input[@formcontrolname='PayorAddress2']/parent::ion-item/parent::ion-col");
	private By payor_CityErrorMsg = By.xpath("//ion-input[@formcontrolname='PayorCity']/parent::ion-item/parent::ion-col");
	private By payor_StateErrorMsg = By.xpath("//select[@formcontrolname='PayorState']/parent::ion-item/parent::ion-col");
	private By payor_ZipCode_Error_Message = By.xpath("//ion-input[@formcontrolname='PayorZipCode']/parent::ion-item/parent::ion-col");
	
	
	public void Policy_Owner_Information() throws Exception {
		
		String Mandatory_Error = "Please enter a value.";
		String Max_Error = "The maximum number of characters is 33.";
		String Max_Char = "qwertyuiopqwertyuiopqwertyuiopqwertyu";
		String Page_Error_ = "There are some errors on this page. Please correct before continuing.";
		String Add_Max = "280 SIERRA DR. APT. B407 1142 SW ARLINGTON BLVD 1142 SW ARLINGTON BLVD";
		String incorrect_Email_Error = "Email is not in the correct format";
		String Email_Max = "destinysdfghdfghdfsgdsfgsdfgdfghdfghdsfghjdsfghdfghdfghfghqwertyuiop";
		String email_Max_error ="The maximum number of characters is 50";
		String phoneMin_error = "The minimum number of characters is 10.";
		String phoneMax_error = "The maximum number of characters is 10.";
		String Ssn_error = "SSN should have exactly 9 digits.";
		String Ein_error = "EIN should have exactly 9 digits.";
		String Ssn_Invalid = "Invalid SSN.";
		String Ein_Invalid = "Invalid EIN format.";
		String Ssn_error_1 = "First 3 digits of SSN should not be 000, 666 or between 900 and 999.";
		String Chars_only = "abcdefghijklmnopqrstuvwxyz";
		String Ssn_Num_Error = "Please use a number format.";
		String age_Max_Error = "The maximum amount is 121.";
		String Min_error_Zp ="The minimum number of characters is 5.";
		String Max_error_Zp ="The maximum number of characters is 5.";
		String zipCode_SearchButtonError = "Please enter a valid Zip Code.";
		
		WebUI.sleep(2);
//		WebUI.verifyElementVisible(policyOwnerInformation_step3);
		WebUI.verifyElementVisible(step3_Yes);
		WebUI.verifyElementVisible(step3_No);
		
//		C.Mandate_Click(driver, NextStep3, e, Test.Case3(9), Test.Exp3(9));
		WebUI.clickElement(NextStep3);
		WebUI.sleep(0.5);

//		C.Empty_Input(driver, Error_ProposedOWner_Message, Mandatory_Error, e, Test.Case3(8), Test.Exp3(8));
		WebUI.verifyContains(getTextElement(Error_ProposedOwner_Message), Mandatory_Error);
		WebUI.sleep(1);
	
//		C.C2(driver, step3_Yes, step3_No, e, Test.Case3(1), Test.Exp3(1));
		WebUI.verifyElementClickable(step3_Yes);
		WebUI.clickElement(step3_Yes);
		WebUI.sleep(0.5);
		WebUI.verifyElementClickable(step3_No);
		WebUI.clickElement(step3_No);
		WebUI.sleep(0.5);
		
		WebUI.clickElement(step3_Yes);
		WebUI.sleep(0.5);
		WebUI.verifyElementVisible(OwnerFirstName);
		WebUI.verifyElementVisible(OwnerMiddleName);
		WebUI.verifyElementVisible(OwnerLastName);
		WebUI.verifyElementVisible(OwnerEmail);
		WebUI.verifyElementVisible(OwnerPhone);
		WebUI.sleep(1);
		
		WebUI.verifyContains(getTextElement(Owner_FistNameErrorMsg), Mandatory_Error);

		WebUI.sleep(0.5);
		WebUI.clearText(OwnerFirstName);
		WebUI.setText(OwnerFirstName, Max_Char);
		WebUI.sleep(0.5);
		WebUI.verifyElementVisible(Owner_FistNameErrorMsg);	
		WebUI.verifyContains(getTextElement(Owner_FistNameErrorMsg), Max_Error);
		
		String FirstName = DataGenerateUtils.randomFirstName();
		WebUI.clearAndFillText(OwnerFirstName, FirstName);
		WebUI.sleep(0.5);
		WebUI.verifyContains(getAttributeElement(OwnerFirstName,"value"), FirstName);
		
		WebUI.clearText(OwnerMiddleName);
		WebUI.setText(OwnerMiddleName, Max_Char);
		WebUI.verifyElementVisible(Owner_MiddleNameErrorMsg);
		WebUI.verifyContains(getTextElement(Owner_MiddleNameErrorMsg), Max_Error);
		

		String MiddleName = DataGenerateUtils.randomMiddleName();
		WebUI.clearAndFillText(OwnerMiddleName, MiddleName);
		WebUI.sleep(0.5);
		WebUI.verifyContains(getAttributeElement(OwnerMiddleName,"value"), MiddleName);

		WebUI.verifyContains(getTextElement(Owner_LastNameErrorMsg), Mandatory_Error);

		WebUI.clearText(OwnerLastName);
		WebUI.setText(OwnerLastName, Max_Char);
		WebUI.verifyElementVisible(Owner_LastNameErrorMsg);
		WebUI.verifyContains(getTextElement(Owner_LastNameErrorMsg), Max_Error);

		String randomLastName = DataGenerateUtils.randomLastName();
		WebUI.clearAndFillText(OwnerLastName, randomLastName);
		WebUI.sleep(0.5);
		WebUI.verifyContains(getAttributeElement(OwnerLastName,"value"), randomLastName);
		
		WebUI.verifyContains(getTextElement(Owner_EmailErrorMsg), Mandatory_Error);
		
		WebUI.clearText(OwnerEmail);
		WebUI.setText(OwnerEmail, "destiny001");
		WebUI.verifyElementVisible(Owner_EmailErrorMsg);
		WebUI.verifyContains(getTextElement(Owner_EmailErrorMsg), incorrect_Email_Error);

		WebUI.clearText(OwnerEmail);
		WebUI.setText(OwnerEmail, Email_Max);
		WebUI.verifyElementVisible(Owner_EmailErrorMsg);
		WebUI.verifyContains(getTextElement(Owner_EmailErrorMsg).trim(), email_Max_error);

		String randomEmailAddress = DataGenerateUtils.randomEmail();
		WebUI.clearAndFillText(OwnerEmail,randomEmailAddress);
		WebUI.sleep(0.2);
		WebUI.verifyContains(getAttributeElement(OwnerEmail,"value"),randomEmailAddress);
		
		WebUI.clearAndFillText(OwnerPhone, "789456");
		WebUI.sleep(0.2);
		WebUI.verifyElementVisible(Owner_PhoneErrorMsg);
		WebUI.verifyContains(WebUI.getTextElement(Owner_PhoneErrorMsg), phoneMin_error);
		WebUI.sleep(0.2);
		WebUI.clearAndFillText(OwnerPhone, "258014736999");
		WebUI.sleep(0.2);
		WebUI.verifyElementVisible(Owner_PhoneErrorMsg);
		WebUI.verifyContains(WebUI.getTextElement(Owner_PhoneErrorMsg), phoneMax_error);
		
		WebUI.clearAndFillText(OwnerPhone, PropertiesHelpers.getValue("benif_phone"));
		WebUI.sleep(0.2);
		
//		C.Empty_Input(driver, ErrorSSN_NumberMessage, Ssn_error, e, Test.Case2(8), Test.Exp2(8));
		WebUI.verifyContains(getTextElement(Error_SSN_EIN_Message), Mandatory_Error);
		WebUI.verifyContains(getTextElement(Error_SSN_EIN_Message), Ssn_error);

		//TC_128
		WebUI.clickElement(OwnerEIN_RadioButton);
		WebUI.sleep(0.2);
		//TC_131
		WebUI.verifyContains(getTextElement(Error_SSN_EIN_Message), Ein_error);
		WebUI.clickElement(OwnerSSN_RadioButton);
		WebUI.sleep(0.2);
		

//		C.Max_Char(driver, SSN_Number, ErrorSSN_NumberMessage, "25478451", Ssn_error, e,Test.Case2(6), Test.Exp2(6));
		WebUI.clearText(OwnerSSN);
		WebUI.setText(OwnerSSN, "25478451");
		WebUI.verifyElementVisible(Error_SSN_EIN_Message);
		WebUI.verifyContains(getTextElement(Error_SSN_EIN_Message).trim(), Ssn_error);
		
//		C.Max_Char(driver, SSN_Number, ErrorSSN_NumberMessage, "25478451123", Ssn_error, e,Test.Case2(7), Test.Exp2(7));
		WebUI.clearText(OwnerSSN);
		WebUI.setText(OwnerSSN, "111111111");
		WebUI.verifyElementVisible(Error_SSN_EIN_Message);
		WebUI.verifyContains(getTextElement(Error_SSN_EIN_Message).trim(), Ssn_Invalid);

		WebUI.clearText(OwnerSSN);
		WebUI.setText(OwnerSSN, "000000000");
		WebUI.verifyElementVisible(Error_SSN_EIN_Message);
		WebUI.verifyContains(getTextElement(Error_SSN_EIN_Message).trim(), Ssn_error_1);
		
//		Verify the field should not accept alphabets
		WebUI.clearText(OwnerSSN);
		WebUI.setText(OwnerSSN, "asasa");
		WebUI.verifyContains(getTextElement(Error_SSN_EIN_Message), Ssn_error_1);
		
		
//		^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^EIN Field Validation^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
		WebUI.clickElement(OwnerEIN_RadioButton);
		WebUI.sleep(0.2);
		
//		C.Max_Char(driver, SSN_Number, ErrorSSN_NumberMessage, "abcdefghijklmnopqrstuvwxyz", "Must be a number", e,
//		Test.Case2(4), Test.Exp2(4));
		WebUI.clearText(OwnerSSN);
		WebUI.setText(OwnerSSN, Chars_only);
		WebUI.verifyElementVisible(Error_SSN_EIN_Message);
		WebUI.verifyContains(getTextElement(Error_SSN_EIN_Message), Ein_Invalid);

//		C.Max_Char(driver, SSN_Number, ErrorSSN_NumberMessage, "25478451", Ssn_error, e,Test.Case2(6), Test.Exp2(6));
		WebUI.clearText(OwnerSSN);
		WebUI.setText(OwnerSSN, "25478451");
		WebUI.verifyElementVisible(Error_SSN_EIN_Message);
		WebUI.verifyContains(getTextElement(Error_SSN_EIN_Message), Ein_error);
		
//		C.Max_Char(driver, SSN_Number, ErrorSSN_NumberMessage, "25478451123", Ssn_error, e,Test.Case2(7), Test.Exp2(7));
		WebUI.clearText(OwnerSSN);
		WebUI.setText(OwnerSSN, "000000000");
		WebUI.verifyElementVisible(Error_SSN_EIN_Message);
		WebUI.verifyContains(getTextElement(Error_SSN_EIN_Message), Ein_Invalid);

//		C.Max_Char(driver, SSN_Number, ErrorSSN_NumberMessage, "1234asasa", Ssn_error1, e,Test.Case2(5), Test.Exp2(5));
		WebUI.clearText(OwnerSSN);
		WebUI.setText(OwnerSSN, "asasa");
		WebUI.verifyElementVisible(Error_SSN_EIN_Message);
		WebUI.verifyContains(getTextElement(Error_SSN_EIN_Message), Ein_Invalid);		

//		C.Send_verify_Valid_C(driver, SSN_Number, e, "254798741", Test.Case2(3), Test.Exp2(3));
		String RandomEINNumber = DataGenerateUtils.randomValidITIN();
		WebUI.clearAndFillText(OwnerSSN,RandomEINNumber);
		WebUI.sleep(0.5);
		WebUI.verifyContains(getAttributeElement(OwnerSSN,"value"),RandomEINNumber);
//		^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
		
		WebUI.clickElement(OwnerSSN_RadioButton);
		WebUI.sleep(0.2);
//		C.Send_verify_Valid_C(driver, SSN_Number, e, "254798741", Test.Case2(3), Test.Exp2(3));
		String RandomSSNNumber = DataGenerateUtils.randomValidSSN();
		WebUI.clearAndFillText(OwnerSSN,RandomSSNNumber);
		WebUI.sleep(0.5);
		WebUI.verifyContains(getAttributeElement(OwnerSSN,"value"),RandomSSNNumber);
		
//	====================================================================================================================================
//	====================================================================================================================================
		
		//Age Field Validation
		WebUI.scrollToElementAtBottom(NextStep3);
		WebUI.sleep(0.2);
		WebUI.clickElement(NextStep3);
		WebUI.scrollToElementAtTop(OwnerSSN);
		WebUI.sleep(0.2);
		WebUI.verifyContains(getTextElement(Owner_AgeErrorMsg), Mandatory_Error);
		
		WebUI.clearText(OwnerAge);
		WebUI.setText(OwnerAge, "asdfghjkl");
		WebUI.verifyElementVisible(Owner_AgeErrorMsg);
		WebUI.verifyContains(getTextElement(Owner_AgeErrorMsg), Mandatory_Error);
		
		WebUI.clearText(OwnerAge);
		WebUI.setText(OwnerAge, "122");
		WebUI.verifyElementVisible(Owner_AgeErrorMsg);
		WebUI.verifyContains(getTextElement(Owner_AgeErrorMsg), age_Max_Error);
		
		WebUI.clearText(OwnerAge);
		WebUI.setText(OwnerAge, "65");
		WebUI.verifyContains(getAttributeElement(OwnerAge,"value"), "65");
		
		//Relationship Field Validation
		WebUI.verifyContains(getTextElement(Owner_RelationErrorMsg), Mandatory_Error);
		
		List<String> relationships = WebUI.getElementTextsInList(OwnerRelationshipsList);
		for(int i=1; i<relationships.size(); i++ )
		{	
			WebUI.selectOptionByIndex(OwnerRelationship, i);
			WebUI.sleep(0.4);
		}
		
		WebUI.sleep(0.2);
		WebUI.clickElement(OwnerRelationship);
		WebUI.setText(OwnerRelationship, "p", Keys.ENTER);
		
		//Address 1 Field Validation
		WebUI.scrollToElementAtBottom(OwnerZipCode);
		WebUI.verifyContains(getTextElement(Owner_Address1ErrorMsg), Mandatory_Error);
		
		WebUI.clearText(OwnerAddress1);
		WebUI.setText(OwnerAddress1, Add_Max);
		WebUI.sleep(0.2);
		WebUI.verifyElementVisible(Owner_Address1ErrorMsg);
		WebUI.verifyContains(getTextElement(Owner_Address1ErrorMsg).trim(), Max_Error);
		
		String RandomAddress = DataGenerateUtils.randomShortAddress();
		WebUI.clearAndFillText(OwnerAddress1,RandomAddress);
		WebUI.sleep(0.2);
		WebUI.verifyContains(getAttributeElement(OwnerAddress1,"value"),RandomAddress);
		
		//Address 2 Field Validation
		WebUI.clearText(OwnerAddress2);
		WebUI.setText(OwnerAddress2, Add_Max);
		WebUI.sleep(0.2);
		WebUI.verifyElementVisible(Owner_Address2ErrorMsg);
		WebUI.verifyContains(getTextElement(Owner_Address2ErrorMsg).trim(), Max_Error);
		
		String RandomAddress2 = DataGenerateUtils.randomShortAddress();
		WebUI.clearAndFillText(OwnerAddress2,RandomAddress2);
		WebUI.sleep(0.2);
		WebUI.verifyContains(getAttributeElement(OwnerAddress2,"value"),RandomAddress2);
		

		WebUI.scrollToElementAtBottom(NextStep3);
		WebUI.sleep(0.2);
		
		//Zip code Field Validation
		WebUI.verifyContains(getTextElement(ZipCode_Error_Message), Mandatory_Error);

//		C.Max_Char(driver, ZipCode, Error_ZipCode_Message,"1234",Min_error_Zp,e, Test.Case2(24),Test.Exp2(24));
		WebUI.clearText(OwnerZipCode);
		WebUI.setText(OwnerZipCode, "1234");
		WebUI.verifyElementVisible(ZipCode_Error_Message);
		WebUI.verifyContains(getTextElement(ZipCode_Error_Message), Min_error_Zp);

//		C.Max_Char(driver, ZipCode, Error_ZipCode_Message,"123456",Max_error_Zp,e, Test.Case2(25),Test.Exp2(25));
		WebUI.clearText(OwnerZipCode);
		WebUI.setText(OwnerZipCode, "123456");
		WebUI.verifyElementVisible(ZipCode_Error_Message);
		WebUI.verifyContains(getTextElement(ZipCode_Error_Message), Max_error_Zp);
		
		//TC_154
		WebUI.clearText(OwnerZipCode);
		WebUI.moveToElement(ZipCode_SearchButton);
		WebUI.clickElement(ZipCode_SearchButton);
		WebUI.verifyElementVisible(ZipCode_SearchButton_Error);
		WebUI.verifyContains(getTextElement(ZipCode_SearchButton_Error), zipCode_SearchButtonError);

		WebUI.verifyContains(getTextElement(Owner_CityErrorMsg), Mandatory_Error);
		WebUI.verifyContains(getTextElement(Owner_StateErrorMsg), Mandatory_Error);
		
//		C.Send_verify_Valid_C(driver, ZipCode, e, "67801", Test.Case2(23),Test.Exp2(23));
		WebUI.clearAndFillText(OwnerZipCode, PropertiesHelpers.getValue("zip_Code"));
		WebUI.sleep(0.2);
		WebUI.verifyContains(getAttributeElement(OwnerZipCode, "value"), PropertiesHelpers.getValue("zip_Code"));

//		C.Mandate_Click1(driver, act, Proposed_ZipCode, e, Test.Case2(26),Test.Exp2(26));
		WebUI.moveToElement(ZipCode_SearchButton);
		WebUI.clickElement(ZipCode_SearchButton);
		WebUI.sleep(2);
		
		WebUI.verifyContains(getTextElement(Owner_CityErrorMsg), Mandatory_Error);
		
		List<String> cities = WebUI.getElementTextsInList(OwnerCityList);
		for(int i=1; i<cities.size(); i++)
		{	
			WebUI.selectOptionByIndex(OwnerCity, i);
			WebUI.sleep(1);
		}
		WebUI.clickElement(OwnerCity);
		WebUI.setText(OwnerCity, "d", Keys.ENTER);
		WebUI.sleep(1);
		
//		================================= Policy Payor Information =============================================================================
		try {

			WebElement policyPayor_Yes = DriverManager.getDriver().findElement(By.xpath("//h3[.='Policy Payor Information']/parent::div/descendant::ion-label[.='Yes']/following-sibling::ion-radio"));
			WebElement policyPayor_No = DriverManager.getDriver().findElement(By.xpath("//h3[.='Policy Payor Information']/parent::div/descendant::ion-label[.='No']/following-sibling::ion-radio"));
			policyPayor_No.click();
			WebUI.sleep(0.5);
			policyPayor_Yes.click();
			WebUI.sleep(1);
			
			WebUI.verifyElementVisible(payorFirstName);
			WebUI.verifyElementVisible(payorMiddleName);
			WebUI.verifyElementVisible(payorLastName);
			WebUI.verifyElementVisible(payorEmail);
			WebUI.verifyElementVisible(payorPhone);
			WebUI.sleep(1);
			
			WebUI.verifyContains(getTextElement(payor_FistNameErrorMsg), Mandatory_Error);

			WebUI.sleep(0.5);
			WebUI.clearText(payorFirstName);
			WebUI.setText(payorFirstName, Max_Char);
			WebUI.sleep(0.5);
			WebUI.verifyElementVisible(payor_FistNameErrorMsg);	
			WebUI.verifyContains(getTextElement(payor_FistNameErrorMsg), Max_Error);
			
			String payor_FirstName = DataGenerateUtils.randomFirstName();
			WebUI.clearAndFillText(payorFirstName, payor_FirstName);
			WebUI.sleep(0.5);
			WebUI.verifyContains(getAttributeElement(payorFirstName,"value"), payor_FirstName);
			
			WebUI.clearText(payorMiddleName);
			WebUI.setText(payorMiddleName, Max_Char);
			WebUI.verifyElementVisible(payor_MiddleNameErrorMsg);
			WebUI.verifyContains(getTextElement(payor_MiddleNameErrorMsg), Max_Error);
			

			String payor_MiddleName = DataGenerateUtils.randomMiddleName();
			WebUI.clearAndFillText(payorMiddleName, payor_MiddleName);
			WebUI.sleep(0.5);
			WebUI.verifyContains(getAttributeElement(payorMiddleName,"value"), payor_MiddleName);

			WebUI.verifyContains(getTextElement(payor_LastNameErrorMsg), Mandatory_Error);

			WebUI.clearText(payorLastName);
			WebUI.setText(payorLastName, Max_Char);
			WebUI.verifyElementVisible(payor_LastNameErrorMsg);
			WebUI.verifyContains(getTextElement(payor_LastNameErrorMsg), Max_Error);

			String payor_LastName = DataGenerateUtils.randomLastName();
			WebUI.clearAndFillText(payorLastName, payor_LastName);
			WebUI.sleep(0.5);
			WebUI.verifyContains(getAttributeElement(payorLastName,"value"), payor_LastName);
			
			WebUI.verifyContains(getTextElement(payor_EmailErrorMsg), Mandatory_Error);
			
			WebUI.clearText(payorEmail);
			WebUI.setText(payorEmail, "destiny001");
			WebUI.verifyElementVisible(payor_EmailErrorMsg);
			WebUI.verifyContains(getTextElement(payor_EmailErrorMsg), incorrect_Email_Error);

			WebUI.clearText(payorEmail);
			WebUI.setText(payorEmail, Email_Max);
			WebUI.verifyElementVisible(payor_EmailErrorMsg);
			WebUI.verifyContains(getTextElement(payor_EmailErrorMsg).trim(), email_Max_error);

			String payor_EmailAddress = DataGenerateUtils.randomEmail();
			WebUI.clearAndFillText(payorEmail,payor_EmailAddress);
			WebUI.sleep(0.2);
			WebUI.verifyContains(getAttributeElement(payorEmail,"value"),payor_EmailAddress);
			
			WebUI.clearAndFillText(payorPhone, "789456");
			WebUI.sleep(0.2);
			WebUI.verifyElementVisible(payor_PhoneErrorMsg);
			WebUI.verifyContains(WebUI.getTextElement(payor_PhoneErrorMsg), phoneMin_error);
			WebUI.sleep(0.2);
			WebUI.clearAndFillText(payorPhone, "258014736999");
			WebUI.sleep(0.2);
			WebUI.verifyElementVisible(payor_PhoneErrorMsg);
			WebUI.verifyContains(WebUI.getTextElement(payor_PhoneErrorMsg), phoneMax_error);
			
			WebUI.clearAndFillText(payorPhone, PropertiesHelpers.getValue("benif_phone"));
			WebUI.sleep(0.2);
			
			WebUI.verifyContains(getTextElement(payor_Error_SSN_EIN_Message), Mandatory_Error);
			WebUI.verifyContains(getTextElement(payor_Error_SSN_EIN_Message), Ssn_error);

			WebUI.clickElement(payorEIN_RadioButton);
			WebUI.sleep(0.2);
			
			WebUI.verifyContains(getTextElement(payor_Error_SSN_EIN_Message), Ein_error);
			WebUI.clickElement(payorSSN_RadioButton);
			WebUI.sleep(0.2);
			
			WebUI.clearText(payorSSN);
			WebUI.setText(payorSSN, "25478451");
			WebUI.verifyElementVisible(payor_Error_SSN_EIN_Message);
			WebUI.verifyContains(getTextElement(payor_Error_SSN_EIN_Message), Ssn_error);
			
			WebUI.clearText(payorSSN);
			WebUI.setText(payorSSN, "111111111");
			WebUI.verifyElementVisible(payor_Error_SSN_EIN_Message);
			WebUI.verifyContains(getTextElement(payor_Error_SSN_EIN_Message), Ssn_Invalid);

			WebUI.clearText(payorSSN);
			WebUI.setText(payorSSN, "000000000");
			WebUI.verifyElementVisible(payor_Error_SSN_EIN_Message);
			WebUI.verifyContains(getTextElement(payor_Error_SSN_EIN_Message), Ssn_error_1);
			
			WebUI.clearText(payorSSN);
			WebUI.setText(payorSSN, "asasa");
			WebUI.verifyContains(getTextElement(payor_Error_SSN_EIN_Message), Ssn_error_1);
			
			
			WebUI.clickElement(payorEIN_RadioButton);
			WebUI.sleep(0.2);
			
			WebUI.clearText(payorSSN);
			WebUI.setText(payorSSN, Chars_only);
			WebUI.verifyElementVisible(payor_Error_SSN_EIN_Message);
			WebUI.verifyContains(getTextElement(payor_Error_SSN_EIN_Message), Ein_Invalid);

			WebUI.clearText(payorSSN);
			WebUI.setText(payorSSN, "25478451");
			WebUI.verifyElementVisible(payor_Error_SSN_EIN_Message);
			WebUI.verifyContains(getTextElement(payor_Error_SSN_EIN_Message), Ein_error);
			
			WebUI.clearText(payorSSN);
			WebUI.setText(payorSSN, "000000000");
			WebUI.verifyElementVisible(payor_Error_SSN_EIN_Message);
			WebUI.verifyContains(getTextElement(payor_Error_SSN_EIN_Message), Ein_Invalid);

			WebUI.clearText(payorSSN);
			WebUI.setText(payorSSN, "asasa");
			WebUI.verifyElementVisible(payor_Error_SSN_EIN_Message);
			WebUI.verifyContains(getTextElement(payor_Error_SSN_EIN_Message), Ein_Invalid);		

			String payor_EINNumber = DataGenerateUtils.randomValidITIN();
			WebUI.clearAndFillText(payorSSN,payor_EINNumber);
			WebUI.sleep(0.5);
			WebUI.verifyContains(getAttributeElement(payorSSN,"value"),payor_EINNumber);
			
			WebUI.clickElement(payorSSN_RadioButton);
			WebUI.sleep(0.2);
			
			String payor_SSNNumber = DataGenerateUtils.randomValidSSN();
			WebUI.clearAndFillText(payorSSN,payor_SSNNumber);
			WebUI.sleep(0.5);
			WebUI.verifyContains(getAttributeElement(payorSSN,"value"),payor_SSNNumber);
			
			WebUI.scrollToElementAtBottom(NextStep3);
			WebUI.sleep(0.2);
			WebUI.clickElement(NextStep3);
			WebUI.scrollToElementAtTop(payorSSN);
			WebUI.sleep(0.2);
			WebUI.verifyContains(getTextElement(payor_AgeErrorMsg), Mandatory_Error);
			
			WebUI.clearText(payorAge);
			WebUI.setText(payorAge, "122");
			WebUI.verifyElementVisible(payor_AgeErrorMsg);
			WebUI.verifyContains(getTextElement(payor_AgeErrorMsg), age_Max_Error);
			
			WebUI.clearText(payorAge);
			WebUI.setText(payorAge, "65");
			WebUI.verifyContains(getAttributeElement(payorAge,"value"), "65");
			
			//Relationship Field Validation
			WebUI.verifyContains(getTextElement(payor_RelationErrorMsg), Mandatory_Error);
			
			List<String> payor_relationships = WebUI.getElementTextsInList(OwnerRelationshipsList);
			for(int i=1; i<payor_relationships.size(); i++ )
			{	
				WebUI.selectOptionByIndex(OwnerRelationship, i);
				WebUI.sleep(0.4);
			}
			
			WebUI.sleep(0.2);
			WebUI.clickElement(payorRelationship);
			WebUI.setText(payorRelationship, "p", Keys.ENTER);
			
			//Address 1 Field Validation
			WebUI.scrollToElementAtBottom(payorZipCode);
			WebUI.verifyContains(getTextElement(payor_Address1ErrorMsg), Mandatory_Error);
			
			WebUI.clearText(payorAddress1);
			WebUI.setText(payorAddress1, Add_Max);
			WebUI.sleep(0.2);
			WebUI.verifyElementVisible(payor_Address1ErrorMsg);
			WebUI.verifyContains(getTextElement(payor_Address1ErrorMsg), Max_Error);
			
			String payor_Address = DataGenerateUtils.randomShortAddress();
			WebUI.clearAndFillText(payorAddress1,payor_Address);
			WebUI.sleep(0.2);
			WebUI.verifyContains(getAttributeElement(payorAddress1,"value"),payor_Address);
			
			//Address 2 Field Validation
			WebUI.clearText(payorAddress2);
			WebUI.setText(payorAddress2, Add_Max);
			WebUI.sleep(0.2);
			WebUI.verifyElementVisible(payor_Address2ErrorMsg);
			WebUI.verifyContains(getTextElement(payor_Address2ErrorMsg), Max_Error);
			
			String payor_Address2 = DataGenerateUtils.randomShortAddress();
			WebUI.clearAndFillText(payorAddress2,payor_Address2);
			WebUI.sleep(0.2);
			WebUI.verifyContains(getAttributeElement(payorAddress2,"value"),payor_Address2);
			
			WebUI.scrollToElementAtBottom(NextStep3);
			WebUI.sleep(0.2);
			
			//Payor City Validation
			WebUI.verifyContains(getTextElement(payor_CityErrorMsg), Mandatory_Error);
			
			WebUI.clearText(payorCity);
			WebUI.setText(payorCity, Add_Max);
			WebUI.sleep(0.2);
			WebUI.verifyElementVisible(payor_CityErrorMsg);
			WebUI.verifyContains(getTextElement(payor_CityErrorMsg), Max_Error);
			
//			String payor_City = DataGenerateUtils.randomShortAddress();
			WebUI.clearAndFillText(payorCity,"Allgood");
			WebUI.sleep(0.2);
			WebUI.verifyContains(getAttributeElement(payorCity,"value"),"Allgood");
			
			WebUI.sleep(0.2);
			WebUI.verifyContains(getTextElement(payor_StateErrorMsg), Mandatory_Error);
			
			WebUI.clickElement(payorState);
			WebUI.sleep(0.5);
			WebUI.selectOptionByValue(payorState, "AL");
			WebUI.sleep(0.5);
			
			WebUI.verifyContains(getTextElement(payor_ZipCode_Error_Message), Mandatory_Error);
			
			WebUI.clearText(payorZipCode);
			WebUI.setText(payorZipCode, "3456");
			WebUI.verifyElementVisible(payor_ZipCode_Error_Message);
			WebUI.verifyContains(getTextElement(payor_ZipCode_Error_Message), Min_error_Zp);

			WebUI.clearText(payorZipCode);
			WebUI.setText(payorZipCode, "345678");
			WebUI.verifyElementVisible(payor_ZipCode_Error_Message);
			WebUI.verifyContains(getTextElement(payor_ZipCode_Error_Message), Max_error_Zp);
			
			WebUI.clearAndFillText(payorZipCode,"35013");
			WebUI.sleep(0.2);
			WebUI.verifyContains(getAttributeElement(payorZipCode,"value"),"35013");
			

		} catch (Exception ex) {
			
			System.out.println("Policy Payor Information Not Available. " + ex.getMessage());
		}
		
		WebUI.scrollToElementAtBottom(NextStep3);
		WebUI.sleep(0.2);
		WebUI.verifyElementClickable(NextStep3);
		WebUI.verifyElementClickable(tableOfContents);
		WebUI.verifyElementClickable(backToList);
		
		WebUI.scrollToElementAtBottom(NextStep3);
		WebUI.sleep(0.2);
		WebUI.clickElement(NextStep3);
		WebUI.sleep(2);
		WebUI.verifyElementVisible(step_4);
		WebUI.logInfoMessage("Element is Visible "+step_4);
	
	}

}

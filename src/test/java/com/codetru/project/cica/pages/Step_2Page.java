
package com.codetru.project.cica.pages;

import static com.codetru.keywords.WebUI.getAttributeElement;
import static com.codetru.keywords.WebUI.getTextElement;

import java.util.List;

import org.openqa.selenium.By;

import com.codetru.constants.FrameworkConstants;
import com.codetru.helpers.PropertiesHelpers;
import com.codetru.keywords.WebUI;
import com.codetru.project.cica.CommonPageCICA;
import com.codetru.utils.DataGenerateUtils;

public class Step_2Page extends CommonPageCICA {


	private By step_2 = By.xpath("//span[text()='Step 2: Proposed Insured Information']");
	private By insuredGeneralInfo = By.xpath("//h3[normalize-space()='Insured General Information']");
	private By contactInfo = By.xpath("//h3[normalize-space()='Contact Information']");
	private By proposedInsuredFullName = By.xpath("//ion-input[@formcontrolname='ProposedFullName']");
	private By proposedAge = By.xpath("//ion-input[@formcontrolname='ProposedAge']");
	private By proposedGender = By.xpath("//ion-input[@value='Male']");
//	private By NextStep2 = By.xpath("(//ion-col/ion-button[starts-with(@class, 'md button')])[2]");
	private By NextStep2 = By.xpath("//h3[.='Contact Information']/parent::div/following-sibling::ion-row/ion-col[@size='24' and @size-md='6']/ion-button");
	private By SSN_RadioButton = By.xpath("(//ion-radio[@role='radio'])[1]");
	private By ITIN_RadioButton = By.xpath("(//ion-radio[@role='radio'])[2]");
	private By SSN_Number = By.xpath("//ion-input[@formcontrolname='ProposedSSN']/input");
	private By ErrorSSN_NumberMessage = By.xpath("(//ion-col[@class = 'md hydrated' and @size-md = '6'])[3]");
	private By EmailAddress = By.xpath("//ion-input[@formcontrolname='ProposedEmailAddress']/input");
	private By Error_EmailAddressMessage = By.xpath("(//h3[text() = 'Contact Information']/following-sibling::ion-row//ion-col[@size-md = '8'])[1]");
	private By Error_EmailCorrectFormatMessage = By.xpath("(//h3[text() = 'Contact Information']/following-sibling::ion-row//ion-col[@size-md = '8'])[1]");
	private By phoneNumber = By.xpath("//ion-input[@formcontrolname='ProposedMobilePhone']/input");
	private By Error_PhoneNumberMessage = By.xpath("(//h3[text() = 'Contact Information']/following-sibling::ion-row//ion-col[@size-md = '8'])[2]");
	private By Address_1_Message = By.xpath("//ion-input[@formcontrolname='ProposedPhysicalAddress1']/input");
	private By Error_Address_1_Message = By.xpath("(//ion-col[@class = 'md hydrated' and @size-md = '24'])[1]");
	private By Address_2_Message = By.xpath("//ion-input[@formcontrolname='ProposedPhysicalAddress2']/input");
	private By Error_Address_2_Message = By.xpath("(//ion-col[@class = 'md hydrated' and @size-md = '24'])[2]");
	private By ZipCode = By.xpath("//ion-input[@formcontrolname='ProposedPhysicalZipCode']/input");
	private By ZipCode_SearchButton = By.xpath("//ion-button[@title='Search']");
	private By ZipCode_SearchButton_Error = By.xpath("//ion-col[@class='md hydrated']//p[normalize-space()='Please enter a valid Zip Code.']");
	private By Error_ZipCode_Message = By.xpath("(//ion-col[@class = 'md hydrated' and @size-md = '7'])[1]");
	private By Proposed_ZipCode = By.xpath("//ion-input[@formcontrolname='ProposedPhysicalZipCode']/following-sibling::ion-button");
	private By city = By.xpath("//select[@formcontrolname='ProposedPhysicalCity']");
	private By citySelection = By.xpath("//option[.='Dodge City ']");
	private By cityList = By.xpath("//select[@formcontrolname='ProposedPhysicalCity']/option");
	private By Error_City_Message = By.xpath("(//ion-col[@class = 'md hydrated' and @size-md = '10'])[1]");
	private By state = By.xpath("(//select[@formcontrolname='ProposedPhysicalState'])[2]");
	private By tableOfContents = By.xpath("(//ion-button[normalize-space()='Table of Contents'])[1]");
	private By backToList = By.xpath("(//ion-button[normalize-space()='Back to List'])[1]");
	private By policyOwnerInformation_step3 = By.xpath("(//h3[normalize-space()='Policy Owner Information'])[2]");

	
	public void Proposed_Insured_Information() throws Exception {
		
		String Email_Max = "destinysdfghdfghdfsgdsfgsdfgdfghdfghdsfghjdsfghdfghdfghfgh";
		String Add_Max = "280 SIERRA DR. APT. B407 1142 SW ARLINGTON BLVD 1142 SW ARLINGTON BLVD";
		String Max_error ="The maximum number of characters is 33.";
		String Max_error_ ="The maximum number of characters is 50";
		String Min_error_Pn ="The minimum number of characters is 10.";
		String Max_error_Pn ="The maximum number of characters is 10.";
		String Min_error_Zp ="The minimum number of characters is 5.";
		String Max_error_Zp ="The maximum number of characters is 5.";
		String Mandatory_Error = "Please enter a value.";
		String Ssn_error = "SSN should have exactly 9 digits.";
		String Itin_error = "ITIN should have exactly 9 digits.";
		String Itin_Invalid = "Invalid ITIN.";
		String Ssn_error1 = "The last 4 digits of SSN should be from 0001 to 9999";
		String Chars_only = "abcdefghijklmnopqrstuvwxyz";
		String Ssn_Num_Error = "Please use a number format.";
		String incorrect_Email_Error = "Email is not in the correct format";
		String phone_Num_Format_Error = "Please use a number format.";
		String zipCode_SearchButtonError = "Please enter a valid Zip Code.";
		
//		C.Click_Displayed(driver, step_2, SSN_Number, e, Test.Case2(1),Test.Exp2(1));
		//TC_117
		WebUI.waitForPageLoaded();
		WebUI.sleep(2);
		WebUI.clickElement(step_2);
		WebUI.sleep(0.5);
		WebUI.verifyElementVisible(SSN_Number);
		
		//TC_118
		WebUI.verifyElementVisible(insuredGeneralInfo);
		WebUI.verifyElementVisible(contactInfo);

		//TC_125
		WebUI.verifyContains(WebUI.getAttributeElement(proposedInsuredFullName, "value"), Step_1Page.Randomfirstname);
//		WebUI.verifyEquals(WebUI.getAttributeElement(proposedAge, "value"), Step_1Page.ageTextBoxValue);
		WebUI.verifyEquals(WebUI.getAttributeElement(proposedGender, "value"),PropertiesHelpers.getValue("gender"));
		WebUI.verifyEquals(WebUI.getAttributeElement(SSN_Number, "value"), "");
		
//		C.Scroll_C_scroll2(driver, act, NextStep2, SSN_Number, e, Test.Case2(35), Test.Exp2(35));
		WebUI.scrollToElementAtBottom(NextStep2);
		WebUI.verifyElementClickable(NextStep2);
		WebUI.clickElement(NextStep2);
		WebUI.scrollToElementAtTop(SSN_Number);
		WebUI.verifyElementPresent(SSN_Number);
		
		//TC_128
		WebUI.verifyElementPresent(SSN_RadioButton);
		WebUI.verifyElementClickable(SSN_RadioButton);
		WebUI.verifyElementPresent(ITIN_RadioButton);
		WebUI.verifyElementClickable(ITIN_RadioButton);
		

//		C.Empty_Input(driver, ErrorSSN_NumberMessage, Ssn_error, e, Test.Case2(8), Test.Exp2(8));
		WebUI.verifyContains(getTextElement(ErrorSSN_NumberMessage).trim(), Ssn_error);

		//TC_128
		WebUI.clickElement(ITIN_RadioButton);
		WebUI.sleep(0.2);
		//TC_131
		WebUI.verifyContains(getTextElement(ErrorSSN_NumberMessage).trim(), Itin_error);
		WebUI.clickElement(SSN_RadioButton);
		WebUI.sleep(0.2);
		
//		C.Max_Char(driver, SSN_Number, ErrorSSN_NumberMessage, "abcdefghijklmnopqrstuvwxyz", "Must be a number", e,
//		Test.Case2(4), Test.Exp2(4));
		WebUI.clearText(SSN_Number);
		WebUI.setText(SSN_Number, Chars_only);
		WebUI.verifyElementVisible(ErrorSSN_NumberMessage);
		WebUI.verifyContains(getTextElement(ErrorSSN_NumberMessage).trim(), Ssn_Num_Error);

//		C.Max_Char(driver, SSN_Number, ErrorSSN_NumberMessage, "25478451", Ssn_error, e,Test.Case2(6), Test.Exp2(6));
		WebUI.clearText(SSN_Number);
		WebUI.setText(SSN_Number, "25478451");
		WebUI.verifyElementVisible(ErrorSSN_NumberMessage);
		WebUI.verifyContains(getTextElement(ErrorSSN_NumberMessage).trim(), Ssn_error);
		
//		C.Max_Char(driver, SSN_Number, ErrorSSN_NumberMessage, "25478451123", Ssn_error, e,Test.Case2(7), Test.Exp2(7));
		WebUI.clearText(SSN_Number);
		WebUI.setText(SSN_Number, "25478451123");
		WebUI.verifyElementVisible(ErrorSSN_NumberMessage);
		WebUI.verifyContains(getTextElement(ErrorSSN_NumberMessage).trim(), Ssn_error);

//		C.Max_Char(driver, SSN_Number, ErrorSSN_NumberMessage, "1234asasa", Ssn_error1, e,Test.Case2(5), Test.Exp2(5));
		WebUI.clearText(SSN_Number);
		WebUI.setText(SSN_Number, "1234asasa");
		WebUI.verifyElementVisible(ErrorSSN_NumberMessage);
		WebUI.verifyContains(getTextElement(ErrorSSN_NumberMessage).trim(), Ssn_error1);
		
		
//		^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ITIN Field Validation^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
		WebUI.clickElement(ITIN_RadioButton);
		WebUI.sleep(0.2);
		
//		C.Max_Char(driver, SSN_Number, ErrorSSN_NumberMessage, "abcdefghijklmnopqrstuvwxyz", "Must be a number", e,
//		Test.Case2(4), Test.Exp2(4));
		WebUI.clearText(SSN_Number);
		WebUI.setText(SSN_Number, Chars_only);
		WebUI.verifyElementVisible(ErrorSSN_NumberMessage);
		WebUI.verifyContains(getTextElement(ErrorSSN_NumberMessage).trim(), Ssn_Num_Error);

//		C.Max_Char(driver, SSN_Number, ErrorSSN_NumberMessage, "25478451", Ssn_error, e,Test.Case2(6), Test.Exp2(6));
		WebUI.clearText(SSN_Number);
		WebUI.setText(SSN_Number, "25478451");
		WebUI.verifyElementVisible(ErrorSSN_NumberMessage);
		WebUI.verifyContains(getTextElement(ErrorSSN_NumberMessage).trim(), Itin_error);
		
//		C.Max_Char(driver, SSN_Number, ErrorSSN_NumberMessage, "25478451123", Ssn_error, e,Test.Case2(7), Test.Exp2(7));
		WebUI.clearText(SSN_Number);
		WebUI.setText(SSN_Number, "25478451123");
		WebUI.verifyElementVisible(ErrorSSN_NumberMessage);
		WebUI.verifyContains(getTextElement(ErrorSSN_NumberMessage).trim(), Itin_error);

//		C.Max_Char(driver, SSN_Number, ErrorSSN_NumberMessage, "1234asasa", Ssn_error1, e,Test.Case2(5), Test.Exp2(5));
		WebUI.clearText(SSN_Number);
		WebUI.setText(SSN_Number, "1234asasa");
		WebUI.verifyElementVisible(ErrorSSN_NumberMessage);
		WebUI.verifyContains(getTextElement(ErrorSSN_NumberMessage).trim(), Ssn_Num_Error);
		WebUI.verifyContains(getTextElement(ErrorSSN_NumberMessage).trim(), Itin_Invalid);
		
		WebUI.clearText(SSN_Number);
		WebUI.setText(SSN_Number, "123451234");
		WebUI.verifyElementVisible(ErrorSSN_NumberMessage);
		WebUI.verifyContains(getTextElement(ErrorSSN_NumberMessage).trim(), Itin_Invalid);
		

//		C.Send_verify_Valid_C(driver, SSN_Number, e, "254798741", Test.Case2(3), Test.Exp2(3));
		String RandomITINNumber = DataGenerateUtils.randomValidITIN();
		WebUI.clearAndFillText(SSN_Number,RandomITINNumber);
		WebUI.sleep(0.5);
		WebUI.verifyContains(getAttributeElement(SSN_Number,"value"),RandomITINNumber);
//		^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
		
		WebUI.clickElement(SSN_RadioButton);
		WebUI.sleep(0.2);
//		C.Send_verify_Valid_C(driver, SSN_Number, e, "254798741", Test.Case2(3), Test.Exp2(3));
		String RandomSSNNumber = DataGenerateUtils.randomValidSSN();
		WebUI.clearAndFillText(SSN_Number,RandomSSNNumber);
		WebUI.sleep(0.5);
		WebUI.verifyContains(getAttributeElement(SSN_Number,"value"),RandomSSNNumber);
		
//		C.act_scroll1(driver, act, ZipCode, e, Test.Case2(27), Test.Exp2(27));
		WebUI.scrollToElementAtBottom(ZipCode);
		WebUI.verifyElementVisible(ZipCode);

//		C.Empty_Input(driver, Error_EmailAddressMessage, Mandatory_Error, e, Test.Case2(12), Test.Exp2(12));
		WebUI.verifyContains(getTextElement(Error_EmailAddressMessage).trim(), Mandatory_Error);

//		C.Max_Char(driver, EmailAddress, Error_EmailCorrectFormatMessage, "destiny", "Email is not in the correct format",
//		e, Test.Case2(10), Test.Exp2(10));
		WebUI.clearText(EmailAddress);
		WebUI.setText(EmailAddress, "destiny001");
		WebUI.verifyElementVisible(Error_EmailCorrectFormatMessage);
		WebUI.verifyContains(getTextElement(Error_EmailCorrectFormatMessage).trim(), incorrect_Email_Error);

//		C.Max_Char(driver, EmailAddress, Error_EmailCorrectFormatMessage, Email_Max,Max_error_,e, Test.Case2(11),Test.Exp2(11));
		WebUI.clearText(EmailAddress);
		WebUI.setText(EmailAddress, Email_Max);
		WebUI.verifyElementVisible(Error_EmailCorrectFormatMessage);
		WebUI.verifyContains(getTextElement(Error_EmailCorrectFormatMessage).trim(), Max_error_);

//		C.Send_verify_Valid_C(driver, EmailAddress, e, "destiny@none.com", Test.Case2(9), Test.Exp2(9));
		String RandomEmailAddress = DataGenerateUtils.randomEmail();
		WebUI.clearAndFillText(EmailAddress,RandomEmailAddress);
		WebUI.sleep(1);
		WebUI.verifyContains(getAttributeElement(EmailAddress,"value"),RandomEmailAddress);
		
//		C.Empty_Input(driver, Error_PhoneNumberMessage, Mandatory_Error, e, Test.Case2(17), Test.Exp2(17));
		WebUI.verifyContains(getTextElement(Error_PhoneNumberMessage).trim(), Mandatory_Error);

//		C.Max_Char(driver, phoneNumber, Error_PhoneNumberMessage, "abc", "Please use a number format.", e, Test.Case2(14),Test.Exp2(14));
		WebUI.clearText(phoneNumber);
		WebUI.setText(phoneNumber, "abcd");
		WebUI.verifyElementVisible(Error_PhoneNumberMessage);
		WebUI.verifyContains(getTextElement(Error_PhoneNumberMessage).trim(), phone_Num_Format_Error);
		
//		C.Max_Char(driver, phoneNumber, Error_PhoneNumberMessage, "78945612", Min_error_Pn,e, Test.Case2(15),Test.Exp2(15));
		WebUI.clearText(phoneNumber);
		WebUI.setText(phoneNumber, "98765432");
		WebUI.verifyElementVisible(Error_PhoneNumberMessage);
		WebUI.verifyContains(getTextElement(Error_PhoneNumberMessage).trim(), Min_error_Pn);

//		C.Max_Char(driver, phoneNumber, Error_PhoneNumberMessage, "12548152251",Max_error_Pn ,e, Test.Case2(16),Test.Exp2(16));
		WebUI.clearText(phoneNumber);
		WebUI.setText(phoneNumber, "98765432100");
		WebUI.verifyElementVisible(Error_PhoneNumberMessage);
		WebUI.verifyContains(getTextElement(Error_PhoneNumberMessage).trim(), Max_error_Pn);

//		C.Send_verify_Valid_C(driver, phoneNumber, e, "1254815225", Test.Case2(13),Test.Exp2(13));
		String RandomPhoneNumber = DataGenerateUtils.randomPhoneNumber();
		WebUI.clearAndFillText(phoneNumber,RandomPhoneNumber);
		WebUI.sleep(1);
		WebUI.verifyContains(getAttributeElement(phoneNumber,"value"),RandomPhoneNumber);
//		C.Empty_Input(driver, Error_Address_1_Message, Mandatory_Error, e, Test.Case2(19),Test.Exp2(19));
		WebUI.verifyContains(getTextElement(Error_Address_1_Message).trim(), Mandatory_Error);

//		C.Max_Char(driver, Address_1_Message, Error_Address_1_Message, Add_Max,Max_error,e, Test.Case2(20),Test.Exp2(20));
		WebUI.clearText(Address_1_Message);
		WebUI.setText(Address_1_Message, Add_Max);
		WebUI.verifyElementVisible(Error_Address_1_Message);
		WebUI.verifyContains(getTextElement(Error_Address_1_Message).trim(), Max_error);

//		C.Send_verify_Valid_C(driver, Address_1_Message, e, "7412 PINNACLE POINT", Test.Case2(18),Test.Exp2(18));
//		WebUI.clearAndFillText(Address_1_Message, PropertiesHelpers.getValue("address_1"));
//		WebUI.sleep(1);
//		WebUI.verifyContains(getAttributeElement(Address_1_Message, "value"), PropertiesHelpers.getValue("address_1"));
		String RandomAddress = DataGenerateUtils.randomShortAddress();
		WebUI.clearAndFillText(Address_1_Message,RandomAddress);
		WebUI.sleep(1);
		WebUI.verifyContains(getAttributeElement(Address_1_Message,"value"),RandomAddress);
//		C.Max_Char(driver, Address_2_Message, Error_Address_2_Message, Add_Max,Max_error,e, Test.Case2(22),Test.Exp2(22));
		WebUI.clearText(Address_2_Message);
		WebUI.setText(Address_2_Message, Add_Max);
		WebUI.verifyElementVisible(Error_Address_2_Message);
		WebUI.verifyContains(getTextElement(Error_Address_2_Message).trim(), Max_error);

//		C.Send_verify_Valid_C(driver, Address_2_Message, e, "668 WOODSIDE DR", Test.Case2(21),Test.Exp2(21));
		WebUI.clearAndFillText(Address_2_Message, PropertiesHelpers.getValue("address_2"));
		WebUI.sleep(1);
		WebUI.verifyContains(getAttributeElement(Address_2_Message, "value"), PropertiesHelpers.getValue("address_2"));

//		C.Empty_Input(driver, Error_ZipCode_Message, Mandatory_Error, e, Test.Case2(28),Test.Exp2(28));
		WebUI.verifyContains(getTextElement(Error_ZipCode_Message).trim(), Mandatory_Error);

//		C.Max_Char(driver, ZipCode, Error_ZipCode_Message,"1234",Min_error_Zp,e, Test.Case2(24),Test.Exp2(24));
		WebUI.clearText(ZipCode);
		WebUI.setText(ZipCode, "1234");
		WebUI.verifyElementVisible(Error_ZipCode_Message);
		WebUI.verifyContains(getTextElement(Error_ZipCode_Message).trim(), Min_error_Zp);

//		C.Max_Char(driver, ZipCode, Error_ZipCode_Message,"123456",Max_error_Zp,e, Test.Case2(25),Test.Exp2(25));
		WebUI.clearText(ZipCode);
		WebUI.setText(ZipCode, "123456");
		WebUI.verifyElementVisible(Error_ZipCode_Message);
		WebUI.verifyContains(getTextElement(Error_ZipCode_Message).trim(), Max_error_Zp);
		
		//TC_154
		WebUI.clearText(ZipCode);
		WebUI.moveToElement(ZipCode_SearchButton);
		WebUI.clickElement(ZipCode_SearchButton);
		WebUI.sleep(0.5);
		WebUI.verifyElementVisible(ZipCode_SearchButton_Error);
		WebUI.verifyContains(getTextElement(ZipCode_SearchButton_Error), zipCode_SearchButtonError);

//		C.Send_verify_Valid_C(driver, ZipCode, e, "67801", Test.Case2(23),Test.Exp2(23));
		WebUI.clearAndFillText(ZipCode, PropertiesHelpers.getValue("zip_Code"));
		WebUI.sleep(0.5);
		WebUI.verifyContains(getAttributeElement(ZipCode, "value"), PropertiesHelpers.getValue("zip_Code"));

//		C.Mandate_Click1(driver, act, Proposed_ZipCode, e, Test.Case2(26),Test.Exp2(26));
		WebUI.moveToElement(Proposed_ZipCode);
		WebUI.sleep(0.5);
		WebUI.clickElementWithJs(Proposed_ZipCode);
		WebUI.sleep(0.5);

//		C.Scroll_Click(driver, wait, act, NextStep2, e, Test.Case2(37),Test.Exp2(37));
		WebUI.scrollToElementAtBottom(NextStep2);
		WebUI.waitForElementVisible(NextStep2);
		WebUI.clickElement(NextStep2);

//		C.Empty_Input(driver, Error_City_Message, Mandatory_Error, e, Test.Case2(31),Test.Exp2(31));
		WebUI.verifyContains(getTextElement(Error_City_Message), Mandatory_Error);
		WebUI.sleep(1);

//		C.W_C2(driver, wait, city, CitySelection, e, Test.Case2(30),Test.Exp2(30));
//		WebUI.waitForElementVisible(city);
//		WebUI.clickElement(city);
//		WebUI.sleep(1);
//		WebUI.waitForElementVisible(citySelection);
//		WebUI.clickElement(citySelection);
		
		//TC_159
		WebUI.scrollToElementAtBottom(NextStep2);
		WebUI.sleep(1);
		List<String> cities = WebUI.getElementTextsInList(cityList);
		WebUI.logInfoMessage("################################# Number of Cities: "+(cities.size()-1));
		WebUI.sleep(1.5);
		for(int i=1; i<cities.size(); i++ )
		{	
			WebUI.selectOptionByIndex(city, i);
			WebUI.sleep(1);
		}
		
		//TC_166
		WebUI.scrollToElementAtBottom(NextStep2);
		WebUI.sleep(0.2);
		WebUI.verifyElementClickable(tableOfContents);
		WebUI.verifyElementClickable(backToList);

//		C.Mandate_Click(driver, NextStep2, e, Test.Case2(36),Test.Exp2(36));
		WebUI.scrollToElementAtBottom(NextStep2);
		WebUI.sleep(0.2);
		WebUI.moveToElement(NextStep2);
		WebUI.clickElement(NextStep2);
		WebUI.sleep(2);
		WebUI.waitForPageLoaded();
		WebUI.verifyElementVisible(policyOwnerInformation_step3);
		
	}

}

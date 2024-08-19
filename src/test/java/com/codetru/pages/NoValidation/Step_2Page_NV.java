package com.codetru.pages.NoValidation;

import static com.codetru.keywords.WebUI.getAttributeElement;
import static com.codetru.keywords.WebUI.getTextElement;

import org.openqa.selenium.By;

import com.codetru.constants.FrameworkConstants;
import com.codetru.helpers.PropertiesHelpers;
import com.codetru.keywords.WebUI;
import com.codetru.project.cica.CommonPageCICA;
import com.codetru.utils.DataGenerateUtils;

public class Step_2Page_NV extends CommonPageCICA {


	private By step_2 = By.xpath("//span[text()='Step 2: Proposed Insured Information']");

//	private By NextStep2 = By.xpath("(//ion-col/ion-button[starts-with(@class, 'md button')])[2]");
//	private By NextStep2 = By.xpath("//select[@formcontrolname='ProposedPhysicalCity']/following::ion-row/ion-col[1]/ion-button[1]");
	private By NextStep2 = By.xpath("//h3[.='Contact Information']/parent::div/following-sibling::ion-row/ion-col[@size='24' and @size-md='6']/ion-button");

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

	private By Error_ZipCode_Message = By.xpath("(//ion-col[@class = 'md hydrated' and @size-md = '7'])[1]");

	private By Proposed_ZipCode = By.xpath("//ion-input[@formcontrolname='ProposedPhysicalZipCode']/following-sibling::ion-button");

	private By city = By.xpath("//select[@formcontrolname='ProposedPhysicalCity']");

	private By CitySelection = By.xpath("//option[.='Dodge City ']");

	private By Error_City_Message = By.xpath("(//ion-col[@class = 'md hydrated' and @size-md = '10'])[1]");

	private By NextStep3 = By.xpath("(//ion-row/ion-col/ion-button[starts-with(@class, 'md button')])[8]");

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
		String Ssn_error1 = "The last 4 digits of SSN should be from 0001 to 9999";
		String Chars_only = "abcdefghijklmnopqrstuvwxyz";
		String Ssn_Num_Error = "Please use a number format.";
		String incorrect_Email_Error = "Email is not in the correct format";
		String phone_Num_Format_Error = "Please use a number format.";
		
		WebUI.waitForPageLoaded();
		WebUI.clickElement(step_2);
		WebUI.clickElement(SSN_Number);
		String RandomSSNNumber = DataGenerateUtils.randomValidSSN();
		WebUI.clearAndFillText(SSN_Number,RandomSSNNumber);
		WebUI.sleep(0.5);
		WebUI.verifyContains(getAttributeElement(SSN_Number,"value"),RandomSSNNumber);
		
		WebUI.scrollToElementAtBottom(ZipCode);
		WebUI.verifyElementVisible(ZipCode);
		WebUI.sleep(0.5);


		String RandomEmailAddress = DataGenerateUtils.randomEmail();
		WebUI.clearAndFillText(EmailAddress,RandomEmailAddress);
		WebUI.sleep(0.5);
		WebUI.verifyContains(getAttributeElement(EmailAddress,"value"),RandomEmailAddress);
		
		String RandomPhoneNumber = DataGenerateUtils.randomPhoneNumber();
		WebUI.clearAndFillText(phoneNumber,RandomPhoneNumber);
		WebUI.sleep(0.5);
		WebUI.verifyContains(getAttributeElement(phoneNumber,"value"),RandomPhoneNumber);
		
		String RandomAddress = DataGenerateUtils.randomShortAddress();
		WebUI.clearAndFillText(Address_1_Message,RandomAddress);
		WebUI.sleep(0.5);
		WebUI.verifyContains(getAttributeElement(Address_1_Message,"value"),RandomAddress);
		

		WebUI.clearAndFillText(Address_2_Message, PropertiesHelpers.getValue("address_2"));
		WebUI.sleep(0.5);
		WebUI.verifyContains(getAttributeElement(Address_2_Message, "value"), PropertiesHelpers.getValue("address_2"));


		WebUI.clearAndFillText(ZipCode, PropertiesHelpers.getValue("zip_Code"));
		WebUI.sleep(0.5);
		WebUI.verifyContains(getAttributeElement(ZipCode, "value"), PropertiesHelpers.getValue("zip_Code"));
		WebUI.moveToElement(Proposed_ZipCode);
		WebUI.clickElement(Proposed_ZipCode);

		WebUI.scrollToElementAtBottom(NextStep2);
//		WebUI.sleep(0.5);
//		WebUI.clickElement(NextStep2);

		WebUI.sleep(1);
//		WebUI.verifyContains(getTextElement(Error_City_Message), Mandatory_Error);

//		WebUI.scrollToElementAtTop(city);
		WebUI.waitForElementVisible(city);
		WebUI.clickElement(city);
		WebUI.sleep(1);
		WebUI.selectOptionByIndex(city,1);
		WebUI.sleep(1);
//		WebUI.waitForElementVisible(CitySelection);
//		WebUI.clickElement(CitySelection);

		WebUI.scrollToElementAtBottom(NextStep2);
		WebUI.sleep(0.5);
		WebUI.moveToElement(NextStep2);
		WebUI.clickElement(NextStep2);
		
		
	}

}

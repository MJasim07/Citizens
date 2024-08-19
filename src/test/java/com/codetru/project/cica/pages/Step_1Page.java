package com.codetru.project.cica.pages;


import static com.codetru.keywords.WebUI.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

import com.codetru.driver.DriverManager;
import com.codetru.helpers.PropertiesHelpers;
import com.codetru.keywords.WebUI;
import com.codetru.project.cica.CommonPageCICA;
import com.codetru.utils.DataFakerUtils;
import com.codetru.utils.DataGenerateUtils;


public class Step_1Page extends CommonPageCICA{


	private By page_Error = By.xpath("//p[.='There are some errors on this page. Please correct before continuing.']");
	private By FirstName = By.xpath("//ion-input[@formcontrolname='ProposedFirstName']/input");
	private By Error_Message_FirstName = By.xpath("(//ion-col[@size='24' and @size-md='8'])[1]");
	private By MiddleName = By.xpath("//ion-input[@formcontrolname='ProposedMiddleName']/input");
	private By Error_Message_MiddleName = By.xpath("(//ion-col[@size='24' and @size-md='8'])[2]");
	private By LastName = By.xpath("//ion-input[@formcontrolname='ProposedLastName']/input");
	private By Error_Message_LastName = By.xpath("(//ion-col[@size='24' and @size-md='8'])[3]");
	private By StateDropdown = By.xpath("//select[@formcontrolname='ProposedPhysicalState']");
	private By Error_Message_State = By.xpath("(//ion-col[@size='24' and @size-md='4'])[1]");
	private By state = By.xpath("(//option[.=' Louisiana'])[1]");
	private By genderDropdown = By.xpath("//select[@formcontrolname='ProposedGender']");
	private By gender = By.xpath("//option[.='Male']");
	private By Error_Message_Gender = By.xpath("(//ion-col[@size='24' and @size-md='4' and @class='md hydrated']/following-sibling::ion-col[@size='24' and @class='md hydrated'])[1]");
	private By DateOfBirth = By.xpath("//input[@formcontrolname='ProposedBirthDate']");
	private By age = By.xpath("//ion-input[@formcontrolname='ProposedAge']");
	private By Error_Message_DateOfBirth = By.xpath("(//ion-col[@size='24' and @size-md='4' and @class='md hydrated']/following-sibling::ion-col[@size='24' and @class='md hydrated'])[2]");
	private By Error_Message_ApplicantLocation = By.xpath("(//ion-col[@size='24' and @size-md='4' and @class='md hydrated']/following-sibling::ion-col[@size='24' and @class='md hydrated'])[4]");
	private By signedStateDropdown = By.xpath("//select[@formcontrolname='SignedState']");
	private By SignedState = By.xpath("(//option[.=' Louisiana'])[2]");
	private By preferredlanguage = By.xpath("//select[@formcontrolname='ProposedPreferredLanguage']");
	private By language = By.xpath("//option[.=' English']");
	private By Call_Yes = By.xpath("(//ion-label[.='Yes'])[1]");
	private By Call_No = By.xpath("(//ion-label[.='No'])[1]");
	private By Error_Message_Language = By.xpath("(//ion-col[@size='24' and @size-md='4' and @class='md hydrated']/following-sibling::ion-col[@size='24' and"
			+ " @class='md hydrated'])[5]");
	private By ErrorMessage_BasePlan = By.xpath("//ion-col[@class = 'md hydrated' and @size-md = '7']");
	private By plan = By.xpath("//select[@formcontrolname='Plan']");
	private By selectPlan = By.xpath("//option[.=' Allegiant Superior Choice Standard Issue']");
	private By selectPlan_CICA = By.xpath("//option[.=' CICA Life Plus Standard Issue']");
	private By selectPlan_Garuntee = By.xpath("//option[.=' CICA Life Plus Guaranteed Issue']");
	private By Accidental_Checkbox = By.xpath("//ion-Checkbox[@formcontrolname='ADB']");
	private By FaceAmount = By.xpath("//ion-input[@formcontrolname='AmountOfInsurance']/input");
	private By ErrorMessage_FaceAmount = By.xpath("//ion-col[@class = 'md hydrated' and @size-md = '3']");
	private By Annually = By.xpath("//ion-label[text()='Annually']/following-sibling::ion-radio");
	private By Semi_Annually = By.xpath("//ion-label[text()='Semi-Annually']/following-sibling::ion-radio");
	private By Quarterly = By.xpath("//ion-label[text()='Quarterly']/following-sibling::ion-radio");
	private By Monthly = By.xpath("//ion-label[text()='Monthly']/following-sibling::ion-radio");
	private By Yes = By.xpath("(//ion-label[text()='Yes']/following-sibling::ion-radio)[2]");
	private By No = By.xpath("(//ion-label[text()='No']/following-sibling::ion-radio)[2]");
	private By Nextstep_1 = By.xpath("(//ion-col/ion-button[starts-with(@class, 'md button')])[5]");
	private By premiumType = By.xpath("//ion-label[text()='Monthly']/following-sibling::ion-radio");
	private By loanRadioBtn = By.xpath("(//ion-label[text()='Yes']/following-sibling::ion-radio)[2]");
	private By calculate = By.xpath("(//div/ion-row/ion-col/ion-button[starts-with(@class, md)])[2]");
	private By totalAnnualPremium = By.xpath("//h4[contains(text(), 'Total Annual Premium')]");
	private By modePremium = By.xpath("//h4[contains(text(), 'Mode Premium')]");
	private By basePremium = By.xpath("//h4[contains(text(), 'Base Premium')]");
	private By accidentalDeathPremium = By.xpath("//h4[contains(text(), 'Accidental Death Premium')]");
	private By tableOfContents = By.xpath("(//ion-button[normalize-space()='Table of Contents'])[1]");
	private By backToList = By.xpath("(//ion-button[normalize-space()='Back to List'])[1]");
	private By list_ColumnNames = By.xpath("//div[@class='table-responsive hidden-sm-down']//table//thead//tr/th");
	
	private By step_1 = By.xpath("//span[.='Step 1: Product Information']");
	private By step_2 = By.xpath("//span[normalize-space()='Step 2: Proposed Insured Information']");
	private By steps_List = By.xpath("//ion-list//span");
	
	private By insuredInfoElement = By.xpath("//h3[.='Proposed Insured Info']");
	private By authorization_Consent = By.xpath("//h3[normalize-space()='Authorization/Consent']");
	private By plan_Options = By.xpath("//h3[normalize-space()='Plan Options']");
	
	// Global Person icon
	private By globalPersonIcon = By.xpath("//ion-icon[@name='person-add']/parent::ion-button");	
	private By edit_PersonHeader = By.xpath("//ion-title[normalize-space()='Edit Person']");
	private By edit_PersonInformation = By.xpath("//h3[normalize-space()='Person Information']");
	private By edit_SaveAndClose_Button = By.xpath("//ion-button[normalize-space()='Save And Close']");
	private By edit_Clear_Button = By.xpath("//ion-button[normalize-space()='Clear']");
	private By edit_Close_Button = By.xpath("//ion-button[normalize-space()='Close']");
	
	private By personInfo_FirstName = By.xpath("//ion-input[@formcontrolname='FirstName']/input");
	private By personInfo_MiddleName = By.xpath("//ion-input[@formcontrolname='MiddleName']/input");
	private By personInfo_LastName = By.xpath("//ion-input[@formcontrolname='LastName']/input");
	private By personInfo_FName_Err_Msg = By.xpath("//ion-input[@formcontrolname='FirstName']/ancestor-or-self::ion-col/div/div/p");
	private By personInfo_MName_Err_Msg = By.xpath("//ion-input[@formcontrolname='MiddleName']/ancestor-or-self::ion-col/div/div/p");
	private By personInfo_LName_Err_Msg = By.xpath("//ion-input[@formcontrolname='LastName']/ancestor-or-self::ion-col/div/div/p");
	private By personInfo_genderDropdown = By.xpath("//select[@formcontrolname='Gender']");
	private By personInfo_gender = By.xpath("//option[.='Male']");
	private By personInfo_dob = By.xpath("//input[@formcontrolname='BirthDate']");
	private By personInfo_ssn_no = By.xpath("//ion-input[@formcontrolname='SSN']/input");
	private By personInfo_ssn_max_err_msg = By.xpath("//p[text()='The maximum number of characters is 9. ']");
	private By personInfo_SSN_err_msg = By.xpath("//ion-input[@formcontrolname='SSN']/ancestor-or-self::ion-col/div/div/p");
	private By personInfo_address1 = By.xpath("//ion-input[@formcontrolname='Address1']/input");
	private By personInfo_address1_err_msg = By.xpath("//ion-input[@formcontrolname='Address1']/ancestor-or-self::ion-col/div/div/p");
	private By personInfo_address2 = By.xpath("//ion-input[@formcontrolname='Address2']/input");
	private By personInfo_address2_err_msg = By.xpath("//ion-input[@formcontrolname='Address2']/ancestor-or-self::ion-col/div/div/p");
	private By personInfo_city = By.xpath("//ion-input[@formcontrolname='City']/input");
	private By personInfo_city_err_msg = By.xpath("//ion-input[@formcontrolname='City']/ancestor-or-self::ion-col/div/div/p");
	private By personInfo_state_dropdown = By.xpath("//select[@formcontrolname='State']");
	private By personInfo_state = By.xpath("(//option[.=' Louisiana'])[3]");
	private By personInfo_zipcode = By.xpath("//ion-input[@formcontrolname='ZipCode']/input");
	private By personInfo_zipcode_err_msg = By.xpath("//ion-input[@formcontrolname='ZipCode']/ancestor-or-self::ion-col/div/div/p");
	private By personInfo_email = By.xpath("//ion-input[@formcontrolname='Email']/input");
	private By personInfo_email_err_msg = By.xpath("//ion-input[@formcontrolname='Email']/ancestor-or-self::ion-col/div/div/p");
	private By personInfo_phone = By.xpath("//ion-input[@formcontrolname='Phone']/input");
	private By personInfo_phone_err_msg = By.xpath("//ion-input[@formcontrolname='Phone']/ancestor-or-self::ion-col/div/div/p");
	private By personInfo_mobile = By.xpath("//ion-input[@formcontrolname='MobilePhone']/input");
	private By personInfo_mobile_err_msg = By.xpath("//ion-input[@formcontrolname='MobilePhone']/ancestor-or-self::ion-col/div/div/p");
	
	// Proposed insured info person icon
	private By infoPersonIcon = By.xpath("//h3[.='Proposed Insured Info']/parent::div/descendant-or-self::ion-icon");
	private By infoPersonPopup_Header = By.xpath("//ion-title[normalize-space()='Copy']");
	private By dataAndAddRadioButton = By.xpath("//ion-label[.='Person Data And Address ']");
	private By addressOnlyRadioButton = By.xpath("//ion-label[.='Address Only ']");
	private By infoPersonPopup_CopyButton = By.xpath("//ion-button[normalize-space()='Copy']");
	
	// DOB validation
	private By errorMessageAge = By.xpath("(//ion-col[@size='24' and @size-md='4' and @class='md hydrated']/following-sibling::ion-col[@size='24' and @class='md hydrated'])[3]");
	
	//Appointment Acknowledgement Popup
	private By appointmentAcknowledgement = By.xpath("//ion-button[normalize-space()='Yes, I acknowledge the statement above']");
	private By step1 = By.xpath("//span[.='Step 1: Product Information']");
	private By agentLicense = By.xpath("//button[@type='button']");
	private By TableOfContent_BackButton = By.xpath("//span[@title='Table of Contents']");
	
	private By logoElement = By.xpath("(//app-header//descendant-or-self::ion-img)[2]");
	private By impNotice_Popup = By.xpath("//ion-backdrop/following-sibling::div/div/following-sibling::div/button");
	
	public static String Randomfirstname;
	public static String ageTextBoxValue;

	public void Product_Information() throws Exception {

		String Mandate_Error = "Please enter a value.";
		String Max_Error = "The maximum number of characters is 33.";
		String Max_Char = "qwertyuiopqwertyuiopqwertyuiopqwertyu";
		String Page_Error_ = "There are some errors on this page. Please correct before continuing.";
		String Fc_MxErr = "The maximum amount is 30000.";
		String Fc_MnErr = "The minimum amount is 1000.";
		String personInfo_SsnMin_error = "The minimum number of characters is 9.";
		String personInfo_SsnMax_error = "The maximum number of characters is 9.";
		String personInfo_ZipMin_error = "The minimum number of characters is 5.";
		String personInfo_ZipMax_error = "The maximum number of characters is 5.";
		String personInfo_PhoneMin_error = "The minimum number of characters is 10.";
		String personInfo_PhoneMax_error = "The maximum number of characters is 10.";
		
		String Add_Max = "280 SIERRA DR. APT. B407 1142 SW ARLINGTON BLVD 1142 SW ARLINGTON BLVD";
		String incorrect_Email_Error = "Email format not correct.";
		String Email_Max = "destinysdfghdfghdfsgdsfgsdfgdfghdfghdsfghjdsfghdfghdfghfgh";
		String email_Max_error ="The maximum number of characters is 50";
		
		String city_Invalid="qweqwertyuioplkjhgfdsazxcvbnmmnbvc";
		String zipcode_Invalid="415236987";
		
		//DOB Validation Messages
//		String age_Max_Error = "The maximum amount is 85.";
		String age_Max_Error = "The maximum age is 85.";
		
///*		

		WebUI.verifyElementPresent(insuredInfoElement);						//
		WebUI.verifyElementPresent(authorization_Consent);					//
		WebUI.scrollToElementAtBottom(plan_Options);
		WebUI.sleep(0.3);
		WebUI.verifyElementPresent(plan_Options);							//
		
		WebUI.scrollToElementAtTop(globalPersonIcon);
		WebUI.sleep(0.3);
		WebUI.verifyElementPresent(globalPersonIcon);						//
		WebUI.clickElement(globalPersonIcon);
		WebUI.sleep(1);
		WebUI.verifyElementPresent(edit_PersonHeader);						//
		WebUI.verifyElementPresent(edit_PersonInformation);					//
		WebUI.verifyElementPresent(edit_Clear_Button);						//
		WebUI.verifyElementPresent(edit_Close_Button);						//
		WebUI.sleep(0.5);
		
//	==============================Global Person Popup Fields Validation ============================================================================	
 
 
		WebUI.clearAndFillText(personInfo_FirstName,Max_Char);
		WebUI.sleep(0.1);

		WebUI.scrollToElementAtBottom(edit_SaveAndClose_Button);
		WebUI.sleep(0.2);
		WebUI.clickElement(edit_SaveAndClose_Button);
		
		WebUI.scrollToElementAtTop(edit_PersonHeader);
		WebUI.sleep(0.1);
		WebUI.verifyElementVisible(personInfo_FName_Err_Msg);
		WebUI.verifyContains(WebUI.getTextElement(personInfo_FName_Err_Msg), Max_Error);
		
		String Random_FirstName = DataGenerateUtils.randomMiddleName();
		WebUI.clearAndFillText(personInfo_FirstName, Random_FirstName);
		WebUI.sleep(0.1);
		WebUI.verifyContains(getAttributeElement(personInfo_FirstName,"value"),Random_FirstName);
		
		WebUI.clearText(personInfo_MiddleName);
		WebUI.setText(personInfo_MiddleName, Max_Char);
		WebUI.verifyElementVisible(personInfo_MName_Err_Msg);
		WebUI.verifyContains(getTextElement(personInfo_MName_Err_Msg).trim(), Max_Error);
		
		String RandomMiddlename = DataGenerateUtils.randomMiddleName();
		WebUI.clearAndFillText(personInfo_MiddleName,RandomMiddlename);
		WebUI.sleep(0.1);
		WebUI.verifyContains(getAttributeElement(personInfo_MiddleName,"value"),RandomMiddlename);

		WebUI.clearText(personInfo_LastName);
		WebUI.setText(personInfo_LastName, Max_Char);
		WebUI.verifyElementVisible(personInfo_LName_Err_Msg);
		WebUI.verifyContains(getTextElement(personInfo_LName_Err_Msg).trim(), Max_Error);

		String RandomLastname = DataGenerateUtils.randomLastName();
		WebUI.clearAndFillText(personInfo_LastName,RandomLastname);
		WebUI.sleep(0.2);
		WebUI.verifyContains(getAttributeElement(personInfo_LastName,"value"),RandomLastname);
		
		WebUI.selectOptionByText(personInfo_genderDropdown, PropertiesHelpers.getValue("gender"));
		
		WebUI.setText(personInfo_dob, PropertiesHelpers.getValue("date_Of_Birth"));
	 
		WebUI.verifyElementVisible(personInfo_ssn_no);
	 
		WebUI.setText(personInfo_ssn_no, "25478451");
		WebUI.verifyElementVisible(personInfo_SSN_err_msg);
		WebUI.verifyContains(getTextElement(personInfo_SSN_err_msg).trim(), personInfo_SsnMin_error);
	 
		WebUI.clearText(personInfo_ssn_no);
		WebUI.setText(personInfo_ssn_no, "25478451123");
		WebUI.verifyElementVisible(personInfo_ssn_max_err_msg);
		WebUI.verifyContains(getTextElement(personInfo_ssn_max_err_msg).trim(), personInfo_SsnMax_error);
			
		String RandomSSNNumber = DataGenerateUtils.randomValidSSN();
		WebUI.clearAndFillText(personInfo_ssn_no,RandomSSNNumber);
		WebUI.sleep(0.2);
		WebUI.verifyContains(getAttributeElement(personInfo_ssn_no,"value"),RandomSSNNumber);
 
		WebUI.clearText(personInfo_address1);
		WebUI.setText(personInfo_address1, Add_Max);
		WebUI.scrollToElementAtBottom(edit_SaveAndClose_Button);
		WebUI.clickElement(edit_SaveAndClose_Button);
		WebUI.sleep(0.2);
		WebUI.scrollToElementAtTop(personInfo_address1);
		WebUI.verifyElementVisible(personInfo_address1_err_msg);
		WebUI.verifyContains(getTextElement(personInfo_address1_err_msg).trim(), Max_Error);
		
		String RandomAddress = DataGenerateUtils.randomShortAddress();
		WebUI.clearAndFillText(personInfo_address1,RandomAddress);
		WebUI.sleep(0.2);
		WebUI.verifyContains(getAttributeElement(personInfo_address1,"value"),RandomAddress);
		
		WebUI.clearText(personInfo_address2);
		WebUI.setText(personInfo_address2, Add_Max);
		WebUI.scrollToElementAtBottom(edit_SaveAndClose_Button);
		WebUI.clickElement(edit_SaveAndClose_Button);
		WebUI.sleep(0.2);
		WebUI.scrollToElementAtTop(personInfo_address2);
		WebUI.verifyElementVisible(personInfo_address2_err_msg);
		WebUI.verifyContains(getTextElement(personInfo_address2_err_msg).trim(), Max_Error);
		
		String RandomAddress2 = DataGenerateUtils.randomShortAddress();
		WebUI.clearAndFillText(personInfo_address2,RandomAddress2);
		WebUI.sleep(0.2);
		WebUI.verifyContains(getAttributeElement(personInfo_address2,"value"),RandomAddress2);
		
		WebUI.sleep(1);
		WebUI.setText(personInfo_city, city_Invalid);
		WebUI.scrollToElementAtBottom(edit_SaveAndClose_Button);
		WebUI.sleep(0.2);
		WebUI.clickElement(edit_SaveAndClose_Button);
		WebUI.sleep(0.2);
		WebUI.scrollToElementAtTop(personInfo_city);
		WebUI.sleep(0.4);
		WebUI.verifyElementVisible(personInfo_city_err_msg);
		WebUI.verifyContains(WebUI.getTextElement(personInfo_city_err_msg), Max_Error);
		WebUI.sleep(0.2);
		WebUI.clearAndFillText(personInfo_city, PropertiesHelpers.getValue("benif_City"));
		WebUI.sleep(0.2);
		
		WebUI.clickElement(personInfo_state_dropdown);
		WebUI.sleep(0.5);
		WebUI.setText(personInfo_state_dropdown, "Te",Keys.ENTER);
			
		WebUI.clearAndFillText(personInfo_zipcode, "7894");
		WebUI.scrollToElementAtBottom(edit_SaveAndClose_Button);
		WebUI.sleep(0.2);
		WebUI.clickElement(edit_SaveAndClose_Button);
		WebUI.sleep(0.2);
		WebUI.verifyElementVisible(personInfo_zipcode_err_msg);
		WebUI.verifyContains(WebUI.getTextElement(personInfo_zipcode_err_msg), personInfo_ZipMin_error);
		WebUI.sleep(0.2);
		WebUI.clearAndFillText(personInfo_zipcode, zipcode_Invalid);
		WebUI.sleep(0.2);
		WebUI.verifyElementVisible(personInfo_zipcode_err_msg);
		WebUI.verifyContains(WebUI.getTextElement(personInfo_zipcode_err_msg), personInfo_ZipMax_error);
		
		WebUI.clearAndFillText(personInfo_zipcode, PropertiesHelpers.getValue("benif_Zip"));
		WebUI.sleep(0.3);
		
		WebUI.clearText(personInfo_email);
		WebUI.setText(personInfo_email, "destiny001");
		WebUI.verifyElementVisible(personInfo_email_err_msg);
		WebUI.verifyContains(getTextElement(personInfo_email_err_msg).trim(), incorrect_Email_Error);

		WebUI.clearText(personInfo_email);
		WebUI.setText(personInfo_email, Email_Max);
		WebUI.verifyElementVisible(personInfo_email_err_msg);
		WebUI.verifyContains(getTextElement(personInfo_email_err_msg).trim(), incorrect_Email_Error);

		String RandomEmailAddress = DataGenerateUtils.randomEmail();
		WebUI.clearAndFillText(personInfo_email,RandomEmailAddress);
		WebUI.sleep(0.2);
		WebUI.verifyContains(getAttributeElement(personInfo_email,"value"),RandomEmailAddress);	

		WebUI.clearAndFillText(personInfo_phone, "789456");
		WebUI.sleep(0.2);
		WebUI.clickElement(edit_SaveAndClose_Button);
		WebUI.sleep(0.2);
		WebUI.verifyElementVisible(personInfo_phone_err_msg);
		WebUI.verifyContains(WebUI.getTextElement(personInfo_phone_err_msg), personInfo_PhoneMin_error);
		WebUI.sleep(0.2);
		WebUI.clearAndFillText(personInfo_phone, "258014736999");
		WebUI.sleep(0.2);
		WebUI.verifyElementVisible(personInfo_phone_err_msg);
		WebUI.verifyContains(WebUI.getTextElement(personInfo_phone_err_msg), personInfo_PhoneMax_error);
		
		WebUI.clearAndFillText(personInfo_phone, PropertiesHelpers.getValue("benif_phone"));
		WebUI.sleep(0.2);
		
		WebUI.clearAndFillText(personInfo_mobile, "789456");
		WebUI.sleep(0.2);
		WebUI.clickElement(edit_SaveAndClose_Button);
		WebUI.sleep(0.2);
		WebUI.verifyElementVisible(personInfo_mobile_err_msg);
		WebUI.verifyContains(WebUI.getTextElement(personInfo_mobile_err_msg), personInfo_PhoneMin_error);
		WebUI.sleep(0.2);
		WebUI.clearAndFillText(personInfo_mobile, "258014736999");
		WebUI.sleep(0.2);
		WebUI.verifyElementVisible(personInfo_mobile_err_msg);
		WebUI.verifyContains(WebUI.getTextElement(personInfo_mobile_err_msg), personInfo_PhoneMax_error);
		
		String RandomMobileNumber = DataGenerateUtils.randomPhoneNumber();
		WebUI.clearAndFillText(personInfo_mobile,RandomMobileNumber);
		WebUI.sleep(0.2);
		WebUI.verifyContains(getAttributeElement(personInfo_mobile,"value"),RandomMobileNumber);
		
		WebUI.clickElement(edit_SaveAndClose_Button);
		WebUI.sleep(1);

		WebUI.verifyElementNotVisible(edit_PersonHeader);
		
		WebUI.clickElement(globalPersonIcon);
		WebUI.sleep(1);
		WebUI.verifyEquals(getAttributeElement(personInfo_FirstName,"value"), Random_FirstName);
		WebUI.verifyEquals(getAttributeElement(personInfo_LastName,"value"), RandomLastname);
		WebUI.verifyEquals(getAttributeElement(personInfo_email,"value"), RandomEmailAddress);
		
		WebUI.clickElement(edit_Clear_Button);
		WebUI.sleep(1);
		
		WebUI.verifyEquals(WebUI.getAttributeElement(personInfo_FirstName,"value"), "");
		WebUI.verifyEquals(WebUI.getAttributeElement(personInfo_LastName,"value"), "");
		WebUI.verifyEquals(WebUI.getAttributeElement(personInfo_zipcode,"value"), "");
		WebUI.verifyEquals(WebUI.getAttributeElement(personInfo_email,"value"), "");
		
		
		
		WebUI.clickElement(edit_Close_Button);
		WebUI.sleep(0.5);
		WebUI.verifyElementNotVisible(edit_PersonHeader);
		
		
		WebUI.clickElement(globalPersonIcon);
		WebUI.sleep(1);
		WebUI.verifyEquals(WebUI.getAttributeElement(personInfo_FirstName,"value"), Random_FirstName);
		WebUI.verifyEquals(WebUI.getAttributeElement(personInfo_LastName,"value"), RandomLastname);
		WebUI.clickElement(edit_Clear_Button);
		WebUI.clickElement(edit_SaveAndClose_Button);
		
		WebUI.clickElement(globalPersonIcon);
		WebUI.sleep(1);
		WebUI.verifyEquals(WebUI.getAttributeElement(personInfo_FirstName,"value"), "");
		WebUI.verifyEquals(WebUI.getAttributeElement(personInfo_LastName,"value"), "");
		
		String Random_FirstName_2 = DataGenerateUtils.randomFirstName();
		WebUI.setText(personInfo_FirstName, Random_FirstName_2);
		WebUI.sleep(1);
		WebUI.verifyEquals(WebUI.getAttributeElement(personInfo_FirstName,"value"), Random_FirstName_2);
		String RandomLastName_2 = DataGenerateUtils.randomMiddleName();
		WebUI.clearAndFillText(personInfo_LastName, RandomLastName_2);
		WebUI.setText(personInfo_address1,RandomAddress);
		WebUI.sleep(0.4);
		WebUI.verifyContains(getAttributeElement(personInfo_address1,"value"),RandomAddress);
		WebUI.clearAndFillText(personInfo_address2, RandomAddress2);
		
		WebUI.clickElement(edit_Close_Button);
		WebUI.verifyElementNotVisible(edit_PersonHeader);
		WebUI.clickElement(globalPersonIcon);
		WebUI.sleep(0.4);
		WebUI.verifyEquals(getAttributeElement(personInfo_FirstName,"value"), "");
		WebUI.verifyEquals(getAttributeElement(personInfo_LastName,"value"), "");
		
		WebUI.clearAndFillText(personInfo_FirstName, Random_FirstName);
		WebUI.clearAndFillText(personInfo_LastName, RandomLastname);
		WebUI.selectOptionByText(personInfo_genderDropdown, PropertiesHelpers.getValue("gender"));
		WebUI.setText(personInfo_dob, PropertiesHelpers.getValue("date_Of_Birth"));
		WebUI.clearAndFillText(personInfo_ssn_no,RandomSSNNumber);
		WebUI.clearAndFillText(personInfo_address1,RandomAddress);
		WebUI.clearAndFillText(personInfo_address2,RandomAddress2);
		WebUI.clearAndFillText(personInfo_city, PropertiesHelpers.getValue("benif_City"));
		WebUI.setText(personInfo_state_dropdown, "Tx",Keys.ENTER);
		WebUI.clearAndFillText(personInfo_zipcode, PropertiesHelpers.getValue("benif_Zip"));
		WebUI.clearAndFillText(personInfo_email,RandomEmailAddress);
		WebUI.clearAndFillText(personInfo_phone, PropertiesHelpers.getValue("benif_phone"));
		WebUI.clearAndFillText(personInfo_mobile,RandomMobileNumber);
		WebUI.clickElement(edit_SaveAndClose_Button);
		
		//============ Proposed insured info person (Copy) popup validation ====================================================
		WebUI.sleep(2);
		WebUI.clickElementWithJs(infoPersonIcon);
		WebUI.sleep(1);
		WebUI.verifyElementVisible(infoPersonPopup_Header);
		WebUI.verifyElementPresent(dataAndAddRadioButton);
		WebUI.verifyElementPresent(addressOnlyRadioButton);
		
		WebUI.verifyEquals(getAttributeElement(personInfo_FirstName,"value"), Random_FirstName);
		WebUI.verifyEquals(getAttributeElement(personInfo_LastName,"value"),RandomLastname);
		WebUI.verifyEquals(getAttributeElement(personInfo_ssn_no,"value"), RandomSSNNumber);
		WebUI.verifyEquals(getAttributeElement(personInfo_email,"value"), RandomEmailAddress);
		WebUI.verifyEquals(getAttributeElement(personInfo_mobile,"value"), RandomMobileNumber);
		
		WebUI.clearAndFillText(personInfo_MiddleName, RandomMiddlename);
		WebUI.sleep(0.3);
		WebUI.verifyEquals(getAttributeElement(personInfo_MiddleName,"value"), RandomMiddlename);
		
		WebUI.verifyElementEnabled(personInfo_dob);
		WebUI.verifyElementEnabled(personInfo_gender);
		WebUI.verifyElementEnabled(personInfo_city);
		WebUI.verifyElementEnabled(personInfo_state_dropdown);
		WebUI.verifyElementEnabled(personInfo_zipcode);
		WebUI.verifyElementEnabled(personInfo_phone);
		
		WebUI.scrollToElementAtTop(addressOnlyRadioButton);
		WebUI.sleep(0.2);
		WebUI.clickElementWithJs(addressOnlyRadioButton);
		WebUI.sleep(0.3);
		WebUI.scrollToElementAtBottom(infoPersonPopup_CopyButton);
		WebUI.sleep(0.2);
		WebUI.clickElement(infoPersonPopup_CopyButton);
		WebUI.sleep(0.5);
		WebUI.verifyElementNotVisible(infoPersonPopup_Header);
		WebUI.verifyContains(getAttributeElement(StateDropdown,"value"),"TX");
		
		WebUI.clickElementWithJs(infoPersonIcon);
		WebUI.sleep(1);
		WebUI.verifyElementVisible(infoPersonPopup_Header);
		WebUI.clickElementWithJs(dataAndAddRadioButton);
		WebUI.scrollToElementAtBottom(infoPersonPopup_CopyButton);
		WebUI.sleep(0.2);
		WebUI.clickElement(infoPersonPopup_CopyButton);
		WebUI.sleep(0.5);
		WebUI.verifyElementNotVisible(infoPersonPopup_Header);
		WebUI.verifyEquals(getAttributeElement(FirstName,"value"),Random_FirstName);
		WebUI.verifyEquals(getAttributeElement(MiddleName,"value"), RandomMiddlename);
		WebUI.verifyEquals(getAttributeElement(LastName,"value"), RandomLastname);
//		WebUI.verifyContains(getAttributeElement(DateOfBirth,"value"),PropertiesHelpers.getValue("date_Of_Birth"));
		
		WebUI.clickElementWithJs(infoPersonIcon);
		WebUI.sleep(1);
		WebUI.clickElement(edit_Clear_Button);
		WebUI.sleep(0.5);
		WebUI.verifyEquals(getAttributeElement(personInfo_FirstName,"value"), "");
		WebUI.verifyEquals(getAttributeElement(personInfo_LastName,"value"), "");
		WebUI.verifyEquals(getAttributeElement(personInfo_ssn_no,"value"), "");
		WebUI.verifyEquals(getAttributeElement(personInfo_zipcode,"value"), "");
		WebUI.verifyEquals(getAttributeElement(personInfo_email,"value"), "");
		
		WebUI.clickElement(edit_Close_Button);
		WebUI.sleep(0.2);
		WebUI.verifyElementNotVisible(infoPersonPopup_Header);
		
		WebUI.clickElementWithJs(infoPersonIcon);
		WebUI.sleep(0.5);
		WebUI.clickElement(edit_Clear_Button);
		WebUI.scrollToElementAtBottom(infoPersonPopup_CopyButton);
		WebUI.clickElement(infoPersonPopup_CopyButton);
		WebUI.sleep(1);
//*/		
		
//	===============================================================================================================================	
//	===============================================================================================================================	
//	===============================================================================================================================	
//	===============================================================================================================================	
		
		WebUI.scrollToElementAtBottom(calculate);
		WebUI.verifyElementClickable(calculate);
		WebUI.clickElement(calculate);
		WebUI.clickElementWithJs(calculate);
		WebUI.scrollToElementAtBottom(page_Error);
		WebUI.verifyElementPresent(page_Error, "Error message not displayed");

		WebUI.verifyContains(getTextElement(page_Error).trim(), Page_Error_);

		WebUI.scrollToElementAtBottom(calculate);
		WebUI.clickElement(calculate);
		WebUI.clickElementWithJs(calculate);
		WebUI.scrollToElementAtTop(FirstName);
		WebUI.verifyElementVisible(FirstName, "First Name textbox not displayed");
		
		WebUI.verifyContains(getTextElement(Error_Message_FirstName).trim(), Mandate_Error);

		WebUI.sleep(1);
		WebUI.scrollToElementAtTop(insuredInfoElement);
		WebUI.clearText(FirstName);
		WebUI.setText(FirstName, Max_Char);
		WebUI.sleep(0.5);
		WebUI.verifyElementVisible(Error_Message_FirstName);	
		WebUI.verifyContains(getTextElement(Error_Message_FirstName).trim(), Max_Error);	
		Randomfirstname = DataGenerateUtils.randomFirstName();
		WebUI.clearAndFillText(FirstName,Randomfirstname);
		WebUI.sleep(0.5);
		WebUI.verifyContains(getAttributeElement(FirstName,"value"),Randomfirstname);
		
		WebUI.clearText(MiddleName);
		WebUI.setText(MiddleName, Max_Char);
		WebUI.verifyElementVisible(Error_Message_MiddleName);
		WebUI.verifyContains(getTextElement(Error_Message_MiddleName).trim(), Max_Error);
		

		String RandomMiddleName = DataGenerateUtils.randomMiddleName();
		WebUI.clearAndFillText(MiddleName,RandomMiddleName);
		WebUI.sleep(0.5);
		WebUI.verifyContains(getAttributeElement(MiddleName,"value"),RandomMiddleName);

		WebUI.verifyContains(getTextElement(Error_Message_LastName).trim(), Mandate_Error);

		WebUI.clearText(LastName);
		WebUI.setText(LastName, Max_Char);
		WebUI.verifyElementVisible(Error_Message_LastName);
		WebUI.verifyContains(getTextElement(Error_Message_LastName).trim(), Max_Error);


		String RandomLastName = DataGenerateUtils.randomLastName();
		WebUI.clearAndFillText(LastName,RandomLastName);
		WebUI.sleep(0.5);
		WebUI.verifyContains(getAttributeElement(LastName,"value"),RandomLastName);
		
		WebUI.verifyContains(getTextElement(Error_Message_State).trim(), Mandate_Error);

		WebUI.verifyElementClickable(StateDropdown);
		WebUI.clickElement(StateDropdown);
		WebUI.clickElementWithJs(StateDropdown);	
		WebUI.sleep(1);
		WebUI.clickElement(state);
		WebUI.clickElementWithJs(state);
		WebUI.verifyContains(getAttributeElement(StateDropdown,"value"), getAttributeElement(StateDropdown,"value"));

		WebUI.verifyContains(getTextElement(Error_Message_Gender).trim(), Mandate_Error);
		
		WebUI.selectOptionByText(genderDropdown, PropertiesHelpers.getValue("gender"));

		WebUI.verifyContains(getAttributeElement(genderDropdown,"value"), getAttributeElement(genderDropdown,"value"));

		
//		========================== DOB Validation ========================================================================================

		WebUI.verifyContains(getTextElement(Error_Message_DateOfBirth).trim(), Mandate_Error);
		
//		------------------------------ Calendar and Age Validation-----------------------------------------------------
/*		WebUI.moveByOffsetWithRobotAndClick(1525, 265,1);	//Move Slider to top
		WebUI.moveByOffsetWithRobotAndClick(660, 550, 0);	//Click on Calendar
		WebUI.sleep(0.5);
		WebUI.moveByOffsetWithRobotAndClick(680, 516, 0);	//Click on Today
		WebUI.sleep(0.5);
		WebUI.verifyContains(getAttributeElement(DateOfBirth,"value"),WebUI.getCurrentDate());
		WebUI.moveByOffsetWithRobotAndClick(660, 550, 0);	//Click on Calendar
		WebUI.sleep(0.5);
		WebUI.moveByOffsetWithRobotAndClick(535, 516, 0);	//Click on Clear
		WebUI.sleep(0.5);
		WebUI.verifyContains(getAttributeElement(DateOfBirth,"value"),"");
		WebUI.verifyEquals(getAttributeElement(age,"value"), "NaN");
		WebUI.sleep(0.2);
		WebUI.moveByOffsetWithRobotAndClick(660, 550, 0);	//Click on Calendar
		WebUI.sleep(0.2);
		WebUI.moveByOffsetWithRobotAndClick(695, 285, 0);	//Click on Down Arrow
		WebUI.sleep(0.5);
		WebUI.moveByOffsetWithRobotAndClick(554, 404, 0);	//Click on Future date
		WebUI.sleep(0.5);
		WebUI.verifyContains(getAttributeElement(age,"value"), "-1");
*/		
//		----------------------------------------------------------------------------------------------------------------	
		
		
//		C.DOB_(driver, DateOfBirth, "01011938", e, Test.Case1(15),Test.Exp1(15));
		WebUI.clearAndFillText(DateOfBirth, "01011938");
		WebUI.sleep(0.2);
		
		WebUI.verifyContains(getTextElement(Error_Message_ApplicantLocation), Mandate_Error);

//		C.C2(driver, signedStateDropdown, SignedState, e,Test.Case1(22),Test.Exp1(22));
/*		WebUI.verifyElementClickable(signedStateDropdown);
		WebUI.clickElementWithJs(signedStateDropdown);
		WebUI.sleep(1);
		WebUI.setText(signedStateDropdown, statex);
*/
		int iteration = 1;
		int countryCount = 1;
		for(String licState : HomePage.licenseStateTexts)
		{
			try {
				
			Select sel = new Select(WebUI.getWebElement(signedStateDropdown));
			WebUI.sleep(1);
			System.out.println("State ******************************************************: "+licState);
			
			sel.selectByValue(licState);
			WebUI.sleep(0.5);
			WebUI.logInfoMessage("Selected State: "+WebUI.getAttributeElement(signedStateDropdown, "value"));
			WebUI.sleep(1);
			
			if(iteration==1)
				{WebUI.verifyContains(getTextElement(Error_Message_Language), Mandate_Error);}

			WebUI.verifyElementClickable(preferredlanguage);
			WebUI.clickElementWithJs(preferredlanguage);
			WebUI.sleep(0.5);
			WebUI.clickElement(language);
			
			WebUI.scrollToElementAtBottom(plan);
			WebUI.sleep(0.2);
			WebUI.clickElementWithJs(Call_Yes);
			WebUI.sleep(0.2);
			WebUI.clickElementWithJs(Call_No);
			
			WebUI.scrollToElementAtBottom(calculate);
			WebUI.verifyElementVisible(calculate);
			
			if(iteration==1)
			{WebUI.verifyContains(getTextElement(ErrorMessage_BasePlan).trim(), Mandate_Error);}

//			C.C2(driver, plan, selectPlan, e, Test.Case1(30),Test.Exp1(30));
			WebUI.verifyElementClickable(plan);
			WebUI.clickElementWithJs(plan);
			WebUI.sleep(1);
			
//			WebUI.clickElement(selectPlan_CICA);
			WebUI.selectOptionByIndex(plan, 1);
			WebUI.sleep(2);
			WebUI.clickElementWithJs(calculate);
			WebUI.sleep(1);
			
			//For Notice Popup
			try {
				DriverManager.getDriver().findElement(impNotice_Popup).isDisplayed();
				WebUI.sleep(0.5);
				WebUI.clickElement(impNotice_Popup);
				
			}catch(Exception ex)
			{
				System.out.println("Notice Popup Did Not Appear. "+ex.getMessage());
			}

			if(iteration==1)
			{WebUI.verifyContains(getTextElement(ErrorMessage_FaceAmount).trim(), Mandate_Error);}
			
			WebUI.clearAndFillText(FaceAmount, "30000");
			WebUI.sleep(0.2);
			if(iteration==1)
			{WebUI.verifyContains(getAttributeElement(FaceAmount,"value"), "30000"); }
			
			//For Notice Popup
			try {
				DriverManager.getDriver().findElement(impNotice_Popup).isDisplayed();
				WebUI.sleep(0.5);
				WebUI.clickElement(impNotice_Popup);
				
			}catch(Exception ex)
			{
				System.out.println("Notice Popup Did Not Appear. "+ex.getMessage());
			}
			
			WebUI.scrollToElementAtBottom(calculate);
			WebUI.sleep(0.2);
			WebUI.clickElement(calculate);
			
			WebUI.scrollToElementAtTop(DateOfBirth);  //errorMessageAge- Element ....... age_Max_Error - String
			WebUI.sleep(0.2);
			
			if(iteration==1)
			{WebUI.verifyContains(getTextElement(errorMessageAge).trim(), age_Max_Error); }
			
			WebUI.clearAndFillText(DateOfBirth, "01011940");
			WebUI.sleep(0.2);
			WebUI.scrollToElementAtBottom(calculate);
			WebUI.sleep(0.2);
			WebUI.clickElement(calculate);
			WebUI.sleep(0.2);
			WebUI.scrollToElementAtTop(DateOfBirth);
			WebUI.sleep(0.2);
			WebUI.verifyElementVisible(ErrorMessage_FaceAmount);
			if(iteration==1)
			{WebUI.verifyContains(getTextElement(ErrorMessage_FaceAmount), "The maximum amount is 10000.");}
			
			WebUI.scrollToElementAtTop(DateOfBirth);
			WebUI.sleep(0.2);
			WebUI.clearAndFillText(DateOfBirth, "01011970");
			WebUI.sleep(0.2);
			WebUI.scrollToElementAtBottom(calculate);
			WebUI.sleep(0.2);
			WebUI.clickElement(calculate);
			WebUI.scrollToElementAtTop(DateOfBirth);
			WebUI.sleep(0.2);
			WebUI.verifyElementVisible(ErrorMessage_FaceAmount);
			if(iteration==1)
			{WebUI.verifyContains(getTextElement(ErrorMessage_FaceAmount), "The maximum amount is 20000.");}
			
			WebUI.scrollToElementAtTop(DateOfBirth);
			WebUI.sleep(0.2);
			WebUI.clearAndFillText(DateOfBirth, "01011991");
			WebUI.sleep(0.2);
			WebUI.scrollToElementAtBottom(calculate);
			WebUI.sleep(0.2);
			WebUI.clickElement(calculate);
			
			//For Notice Popup
			try {
				DriverManager.getDriver().findElement(impNotice_Popup).isDisplayed();
				WebUI.sleep(0.5);
				WebUI.clickElement(impNotice_Popup);
				
			}catch(Exception ex)
			{
				System.out.println("Notice Popup Did Not Appear. "+ex.getMessage());
			}
			
			WebUI.scrollToElementAtBottom(FaceAmount);
			
			
//			==================================================================================================================================
//			==================================================================================================================================
			

//			C.Max_Char_Scroll(driver, act, FaceAmount, calculate, ErrorMessage_FaceAmount, "Testing", Test.Err_Msg(2, 4, 4), e, Test.Case1(33),Test.Exp1(33));
			WebUI.clearText(FaceAmount);
			WebUI.sleep(0.2);
			WebUI.setText(FaceAmount, "Testing");
			WebUI.moveToElement(calculate);
			WebUI.clickElement(calculate);
			WebUI.verifyElementVisible(ErrorMessage_FaceAmount);
			WebUI.verifyContains(getTextElement(ErrorMessage_FaceAmount), "Please use a number format.");

//			C.Max_Char(driver, FaceAmount, ErrorMessage_FaceAmount, "30001", Fc_MxErr, e,  Test.Case1(34),Test.Exp1(34));
			WebUI.scrollToElementAtTop(FaceAmount);
			WebUI.clearText(FaceAmount);
			WebUI.sleep(0.2);
			WebUI.setText(FaceAmount, "30001");
			WebUI.sleep(0.5);
			WebUI.verifyElementVisible(ErrorMessage_FaceAmount);
			WebUI.verifyContains(getTextElement(ErrorMessage_FaceAmount).trim(), Fc_MxErr);

//			C.SC_C_Send(driver, act, calculate,FaceAmount, ErrorMessage_FaceAmount, "999", Fc_MnErr, e, Test.Case1(35),Test.Exp1(35));
			WebUI.scrollToElementAtBottom(calculate);
			WebUI.sleep(0.5);
			WebUI.clickElement(calculate);
			WebUI.sleep(1);
			WebUI.clearAndFillText(FaceAmount, "999");
			WebUI.verifyElementVisible(ErrorMessage_FaceAmount);
			WebUI.verifyContains(getTextElement(ErrorMessage_FaceAmount).trim(), Fc_MnErr);


//			C.Send_verify_Valid_C(driver, FaceAmount, e, "3001", Test.Case1(32),Test.Exp1(32));
			WebUI.clearText(FaceAmount);
			WebUI.sleep(0.2);
//			WebUI.setText(FaceAmount, "3001");
			int fAmountGenerated = DataGenerateUtils.random4DigitNumberLessThan30000();
			WebUI.clearAndFillText(FaceAmount,String.valueOf(fAmountGenerated));
			WebUI.sleep(0.2);
			System.out.println(fAmountGenerated);
			WebUI.verifyContains(getAttributeElement(FaceAmount,"value"),String.valueOf(fAmountGenerated));

//			C.Clk_Is_Enabled(driver, Annually, e,  Test.Case1(42),Test.Exp1(42));
			WebUI.verifyElementClickable(Annually);
			WebUI.clickElement(Annually);
			
//			C.Clk_Is_Enabled(driver, Semi_Annually, e,  Test.Case1(43),Test.Exp1(43));
			WebUI.verifyElementClickable(Semi_Annually);
			WebUI.clickElement(Semi_Annually);
			
//			C.Clk_Is_Enabled(driver, Quarterly, e,  Test.Case1(44),Test.Exp1(44));
			WebUI.verifyElementClickable(Quarterly);
			WebUI.clickElement(Quarterly);
			
//			C.Clk_Is_Enabled(driver, Monthly, e,  Test.Case1(45),Test.Exp1(45));
			WebUI.verifyElementClickable(Monthly);
			WebUI.clickElement(Monthly);
			
//			C.Clk_Is_Enabled(driver, Yes, e, Test.Case1(46),Test.Exp1(46));
			WebUI.verifyElementClickable(Yes);
			WebUI.clickElement(Yes);
			
//			C.Clk_Is_Enabled(driver, No, e,  Test.Case1(47),Test.Exp1(47));
			WebUI.verifyElementClickable(No);
			WebUI.clickElement(No);
			WebUI.clickElement(calculate);
			
//			C.page_Navigation(driver, act, Nextstep_1, step_2, e, Test.Case1(59),Test.Exp1(59));
			WebUI.moveToElement(Nextstep_1);
			WebUI.clickElement(Nextstep_1);
			WebUI.waitForPageLoaded();
			WebUI.sleep(1);
			
				try {
						WebUI.verifyElementVisible(step_2);
						WebUI.sleep(1.5);
						WebUI.clickElement(step1);
						WebUI.sleep(1);
						
						//For Notice Popup
						try {
							DriverManager.getDriver().findElement(impNotice_Popup).isDisplayed();
							WebUI.sleep(0.5);
							WebUI.clickElement(impNotice_Popup);
							
						}catch(Exception ex)
						{
							System.out.println("Notice Popup Did Not Appear. "+ex.getMessage());
						}
				}
				catch(Exception Ex1)
				{
					try {
						WebUI.verifyElementVisible(appointmentAcknowledgement);
						WebUI.clickElement(appointmentAcknowledgement);
						WebUI.sleep(0.5);
						WebUI.clickElement(agentLicense);
						WebUI.sleep(0.2);
						WebUI.clickElement(TableOfContent_BackButton);
					}
					catch(Exception Ex2)
					{
						try {
							WebUI.verifyElementVisible(agentLicense);
							WebUI.clickElement(agentLicense);
							WebUI.sleep(0.2);
							WebUI.clickElement(TableOfContent_BackButton);
						}
						catch(Exception Ex3)
						{
							System.out.println("No popup found: "+ Ex3.getMessage());
						}
					}
				}

			}
			catch(Exception Ex)
			{
				System.out.println("-------------------------------------------------");
				System.out.println("No State found in Dropdown"+ licState);
				System.out.println("-------------------------------------------------");
				continue;
			}
			
			iteration++;
			countryCount++;
			
			if(countryCount==2)
				break;
		}
		
		
/*	//$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		
*/	//$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		
		WebUI.sleep(0.5);
		WebUI.scrollToElementAtBottom(calculate);
		WebUI.sleep(0.5);
		WebUI.clickElement(calculate);
		WebUI.sleep(2);
		WebUI.moveToElement(Nextstep_1);
		WebUI.clickElementWithJs(Nextstep_1);
		WebUI.sleep(2);
		WebUI.waitForPageLoaded();
		WebUI.verifyElementVisible(step_2);

		
	}
}




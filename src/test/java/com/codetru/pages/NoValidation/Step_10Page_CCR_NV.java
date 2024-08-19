package com.codetru.pages.NoValidation;

import static com.codetru.keywords.WebUI.getAttributeElement;
import static com.codetru.keywords.WebUI.getTextElement;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.codetru.driver.DriverManager;
import com.codetru.helpers.PropertiesHelpers;
import com.codetru.keywords.WebUI;
import com.codetru.project.cica.CommonPageCICA;
import com.codetru.utils.DataGenerateUtils;

public class Step_10Page_CCR_NV extends CommonPageCICA {
	
	private By MakePayment_Step_9 = By.xpath("//span[text()='Step 9: Make a Payment']");
	
	private By nextButton = By.xpath("//ion-button[normalize-space()='Next']");
	
	private By wait_ion_padding = By.xpath("(//ion-content[contains(@class, ion-padding)])[6]");
		
	private By nextButton_PolicyPayment = By.xpath("//ion-button[normalize-space()='Next']");
	
	private By waitUntill = By.xpath("(//ion-content[contains(@class, ion-padding)])[6]");
	
	private By nxtBtn = By.xpath("(//ion-col/ion-button[@size='small' and @color='primary'])[1]");
	
	private By Disclaimeryes = By.xpath("//ion-checkbox[@formcontrolname='disclaimerYes']");
	
	private By Error_PolicyPayment_Relationship = By.xpath("//ion-label[.=' Relationship']/parent::ion-item/following-sibling::div[.=' Please enter a value. ']");
	
	private By ErrorMessage_PolicyPayment_PaymentType = By.xpath("(//ion-col[@size='24' and @size-md='8' and @class='md hydrated'])[5]");
	
	private By RelationShipDropDown = By.xpath("//select[@formcontrolname='Relationship']");
	
	private By RelationShip_Parent = By.xpath("//option[.='Parent ']");
	
	private By PaymentType = By.xpath("//select[@formcontrolname='PaymentType']");
	
	private By PaymentType_premium = By.xpath("//option[.='Premium']");
	
	private By NextBtn_BillingPage = By.xpath("//ion-button[@color='primary' and @size-md='8']");
	
	private By Error_FormOfPayment = By.xpath("(//h3[.='Payment Preferences']/following-sibling::ion-row/ion-col[@size='24'])[1]");
	
	private By CreditCard = By.xpath("(//ion-radio[@slot='start' and @aria-checked='false'])[1]");
	
	private By Error_ReccuringPayemtns = By.xpath("(//h3[.='Payment Preferences']/following-sibling::ion-row/ion-col[@size='24'])[2]");
	
	private By Reccuring_CheckBox = By.xpath("//ion-checkbox[@role='checkbox']");
	
	private By Error_BillignFirstName = By.xpath("(//h3[.='Billing Information']/following-sibling::ion-row/ion-col[@size='24' and @size-md='12'])[1]");
	
	private By BillingFirstName = By.xpath("//ion-input[@formcontrolname='CardHolderFirstName']/input");
	
	private By Error_BillignLastName = By.xpath("(//h3[.='Billing Information']/following-sibling::ion-row/ion-col[@size='24' and @size-md='12'])[2]");
	
	private By BillingLastName = By.xpath("//ion-input[@formcontrolname='CardHolderLastName']/input");
	
	private By billingZipCode = By.xpath("//ion-input[@formcontrolname='Zip']/input");
	
	private By Error_BillignStreetAddress = By.xpath("(//h3[.='Billing Information']/following-sibling::ion-row/ion-col[@size='24' and @class='md hydrated'])[3]");
	
	private By billingStreetAddress = By.xpath("//ion-input[@formcontrolname='StreetAddress']/input");
	
	private By Error_BillignCityAndRegion = By.xpath("(//h3[.='Billing Information']/following-sibling::ion-row/ion-col[@size='24' and @class='md hydrated'])[4]");
	
	private By billingCityAndRegion = By.xpath("//ion-input[@formcontrolname='City']/input");
	
	private By Error_BillignState = By.xpath("(//h3[.='Billing Information']/following-sibling::ion-row/ion-col[@size='24' and @class='md hydrated'])[5]");
	
	private By billingState = By.xpath("//select[@formcontrolname='State']");
	
	private By StateSelection = By.xpath("//option[.=' Arkansas']");
	
	private By Error_BillignZipCode = By.xpath("(//h3[.='Billing Information']/following-sibling::ion-row/ion-col[@size='24' and @class='md hydrated'])[6]");
	
	private By Error_BillignCountry = By.xpath("(//h3[.='Billing Information']/following-sibling::ion-row/ion-col[@size='24' and @class='md hydrated'])[7]");
	
	private By billingCountry = By.xpath("//select[@formcontrolname='Country']");
	
	private By billingCountrySelection = By.xpath("//option[.=' COLOMBIA']");
	
	private By Error_BillignPhoneNumber = By.xpath("(//h3[.='Billing Information']/following-sibling::ion-row/ion-col[@size='24' and @class='md hydrated'])[8]");
	
	private By BillingPhoneNumber = By.xpath("//ion-input[@formcontrolname='Phone']/input");
	
	private By Error_BillignEmailAddress = By.xpath("(//h3[.='Billing Information']/following-sibling::ion-row/ion-col[@size='24' and @class='md hydrated'])[9]");
	
	private By BillingEmailAddress = By.xpath("//ion-input[@formcontrolname='Email']/input");
	
	private By CardNumber = By.xpath("//input[@name='cardNumber']");
	
	private By cardHolderName = By.id("cardholderName");
	
	private By Error_CardNumber = By.id("cardNumber-hint");
	
	private By Error_CardHoldername = By.id("cardholderName-hint");
	
	private By ExpiryMonth = By.id("expiryMonth");
	
	private By Error_ExpiryMonth = By.id("expiryDate-hint");
	
	private By ExpiryYear = By.id("expiryYear");
	
	private By Error_ExpiryYear = By.id("expiryDate-hint");
	
	private By SecurityCode = By.id("securityCode");
	
	private By Error_SecurityCode = By.id("securityCode-hint");
	
	private By SecurityCode_PInHintVisa_Master = By.id("pin-helptxt");
	
	private By MakePayment = By.id("submitButton");
	
	private By mail_Id = By.xpath("//input[@id='ReceiptEmail']");
 
	private By send_btn = By.xpath("//input[@name='sendReceipt']");
 
	private By email_field = By.id("login");
 
	private By submit = By.id("refreshbut");
 
	private By email_from =By.xpath("(//span[contains(text(),'Citizensinc.com')])");
 
	private By reciept = By.xpath("//a[@title='Receipt.pdf']");
 
	private By email_inbox = By.xpath("(//span[contains(text(),'Citizensinc.com')])");
 
	private By open_file = By.xpath("return document.querySelector('downloads-manager').shadowRoot.querySelector('downloads-item').shadowRoot.querySelector('div>div>div>a')");
 
	//--------------------------------------------------------------------------------------------
	//ACH Payment Method ---------NOT USING THIS PAYMENT METHOD
	private By ACh = By.xpath("//ion-label[text()='ACH (Automated Clearing House) ']/following-sibling::ion-radio[@slot='start']");
	private By Error_AcountType = By.xpath("(//ion-row[@class='md hydrated']/ion-col[@size='24' and @size-md='12' and @class='md hydrated'])[2]");
	private By AcountType = By.xpath("//select[@formcontrolname='AccountType']");
	private By SavingType = By.xpath("//option[.=' Checking ']");
	private By Error_AcountNumber = By.xpath("(//ion-row[@class='md hydrated']/ion-col[@size='24' and @size-md='12' and @class='md hydrated'])[3]");
	private By AcountNumber = By.xpath("//ion-input[@formcontrolname='AccountNumber']/input");
	private By Error_RoutingNumber = By.xpath("//ion-input[@formcontrolname='RoutingNumber']/parent::ion-item/parent::ion-col");
	private By RountingNumber = By.xpath("//ion-input[@formcontrolname='RoutingNumber']/input");
	
	//-----------------------------------------------------------------------------------------------
//	private By recipientEmail = By.id("ReceiptEmail");
//	private By sendReceiptBtn = By.id("sendReceipt");
//	private By loginID = By.id("login");
//	private By refreshButton = By.id("refreshbut");
	private By insuredPolicyNumber = By.xpath("//tbody/tr/td[1]");
	public static String PolicyNumber;
	

	public void Make_a_Payment() throws Exception {

		String Max_Name = "PaymentasdfgaedfsdfgwSEDFGASDFGBASDFGBASDFGASDFGBASDFGSADF1234sdfsghdsfghjdfgh2345";
		String max_name = "sadfgsadfgsadfghasfgasdfghsadfgasdfghsadfghsdafghjasdfgn";
		String Max_error_70 ="The maximum number of characters is 70";
		String Max_error_50 ="The maximum number of characters is 50";
		String Mandatory_Err = "Please enter a value.";
		String billing_FMax_Name = "qwertyuiopasdfghj";
		String billing_FMax_Name_Err = "The maximum number of characters is 15.";
		String billing_City_Max_Err = "The maximum number of characters is 40.";
		String billing_Zip_Format_Err = "Please use a number format.";
		String billing_Zip_Max_Char_Err = "The minimum number of characters is 5.";
		String billing_Ph_Format_Err = "Please use a number format.";
		String billing_Ph_Min_Char_Err = "The minimum number of characters is 10.";
		String billing_Ph_Max_Char_Err = "The maximum number of characters is 10.";
		String billing_Email_Format_Err = "Email is not in the correct format";
		String billing_Email_Max_Char_Err = "The maximum number of characters is 50.";
		String billing_Invalid_Card_Err = "Enter a valid card number";
		String billing_Card_Holder_Name_Err = "Enter a valid cardholder's name";
		String billing_Card_Month_Err = "Enter a valid month";
		String billing_Card_Year_Err = "Enter a valid year";
		String billing_Card_PastYear_Err = "Expiry date must be in the future";
		String billing_Card_SecuCode_Err = "Enter a valid security code";
		String billing_Pin_Hint = "Last 3 digits on the back of card";
		String billing_Pin_Hint_Front = "4 digits on the front of card";

		WebUI.sleep(2);
		WebUI.clickElement(MakePayment_Step_9);
		WebUI.sleep(2);
		
		WebUI.clickElement(RelationShipDropDown,2);
		
		WebUI.clickElement(RelationShip_Parent,2);
		
		WebUI.clickElement(PaymentType,2);
		
		WebUI.clickElement(PaymentType_premium);
		WebUI.sleep(1);
		
		WebUI.clickElement(nextButton);

		WebUI.scrollToElementAtBottom(nxtBtn);
		WebUI.sleep(1);
		
		WebUI.clickElement(Disclaimeryes);
		WebUI.sleep(1);
		WebUI.clickElement(nxtBtn);
		WebUI.sleep(2);
	
		WebUI.scrollToElementAtBottom(NextBtn_BillingPage);
		WebUI.sleep(1);
		WebUI.clickElement(NextBtn_BillingPage);
		WebUI.sleep(1);

		WebUI.scrollToElementAtBottom(Error_FormOfPayment);
		WebUI.verifyElementVisible(Error_FormOfPayment, 2);
		WebUI.verifyContains(getTextElement(Error_FormOfPayment).trim(), Mandatory_Err);
		
		WebUI.clickElement(CreditCard);
		WebUI.sleep(1);

		WebUI.scrollToElementAtBottom(Error_ReccuringPayemtns);
		WebUI.verifyElementVisible(Error_ReccuringPayemtns, 2);
		WebUI.verifyContains(getTextElement(Error_ReccuringPayemtns).trim(), Mandatory_Err);
		WebUI.sleep(1);
		
//		WebUI.clickElement(Reccuring_CheckBox); 		////// For Recurring Payment.

		String RandomBillingFirstName = DataGenerateUtils.randomFirstName();
		WebUI.clearAndFillText(BillingFirstName,RandomBillingFirstName);
		WebUI.sleep(1);
		WebUI.verifyContains(getAttributeElement(BillingFirstName,"value"),RandomBillingFirstName);
		
//		WebUI.scrollToElementAtBottom(Error_BillignLastName);
//		WebUI.verifyElementVisible(Error_BillignLastName, 2);
//		WebUI.verifyContains(getTextElement(Error_BillignLastName).trim(), Mandatory_Err);

		String RandomBillingLastName = DataGenerateUtils.randomLastName();
		WebUI.clearAndFillText(BillingLastName,RandomBillingLastName);
		WebUI.sleep(1);
		WebUI.verifyContains(getAttributeElement(BillingLastName,"value"),RandomBillingLastName);
		
//		WebUI.scrollToElementAtBottom(Error_BillignStreetAddress);
//		WebUI.verifyElementVisible(Error_BillignStreetAddress, 2);
//		WebUI.verifyContains(getTextElement(Error_BillignStreetAddress).trim(), Mandatory_Err);

		
		String RandomBillingAddress = DataGenerateUtils.randomShortAddress();
		WebUI.clearAndFillText(billingStreetAddress,RandomBillingAddress);
		WebUI.sleep(1);
		WebUI.verifyContains(getAttributeElement(billingStreetAddress,"value"),RandomBillingAddress);
		
//		WebUI.scrollToElementAtBottom(Error_BillignCityAndRegion);
//		WebUI.verifyElementVisible(Error_BillignCityAndRegion, 2);
//		WebUI.verifyContains(getTextElement(Error_BillignCityAndRegion).trim(), Mandatory_Err);

	
		String RandomBillingCity = DataGenerateUtils.randomCity();
		WebUI.clearAndFillText(billingCityAndRegion,RandomBillingCity);
		WebUI.sleep(1);
		WebUI.verifyContains(getAttributeElement(billingCityAndRegion,"value"),RandomBillingCity);
		
//		WebUI.scrollToElementAtBottom(Error_BillignState);
//		WebUI.verifyElementVisible(Error_BillignState, 2);
//		WebUI.verifyContains(getTextElement(Error_BillignState).trim(), Mandatory_Err);
	
		WebUI.verifyElementClickable(billingState);
		WebUI.clickElement(billingState);
		WebUI.sleep(1);
		WebUI.clickElement(StateSelection);

//		WebUI.scrollToElementAtBottom(Error_BillignZipCode);
//		WebUI.verifyElementVisible(Error_BillignZipCode, 2);
//		WebUI.verifyContains(getTextElement(Error_BillignZipCode).trim(), Mandatory_Err);

		WebUI.scrollToElementAtBottom(billingZipCode);
		String RandomBillingZipcode = DataGenerateUtils.randomZipCode();
		WebUI.clearAndFillText(billingZipCode,RandomBillingZipcode);
		WebUI.sleep(1);
		WebUI.verifyContains(getAttributeElement(billingZipCode,"value"),RandomBillingZipcode);

//		WebUI.scrollToElementAtBottom(Error_BillignCountry);
//		WebUI.verifyElementVisible(Error_BillignCountry, 2);
//		WebUI.verifyContains(getTextElement(Error_BillignCountry).trim(), Mandatory_Err);

		WebUI.scrollToElementAtBottom(billingCountry);
		WebUI.verifyElementClickable(billingCountry);
		WebUI.clickElement(billingCountry);
		WebUI.sleep(1);
		WebUI.clickElement(billingCountrySelection);

		WebUI.scrollToElementAtBottom(NextBtn_BillingPage);
		WebUI.verifyElementVisible(NextBtn_BillingPage);

//		WebUI.scrollToElementAtBottom(Error_BillignPhoneNumber);
//		WebUI.verifyElementVisible(Error_BillignPhoneNumber);
//		WebUI.verifyContains(getTextElement(Error_BillignPhoneNumber).trim(), Mandatory_Err);

		String RandomBillingPhone = DataGenerateUtils.randomPhoneNumber();
		WebUI.clearAndFillText(BillingPhoneNumber,RandomBillingPhone);
		WebUI.sleep(1);
		WebUI.verifyContains(getAttributeElement(BillingPhoneNumber,"value"),RandomBillingPhone);
		
//		WebUI.scrollToElementAtBottom(Error_BillignEmailAddress);
//		WebUI.verifyElementVisible(Error_BillignEmailAddress, 2);
//		WebUI.verifyContains(getTextElement(Error_BillignEmailAddress).trim(), Mandatory_Err);

		WebUI.scrollToElementAtBottom(BillingEmailAddress);
		String RandomBillingEmail = DataGenerateUtils.randomEmail();
		WebUI.clearAndFillText(BillingEmailAddress,RandomBillingEmail);
		WebUI.sleep(1);
		WebUI.verifyContains(getAttributeElement(BillingEmailAddress,"value"),RandomBillingEmail);

		WebUI.scrollToElementAtBottom(NextBtn_BillingPage);
		WebUI.sleep(1);
		WebUI.waitForElementVisible(NextBtn_BillingPage);
		WebUI.sleep(1);
		WebUI.clickElement(NextBtn_BillingPage);
		
		WebUI.sleep(1);
		WebUI.switchToFrameByIndex(0);
		WebUI.sleep(1);
		WebUI.switchToFrameByIndex(0);
		WebUI.sleep(1);
		
		WebUI.clickElement(CardNumber);
		WebUI.sleep(1);
		
//		WebUI.clearText(CardNumber);
//		WebUI.setText(CardNumber, "123456567");
//		WebUI.clickElement(cardHolderName);
//		WebUI.sleep(1);
//		WebUI.verifyElementVisible(Error_CardNumber);
//		WebUI.verifyContains(getTextElement(Error_CardNumber).trim(), billing_Invalid_Card_Err);
//		WebUI.sleep(1);
		
		
//		WebUI.clearText(CardNumber);
//		WebUI.setText(CardNumber, "5555555555554444124541");
//		WebUI.clickElement(cardHolderName);
//		WebUI.sleep(1);
//		WebUI.verifyElementVisible(Error_CardNumber);
//		WebUI.verifyContains(getTextElement(Error_CardNumber).trim(), billing_Invalid_Card_Err);
//		WebUI.sleep(1);
		
		WebUI.clearAndFillText(CardNumber, PropertiesHelpers.getValue("billing_Card_No"));
		WebUI.sleep(1);
		WebUI.verifyContains(getAttributeElement(CardNumber, "value"), PropertiesHelpers.getValue("billing_Card_No"));

//		WebUI.verifyContains(getTextElement(Error_CardHoldername).trim(), billing_Card_Holder_Name_Err);
		WebUI.sleep(1);


//		WebUI.clearText(cardHolderName);
//		WebUI.setText(cardHolderName, "12451232");
//		WebUI.clickElement(CardNumber);
//		WebUI.sleep(1);
//		WebUI.verifyElementVisible(Error_CardHoldername);
//		WebUI.verifyContains(getTextElement(Error_CardHoldername).trim(), billing_Card_Holder_Name_Err);
//		WebUI.sleep(1);

		WebUI.clearAndFillText(cardHolderName, PropertiesHelpers.getValue("billing_CardHolder_Name"));
		WebUI.sleep(1);
		WebUI.verifyContains(getAttributeElement(cardHolderName, "value"), PropertiesHelpers.getValue("billing_CardHolder_Name"));
	
//		WebUI.clickElement(ExpiryMonth);
//		WebUI.sleep(1);
//		WebUI.clickElement(CardNumber);
//		WebUI.sleep(1);
//		WebUI.verifyElementVisible(Error_ExpiryMonth);
//		WebUI.verifyContains(getTextElement(Error_ExpiryMonth).trim(), billing_Card_Month_Err);
//		WebUI.sleep(1);
	
//		WebUI.clickElement(CardNumber);
//		WebUI.clearAndFillText(ExpiryMonth, "13");
//		WebUI.sleep(1);
//		WebUI.clickElement(CardNumber);
//		WebUI.verifyElementVisible(Error_ExpiryMonth, 2);
//		WebUI.verifyContains(getTextElement(Error_ExpiryMonth).trim(), billing_Card_Month_Err);
//		WebUI.sleep(1);
		
		WebUI.clearAndFillText(ExpiryMonth, PropertiesHelpers.getValue("billing_Card_Exp_Mn"));
		WebUI.sleep(1);
		WebUI.verifyContains(getAttributeElement(ExpiryMonth, "value"), PropertiesHelpers.getValue("billing_Card_Exp_Mn"));

//		WebUI.clickElement(ExpiryYear);
//		WebUI.sleep(1);
//		WebUI.clickElement(CardNumber);
//		WebUI.sleep(1);
//		WebUI.verifyElementVisible(Error_ExpiryYear);
//		WebUI.verifyContains(getTextElement(Error_ExpiryYear).trim(), billing_Card_Year_Err);
//		WebUI.sleep(1);

//		WebUI.clearText(ExpiryYear);
//		WebUI.setText(ExpiryYear, "23");
//		WebUI.clickElement(CardNumber);
//		WebUI.sleep(1);
//		WebUI.verifyElementVisible(Error_ExpiryYear);
//		WebUI.verifyContains(getTextElement(Error_ExpiryYear).trim(), billing_Card_PastYear_Err);
//		WebUI.sleep(1);

		WebUI.clickElement(CardNumber);
		WebUI.clearAndFillText(ExpiryYear, PropertiesHelpers.getValue("billing_Card_Exp_Yr"));
		WebUI.sleep(1);
		WebUI.verifyContains(getAttributeElement(ExpiryYear, "value").trim(), PropertiesHelpers.getValue("billing_Card_Exp_Yr"));
		WebUI.sleep(1);
		
//		WebUI.clearText(SecurityCode);
//		WebUI.setText(SecurityCode, "12");
//		WebUI.clickElement(CardNumber);
//		WebUI.sleep(1);
//		WebUI.verifyElementVisible(Error_SecurityCode);
//		WebUI.verifyContains(getTextElement(Error_SecurityCode).trim(), billing_Card_SecuCode_Err);
//		WebUI.sleep(1);

		WebUI.clickElement(SecurityCode);
		WebUI.clearAndFillText(SecurityCode, PropertiesHelpers.getValue("billing_Card_Security_Code"));
		WebUI.sleep(1);
		WebUI.verifyContains(getAttributeElement(SecurityCode, "value").trim(), PropertiesHelpers.getValue("billing_Card_Security_Code"));
		WebUI.sleep(1);

//		WebUI.verifyContains(getTextElement(SecurityCode_PInHintVisa_Master).trim(), billing_Pin_Hint);
//		WebUI.sleep(1);

//		WebUI.clearText(CardNumber);
//		WebUI.setText(CardNumber, "371449635398431");
//		WebUI.clickElement(SecurityCode);
//		WebUI.sleep(1);
//		WebUI.verifyElementVisible(SecurityCode_PInHintVisa_Master);
//		WebUI.verifyContains(getTextElement(SecurityCode_PInHintVisa_Master).trim(), billing_Pin_Hint_Front);
//		WebUI.sleep(1);

		WebUI.clearAndFillText(CardNumber, PropertiesHelpers.getValue("billing_Card_No"));
		WebUI.sleep(1);
		WebUI.verifyContains(getAttributeElement(CardNumber, "value"), PropertiesHelpers.getValue("billing_Card_No"));

		WebUI.sleep(1);
		WebUI.clickElement(SecurityCode);
		WebUI.clearAndFillText(SecurityCode, PropertiesHelpers.getValue("billing_Card_Security_Code"));
		WebUI.sleep(1);
		WebUI.verifyContains(getAttributeElement(SecurityCode, "value").trim(), PropertiesHelpers.getValue("billing_Card_Security_Code"));
		WebUI.sleep(1);

		WebUI.clickElement(MakePayment);
		WebUI.waitForPageLoaded();
		
		WebUI.sleep(1);
		WebUI.switchToParentFrame();
		WebUI.sleep(1);
		
		//-----------------------------------------
		
		String policyDetails = WebUI.getTextElement(insuredPolicyNumber);
		System.out.println("Policy Holder Name and Policy Number: "+policyDetails);
		PolicyNumber = policyDetails.replaceAll("[^0-9]", "");
		System.out.println("Policy Number: "+PolicyNumber);
		
		//-----------------------------------------
		
		WebUI.clearAndFillText(mail_Id, PropertiesHelpers.getValue("recipient_Email"));
		WebUI.sleep(1);
		
		WebUI.clickElement(send_btn,2);
		WebUI.sleep(2);
		
		WebUI.dismissAlert();
		WebUI.sleep(1);
		
		WebUI.openNewTab();
		WebUI.sleep(1);
		
		WebUI.openWebsite(PropertiesHelpers.getValue("email_URL"));
		WebUI.waitForPageLoaded(10);
		
		WebUI.clearAndFillText(email_field, PropertiesHelpers.getValue("recipient_Email"));
		
		WebUI.clickElement(submit);
		
		WebUI.switchToFrameByIdOrName("ifmail");
		
		if(WebUI.isElementVisible(email_from, 3))
		{
			WebUI.clickElement(reciept);
		}
		else
		{
			WebUI.switchToDefaultContent();
			WebUI.switchToFrameByIdOrName("ifinbox");
			WebUI.sleep(1);
			WebUI.clickElement(email_inbox);
			WebUI.sleep(1);
			WebUI.switchToDefaultContent();
			WebUI.switchToFrameByIdOrName("ifmail");
			WebUI.sleep(1);
			WebUI.clickElement(reciept);
		}
		
		WebUI.sleep(1);
		
		WebUI.openNewTab();
		
		WebUI.openWebsite("chrome://downloads/");
		WebUI.sleep(1);
		
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		
		WebElement open_file = (WebElement) js.executeScript("return document.querySelector('downloads-manager').shadowRoot.querySelector('downloads-item').shadowRoot.querySelector('div>div>div>a')");
		WebUI.sleep(2);
		open_file.click();
		WebUI.sleep(2);
		
	
	}

}

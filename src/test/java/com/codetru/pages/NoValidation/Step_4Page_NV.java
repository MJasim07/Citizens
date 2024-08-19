package com.codetru.pages.NoValidation;

import static com.codetru.keywords.WebUI.getAttributeElement;
import static com.codetru.keywords.WebUI.getTextElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.codetru.helpers.PropertiesHelpers;
import com.codetru.keywords.WebUI;
import com.codetru.project.cica.CommonPageCICA;
import com.codetru.utils.DataGenerateUtils;


public class Step_4Page_NV extends CommonPageCICA {


	private By NextStep4 = By.xpath("//h3[.='Beneficiary Information']/parent::div/following-sibling::ion-row/ion-col[@size='24' and @size-md='6']/ion-button"); 

	private By BenificiaryFirstname = By.xpath("//ion-input[@formcontrolname='BeneficiaryFirstName']/input");
	
	private By Business_name = By.xpath("//ion-input[@formcontrolname='BeneficiaryBusinessName']/input");

	private By Error_BenificicartFirstName_Message = By.xpath("(//ion-col[@class = 'md hydrated' and @size-md = '8' and @size='24'])[6]"); 

	private By BenificiaryMiddlename = By.xpath("//ion-input[@formcontrolname='BeneficiaryMiddleName']/input"); 

	private By Error_BenificicartMiddleName_Message = By.xpath("(//ion-col[@class = 'md hydrated' and @size-md = '8' and @size='24'])[7]"); 

	private By Error_BenificicaryLastName_Message = By.xpath("(//ion-col[@class = 'md hydrated' and @size-md = '8' and @size='24'])[8]"); 

	private By Error_BenificicaryAddress_1_Message = By.xpath("(//ion-col[@class = 'md hydrated' and @size-md = '24' and @size='24'])[4]"); 

	private By BenificiaryLastname = By.xpath("//ion-input[@formcontrolname='BeneficiaryLastName']/input");

	private By BenificiaryAddress_1 = By.xpath("//ion-input[@formcontrolname='BeneficiaryAddress1']/input");

	private By BenificiaryAddress_2 = By.xpath("//ion-input[@formcontrolname='BeneficiaryAddress2']/input"); 

	private By Error_MaximumBenificiaryAddress_2_Message = By.xpath("(//ion-col[@class = 'md hydrated' and @size-md = '24' and @size='24'])[5]"); 

	private By AddBenificiary = By.xpath("//ion-button[normalize-space()='Add Beneficiary']"); 

	private By Error_BenificicaryCity_Message = By.xpath("(//ion-col[@class = 'md hydrated' and @size-md = '10' and @size='24'])[2]"); 

	private By BenificiaryCity = By.xpath("//ion-input[@formcontrolname='BeneficiaryCity']/input"); 

	private By Error_BenificicaryState_Message = By.xpath("(//ion-col[@class = 'md hydrated' and @size-md = '7' and @size='24'])[4]"); 

	private By benificiaryState = By.xpath("//select[@formcontrolname='BeneficiaryState']"); 

	private By Arizona_State = By.xpath("(//option[.=' Arizona'])[2]"); 

	private By Error_BenificicaryZipCode_Message = By.xpath("(//ion-col[@class = 'md hydrated' and @size-md = '7' and @size='24'])[5]"); 

	private By benificiaryZipcode = By.xpath("//ion-input[@formcontrolname='BeneficiaryZipCode']/input"); 

	private By benificiaryEmailAddress = By.xpath("//ion-input[@formcontrolname='BeneficiaryEmailAddress']/input"); 

	private By Error_Message_BenificiaryEmailAddress = By.xpath("(//div[@formarrayname= 'BeneficiaryInformation']//ion-row[7]/ion-col[@class='md hydrated' and @size='24'])[1]"); 

	private By benificiaryPhone = By.xpath("//ion-input[@formcontrolname= 'BeneficiaryPhone']/input"); 

	private By Error_Message_MinimumBenificiaryPhone = By.xpath("(//div[@formarrayname= 'BeneficiaryInformation']//ion-row[7]/ion-col[@class='md hydrated' and @size='24'])[2]"); 

	private By Error_Message_MinimumBenificiarySSN = By.xpath("(//div[@formarrayname= 'BeneficiaryInformation']//ion-row[7]/ion-col[@class='md hydrated' and @size='24'])[3]"); 

	private By BenificiarySSN = By.xpath("//ion-input[@formcontrolname='BeneficiarySSN']/input"); 

	private By Error_Message_BenificiaryDOB = By.xpath("(//div[@formarrayname= 'BeneficiaryInformation']//ion-row[7]/ion-col[@class='md hydrated' and @size='24'])[4]"); 

	private By BenificiaryDOB = By.xpath("//input[@formcontrolname='BeneficiaryBirthDate']"); 

	private By Error_Message_BenificiaryPercent = By.xpath("(//div[@formarrayname= 'BeneficiaryInformation']//ion-row[8]/ion-col[@class='md hydrated' and @size='24'])[1]"); 

	private By BenificiaryPercent = By.xpath("//ion-input[@formcontrolname='BeneficiaryPercent']/input"); 

	private By benificiaryMaxPercentError = By.xpath("//p[normalize-space()='Primary Beneficiaries must equal 100']"); 

	private By Error_Message_BenificiaryRelationShip = By.xpath("(//div[@formarrayname= 'BeneficiaryInformation']//ion-row[8]/ion-col[@class='md hydrated' and @size='24'])[2]"); 

	private By Benificiaryrelation = By.xpath("//select[@formcontrolname='BeneficiaryRelation']"); 

	private By error_Message_BenificiaryRelationShipForElementOthers = By.xpath("(//div[@formarrayname= 'BeneficiaryInformation']//ion-row[8]/ion-col[@class='md hydrated' and @size='24'])[3]"); 

	private By benificiaryOthersRelationsship = By.xpath("//ion-input[@formcontrolname='BeneficiaryOtherExplain']/input"); 

	private By Other = By.xpath("//option[.=' Other']");

	private By NextStep5 = By.xpath("(//ion-row[@style='padding-left: 50px;']/ion-col[@class='md hydrated']/ion-button[starts-with(@class, md)])[4]");


	public void Beneficiary_Information() throws Exception {


		String Max_Name = "sdfsadfgdfsfghfghxfghjdsfghdfghdfghjdfsghdsfghretyu";
		String Add_Max = "913 Alena Lakes Suite 843 35311 Kub Extensions Apt.Lakes Suite 843 ";
		String Max_error ="The maximum number of characters is 33.";
		String Max_error_ ="The maximum number of characters is 50";
		String Mandatory_Error = "Please enter a value.";
		String Min_error_Zp ="The minimum number of characters is 5.";
		String Max_error_Zp ="The maximum number of characters is 5.";
		String Min_error_Pn ="The minimum number of characters is 10.";
		String Max_error_Pn ="The maximum number of characters is 10.";
		String Min_error_ssn ="The minimum number of characters is 9.";
		String Max_error_ssn ="The maximum number of characters is 9.";
		String incorrect_email_error = "Email is not in the correct format";
		String benif_max_percentage_error = "Primary Beneficiaries must equal 100";
		
		
		WebUI.sleep(1);
		WebUI.waitForElementVisible(BenificiaryFirstname);
		String RandomBenificiaryfirstname = DataGenerateUtils.randomFirstName();
		WebUI.clearAndFillText(BenificiaryFirstname,RandomBenificiaryfirstname);
		WebUI.sleep(0.5);
		WebUI.verifyContains(getAttributeElement(BenificiaryFirstname,"value"),RandomBenificiaryfirstname);
		
		String RandomBenificiaryMiddlename = DataGenerateUtils.randomMiddleName();
		WebUI.clearAndFillText(BenificiaryMiddlename,RandomBenificiaryMiddlename);
		WebUI.sleep(0.5);
		WebUI.verifyContains(getAttributeElement(BenificiaryMiddlename,"value"),RandomBenificiaryMiddlename);
		
		String RandomBenificiaryLastname = DataGenerateUtils.randomLastName();
		WebUI.clearAndFillText(BenificiaryLastname,RandomBenificiaryLastname);
		WebUI.sleep(0.5);
		WebUI.verifyContains(getAttributeElement(BenificiaryLastname,"value"),RandomBenificiaryLastname);
		
		String RandomBenificiaryAddress = DataGenerateUtils.randomShortAddress();
		WebUI.clearAndFillText(BenificiaryAddress_1,RandomBenificiaryAddress);
		WebUI.sleep(0.5);
		WebUI.verifyContains(getAttributeElement(BenificiaryAddress_1,"value"),RandomBenificiaryAddress);
		
		String RandomBenificiaryAddress_2 = DataGenerateUtils.randomShortAddress();
		WebUI.clearAndFillText(BenificiaryAddress_2,RandomBenificiaryAddress_2);
		WebUI.sleep(0.5);
		WebUI.verifyContains(getAttributeElement(BenificiaryAddress_2,"value"),RandomBenificiaryAddress_2);
		
		WebUI.scrollToElementAtBottom(AddBenificiary);
		WebUI.verifyElementVisible(AddBenificiary);

		String RandomBenificiaryCity = DataGenerateUtils.randomCity();
		WebUI.clearAndFillText(BenificiaryCity,RandomBenificiaryCity);
		WebUI.sleep(0.5);
		WebUI.verifyContains(getAttributeElement(BenificiaryCity,"value"),RandomBenificiaryCity);
		
		WebUI.waitForElementVisible(benificiaryState);
		WebUI.clickElement(benificiaryState);
		WebUI.sleep(0.5);
//		WebUI.clickElement(Arizona_State);
		WebUI.selectOptionByIndex(benificiaryState, 1);
		
		String RandomBenificiaryZipcode = DataGenerateUtils.randomZipCode();
		WebUI.clearAndFillText(benificiaryZipcode,RandomBenificiaryZipcode);
		WebUI.sleep(0.5);
		WebUI.verifyContains(getAttributeElement(benificiaryZipcode,"value"),RandomBenificiaryZipcode);
		
		String RandomBenificiaryEmail = DataGenerateUtils.randomEmail();
		WebUI.clearAndFillText(benificiaryEmailAddress,RandomBenificiaryEmail);
		WebUI.sleep(0.5);
		WebUI.verifyContains(getAttributeElement(benificiaryEmailAddress,"value"),RandomBenificiaryEmail);
		
		String RandomBenificiaryPhone = DataGenerateUtils.randomPhoneNumber();
		WebUI.clearAndFillText(benificiaryPhone,RandomBenificiaryPhone);
		WebUI.sleep(0.5);
		WebUI.verifyContains(getAttributeElement(benificiaryPhone,"value"),RandomBenificiaryPhone);
		
		String RandomBenificiarySSN = DataGenerateUtils.randomSSNNumber();
		WebUI.clearAndFillText(BenificiarySSN,RandomBenificiarySSN);
		WebUI.sleep(0.5);
		WebUI.verifyContains(getAttributeElement(BenificiarySSN,"value"),RandomBenificiarySSN);
		
		String RandomBenificiaryDOB = DataGenerateUtils.randomDateOfBirthDDMMYYYY();
		WebUI.clearAndFillText(BenificiaryDOB,RandomBenificiaryDOB);
		WebUI.sleep(0.5);
		
		
		WebUI.clearAndFillText(BenificiaryPercent, "100");
		WebUI.sleep(0.5);
		WebUI.verifyContains(getAttributeElement(BenificiaryPercent, "value"), "100");

		WebUI.clickElement(Benificiaryrelation);
		WebUI.sleep(0.5);
		WebUI.clickElement(Other);
		WebUI.sleep(2);
		WebUI.clickElement(Benificiaryrelation);
		WebUI.sleep(0.5);
		
		WebUI.clearAndFillText(benificiaryOthersRelationsship, "Others");
		WebUI.sleep(0.5);
		WebUI.verifyContains(getAttributeElement(benificiaryOthersRelationsship, "value"), "Others");

		WebUI.scrollToElementAtBottom(NextStep4);
		WebUI.moveToElement(NextStep4);
		WebUI.sleep(0.5);
		WebUI.clickElement(NextStep4);
		WebUI.waitForPageLoaded();
//		WebUI.verifyElementVisible(NextStep5);
		
		
		}


}

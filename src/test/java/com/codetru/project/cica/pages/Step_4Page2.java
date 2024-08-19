package com.codetru.project.cica.pages;

import static com.codetru.keywords.WebUI.getAttributeElement;
import static com.codetru.keywords.WebUI.getTextElement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.codetru.driver.DriverManager;
import com.codetru.helpers.PropertiesHelpers;
import com.codetru.keywords.WebUI;
import com.codetru.project.cica.CommonPageCICA;
import com.codetru.utils.DataGenerateUtils;


public class Step_4Page2 extends CommonPageCICA {


	private By step_4 = By.xpath("//span[normalize-space()='Step 4: Beneficiary Information']");
	
	private By Beneficiary_Information_Section= By.xpath("(//h3[normalize-space()='Beneficiary Information'])[2]"); 
	private By Contingent_Information_Section= By.xpath("//h3[normalize-space()='Contingent Beneficiary Information']"); 
	private By Business_RadioButton_Yes= By.xpath("(//ion-label[normalize-space()='Yes'])[2]/following::ion-radio[1]");
	private By Business_RadioButton_No= By.xpath("(//ion-label[normalize-space()='No'])[2]/following::ion-radio[1]");
	private By NextStep4 = By.xpath("//h3[.='Beneficiary Information']/parent::div/following-sibling::ion-row/ion-col[@size='24' and @size-md='6']/ion-button"); 
	private By BenificiaryFirstname = By.xpath("//ion-input[@formcontrolname='BeneficiaryFirstName']/input");
	private By Business_name = By.xpath("//ion-input[@formcontrolname='BeneficiaryBusinessName']/input");
	private By Business_name_error = By.xpath("(//ion-col[@class='md hydrated' and @size='24' and @size-md='24'])[6]");
	private By Error_BenificicartFirstName_Message = By.xpath("(//ion-col[@class = 'md hydrated' and @size-md = '8' and @size='24'])[9]"); 
	private By BenificiaryMiddlename = By.xpath("//ion-input[@formcontrolname='BeneficiaryMiddleName']/input"); 
	private By Error_BenificicartMiddleName_Message = By.xpath("(//ion-col[@class = 'md hydrated' and @size-md = '8' and @size='24'])[10]"); 
	private By Error_BenificicaryLastName_Message = By.xpath("(//ion-col[@class = 'md hydrated' and @size-md = '8' and @size='24'])[11]"); 
	private By Error_BenificicaryAddress_1_Message = By.xpath("(//ion-col[@class = 'md hydrated' and @size-md = '24' and @size='24'])[6]"); 
	private By BenificiaryLastname = By.xpath("//ion-input[@formcontrolname='BeneficiaryLastName']/input");
	private By BenificiaryAddress_1 = By.xpath("//ion-input[@formcontrolname='BeneficiaryAddress1']/input");
	private By BenificiaryAddress_2 = By.xpath("//ion-input[@formcontrolname='BeneficiaryAddress2']/input"); 
	private By Error_MaximumBenificiaryAddress_2_Message = By.xpath("(//ion-col[@class = 'md hydrated' and @size-md = '24' and @size='24'])[7]"); 
	private By Error_BenificicaryCity_Message = By.xpath("(//ion-col[@class = 'md hydrated' and @size-md = '10' and @size='24'])[6]"); 
	private By BenificiaryCity = By.xpath("//ion-input[@formcontrolname='BeneficiaryCity']/input"); 
	private By Error_BenificicaryState_Message = By.xpath("(//ion-col[@class = 'md hydrated' and @size-md = '7' and @size='24'])[6]"); 
	private By benificiaryState = By.xpath("//select[@formcontrolname='BeneficiaryState']"); 
	private By benificiaryState_List = By.xpath("//select[@formcontrolname='BeneficiaryState']/option"); 
	private By Arizona_State = By.xpath("(//option[.=' Arizona'])[2]"); 
	private By Error_BenificicaryZipCode_Message = By.xpath("(//ion-col[@class = 'md hydrated' and @size-md = '7' and @size='24'])[7]"); 
	private By benificiaryZipcode = By.xpath("//ion-input[@formcontrolname='BeneficiaryZipCode']/input"); 
	private By benificiaryEmailAddress = By.xpath("//ion-input[@formcontrolname='BeneficiaryEmailAddress']/input"); 
	private By Error_Message_BenificiaryEmailAddress = By.xpath("(//div[@formarrayname= 'BeneficiaryInformation']//ion-row[7]/ion-col[@class='md hydrated' and @size='24'])[1]"); 
	private By benificiaryPhone = By.xpath("//ion-input[@formcontrolname= 'BeneficiaryPhone']/input"); 
	private By Error_Message_MinimumBenificiaryPhone = By.xpath("(//div[@formarrayname= 'BeneficiaryInformation']//ion-row[7]/ion-col[@class='md hydrated' and @size='24'])[2]"); 
	private By Error_Message_MinimumBenificiarySSN = By.xpath("(//div[@formarrayname= 'BeneficiaryInformation']//ion-row[7]/ion-col[@class='md hydrated' and @size='24'])[3]"); 
	private By BenificiarySSN = By.xpath("//ion-input[@formcontrolname='BeneficiarySSN']/input"); 
	private By Error_Message_BenificiaryDOB = By.xpath("(//div[@formarrayname= 'BeneficiaryInformation']//ion-row[7]/ion-col[@class='md hydrated' and @size='24'])[4]"); 
	private By BenificiaryDOB = By.xpath("//input[@formcontrolname='BeneficiaryBirthDate']"); 
	private By Error_Message_BenificiaryAge = By.xpath("(//div[@formarrayname= 'BeneficiaryInformation']//ion-row[7]/ion-col[@class='md hydrated' and @size='24'])[5]"); 
	private By BenificiaryAge = By.xpath("//input[@formcontrolname='BeneficiaryBirthDate']/following::ion-col[1]//ion-input/input"); 
	private By Error_Message_BenificiaryPercent = By.xpath("(//div[@formarrayname= 'BeneficiaryInformation']//ion-row[8]/ion-col[@class='md hydrated' and @size='24'])[1]"); 
	private By BenificiaryPercent = By.xpath("//ion-input[@formcontrolname='BeneficiaryPercent']/input"); 
	private By benificiaryMaxPercentError = By.xpath("//p[normalize-space()='Primary Beneficiaries must equal 100']"); 
	private By Error_Message_BenificiaryRelationShip = By.xpath("(//div[@formarrayname= 'BeneficiaryInformation']//ion-row[8]/ion-col[@class='md hydrated' and @size='24'])[2]"); 
	private By Benificiaryrelation = By.xpath("//select[@formcontrolname='BeneficiaryRelation']"); 
	private By BenificiaryrelationsList = By.xpath("//select[@formcontrolname='BeneficiaryRelation']/option"); 
	private By error_Message_BenificiaryRelationShipForElementOthers = By.xpath("(//div[@formarrayname= 'BeneficiaryInformation']//ion-row[8]/ion-col[@class='md hydrated' and @size='24'])[3]"); 
	private By benificiaryOthersRelationsship = By.xpath("//ion-input[@formcontrolname='BeneficiaryOtherExplain']/input"); 

	private By Other = By.xpath("//option[.=' Other']");
	private By AddBenificiary = By.xpath("//ion-button[normalize-space()='Add Beneficiary']"); 
	private By BenefDeleteButton = By.xpath("(//div[@formarrayname='BeneficiaryInformation']//ion-row[8]/ion-col[@class='md hydrated' and @size='24'])[6]/ion-button");

	
	private By getBusinessRadioButtonYes(int index) {
	    return By.xpath("(//ion-label[normalize-space()='Yes'])[" + index + "]/following::ion-radio[1]");
	}

	private By getBusinessRadioButtonNo(int index) {
	    return By.xpath("(//ion-label[normalize-space()='No'])[" + index + "]/following::ion-radio[1]");
	}

	private By getBeneficiaryFirstname(int index) {
	    return By.xpath("(//ion-input[@formcontrolname='BeneficiaryFirstName']/input)[" + index + "]");
	}

	private By getBusinessName(int index) {
	    return By.xpath("(//ion-input[@formcontrolname='BeneficiaryBusinessName']/input)");
	}

	private By getBeneficiaryMiddlename(int index) {
	    return By.xpath("(//ion-input[@formcontrolname='BeneficiaryMiddleName']/input)[" + index + "]");
	}

	private By getBeneficiaryLastname(int index) {
	    return By.xpath("(//ion-input[@formcontrolname='BeneficiaryLastName']/input)[" + index + "]");
	}

	private By getBeneficiaryAddress1(int index) {
	    return By.xpath("(//ion-input[@formcontrolname='BeneficiaryAddress1']/input)[" + index + "]");
	}

	private By getBeneficiaryAddress2(int index) {
	    return By.xpath("(//ion-input[@formcontrolname='BeneficiaryAddress2']/input)[" + index + "]");
	}

	private By getBeneficiaryCity(int index) {
	    return By.xpath("(//ion-input[@formcontrolname='BeneficiaryCity']/input)[" + index + "]");
	}

	private By getBeneficiaryState(int index) {
	    return By.xpath("(//select[@formcontrolname='BeneficiaryState'])[" + index + "]");
	}

	private By getBeneficiaryStateList(int index) {
	    return By.xpath("(//select[@formcontrolname='BeneficiaryState'])[" + index + "]/option");
	}

	private By getArizonaState(int index) {
	    return By.xpath("(//option[.=' Arizona'])[" + index + "]");
	}

	private By getBeneficiaryZipcode(int index) {
	    return By.xpath("(//ion-input[@formcontrolname='BeneficiaryZipCode']/input)[" + index + "]");
	}

	private By getBeneficiaryEmailAddress(int index) {
	    return By.xpath("(//ion-input[@formcontrolname='BeneficiaryEmailAddress']/input)[" + index + "]");
	}

	private By getBeneficiaryPhone(int index) {
	    return By.xpath("(//ion-input[@formcontrolname='BeneficiaryPhone']/input)[" + index + "]");
	}

	private By getBeneficiarySSN(int index) {
	    return By.xpath("(//ion-input[@formcontrolname='BeneficiarySSN']/input)[" + index + "]");
	}

	private By getBeneficiaryDOB(int index) {
	    return By.xpath("(//input[@formcontrolname='BeneficiaryBirthDate'])[" + index + "]");
	}

	private By getBeneficiaryAge(int index) {
	    return By.xpath("(//input[@formcontrolname='BeneficiaryBirthDate']/following::ion-col[1]//ion-input/input)[" + index + "]");
	}

	private By getBeneficiaryPercent(int index) {
	    return By.xpath("(//ion-input[@formcontrolname='BeneficiaryPercent']/input)[" + index + "]");
	}

	private By getBeneficiaryRelation(int index) {
	    return By.xpath("(//select[@formcontrolname='BeneficiaryRelation'])[" + index + "]");
	}

	private By getBeneficiaryRelationsList(int index) {
	    return By.xpath("(//select[@formcontrolname='BeneficiaryRelation'])[" + index + "]/option");
	}

	private By getBeneficiaryOthersRelationship(int index) {
	    return By.xpath("(//ion-input[@formcontrolname='BeneficiaryOtherExplain']/input)[" + index + "]");
	}
	
	private By Add_ContBeneficiary = By.xpath("//ion-button[normalize-space()='Add Contingent Beneficiary']");
	private By ContBeneficiary_Yes_Button = By.xpath("(//ion-label[normalize-space()='Yes'])[6]/following::ion-radio[1]");
	private By ContBeneficiary_No_Button = By.xpath("(//ion-label[normalize-space()='No'])[6]/following::ion-radio[1]");
	private By ContBeneficiaryBusinessName = By.xpath("//ion-input[@formcontrolname='ContingentBeneficiaryBusinessName']/input");
	private By ContBeneficiary_Yes_Button2 = By.xpath("(//ion-label[normalize-space()='Yes'])[6]/following::ion-radio[1]");
	private By ContBeneficiary_No_Button2 = By.xpath("(//ion-label[normalize-space()='No'])[6]/following::ion-radio[1]");
	
	private By ContBeneficiaryFirstName = By.xpath("//ion-input[@formcontrolname='ContingentBeneficiaryFirstName']/input");
	private By ContBeneficiaryFirstName_ErrorMsg = By.xpath("(//ion-col[@size='24' and @size-md='8'])[21]");
	private By ContBeneficiaryMiddleName_ErrorMsg = By.xpath("(//ion-col[@size='24' and @size-md='8'])[22]");
	private By ContBeneficiaryLastName_ErrorMsg = By.xpath("(//ion-col[@size='24' and @size-md='8'])[23]");
	private By ContBeneficiary_Address1ErrorMsg = By.xpath("(//ion-col[@size='24' and @size-md='24'])[18]");
	private By ContBeneficiary_Address2ErrorMsg = By.xpath("(//ion-col[@size='24' and @size-md='24'])[19]");
	private By ContBeneficiary_CityErrorMsg = By.xpath("(//ion-col[@size='24' and @size-md='10'])[11]");
	private By ContBeneficiary_StateErrorMsg = By.xpath("(//ion-col[@size='24' and @size-md='7'])[14]");
	private By ContBeneficiary_ZipCodeErrorMsg = By.xpath("(//ion-col[@size='24' and @size-md='7'])[15]");
	private By ContBeneficiary_EmailErrorMsg = By.xpath("(//div[@formarrayname='ContingentBeneficiaryInformation']//ion-row[7]/ion-col[@class='md hydrated' and @size='24'])[1]");
	private By ContBeneficiary_PhoneErrorMsg = By.xpath("(//div[@formarrayname='ContingentBeneficiaryInformation']//ion-row[7]/ion-col[@class='md hydrated' and @size='24'])[2]");
	private By ContBeneficiary_SSNErrorMsg = By.xpath("(//div[@formarrayname='ContingentBeneficiaryInformation']//ion-row[7]/ion-col[@class='md hydrated' and @size='24'])[3]");
	private By ContBeneficiary_DOBErrorMsg = By.xpath("(//div[@formarrayname='ContingentBeneficiaryInformation']//ion-row[7]/ion-col[@class='md hydrated' and @size='24'])[4]");
	private By ContBeneficiary_AgeErrorMsg = By.xpath("(//div[@formarrayname='ContingentBeneficiaryInformation']//ion-row[7]/ion-col[@class='md hydrated' and @size='24'])[5]");
	private By ContBeneficiary_PercentErrorMsg = By.xpath("(//div[@formarrayname='ContingentBeneficiaryInformation']//ion-row[8]/ion-col[@class='md hydrated' and @size='24'])[1]");
	private By ContBeneficiary_MaxPercentErrorMsg = By.xpath("//p[normalize-space()='Contingent Beneficiaries must equal 100']"); 
	private By ContBeneficiary_RelationErrorMsg = By.xpath("(//div[@formarrayname='ContingentBeneficiaryInformation']//ion-row[8]/ion-col[@class='md hydrated' and @size='24'])[2]");
	private By ContBeneficiary_DeleteButton = By.xpath("(//div[@formarrayname='ContingentBeneficiaryInformation']//ion-row[8]/ion-col[@class='md hydrated' and @size='24'])[3]/ion-button");
	private By ContBeneficiaryMiddleName = By.xpath("//ion-input[@formcontrolname='ContingentBeneficiaryMiddleName']/input");
	private By ContBeneficiaryLastName = By.xpath("//ion-input[@formcontrolname='ContingentBeneficiaryLastName']/input");
	private By ContBeneficiaryAddress1 = By.xpath("//ion-input[@formcontrolname='ContingentBeneficiaryAddress1']/input");
	private By ContBeneficiaryAddress2 = By.xpath("//ion-input[@formcontrolname='ContingentBeneficiaryAddress2']/input");
	private By ContBeneficiaryCity = By.xpath("//ion-input[@formcontrolname='ContingentBeneficiaryCity']/input");
	private By ContBeneficiaryState = By.xpath("//select[@formcontrolname='ContingentBeneficiaryState']");
	private By ContBeneficiaryState_List = By.xpath("(//select[@formcontrolname='ContingentBeneficiaryState'])[1]/option");
	private By ContBeneficiaryZipcode = By.xpath("//ion-input[@formcontrolname='ContingentBeneficiaryZipCode']/input");
	private By ContBeneficiaryEmail = By.xpath("//ion-input[@formcontrolname='ContingentBeneficiaryEmailAddress']/input");
	private By ContBeneficiaryPhone = By.xpath("//ion-input[@formcontrolname='ContingentBeneficiaryPhone']/input");
	private By ContBeneficiarySSN = By.xpath("//ion-input[@formcontrolname='ContingentBeneficiarySSN']/input");
	private By ContBeneficiaryDOB = By.xpath("//input[@formcontrolname='ContingentBeneficiaryBirthDate']");
	private By ContBenificiaryAge = By.xpath("//input[@formcontrolname='ContingentBeneficiaryBirthDate']/following::ion-col[1]//ion-input/input"); 
	private By ContBeneficiaryPercent = By.xpath("//ion-input[@formcontrolname='ContingentBeneficiaryPercent']/input");
	private By ContBenificiaryMaxPercentError = By.xpath("//p[normalize-space()='Contingent Beneficiaries must equal 100']"); 
	private By ContBeneficiaryRelation = By.xpath("//select[@formcontrolname='ContingentBeneficiaryRelation']");
	private By ContBenificiaryrelationsList = By.xpath("//select[@formcontrolname='ContingentBeneficiaryRelation']/option");
	private By error_Message_ContBenificiaryRelationShipForElementOthers = By.xpath("(//div[@formarrayname= 'ContingentBeneficiaryInformation']//ion-row[8]/ion-col[@class='md hydrated' and @size='24'])[3]"); 
	private By ContBenificiaryOthersRelationsship = By.xpath("//ion-input[@formcontrolname='ContingentBeneficiaryOtherExplain']/input"); 
	
	private By getContBeneficiaryFirstName(int index) {
	    return By.xpath("(//ion-input[@formcontrolname='ContingentBeneficiaryFirstName']/input)[" + index + "]");
	}

	private By getContBeneficiaryMiddleName(int index) {
	    return By.xpath("(//ion-input[@formcontrolname='ContingentBeneficiaryMiddleName']/input)[" + index + "]");
	}

	private By getContBeneficiaryLastName(int index) {
	    return By.xpath("(//ion-input[@formcontrolname='ContingentBeneficiaryLastName']/input)[" + index + "]");
	}

	private By getContBeneficiaryAddress1(int index) {
	    return By.xpath("(//ion-input[@formcontrolname='ContingentBeneficiaryAddress1']/input)[" + index + "]");
	}

	private By getContBeneficiaryAddress2(int index) {
	    return By.xpath("(//ion-input[@formcontrolname='ContingentBeneficiaryAddress2']/input)[" + index + "]");
	}

	private By getContBeneficiaryCity(int index) {
	    return By.xpath("(//ion-input[@formcontrolname='ContingentBeneficiaryCity']/input)[" + index + "]");
	}

	private By getContBeneficiaryState(int index) {
	    return By.xpath("(//select[@formcontrolname='ContingentBeneficiaryState'])[" + index + "]");
	}

	private By getContBeneficiaryZipcode(int index) {
	    return By.xpath("(//ion-input[@formcontrolname='ContingentBeneficiaryZipCode']/input)[" + index + "]");
	}

	private By getContBeneficiaryEmail(int index) {
	    return By.xpath("(//ion-input[@formcontrolname='ContingentBeneficiaryEmailAddress']/input)[" + index + "]");
	}

	private By getContBeneficiaryPhone(int index) {
	    return By.xpath("(//ion-input[@formcontrolname='ContingentBeneficiaryPhone']/input)[" + index + "]");
	}

	private By getContBeneficiarySSN(int index) {
	    return By.xpath("(//ion-input[@formcontrolname='ContingentBeneficiarySSN']/input)[" + index + "]");
	}

	private By getContBeneficiaryDOB(int index) {
	    return By.xpath("(//input[@formcontrolname='ContingentBeneficiaryBirthDate'])[" + index + "]");
	}

	private By getContBeneficiaryPercent(int index) {
	    return By.xpath("(//ion-input[@formcontrolname='ContingentBeneficiaryPercent']/input)[" + index + "]");
	}

	private By getContBeneficiaryRelation(int index) {
	    return By.xpath("(//select[@formcontrolname='ContingentBeneficiaryRelation'])[" + index + "]");
	}
	
	
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
		String Max_Business_Name = "Infinite Horizons Innovative Solutions Pioneering Excellence in Sustainable Growth and Technological Advancement";
		String Business_Name_100Chars = "Infinite Horizons Innovative Solutions Pioneering Excellence in Sustainable Growth and Technological";
		String Max_Business_Name_Error = "The maximum number of characters is 100.";
		String BusinessName = "Codetru Pvt Ltd";
		String Max_Error_OtherRelationship = "The maximum number of characters is 90.";
		String ContBenif_max_percentage_error = "Contingent Beneficiaries must equal 100";
		
		WebUI.waitForPageLoaded();
		WebUI.sleep(1);
//		WebUI.clickElement(step_4);
//		WebUI.sleep(1);
		
		//TC_280 281 282
		WebUI.verifyElementVisible(Beneficiary_Information_Section);
		WebUI.clickElement(Business_RadioButton_Yes);
		WebUI.sleep(0.2);
		WebUI.verifyElementVisible(Business_name);
		WebUI.clickElement(Business_RadioButton_No);
		WebUI.sleep(0.2);
		WebUI.verifyElementPresent(BenificiaryFirstname);
		WebUI.verifyElementPresent(BenificiaryLastname);
		WebUI.verifyElementPresent(BenificiaryMiddlename);

		
		//TC_283 284 285 286
		WebUI.clickElement(Business_RadioButton_Yes);
		WebUI.scrollToElementAtBottom(NextStep4);
		WebUI.sleep(0.2);
		WebUI.verifyElementVisible(Contingent_Information_Section);
		WebUI.verifyElementClickable(NextStep4);
		WebUI.clickElement(NextStep4);
		WebUI.scrollToElementAtTop(Beneficiary_Information_Section);
		
		WebUI.verifyElementVisible(Business_name_error);
		WebUI.verifyContains(getTextElement(Business_name_error), Mandatory_Error);
		
		//Max Business name
		WebUI.clearText(Business_name);
		WebUI.setText(Business_name, Max_Business_Name);
		WebUI.verifyElementVisible(Business_name_error);
		WebUI.verifyContains(getTextElement(Business_name_error), Max_Business_Name_Error);
		
		WebUI.clearText(Business_name);
		WebUI.setText(Business_name, Business_Name_100Chars);
		WebUI.sleep(0.2);
//		WebUI.verifyElementNotVisibleSoftAssert(Business_name_error);
		WebUI.clearText(Business_name);
		WebUI.setText(Business_name, BusinessName);
		WebUI.verifyContains(getAttributeElement(Business_name,"value"),BusinessName);
		
		
		WebUI.clickElement(Business_RadioButton_No);
		WebUI.verifyElementPresent(BenificiaryFirstname);
		WebUI.verifyContains(getTextElement(Error_BenificicartFirstName_Message), Mandatory_Error);

		WebUI.clearText(BenificiaryFirstname);
		WebUI.setText(BenificiaryFirstname, Max_Name);
		WebUI.verifyElementVisible(Error_BenificicartFirstName_Message);
		WebUI.verifyContains(getTextElement(Error_BenificicartFirstName_Message), Max_error);

		String RandomBenificiaryfirstname = DataGenerateUtils.randomFirstName();
		WebUI.clearAndFillText(BenificiaryFirstname,RandomBenificiaryfirstname);
		WebUI.sleep(0.2);
		WebUI.verifyContains(getAttributeElement(BenificiaryFirstname,"value"),RandomBenificiaryfirstname);
		
		WebUI.clearText(BenificiaryMiddlename);
		WebUI.setText(BenificiaryMiddlename, Max_Name);
		WebUI.verifyElementVisible(Error_BenificicartMiddleName_Message);
		WebUI.verifyContains(getTextElement(Error_BenificicartMiddleName_Message), Max_error);

		String RandomBenificiaryMiddlename = DataGenerateUtils.randomMiddleName();
		WebUI.clearAndFillText(BenificiaryMiddlename,RandomBenificiaryMiddlename);
		WebUI.sleep(0.2);
		WebUI.verifyContains(getAttributeElement(BenificiaryMiddlename,"value"),RandomBenificiaryMiddlename);
		
		WebUI.verifyContains(getTextElement(Error_BenificicaryLastName_Message), Mandatory_Error);

		WebUI.clearText(BenificiaryLastname);
		WebUI.setText(BenificiaryLastname, Max_Name);
		WebUI.verifyElementVisible(Error_BenificicaryLastName_Message);
		WebUI.verifyContains(getTextElement(Error_BenificicaryLastName_Message), Max_error);

		String RandomBenificiaryLastname = DataGenerateUtils.randomLastName();
		WebUI.clearAndFillText(BenificiaryLastname,RandomBenificiaryLastname);
		WebUI.sleep(0.2);
		WebUI.verifyContains(getAttributeElement(BenificiaryLastname,"value"),RandomBenificiaryLastname);
		
		WebUI.verifyContains(getTextElement(Error_BenificicaryAddress_1_Message), Mandatory_Error);

		WebUI.clearText(BenificiaryAddress_1);
		WebUI.setText(BenificiaryAddress_1, Add_Max);
		WebUI.verifyElementVisible(Error_BenificicaryAddress_1_Message);
		WebUI.verifyContains(getTextElement(Error_BenificicaryAddress_1_Message), Max_error);

		String RandomBenificiaryAddress = DataGenerateUtils.randomShortAddress();
		WebUI.clearAndFillText(BenificiaryAddress_1,RandomBenificiaryAddress);
		WebUI.sleep(0.2);
		WebUI.verifyContains(getAttributeElement(BenificiaryAddress_1,"value"),RandomBenificiaryAddress);
		
		WebUI.clearText(BenificiaryAddress_2);
		WebUI.setText(BenificiaryAddress_2, Add_Max);
		WebUI.verifyElementVisible(Error_MaximumBenificiaryAddress_2_Message);
		WebUI.verifyContains(getTextElement(Error_MaximumBenificiaryAddress_2_Message), Max_error);

		String RandomBenificiaryAddress_2 = DataGenerateUtils.randomShortAddress();
		WebUI.clearAndFillText(BenificiaryAddress_2,RandomBenificiaryAddress_2);
		WebUI.sleep(0.2);
		WebUI.verifyContains(getAttributeElement(BenificiaryAddress_2,"value"),RandomBenificiaryAddress_2);
		
		WebUI.scrollToElementAtBottom(AddBenificiary);
		WebUI.verifyElementVisible(AddBenificiary);

		WebUI.verifyContains(getTextElement(Error_BenificicaryCity_Message), Mandatory_Error);
		
		WebUI.clearText(BenificiaryCity);
		WebUI.setText(BenificiaryCity, Max_Name);
		WebUI.verifyElementVisible(Error_BenificicaryCity_Message);
		WebUI.verifyContains(getTextElement(Error_BenificicaryCity_Message), Max_error);

		String RandomBenificiaryCity = DataGenerateUtils.randomCity();
		WebUI.clearAndFillText(BenificiaryCity,RandomBenificiaryCity);
		WebUI.sleep(0.2);
		WebUI.verifyContains(getAttributeElement(BenificiaryCity,"value"),RandomBenificiaryCity);
		
		WebUI.verifyContains(getTextElement(Error_BenificicaryState_Message), Mandatory_Error);

		WebUI.waitForElementVisible(benificiaryState);

		List<String> states = WebUI.getElementTextsInList(benificiaryState_List);
		for(int i=1; i<=10; i+=2)
		{	
			WebUI.selectOptionByIndex(benificiaryState, i);
			WebUI.sleep(0.2);
		}
		WebUI.clickElement(benificiaryState);
		WebUI.sleep(0.2);
		WebUI.setText(benificiaryState, "l", Keys.ENTER);
		WebUI.sleep(0.2);
		
		WebUI.verifyContains(getTextElement(Error_BenificicaryZipCode_Message), Mandatory_Error);

		WebUI.clearText(benificiaryZipcode);
		WebUI.setText(benificiaryZipcode, "345");
		WebUI.verifyElementVisible(Error_BenificicaryZipCode_Message);
		WebUI.verifyContains(getTextElement(Error_BenificicaryZipCode_Message), Min_error_Zp);

		WebUI.clearText(benificiaryZipcode);
		WebUI.setText(benificiaryZipcode, "3456789");
		WebUI.verifyElementVisible(Error_BenificicaryZipCode_Message);
		WebUI.verifyContains(getTextElement(Error_BenificicaryZipCode_Message), Max_error_Zp);

		String RandomBenificiaryZipcode = DataGenerateUtils.randomZipCode();
		WebUI.clearAndFillText(benificiaryZipcode,RandomBenificiaryZipcode);
		WebUI.sleep(0.2);
		WebUI.verifyContains(getAttributeElement(benificiaryZipcode,"value"),RandomBenificiaryZipcode);
		
		WebUI.clearText(benificiaryEmailAddress);
		WebUI.setText(benificiaryEmailAddress, "asdsaf");
		WebUI.verifyElementVisible(Error_Message_BenificiaryEmailAddress);
		WebUI.verifyContains(getTextElement(Error_Message_BenificiaryEmailAddress), incorrect_email_error);

		WebUI.clearText(benificiaryEmailAddress);
		WebUI.setText(benificiaryEmailAddress, Max_Name);
		WebUI.verifyElementVisible(Error_Message_BenificiaryEmailAddress);
		WebUI.verifyContains(getTextElement(Error_Message_BenificiaryEmailAddress), Max_error_);

		String RandomBenificiaryEmail = DataGenerateUtils.randomEmail();
		WebUI.clearAndFillText(benificiaryEmailAddress,RandomBenificiaryEmail);
		WebUI.sleep(0.2);
		WebUI.verifyContains(getAttributeElement(benificiaryEmailAddress,"value"),RandomBenificiaryEmail);
		
		WebUI.setText(benificiaryPhone, "123");
		WebUI.verifyElementVisible(Error_Message_MinimumBenificiaryPhone);
		WebUI.verifyContains(getTextElement(Error_Message_MinimumBenificiaryPhone), Min_error_Pn);

		WebUI.clearText(benificiaryPhone);
		WebUI.setText(benificiaryPhone, "12487451245871");
		WebUI.verifyElementVisible(Error_Message_MinimumBenificiaryPhone);
		WebUI.verifyContains(getTextElement(Error_Message_MinimumBenificiaryPhone), Max_error_Pn);

		String RandomBenificiaryPhone = DataGenerateUtils.randomPhoneNumber();
		WebUI.clearAndFillText(benificiaryPhone,RandomBenificiaryPhone);
		WebUI.sleep(0.2);
		WebUI.verifyContains(getAttributeElement(benificiaryPhone,"value"),RandomBenificiaryPhone);
		
		WebUI.verifyContains(getTextElement(Error_Message_MinimumBenificiarySSN), Mandatory_Error);

		WebUI.clearText(BenificiarySSN);
		WebUI.setText(BenificiarySSN, "12345");
		WebUI.verifyElementVisible(Error_Message_MinimumBenificiarySSN);
		WebUI.verifyContains(getTextElement(Error_Message_MinimumBenificiarySSN), Min_error_ssn);

		WebUI.clearText(BenificiarySSN);
		WebUI.setText(BenificiarySSN, "123455874512");
		WebUI.verifyElementVisible(Error_Message_MinimumBenificiarySSN);
		WebUI.verifyContains(getTextElement(Error_Message_MinimumBenificiarySSN), Max_error_ssn);
		
		String RandomBenificiarySSN = DataGenerateUtils.randomSSNNumber();
		WebUI.clearAndFillText(BenificiarySSN,RandomBenificiarySSN);
		WebUI.sleep(0.2);
		WebUI.verifyContains(getAttributeElement(BenificiarySSN,"value"),RandomBenificiarySSN);
		
		WebUI.verifyContains(getTextElement(Error_Message_BenificiaryDOB), Mandatory_Error);
		WebUI.verifyContains(getTextElement(Error_Message_BenificiaryAge), Mandatory_Error);
		
		WebUI.verifyEquals(getAttributeElement(BenificiaryAge,"value"), "0");

		String RandomBenificiaryDOB = DataGenerateUtils.randomDateOfBirthDDMMYYYY();
		WebUI.clearAndFillText(BenificiaryDOB,RandomBenificiaryDOB);
		WebUI.sleep(0.2);
		
		System.out.println("Generated DOB: "+RandomBenificiaryDOB);
		System.out.println("Attribute DOB: "+getAttributeElement(BenificiaryDOB,"value"));
		
		WebUI.verifyContains(getTextElement(Error_Message_BenificiaryPercent), Mandatory_Error);

		WebUI.clearText(BenificiaryPercent);
		WebUI.setText(BenificiaryPercent, "123455874512");
		WebUI.verifyElementVisible(benificiaryMaxPercentError);
		WebUI.verifyContains(getTextElement(benificiaryMaxPercentError), benif_max_percentage_error);

		WebUI.clearAndFillText(BenificiaryPercent, "25");
		WebUI.sleep(0.2);
		WebUI.verifyContains(getAttributeElement(BenificiaryPercent, "value"), "25");

		WebUI.verifyContains(getTextElement(Error_Message_BenificiaryRelationShip), Mandatory_Error);

		List<String> relationships = WebUI.getElementTextsInList(BenificiaryrelationsList);
		for(int i=1; i<relationships.size(); i++)
		{	
			WebUI.selectOptionByIndex(Benificiaryrelation, i);
			WebUI.sleep(0.2);
		}
		
		WebUI.sleep(0.2);
		WebUI.clickElement(Benificiaryrelation);
		WebUI.setText(Benificiaryrelation, "o", Keys.ENTER);
		WebUI.sleep(1);
		
		WebUI.verifyElementVisible(error_Message_BenificiaryRelationShipForElementOthers);
		WebUI.verifyContains(getTextElement(error_Message_BenificiaryRelationShipForElementOthers), "Please Explain Other Relationship");
		
		//Please Explain Other Relationship Max Error
		WebUI.clearText(benificiaryOthersRelationsship);
		WebUI.setText(benificiaryOthersRelationsship, Business_Name_100Chars);
		WebUI.verifyElementVisible(error_Message_BenificiaryRelationShipForElementOthers);
		WebUI.verifyContains(getTextElement(error_Message_BenificiaryRelationShipForElementOthers), Max_Error_OtherRelationship);

		WebUI.clearAndFillText(benificiaryOthersRelationsship, "Others");
		WebUI.sleep(1);
		WebUI.verifyContains(getAttributeElement(benificiaryOthersRelationsship, "value"), "Others");
		
		
//		==============================================ADD BENEFICIARY INFORMATION============================================================================================
		
		WebUI.verifyElementVisible(AddBenificiary);
		WebUI.clickElement(AddBenificiary);
		WebUI.sleep(1);
		WebUI.verifyElementVisible(getBusinessRadioButtonYes(3));
		WebUI.logInfoMessage("Element Visible "+getBusinessRadioButtonYes(3));
		WebUI.verifyElementVisible(getBusinessRadioButtonNo(3));
		WebUI.logInfoMessage("Element Visible "+getBusinessRadioButtonNo(3));
		WebUI.scrollToElementAtBottom(BenefDeleteButton);			
		WebUI.sleep(1);
		WebUI.clickElement(BenefDeleteButton);
		WebUI.sleep(1);
		WebUI.verifyElementNotVisibleSoftAssert(getBusinessRadioButtonYes(2));
		WebUI.verifyElementNotVisibleSoftAssert(getBusinessRadioButtonNo(2));
		WebUI.scrollToElementAtTop(AddBenificiary);
		WebUI.clickElement(AddBenificiary);
		
		try {
			
			for (int index = 2; index <= 4; index++) {

				WebUI.clearAndFillText(getBeneficiaryFirstname(index), DataGenerateUtils.randomFirstName());
				WebUI.clearAndFillText(getBeneficiaryMiddlename(index), DataGenerateUtils.randomMiddleName());
				WebUI.clearAndFillText(getBeneficiaryLastname(index), DataGenerateUtils.randomLastName());
				WebUI.clearAndFillText(getBeneficiaryAddress1(index), DataGenerateUtils.randomAddress());
				WebUI.clearAndFillText(getBeneficiaryAddress2(index), DataGenerateUtils.randomAddress());
				WebUI.clearAndFillText(getBeneficiaryCity(index), DataGenerateUtils.randomCity());
				WebUI.clickElement(getBeneficiaryState(index));
				WebUI.sleep(0.2);
				WebUI.setText(getBeneficiaryState(index), "g", Keys.ENTER);
				WebUI.sleep(0.2);
				WebUI.clearAndFillText(getBeneficiaryZipcode(index), DataGenerateUtils.randomZipCode());
				WebUI.clearAndFillText(getBeneficiaryEmailAddress(index), DataGenerateUtils.randomEmail());
				WebUI.clearAndFillText(getBeneficiaryPhone(index), DataGenerateUtils.randomPhoneNumber());
				WebUI.clearAndFillText(getBeneficiarySSN(index), DataGenerateUtils.randomSSNNumber());
				WebUI.clearAndFillText(getBeneficiaryDOB(index), DataGenerateUtils.randomDateOfBirthDDMMYYYY());
				WebUI.clearAndFillText(getBeneficiaryPercent(index), "25");
				WebUI.sleep(0.2);
				WebUI.clickElement(getBeneficiaryRelation(index));
				WebUI.setText(getBeneficiaryRelation(index), "p", Keys.ENTER);
				WebUI.sleep(1);
				WebUI.clickElement(AddBenificiary);
				
				if(index+1 >= 5)
				{
					WebElement Benef_FirstName_5th = DriverManager.getDriver().findElement(By.xpath("(//ion-input[@formcontrolname='BeneficiaryFirstName']/input)[5]"));
					Benef_FirstName_5th.isDisplayed();
				}
			}
			
		} catch (Exception ex) {
			WebUI.logInfoMessage("Added maximum beneficiary");
			WebUI.logInfoMessage(ex.getMessage());
		}
		
//		==============================================ADD CONTINGENT BENEFICIARY INFORMATION============================================================================================
		
		WebUI.sleep(1);
		WebUI.scrollToElementAtBottom(NextStep4);
		WebUI.verifyElementVisible(Add_ContBeneficiary);
		WebUI.clickElement(Add_ContBeneficiary);
		WebUI.sleep(2);
		WebUI.verifyElementVisible(ContBeneficiary_Yes_Button);
		WebUI.logInfoMessage("Element Visible "+ContBeneficiary_Yes_Button);
		WebUI.verifyElementVisible(ContBeneficiary_No_Button);
		WebUI.logInfoMessage("Element Visible "+ContBeneficiary_No_Button);
		WebUI.scrollToElementAtBottom(ContBeneficiary_DeleteButton);			
		WebUI.sleep(1);
		WebUI.clickElement(ContBeneficiary_DeleteButton);
		WebUI.sleep(1);
		WebUI.verifyElementNotVisibleSoftAssert(ContBeneficiary_Yes_Button);
		WebUI.verifyElementNotVisibleSoftAssert(ContBeneficiary_No_Button);
		WebUI.scrollToElementAtTop(Add_ContBeneficiary);
		WebUI.sleep(0.2);
		WebUI.clickElement(Add_ContBeneficiary);
		WebUI.sleep(0.5);

		WebUI.scrollToElementAtBottom(NextStep4);
		WebUI.moveToElement(NextStep4);
		WebUI.clickElement(NextStep4);
		WebUI.scrollToElementAtTop(ContBeneficiary_No_Button);
		WebUI.sleep(0.2);
		
		WebUI.clearText(ContBeneficiaryFirstName);
		WebUI.setText(ContBeneficiaryFirstName, Max_Name);
		WebUI.verifyElementVisible(ContBeneficiaryFirstName_ErrorMsg);
		WebUI.verifyContains(getTextElement(ContBeneficiaryFirstName_ErrorMsg), Max_error);

		String RandomBenificiaryfirstname_Cont = DataGenerateUtils.randomFirstName();
		WebUI.clearAndFillText(ContBeneficiaryFirstName,RandomBenificiaryfirstname_Cont);
		WebUI.sleep(0.2);
		WebUI.verifyContains(getAttributeElement(ContBeneficiaryFirstName,"value"),RandomBenificiaryfirstname_Cont);
		
		WebUI.clearText(ContBeneficiaryMiddleName);
		WebUI.setText(ContBeneficiaryMiddleName, Max_Name);
		WebUI.verifyElementVisible(ContBeneficiaryMiddleName_ErrorMsg);
		WebUI.verifyContains(getTextElement(ContBeneficiaryMiddleName_ErrorMsg), Max_error);

		String RandomBenificiaryMiddlename_Cont = DataGenerateUtils.randomMiddleName();
		WebUI.clearAndFillText(ContBeneficiaryMiddleName,RandomBenificiaryMiddlename_Cont);
		WebUI.sleep(0.2);
		WebUI.verifyContains(getAttributeElement(ContBeneficiaryMiddleName,"value"),RandomBenificiaryMiddlename_Cont);
		
		WebUI.verifyContains(getTextElement(ContBeneficiaryLastName_ErrorMsg), Mandatory_Error);

		WebUI.clearText(ContBeneficiaryLastName);
		WebUI.setText(ContBeneficiaryLastName, Max_Name);
		WebUI.verifyElementVisible(ContBeneficiaryLastName_ErrorMsg);
		WebUI.verifyContains(getTextElement(ContBeneficiaryLastName_ErrorMsg), Max_error);

		String RandomBenificiaryLastname_Cont = DataGenerateUtils.randomLastName();
		WebUI.clearAndFillText(ContBeneficiaryLastName,RandomBenificiaryLastname_Cont);
		WebUI.sleep(0.2);
		WebUI.verifyContains(getAttributeElement(ContBeneficiaryLastName,"value"),RandomBenificiaryLastname_Cont);
		
		WebUI.verifyContains(getTextElement(ContBeneficiary_Address1ErrorMsg), Mandatory_Error);

		WebUI.clearText(ContBeneficiaryAddress1);
		WebUI.setText(ContBeneficiaryAddress1, Add_Max);
		WebUI.verifyElementVisible(ContBeneficiary_Address1ErrorMsg);
		WebUI.verifyContains(getTextElement(ContBeneficiary_Address1ErrorMsg), Max_error);

		String RandomBenificiaryAddress_Cont = DataGenerateUtils.randomShortAddress();
		WebUI.clearAndFillText(ContBeneficiaryAddress1,RandomBenificiaryAddress_Cont);
		WebUI.sleep(0.2);
		WebUI.verifyContains(getAttributeElement(ContBeneficiaryAddress1,"value"),RandomBenificiaryAddress_Cont);
		
		WebUI.clearText(ContBeneficiaryAddress2);
		WebUI.setText(ContBeneficiaryAddress2, Add_Max);
		WebUI.verifyElementVisible(ContBeneficiary_Address2ErrorMsg);
		WebUI.verifyContains(getTextElement(ContBeneficiary_Address2ErrorMsg), Max_error);

		String RandomBenificiaryAddress_2_Cont = DataGenerateUtils.randomShortAddress();
		WebUI.clearAndFillText(ContBeneficiaryAddress2,RandomBenificiaryAddress_2_Cont);
		WebUI.sleep(0.2);
		WebUI.verifyContains(getAttributeElement(ContBeneficiaryAddress2,"value"),RandomBenificiaryAddress_2_Cont);
		
		WebUI.scrollToElementAtBottom(Add_ContBeneficiary);

		WebUI.verifyContains(getTextElement(ContBeneficiary_CityErrorMsg), Mandatory_Error);
		
		WebUI.clearText(ContBeneficiaryCity);
		WebUI.setText(ContBeneficiaryCity, Max_Name);
		WebUI.verifyElementVisible(ContBeneficiary_CityErrorMsg);
		WebUI.verifyContains(getTextElement(ContBeneficiary_CityErrorMsg), Max_error);

		String RandomBenificiaryCity_Cont = DataGenerateUtils.randomCity();
		WebUI.clearAndFillText(ContBeneficiaryCity,RandomBenificiaryCity_Cont);
		WebUI.sleep(0.2);
		WebUI.verifyContains(getAttributeElement(ContBeneficiaryCity,"value"),RandomBenificiaryCity_Cont);
		
		WebUI.scrollToElementAtBottom(Add_ContBeneficiary);
		WebUI.verifyContains(getTextElement(ContBeneficiary_StateErrorMsg), Mandatory_Error);

		WebUI.waitForElementVisible(ContBeneficiaryState);

		List<String> cont_States = WebUI.getElementTextsInList(ContBeneficiaryState_List);
		for(int i=1; i<=10; i+=2)
		{	
			WebUI.selectOptionByIndex(ContBeneficiaryState, i);
			WebUI.sleep(0.2);
		}
		WebUI.clickElement(ContBeneficiaryState);
		WebUI.sleep(0.2);
		WebUI.setText(ContBeneficiaryState, "l", Keys.ENTER);
		WebUI.sleep(0.2);
		
		WebUI.verifyContains(getTextElement(ContBeneficiary_ZipCodeErrorMsg), Mandatory_Error);

		WebUI.clearText(ContBeneficiaryZipcode);
		WebUI.setText(ContBeneficiaryZipcode, "345");
		WebUI.verifyElementVisible(ContBeneficiary_ZipCodeErrorMsg);
		WebUI.verifyContains(getTextElement(ContBeneficiary_ZipCodeErrorMsg), Min_error_Zp);

		WebUI.clearText(ContBeneficiaryZipcode);
		WebUI.setText(ContBeneficiaryZipcode, "3456789");
		WebUI.verifyElementVisible(ContBeneficiary_ZipCodeErrorMsg);
		WebUI.verifyContains(getTextElement(ContBeneficiary_ZipCodeErrorMsg), Max_error_Zp);

		String RandomBenificiaryZipcode_Cont = DataGenerateUtils.randomZipCode();
		WebUI.clearAndFillText(ContBeneficiaryZipcode,RandomBenificiaryZipcode_Cont);
		WebUI.sleep(0.2);
		WebUI.verifyContains(getAttributeElement(ContBeneficiaryZipcode,"value"),RandomBenificiaryZipcode_Cont);
		
		WebUI.clearText(ContBeneficiaryEmail);
		WebUI.setText(ContBeneficiaryEmail, "asdsaf");
		WebUI.verifyElementVisible(ContBeneficiary_EmailErrorMsg);
		WebUI.verifyContains(getTextElement(ContBeneficiary_EmailErrorMsg), incorrect_email_error);

		WebUI.clearText(ContBeneficiaryEmail);
		WebUI.setText(ContBeneficiaryEmail, Max_Name);
		WebUI.verifyElementVisible(ContBeneficiary_EmailErrorMsg);
		WebUI.verifyContains(getTextElement(ContBeneficiary_EmailErrorMsg), Max_error_);

		String RandomBenificiaryEmail_Cont = DataGenerateUtils.randomEmail();
		WebUI.clearAndFillText(ContBeneficiaryEmail,RandomBenificiaryEmail_Cont);
		WebUI.sleep(0.2);
		WebUI.verifyContains(getAttributeElement(ContBeneficiaryEmail,"value"),RandomBenificiaryEmail_Cont);
		
		WebUI.setText(ContBeneficiaryPhone, "123");
		WebUI.verifyElementVisible(ContBeneficiary_PhoneErrorMsg);
		WebUI.verifyContains(getTextElement(ContBeneficiary_PhoneErrorMsg), Min_error_Pn);

		WebUI.clearText(ContBeneficiaryPhone);
		WebUI.setText(ContBeneficiaryPhone, "12487451245871");
		WebUI.verifyElementVisible(ContBeneficiary_PhoneErrorMsg);
		WebUI.verifyContains(getTextElement(ContBeneficiary_PhoneErrorMsg), Max_error_Pn);

		String RandomBenificiaryPhone_Cont = DataGenerateUtils.randomPhoneNumber();
		WebUI.clearAndFillText(ContBeneficiaryPhone,RandomBenificiaryPhone_Cont);
		WebUI.sleep(0.2);
		WebUI.verifyContains(getAttributeElement(ContBeneficiaryPhone,"value"),RandomBenificiaryPhone_Cont);
		
		WebUI.verifyContains(getTextElement(ContBeneficiary_SSNErrorMsg), Mandatory_Error);

		WebUI.clearText(ContBeneficiarySSN);
		WebUI.setText(ContBeneficiarySSN, "12345");
		WebUI.verifyElementVisible(ContBeneficiary_SSNErrorMsg);
		WebUI.verifyContains(getTextElement(ContBeneficiary_SSNErrorMsg), Min_error_ssn);

		WebUI.clearText(ContBeneficiarySSN);
		WebUI.setText(ContBeneficiarySSN, "123455874512");
		WebUI.verifyElementVisible(ContBeneficiary_SSNErrorMsg);
		WebUI.verifyContains(getTextElement(ContBeneficiary_SSNErrorMsg), Max_error_ssn);
		
		String RandomBenificiarySSN_Cont = DataGenerateUtils.randomSSNNumber();
		WebUI.clearAndFillText(ContBeneficiarySSN,RandomBenificiarySSN_Cont);
		WebUI.sleep(0.2);
		WebUI.verifyContains(getAttributeElement(ContBeneficiarySSN,"value"),RandomBenificiarySSN_Cont);
		
		WebUI.scrollToElementAtBottom(Add_ContBeneficiary);
		WebUI.sleep(0.2);
		
		WebUI.verifyContains(getTextElement(ContBeneficiary_DOBErrorMsg), Mandatory_Error);
		WebUI.verifyContains(getTextElement(ContBeneficiary_AgeErrorMsg), Mandatory_Error);
		
		WebUI.verifyEquals(getAttributeElement(ContBenificiaryAge,"value"), "0");

		String RandomBenificiaryDOB_Cont = DataGenerateUtils.randomDateOfBirthDDMMYYYY();
		WebUI.clearAndFillText(ContBeneficiaryDOB,RandomBenificiaryDOB_Cont);
		WebUI.sleep(0.2);
		
		System.out.println("Generated DOB: "+RandomBenificiaryDOB_Cont);
		System.out.println("Attribute DOB: "+getAttributeElement(ContBeneficiaryDOB,"value"));
		
		WebUI.verifyContains(getTextElement(ContBeneficiary_PercentErrorMsg), Mandatory_Error);

		WebUI.scrollToElementAtBottom(NextStep4);
		WebUI.clearText(ContBeneficiaryPercent);
		WebUI.setText(ContBeneficiaryPercent, "123455874512");
		WebUI.verifyElementVisible(ContBenificiaryMaxPercentError);
		WebUI.verifyContains(getTextElement(ContBeneficiary_MaxPercentErrorMsg), ContBenif_max_percentage_error);
	
		WebUI.clearAndFillText(ContBeneficiaryPercent, "50");
		WebUI.sleep(0.2);
		WebUI.verifyContains(getAttributeElement(ContBeneficiaryPercent, "value"), "50");

		WebUI.verifyContains(getTextElement(ContBeneficiary_RelationErrorMsg), Mandatory_Error);

		List<String> relationships_Cont = WebUI.getElementTextsInList(ContBenificiaryrelationsList);
		for(int i=1; i<relationships_Cont.size(); i++)
		{	
			WebUI.selectOptionByIndex(ContBeneficiaryRelation, i);
			WebUI.sleep(0.2);
		}
		
		WebUI.sleep(0.2);
		WebUI.clickElement(ContBeneficiaryRelation);
		WebUI.setText(ContBeneficiaryRelation, "o", Keys.ENTER);
		WebUI.sleep(1);
		
		WebUI.verifyElementVisible(error_Message_ContBenificiaryRelationShipForElementOthers);
		WebUI.verifyContains(getTextElement(error_Message_ContBenificiaryRelationShipForElementOthers), "Please Explain Other Relationship");
		
		//Please Explain Other Relationship Max Error
		WebUI.clearText(ContBenificiaryOthersRelationsship);
		WebUI.setText(ContBenificiaryOthersRelationsship, Business_Name_100Chars);
		WebUI.verifyElementVisible(error_Message_ContBenificiaryRelationShipForElementOthers);
		WebUI.verifyContains(getTextElement(error_Message_ContBenificiaryRelationShipForElementOthers), Max_Error_OtherRelationship);

		WebUI.clearAndFillText(ContBenificiaryOthersRelationsship, "Others");
		WebUI.sleep(1);
		WebUI.verifyContains(getAttributeElement(ContBenificiaryOthersRelationsship, "value"), "Others");

//		*************************************************************************************************************************
		
/*		WebUI.sleep(1);
		WebUI.scrollToElementAtBottom(NextStep4);
		WebUI.verifyElementVisible(Add_ContBeneficiary);
		WebUI.clickElement(Add_ContBeneficiary);
		WebUI.sleep(2);
		WebUI.verifyElementVisible(ContBeneficiary_Yes_Button);
		WebUI.logInfoMessage("Element Visible "+ContBeneficiary_Yes_Button);
		WebUI.verifyElementVisible(ContBeneficiary_No_Button);
		WebUI.logInfoMessage("Element Visible "+ContBeneficiary_No_Button);
		WebUI.scrollToElementAtBottom(ContBeneficiary_DeleteButton);			
		WebUI.sleep(1);
		WebUI.clickElement(ContBeneficiary_DeleteButton);
		WebUI.sleep(1);
		WebUI.verifyElementNotVisibleSoftAssert(ContBeneficiary_Yes_Button);
		WebUI.verifyElementNotVisibleSoftAssert(ContBeneficiary_No_Button);
		WebUI.scrollToElementAtTop(Add_ContBeneficiary);
		WebUI.clickElement(Add_ContBeneficiary);
		WebUI.sleep(0.5);
		
		WebUI.clearAndFillText(getContBeneficiaryFirstName(1), DataGenerateUtils.randomFirstName());
		WebUI.clearAndFillText(getContBeneficiaryMiddleName(1), DataGenerateUtils.randomMiddleName());
		WebUI.clearAndFillText(getContBeneficiaryLastName(1), DataGenerateUtils.randomLastName());
		WebUI.clearAndFillText(getContBeneficiaryAddress1(1), DataGenerateUtils.randomAddress());
		WebUI.clearAndFillText(getContBeneficiaryAddress2(1), DataGenerateUtils.randomAddress());
		WebUI.clearAndFillText(getContBeneficiaryCity(1), DataGenerateUtils.randomCity());
		WebUI.clickElement(getContBeneficiaryState(1));
		WebUI.setText(getContBeneficiaryState(1), "c", Keys.ENTER);
		WebUI.sleep(0.2);
		WebUI.clearAndFillText(getContBeneficiaryZipcode(1), DataGenerateUtils.randomZipCode());
		WebUI.clearAndFillText(getContBeneficiaryEmail(1), DataGenerateUtils.randomEmail());
		WebUI.clearAndFillText(getContBeneficiaryPhone(1), DataGenerateUtils.randomPhoneNumber());
		WebUI.clearAndFillText(getContBeneficiarySSN(1), DataGenerateUtils.randomSSNNumber());
		WebUI.clearAndFillText(getContBeneficiaryDOB(1), DataGenerateUtils.randomDateOfBirthDDMMYYYY());
		WebUI.clearAndFillText(getContBeneficiaryPercent(1), "50");
		WebUI.clickElement(getContBeneficiaryRelation(1));
		WebUI.setText(getContBeneficiaryRelation(1), "s", Keys.ENTER);
*///		
				
		//2nd Contingent Beneficiary Details
		WebUI.clickElement(Add_ContBeneficiary);
		WebUI.sleep(0.5);
		WebUI.clearAndFillText(getContBeneficiaryFirstName(2), DataGenerateUtils.randomFirstName());
		WebUI.clearAndFillText(getContBeneficiaryMiddleName(2), DataGenerateUtils.randomMiddleName());
		WebUI.clearAndFillText(getContBeneficiaryLastName(2), DataGenerateUtils.randomLastName());
		WebUI.clearAndFillText(getContBeneficiaryAddress1(2), DataGenerateUtils.randomAddress());
		WebUI.clearAndFillText(getContBeneficiaryAddress2(2), DataGenerateUtils.randomAddress());
		WebUI.clearAndFillText(getContBeneficiaryCity(2), DataGenerateUtils.randomCity());
		WebUI.clickElement(getContBeneficiaryState(2));
		WebUI.setText(getContBeneficiaryState(2), "a", Keys.ENTER);
		WebUI.sleep(0.2);
		WebUI.clearAndFillText(getContBeneficiaryZipcode(2), DataGenerateUtils.randomZipCode());
		WebUI.clearAndFillText(getContBeneficiaryEmail(2), DataGenerateUtils.randomEmail());
		WebUI.clearAndFillText(getContBeneficiaryPhone(2), DataGenerateUtils.randomPhoneNumber());
		WebUI.clearAndFillText(getContBeneficiarySSN(2), DataGenerateUtils.randomSSNNumber());
		WebUI.clearAndFillText(getContBeneficiaryDOB(2), DataGenerateUtils.randomDateOfBirthDDMMYYYY());
		WebUI.clearAndFillText(getContBeneficiaryPercent(2), "100");
		WebUI.sleep(0.2);
		WebUI.verifyContains(getTextElement(ContBeneficiary_MaxPercentErrorMsg), ContBenif_max_percentage_error);
		WebUI.clearAndFillText(getContBeneficiaryPercent(2), "50");
		WebUI.clickElement(getContBeneficiaryRelation(2));
		WebUI.setText(getContBeneficiaryRelation(2), "s", Keys.ENTER);
		
//		==========================================================================================================================================

		WebUI.scrollToElementAtBottom(NextStep4);
		WebUI.sleep(0.2);
		WebUI.moveToElement(NextStep4);
		WebUI.sleep(1);
		WebUI.clickElement(NextStep4);					
		WebUI.waitForPageLoaded();
//		WebUI.verifyElementVisible(NextStep5);			
		
		
		}


}

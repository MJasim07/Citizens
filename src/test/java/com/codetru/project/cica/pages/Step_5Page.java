package com.codetru.project.cica.pages;

import static com.codetru.keywords.WebUI.getAttributeElement;
import static com.codetru.keywords.WebUI.getTextElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.codetru.keywords.WebUI;
import com.codetru.project.cica.CommonPageCICA;
import com.codetru.utils.DataGenerateUtils;

public class Step_5Page extends CommonPageCICA {

	private By exist_no = By.xpath("(//ion-label[text()='No ']/following-sibling::ion-radio[@slot='start'])[1]");
	private By NextStep5 = By.xpath("//h3[.='Existing Insurance']/parent::div/following-sibling::ion-row/ion-col[@size='24' and @size-md='6']/ion-button");
	private By error_Message_ExistingInsurQuest_1 = By.xpath("(//h3[text()='Existing Insurance']/following-sibling::ion-row[@class='md hydrated'])[1]");
	private By error_Message_ExistingInsurQuest_2 = By.xpath("(//h3[text()='Existing Insurance']/following-sibling::ion-row[@class='md hydrated'])[2]");
	private By ExitingInsurance_Question_1 = By.xpath("(//ion-label[text()='No ']/following-sibling::ion-radio[@slot='start'])[1]");
	private By Error_HealthQuestions_1 = By.xpath("//div[@class='block-info-app' and @style='margin-top: 20px; margin-bottom: 20px;' ]/div[1]/ion-row/ion-col[@class='md hydrated']");
	private By ExistingInsurance_RadioB_Yes1 = By.xpath("(//ion-label[normalize-space()='Yes']/following-sibling::ion-radio)[8]");
	private By ExistingInsurance_RadioB_Yes2 = By.xpath("(//ion-label[normalize-space()='Yes']/following-sibling::ion-radio)[9]");
	private By ExistingInsurance_RadioB_No1 = By.xpath("(//ion-label[normalize-space()='No']/following-sibling::ion-radio)[8]");
	private By ExistingInsurance_RadioB_No2 = By.xpath("(//ion-label[normalize-space()='No']/following-sibling::ion-radio)[9]");
	private By Questionier__RadioB_Yes1 = By.xpath("(//ion-label[normalize-space()='Yes']/following-sibling::ion-radio)[10]");
	private By Questionier__RadioB_Yes2 = By.xpath("(//ion-label[normalize-space()='Yes']/following-sibling::ion-radio)[11]");
	private By Questionier__RadioB_No1 = By.xpath("(//ion-label[normalize-space()='No']/following-sibling::ion-radio)[10]");
	private By Questionier__RadioB_No2 = By.xpath("(//ion-label[normalize-space()='No']/following-sibling::ion-radio)[11]");
	private By ProposedInsurer_Sign = By.xpath("(//ion-button[@class='buttonIcon md button button-clear ion-activatable ion-focusable hydrated'])[1]");
	private By Agent_Sign = By.xpath("(//ion-button[@class='buttonIcon md button button-clear ion-activatable ion-focusable hydrated'])[2]");
	private By Signature_pad = By.xpath("//canvas[@class='signature-pad-canvas hidden-xs-down']");
	private By Sign_Done = By.xpath("(//ion-col[@style='padding-right: 20px;']/ion-button)[1]");
	private By Sign_Clear = By.xpath("//ion-col[@style='padding-left: 20px;']/ion-button");
	private By SignPad_CloseButton = By.xpath("//ion-buttons[@slot='primary']/ion-button");
	private By InsurerName = By.xpath("//ion-input[@formcontrolname='PriorCovCompanyName1']/input");
	private By InsurerName_ErrorMsg = By.xpath("(//ion-col[@class = 'md hydrated' and @size-md = '12' and @size='24'])[4]");
	private By ContractOrPolicyNumber = By.xpath("//ion-input[@formcontrolname='PriorCovPolicyNumber1']/input");
	private By ContractOrPolicyNumber_ErrorMsg = By.xpath("(//ion-col[@class = 'md hydrated' and @size-md = '12' and @size='24'])[5]");
	private By InsuredOrAnnuitant = By.xpath("//ion-input[@formcontrolname='PriorCovInsured1']/input");
	private By InsuredOrAnnuitant_ErrorMsg = By.xpath("(//ion-col[@class = 'md hydrated' and @size-md = '12' and @size='24'])[6]");
	private By Replaced_RadioButton = By.xpath("//ion-label[@mode='md']/following-sibling::ion-radio[@value='R']");
	private By Financing_RadioButton = By.xpath("//ion-label[@mode='md']/following-sibling::ion-radio[@value='F']");
	private By Replaced_Financing_ErrorMsg = By.xpath("(//ion-col[@class = 'md hydrated' and @size-md = '12' and @size='24'])[7]");
	private By Add_Button = By.xpath("//ion-button[normalize-space()='Add']");	
	private By Remove_Button = By.xpath("//ion-button[normalize-space()='Remove']");	
	private By PolicyReplaced_Explanation = By.xpath("//ion-input[@formcontrolname='PriorCovExplain']/input");
	private By PolicyReplaced_Explanation_ErrorMsg = By.xpath("//ion-input[@formcontrolname='PriorCovExplain']/parent::ion-item/parent::ion-col");
	private By ProposedInsurer_Sign_Error = By.xpath("(//p[@class='errormsg']/parent::div)[2]/parent::div/parent::ion-col");
	private By Agent_Sign_Error = By.xpath("//ion-label[text()=' AGENT CLICK HERE TO SIGN. ']/parent::ion-button/parent::div/parent::ion-col");
	private By Proposed_SignedDate = By.xpath("//ion-input[@formcontrolname='ProposedReplacementSignedDate']/input");
	private By Agent_SignedDate = By.xpath("//ion-input[@formcontrolname='AgentReplacementSignedDate']/input");
	
	private By InsurerName2 = By.xpath("//ion-input[@formcontrolname='PriorCovCompanyName2']/input");
	private By ContractOrPolicyNumber2 = By.xpath("//ion-input[@formcontrolname='PriorCovPolicyNumber2']/input");
	private By InsuredOrAnnuitant2 = By.xpath("//ion-input[@formcontrolname='PriorCovInsured2']/input");

	public void Existing_Insurance() throws Exception {

		String Mandatory_Error = "Please enter a value.";
		String Name_MaxChar = "qwertyuiop asdfghjkl zxcvbnm qwertyuiop asdfghjkl zxcvbnm";
		String MaxChar_ErrorMsg = "The maximum number of characters is 50.";
		String Explanation_MaxChar = "qwertyuiop asdfghjkl zxcvbnm poiuytrewq lkjhgfdsa mnbvcxz zxcvbnm lkjhgfdsa qwertyuiop poiuytrewq asdfghjkl";
		String Explanation_MaxChar_Error = "The maximum number of characters is 100.";
		

		WebUI.sleep(1);
//		C.Mandate_Click1(driver, act, NextStep5, e, Test.Case5(7), Test.Exp5(7));
		WebUI.moveToElement(NextStep5);
		WebUI.sleep(1);
		WebUI.clickElement(NextStep5);


//		C.Empty_Input(driver, error_Message_ExistingInsurQuest_1, Mandatory_Error, e, Test.Case5(4), Test.Exp5(4));
		WebUI.verifyContains(getTextElement(error_Message_ExistingInsurQuest_1), Mandatory_Error);


//		C.Empty_Input(driver, error_Message_ExistingInsurQuest_2, Mandatory_Error, e, Test.Case5(8), Test.Exp5(8));
		WebUI.verifyContains(getTextElement(error_Message_ExistingInsurQuest_2), Mandatory_Error);

//		C.step_5_(driver, ExitingInsurance_Question_1, NextStep5, Error_HealthQuestions_1, e, Test.Case5(6), Test.Exp5(6));
		WebUI.clickElement(ExitingInsurance_Question_1);
		WebUI.sleep(0.2);
		WebUI.clickElement(ExistingInsurance_RadioB_Yes1);
		WebUI.sleep(0.2);
		WebUI.clickElement(ExistingInsurance_RadioB_Yes2);
		WebUI.sleep(0.2);
		WebUI.clickElement(ExistingInsurance_RadioB_No2);
		
		WebUI.scrollToElementAtBottom(ProposedInsurer_Sign);
		WebUI.sleep(0.2);
		WebUI.clickElement(Questionier__RadioB_No1);
		WebUI.clickElement(Questionier__RadioB_Yes1);
		WebUI.sleep(0.2);
		WebUI.clickElement(Questionier__RadioB_No2);		
		WebUI.clickElement(Questionier__RadioB_Yes2);		
		WebUI.clickElement(Questionier__RadioB_No2);	
		
		WebUI.scrollToElementAtBottom(NextStep5);
		WebUI.moveToElement(NextStep5);
		WebUI.sleep(1);
		WebUI.clickElement(NextStep5);
		
		WebUI.verifyContains(getTextElement(InsurerName_ErrorMsg), Mandatory_Error);
		WebUI.verifyContains(getTextElement(ContractOrPolicyNumber_ErrorMsg), Mandatory_Error);
		
		WebUI.clearAndFillText(InsurerName, Name_MaxChar);
		WebUI.verifyElementVisible(InsurerName_ErrorMsg);
		WebUI.verifyContains(getTextElement(InsurerName_ErrorMsg), MaxChar_ErrorMsg);
		
		String RandomInsurerName = DataGenerateUtils.randomFirstName();
		WebUI.clearAndFillText(InsurerName,RandomInsurerName);
		WebUI.sleep(0.2);
		WebUI.verifyContains(getAttributeElement(InsurerName,"value"),RandomInsurerName);
		
		WebUI.clearAndFillText(ContractOrPolicyNumber, Name_MaxChar);
		WebUI.verifyElementVisible(ContractOrPolicyNumber_ErrorMsg);
		WebUI.verifyContains(getTextElement(ContractOrPolicyNumber_ErrorMsg), MaxChar_ErrorMsg);
		
		String RandomPolicyNumber = DataGenerateUtils.randomSSNNumber();
		WebUI.clearAndFillText(ContractOrPolicyNumber,RandomPolicyNumber);
		WebUI.sleep(0.2);
		WebUI.verifyContains(getAttributeElement(ContractOrPolicyNumber,"value"),RandomPolicyNumber);
		
		WebUI.scrollToElementAtBottom(PolicyReplaced_Explanation);
		WebUI.verifyContains(getTextElement(InsuredOrAnnuitant_ErrorMsg), Mandatory_Error);
		
		WebUI.clearAndFillText(InsuredOrAnnuitant, Name_MaxChar);
		WebUI.verifyElementVisible(InsuredOrAnnuitant_ErrorMsg);
		WebUI.verifyContains(getTextElement(InsuredOrAnnuitant_ErrorMsg), MaxChar_ErrorMsg);
		
		String RandomInsured = DataGenerateUtils.randomFirstName();
		WebUI.clearAndFillText(InsuredOrAnnuitant,RandomInsured);
		WebUI.sleep(0.2);
		WebUI.verifyContains(getAttributeElement(InsuredOrAnnuitant,"value"),RandomInsured);
		
		WebUI.verifyContains(getTextElement(Replaced_Financing_ErrorMsg), Mandatory_Error);
		WebUI.clickElement(Financing_RadioButton);
		WebUI.sleep(0.2);
		WebUI.clickElement(Replaced_RadioButton);
		WebUI.clickElement(Financing_RadioButton);
		WebUI.sleep(0.2);
		
		WebUI.clickElement(Add_Button);
		WebUI.sleep(0.2);
		WebUI.verifyElementVisible(InsurerName2);
		WebUI.verifyElementVisible(ContractOrPolicyNumber2);
		WebUI.verifyElementVisible(InsuredOrAnnuitant2);
		WebUI.clickElement(Remove_Button);
		
		WebUI.scrollToElementAtBottom(Agent_Sign);
		WebUI.sleep(0.2);
		WebUI.verifyContains(getTextElement(PolicyReplaced_Explanation_ErrorMsg), Mandatory_Error);
		WebUI.clearAndFillText(PolicyReplaced_Explanation, Explanation_MaxChar);
		WebUI.verifyElementVisible(PolicyReplaced_Explanation_ErrorMsg);
		WebUI.verifyContains(getTextElement(PolicyReplaced_Explanation_ErrorMsg), Explanation_MaxChar_Error);
		
		WebUI.clearAndFillText(PolicyReplaced_Explanation, "Enter the reason of policy change");
		
		WebUI.scrollToElementAtTop(ProposedInsurer_Sign);
		WebUI.sleep(0.2);
		
		WebUI.verifyContains(getTextElement(ProposedInsurer_Sign_Error), Mandatory_Error);
		WebUI.clickElement(ProposedInsurer_Sign);
		WebUI.sleep(2);
		WebUI.clickHold(Signature_pad);
		WebUI.moveToOffset(25, 25);
		WebUI.moveToOffset(35, 30);
		WebUI.moveToOffset(16, 26);
		WebUI.moveToOffset(-76, -26);
		WebUI.moveToOffset(18, 56);
		WebUI.moveToOffset(-52, -36);
		WebUI.moveToOffset(-21, -25);
		WebUI.moveToOffset(36, 26);
		WebUI.moveToOffset(-54, 56);
		WebUI.releaseElement(Signature_pad);
		WebUI.sleep(0.2);
		WebUI.clickElement(Sign_Clear);
		WebUI.sleep(0.5);
		WebUI.clickElement(SignPad_CloseButton);
		
		WebUI.sleep(1);
		WebUI.clickElement(ProposedInsurer_Sign);
		WebUI.sleep(2);
		WebUI.clickHold(Signature_pad);
		WebUI.moveToOffset(25, 25);
		WebUI.moveToOffset(35, 30);
		WebUI.moveToOffset(16, 26);
		WebUI.moveToOffset(-76, -26);
		WebUI.moveToOffset(18, 56);
		WebUI.moveToOffset(-52, -36);
		WebUI.moveToOffset(-21, -25);
		WebUI.moveToOffset(36, 26);
		WebUI.moveToOffset(-54, 56);
		WebUI.releaseElement(Signature_pad);
		WebUI.clickElement(Sign_Done);
		
		WebUI.verifyElementNotEditable(Proposed_SignedDate);
		WebUI.sleep(1);
		
		//Agent Sign
		WebUI.verifyContains(getTextElement(Agent_Sign_Error), Mandatory_Error);
		WebUI.clickElement(Agent_Sign);
		WebUI.sleep(2);
		WebUI.clickHold(Signature_pad);
		WebUI.moveToOffset(25, 25);
		WebUI.moveToOffset(35, 30);
		WebUI.moveToOffset(16, 26);
		WebUI.moveToOffset(-76, -26);
		WebUI.moveToOffset(18, 56);
		WebUI.moveToOffset(-52, -36);
		WebUI.moveToOffset(-21, -25);
		WebUI.moveToOffset(36, 26);
		WebUI.moveToOffset(-54, 56);
		WebUI.releaseElement(Signature_pad);
		
		try {
			WebUI.getWebElement(Sign_Done).isEnabled();
			WebUI.clickElement(Sign_Done);
		}
		catch(Exception ex) {
			WebUI.clickElement(SignPad_CloseButton);
			WebUI.sleep(1);
			WebUI.clickElement(Agent_Sign);
			WebUI.sleep(2);
			WebUI.clickHold(Signature_pad);
			WebUI.moveToOffset(25, 25);
			WebUI.moveToOffset(35, 30);
			WebUI.moveToOffset(16, 26);
			WebUI.moveToOffset(-76, -26);
			WebUI.moveToOffset(18, 56);
			WebUI.moveToOffset(-52, -36);
			WebUI.moveToOffset(-21, -25);
			WebUI.moveToOffset(36, 26);
			WebUI.moveToOffset(-54, 56);
			WebUI.releaseElement(Signature_pad);
			WebUI.clickElement(Sign_Done);
		}
		
		WebUI.sleep(0.5);
		WebUI.verifyElementNotEditable(Agent_SignedDate);
		WebUI.logInfoMessage("Proposed Signed Date: "+WebUI.getAttributeElement(Proposed_SignedDate, "value"));
		WebUI.logInfoMessage("Agent Signed Date: "+WebUI.getAttributeElement(Agent_SignedDate, "value"));
		
		WebUI.sleep(1);
		WebUI.scrollToElementAtBottom(NextStep5);
		WebUI.sleep(0.2);
		WebUI.moveToElement(NextStep5);
		WebUI.clickElement(NextStep5);
		WebUI.verifyElementVisible(Error_HealthQuestions_1);

	}

}

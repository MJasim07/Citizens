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

import com.codetru.driver.DriverManager;
import com.codetru.helpers.PropertiesHelpers;
import com.codetru.keywords.WebUI;
import com.codetru.project.cica.CommonPageCICA;
import com.codetru.utils.DataGenerateUtils;


public class Step_8Page_NV extends CommonPageCICA {

	
//		private By NextStep8 = By.xpath("(//ion-row[@style='padding-left: 50px;']/ion-col[@class='md hydrated']/ion-button)[7]");
		private By NextStep8 = By.xpath("//h3[text()='Agent']/ancestor::ion-grid/ion-row[2]/ion-col/ion-button[text()='Next Step']");
	
		private By signedCity = By.xpath("//ion-input[@formcontrolname='SignedCity']/input");
		private By HoldDateRadioButton_No = By.xpath("//ion-radio-group[@formcontrolname='HoldDateCheckBox']/ion-row/ion-col/ion-item/ion-label[text()='No']/following-sibling::ion-radio");
		private By HoldDateRadioButton_Yes = By.xpath("//ion-radio-group[@formcontrolname='HoldDateCheckBox']/ion-row/ion-col/ion-item/ion-label[text()='Yes']/following-sibling::ion-radio");		
		private By Error_SignedCity = By.xpath("(//ion-col[@class = 'md hydrated' and @size-md = '12' and @size='24'])[3]");
		private By Error_SignatureProposedInsurer = By.xpath("(//h3[text()='Signature']/following-sibling::ion-row[2]/ion-col[@size='24' and @size-md='6'])[1]");
		private By ProposedInsurerSignature = By.xpath("//h3[.='Signature']/following-sibling::ion-row[2]/ion-col/div/ion-button");
		private By signature_pad1 = By.xpath("(//canvas[@class='signature-pad-canvas hidden-xs-down'])[1]");
		private By Padding_Right1 = By.xpath("(//ion-col[@style='padding-right: 20px;']/ion-button)[1]");
		private By Error_HoldUntillDate = By.xpath("(//ion-col[@class = 'md hydrated' and @size-md = '12' and @size='24'])[7]");
		private By Error_SignatureOfAgent = By.xpath("//h3[text()='Agent']/following-sibling::ion-row/ion-col[4][@size='24']");
		private By SignatureOfAgent = By.xpath("//div/h3[.='Agent']/following-sibling::ion-row/ion-col[4]/div/ion-button");
		private By signature_pad2 = By.xpath("//canvas[@class='signature-pad-canvas hidden-xs-down']");
		private By Padding_Right2 = By.xpath("(//ion-col[@style='padding-right: 20px;']/ion-button)[1]");
		private By Sign1 = By.xpath("(//img[@width='150'])[1]");
		private By Sign2 = By.xpath("(//img[@width='150'])[2]");
		private By application_btn = By.id("applicationButton");
		private By EC_Consent_Signature = By.xpath("//h3[.='Electronic Communication Consent']/parent::div/descendant::ion-button");
		
		private By AgentStatement_RadioB_No1 = By.xpath("//ion-radio-group[@formcontrolname='AgentStatement1']/ion-row/ion-col[2]/ion-item/ion-radio");
		private By AgentStatement_RadioB_No2 = By.xpath("//ion-radio-group[@formcontrolname='AgentStatement1']/ion-row/ion-col[2]/ion-item/following::ion-radio[2]");
		
		
		public void Disclosure_and_Signature() throws Exception {
	
			String Max_Name = "sdfsadfgdfsfghfghxfghjdsfghdfghdfghjdfsghdsfghretyu";
			String Max_error_ ="The maximum number of characters is 50.";
			String Mandatory_Err = "Please enter a value.";
			String hold_Date_Err = "Hold Date must be before License Expiration Date";
			
			WebUI.sleep(1);
			
			try {
				WebElement AgentLic_ContinueButton = DriverManager.getDriver().findElement(By.xpath("//span[normalize-space()='Continue']/parent::button"));
				AgentLic_ContinueButton.click();
			}catch(Exception ex)
			{
				System.out.println("Agent License pop up did not appear.");
			}
			
			try {
				
				DriverManager.getDriver().findElement(EC_Consent_Signature).isDisplayed();
				WebUI.scrollToElementAtTop(EC_Consent_Signature);
				WebUI.clickElement(EC_Consent_Signature);
				WebUI.sleep(2);
				WebUI.clickHold(signature_pad1);
				WebUI.moveToOffset(25, 25);
				WebUI.moveToOffset(35, 30);
				WebUI.moveToOffset(16, 26);
				WebUI.moveToOffset(-50, -10);
				WebUI.moveToOffset(18, 56);
				WebUI.moveToOffset(-40, -55);
				WebUI.moveToOffset(-21, -25);
				WebUI.moveToOffset(36, 26);
				WebUI.moveToOffset(-60, 65);
				WebUI.releaseElement(signature_pad1);
				WebUI.clickElement(Padding_Right1);
				WebUI.sleep(2);

			} catch (Exception exe) {
				System.out.println("Electronic Communication Consent Did Not Appear. " + exe.getMessage());
			}
			
			WebUI.sleep(1);
//			WebUI.moveToElement(signedCity);
//			WebUI.moveToElement(ProposedInsurerSignature);			
//			WebUI.moveToElement(signedCity);
			WebUI.scrollToElementAtTop(signedCity);
			WebUI.sleep(1);
			
			String RandomCity = DataGenerateUtils.randomCity();
			WebUI.clearAndFillText(signedCity,RandomCity);
			WebUI.sleep(0.5);
			WebUI.verifyContains(getAttributeElement(signedCity,"value"),RandomCity);
			WebUI.moveToElement(signedCity);
			
	
			WebUI.scrollToElementAtBottom(Error_SignatureProposedInsurer);
			WebUI.sleep(1);
			WebUI.scrollToElementAtBottom(HoldDateRadioButton_No);
//			WebUI.verifyElementPresent(HoldDateRadioButton_No);
			WebUI.sleep(0.5);
	
			WebUI.sleep(1);
			WebUI.clickElement(ProposedInsurerSignature);
			WebUI.sleep(2);
			WebUI.clickHold(signature_pad1);
			WebUI.moveToOffset(25, 25);
			WebUI.moveToOffset(35, 30);
			WebUI.moveToOffset(16, 26);
			WebUI.moveToOffset(-76, -26);
			WebUI.moveToOffset(18, 56);
			WebUI.moveToOffset(-52, -36);
			WebUI.moveToOffset(-21, -25);
			WebUI.moveToOffset(36, 26);
			WebUI.moveToOffset(-54, 56);
			WebUI.releaseElement(signature_pad1);
			WebUI.clickElement(Padding_Right1);
			WebUI.sleep(2);
//			WebUI.verifyElementVisible(Sign1);
				
//			WebUI.scrollToElementAtBottom(Error_HoldUntillDate);
//			WebUI.verifyElementVisible(Error_HoldUntillDate);
//			
			WebUI.clickElement(HoldDateRadioButton_No);
			WebUI.sleep(1);
			WebUI.scrollToElementAtBottom(NextStep8);
			WebUI.verifyElementVisible(NextStep8);
			WebUI.sleep(0.5);
			
			try {
				
				WebElement radioButton_1 = DriverManager.getDriver().findElement(AgentStatement_RadioB_No1);
				radioButton_1.click();
				WebUI.sleep(0.5);
				WebElement radioButton_2 = DriverManager.getDriver().findElement(AgentStatement_RadioB_No2);
				radioButton_2.click();
				WebUI.sleep(0.5);
				
			}catch(Exception ex)
			{
				System.out.println("LICENSED AGENT STATEMENT - Not Available");
			}
			
	
			WebUI.scrollToElementAtBottom(NextStep8);
			WebUI.verifyElementVisible(NextStep8);
			WebUI.sleep(0.5);
			WebUI.clickElement(SignatureOfAgent);
			WebUI.sleep(1);
			WebUI.clickHold(signature_pad2); 
			WebUI.moveToOffset(25, 25);
			WebUI.moveToOffset(35, 30);
			WebUI.moveToOffset(16, 26);
			WebUI.moveToOffset(-76, -26);
			WebUI.moveToOffset(18, 56);
			WebUI.moveToOffset(-52, -36);
			WebUI.moveToOffset(-21, -25);
			WebUI.moveToOffset(36, 26);
			WebUI.moveToOffset(112, 56);
			WebUI.releaseElement(signature_pad2); 
			WebUI.clickElement(Padding_Right2);
			WebUI.sleep(2);
//			WebUI.verifyElementVisible(Sign2);
			WebUI.sleep(1);
			
			WebUI.scrollToElementAtBottom(NextStep8);
			WebUI.sleep(0.5);
			WebUI.clickElement(NextStep8);
			WebUI.sleep(1);
			WebUI.verifyElementVisible(application_btn);
			WebUI.sleep(1);
						
			
		}
}

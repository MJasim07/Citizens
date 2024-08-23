package com.codetru.project.cica.pages;

import static com.codetru.keywords.WebUI.getTextElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.codetru.driver.DriverManager;
import com.codetru.keywords.WebUI;
import com.codetru.project.cica.CommonPageCICA;


public class Step_7PageHIPAA extends CommonPageCICA{



	private By nextStepHIPAA	=	By.xpath("//h3[.='HIPAA Privacy Authorization']/parent::div/following-sibling::ion-row/ion-col[@size='24' and @size-md='6']/ion-button");	
	private By ownerSign_Error = By.xpath("//h3[.='Authorization/Consent']/following-sibling::ion-row/ion-col[1]");
	private By ownerSignature = By.xpath("//h3[.='Authorization/Consent']/following-sibling::ion-row/ion-col/div/ion-button");
	private By consentSection = By.xpath("//h3[.='Authorization/Consent']");
	private By signature_pad1 = By.xpath("(//canvas[@class='signature-pad-canvas hidden-xs-down'])[1]");
	private By Padding_Right1 = By.xpath("(//ion-col[@style='padding-right: 20px;']/ion-button)[1]");
	private By processing_Popup = By.xpath("//h2[contains(text(), 'Please stay on this page as we process this request.')]");
	private By HIPAA_Authentication_Error = By.xpath("//div[contains(text(),'Please ensure the following steps are completed before the HIPAA authentication can be performed.')]");
	private By HIPAA_Popup_OK_Button = By.xpath("//span[text()='OK']/parent::button");
	private By TableOfContents = By.xpath("//h3[.='HIPAA Privacy Authorization']/parent::div/following-sibling::ion-row/ion-col[@size='24' and @size-md='18']/ion-button[.='Table of Contents']");
	
	private By step_1 = By.xpath("//span[.='Step 1: Product Information']");
	private By calculate = By.xpath("(//div/ion-row/ion-col/ion-button[starts-with(@class, md)])[2]");
	private By impNotice_Popup = By.xpath("//ion-backdrop/following-sibling::div/div/following-sibling::div/button");
	private By step_1_NextB = By.xpath("//p[.='Is Automatic Premium Loan Desired?']/parent::div/parent::ion-col/parent::ion-row/following::ion-row/ion-col[@size='24' and @size-md='6']/ion-button");
	private By step_2_NextB = By.xpath("//h3[.='Contact Information']/parent::div/following-sibling::ion-row/ion-col[@size='24' and @size-md='6']/ion-button");
	private By step_3_NextB = By.xpath("//h3[.='Policy Owner Information']/parent::div/following-sibling::ion-row/ion-col[@size='24' and @size-md='6']/ion-button");
	private By step_3_OwnerSSN = By.xpath("//ion-input[@formcontrolname='OwnerSSN']/input");
	private By step_4_NextB = By.xpath("//h3[.='Beneficiary Information']/parent::div/following-sibling::ion-row/ion-col[@size='24' and @size-md='6']/ion-button");
	private By AddBenificiary = By.xpath("//ion-button[normalize-space()='Add Beneficiary']");
	private By step_5_NextB = By.xpath("//h3[.='Existing Insurance']/parent::div/following-sibling::ion-row/ion-col[@size='24' and @size-md='6']/ion-button");
	private By InsurerName = By.xpath("//ion-input[@formcontrolname='PriorCovCompanyName1']/input");
	private By step_6_NextB = By.xpath("//h3[text()='Health Questions ']/following::ion-row/ion-col[@size='24' and @size-md='6']/ion-button");
	

	public void HIPAA_Voice_Authorization() throws Exception {
		
		String Mandatory_Err = "Please enter a value.";
		String HIPAA_Authentication_Err_Msg = "Please ensure the following steps are completed before the HIPAA authentication can be performed.";

		WebUI.sleep(1);
		WebUI.moveToElement(nextStepHIPAA);
		WebUI.sleep(0.5);
		WebUI.clickElementWithJs(nextStepHIPAA);
		WebUI.sleep(0.5);
		WebUI.scrollToElementAtTop(consentSection);
		WebUI.sleep(0.5);
		WebUI.verifyContains(getTextElement(ownerSign_Error), Mandatory_Err);
		
		WebUI.sleep(1);
		WebUI.clickElement(ownerSignature);
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
		
		
		WebUI.scrollToElementAtBottom(nextStepHIPAA);
		WebUI.moveToElement(nextStepHIPAA);
		WebUI.sleep(2);
		WebUI.clickElementWithJs(nextStepHIPAA);
		WebUI.sleep(1);
		
		try {
			WebUI.verifyElementVisible(HIPAA_Authentication_Error);
			WebUI.verifyContains(getTextElement(HIPAA_Authentication_Error), HIPAA_Authentication_Err_Msg);
			WebUI.sleep(0.5);
			
			WebUI.clickElement(HIPAA_Popup_OK_Button);
			WebUI.sleep(0.5);
			
			WebUI.scrollToElementAtBottom(TableOfContents);
			WebUI.sleep(0.2);
			WebUI.moveToElement(TableOfContents);
			WebUI.clickElement(TableOfContents);
		
			WebUI.clickElementWithJs(step_1);
    		WebUI.sleep(1);
    		try {
				DriverManager.getDriver().findElement(impNotice_Popup).isDisplayed();
				WebUI.sleep(0.5);
				WebUI.clickElement(impNotice_Popup);
				WebUI.sleep(0.5);
	    		WebUI.scrollToElementAtBottom(calculate);
	    		WebUI.clickElement(calculate);
	    		WebUI.sleep(0.2);
    		}catch(Exception exe)
    		{
    			System.out.println("Move to Step-1 page failed. "+exe.getMessage());
    		}
    		WebUI.scrollToElementAtBottom(step_1_NextB);
    		WebUI.moveToElement(step_1_NextB);
    		WebUI.clickElement(step_1_NextB);
    		WebUI.sleep(2.5);
    		
    		WebUI.scrollToElementAtBottom(step_2_NextB);
    		WebUI.sleep(0.5);
    		WebUI.moveToElement(step_2_NextB);
    		WebUI.clickElement(step_2_NextB);
    		WebUI.sleep(3);
    		
    		WebUI.scrollToElementAtTop(step_3_OwnerSSN);
    		WebUI.sleep(0.5);
    		WebUI.scrollToElementAtBottom(step_3_NextB);
    		WebUI.sleep(0.5);
    		WebUI.moveToElement(step_3_NextB);
    		WebUI.clickElement(step_3_NextB);
    		WebUI.sleep(2.5);
    		
    		WebUI.scrollToElementAtTop(AddBenificiary);
    		WebUI.sleep(0.5);
    		WebUI.scrollToElementAtBottom(step_4_NextB);
    		WebUI.sleep(0.5);
    		WebUI.moveToElement(step_4_NextB);
    		WebUI.clickElement(step_4_NextB);
    		WebUI.sleep(2.5);
    		
    		WebUI.scrollToElementAtTop(InsurerName);
    		WebUI.sleep(0.5);
    		WebUI.scrollToElementAtBottom(step_5_NextB);
    		WebUI.sleep(0.5);
    		WebUI.moveToElement(step_5_NextB);
    		WebUI.clickElement(step_5_NextB);
    		WebUI.sleep(2.5);
    		
    		WebUI.scrollToElementAtBottom(step_6_NextB);
    		WebUI.sleep(0.2);
    		WebUI.moveToElement(step_6_NextB);
    		WebUI.clickElement(step_6_NextB);
    		WebUI.sleep(2.5);
    		
    		WebUI.scrollToElementAtBottom(nextStepHIPAA);
    		WebUI.sleep(0.2);
    		WebUI.moveToElement(nextStepHIPAA);
    		WebUI.clickElement(nextStepHIPAA);
    		WebUI.sleep(2.5);
			
		}
		catch(Exception ex)
		{
			System.out.println("HIPAA Authentication Failed. "+ex.getMessage());
		}
		
		
		try {
			while(DriverManager.getDriver().findElement(processing_Popup).isDisplayed())
			{
				continue;
			}
			
		} catch(Exception exe)
		{
			System.out.println("");
		}
		
		WebUI.waitForPageLoaded();
		WebUI.sleep(2);
		
	}


}

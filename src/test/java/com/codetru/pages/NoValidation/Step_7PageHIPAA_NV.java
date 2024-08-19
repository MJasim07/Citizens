package com.codetru.pages.NoValidation;

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


public class Step_7PageHIPAA_NV extends CommonPageCICA{



	private By nextStepHIPAA = By.xpath("//h3[.='HIPAA Privacy Authorization']/parent::div/following-sibling::ion-row/ion-col[@size='24' and @size-md='6']/ion-button");	
	private By ownerSign_Error = By.xpath("//h3[.='Authorization/Consent']/following-sibling::ion-row/ion-col[1]");
	private By ownerSignature = By.xpath("//h3[.='Authorization/Consent']/following-sibling::ion-row/ion-col/div/ion-button");
	private By consentSection = By.xpath("//h3[.='Authorization/Consent']");
	private By signature_pad1 = By.xpath("(//canvas[@class='signature-pad-canvas hidden-xs-down'])[1]");
	private By Padding_Right1 = By.xpath("(//ion-col[@style='padding-right: 20px;']/ion-button)[1]");
	private By processing_Popup = By.xpath("//h2[contains(text(), 'Please stay on this page as we process this request.')]");

	public void HIPAA_Voice_Authorization() throws Exception {
		
		String Mandatory_Err = "Please enter a value.";

//		WebUI.sleep(1);
//		WebUI.moveToElement(nextStepHIPAA);
//		WebUI.sleep(0.5);
//		WebUI.clickElementWithJs(nextStepHIPAA);
//		WebUI.sleep(0.5);
//		WebUI.scrollToElementAtTop(consentSection);
//		WebUI.sleep(0.5);
//		WebUI.verifyContains(getTextElement(ownerSign_Error), Mandatory_Err);
		
		WebUI.waitForPageLoaded();
		WebUI.sleep(1);
		WebUI.clickElementWithJs(ownerSignature);
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
		WebUI.sleep(1);
		
		
		WebUI.scrollToElementAtBottom(nextStepHIPAA);
		WebUI.sleep(1);
		WebUI.moveToElement(nextStepHIPAA);
		WebUI.clickElement(nextStepHIPAA);
		
		try {
			while(DriverManager.getDriver().findElement(processing_Popup).isDisplayed())
			{
				continue;
			}
			
		} catch(Exception ex)
		{
			System.out.println("");
		}

		
		WebUI.waitForPageLoaded();
		WebUI.sleep(1);
	}


}

package com.codetru.pages.NoValidation;

import static com.codetru.keywords.WebUI.getAttributeElement;
import static com.codetru.keywords.WebUI.getTextElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.codetru.driver.DriverManager;
import com.codetru.helpers.PropertiesHelpers;
import com.codetru.keywords.WebUI;
import com.codetru.project.cica.CommonPageCICA;

public class Step_3Page_NV extends CommonPageCICA {
	
	private By noRadioBtn = By.xpath("//ion-item/ion-label[.='No']/following-sibling::ion-radio[@value='false']");
	private By NextStep3 = By.xpath("//h3[.='Policy Owner Information']/parent::div/following-sibling::ion-row/ion-col[@size='24' and @size-md='6']/ion-button");
	private By step3_Yes = By.xpath("//h3[.='Policy Owner Information']/parent::div/descendant::ion-radio-group/ion-row/ion-col//ion-label[.='Yes']/following-sibling::ion-radio");
	private By step3_No = By.xpath("//h3[.='Policy Owner Information']/parent::div/descendant::ion-radio-group/ion-row/ion-col//ion-label[.='No']/following-sibling::ion-radio");
	private By Error_ProposedOWner_Message = By.xpath("//form[@class='ng-untouched ng-pristine ng-invalid']//div[@class='block-info-app']");
	private By BenificiaryFirstname = By.xpath("//ion-input[@formcontrolname='BeneficiaryFirstName']/input");
	private By policyPayor_Yes = By.xpath("//h3[.='Policy Payor Information']/parent::div/descendant::ion-label[.='Yes']/following-sibling::ion-radio");
//	private By policyPayor_No = By.xpath("//h3[.='Policy Payor Information']/parent::div/descendant::ion-label[.='No']/following-sibling::ion-radio");
	
	private By step_1 = By.xpath("//span[.='Step 1: Product Information']");
	private By calculate = By.xpath("(//div/ion-row/ion-col/ion-button[starts-with(@class, md)])[2]");
	private By step_1_NextB = By.xpath("//p[.='Is Automatic Premium Loan Desired?']/parent::div/parent::ion-col/parent::ion-row/following::ion-row/ion-col[@size='24' and @size-md='6']/ion-button");
	private By step_2_NextB = By.xpath("//h3[.='Contact Information']/parent::div/following-sibling::ion-row/ion-col[@size='24' and @size-md='6']/ion-button");
	private By TableOfContent = By.xpath("//h3[.='Policy Owner Information']/parent::div/following-sibling::ion-row[@style='padding-left: 50px;']/ion-col[@size-md='18']/ion-button[.='Table of Contents']");
	private By impNotice_Popup = By.xpath("//ion-backdrop/following-sibling::div/div/following-sibling::div/button");

	
	public void Policy_Owner_Information() throws Exception {
		
		String Mandatory_Error = "Please enter a value.";
		
		WebUI.sleep(1);
		WebUI.moveToElement(TableOfContent);
		WebUI.clickElement(TableOfContent);
		WebUI.sleep(1);
		WebUI.clickElementWithJs(step_1);
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

		WebUI.scrollToElementAtBottom(calculate);
		WebUI.clickElement(calculate);
		WebUI.sleep(0.2);

		WebUI.scrollToElementAtBottom(step_1_NextB);
		WebUI.moveToElement(step_1_NextB);
		WebUI.clickElement(step_1_NextB);
		WebUI.sleep(2.5);
		
		WebUI.scrollToElementAtBottom(step_2_NextB);
		WebUI.sleep(0.5);
		WebUI.moveToElement(step_2_NextB);
		WebUI.clickElement(step_2_NextB);
		WebUI.sleep(3);
		
		//Step-3 starts
		WebUI.clickElement(step3_No);
		WebUI.sleep(0.5);

		try {

//			WebElement policyPayor_Yes = DriverManager.getDriver().findElement(By.xpath("//h3[.='Policy Payor Information']/parent::div/descendant::ion-label[.='Yes']/following-sibling::ion-radio"));
			WebElement policyPayor_No = DriverManager.getDriver().findElement(By.xpath("//h3[.='Policy Payor Information']/parent::div/descendant::ion-label[.='No']/following-sibling::ion-radio"));
			policyPayor_No.click();
			WebUI.sleep(0.5);

		} catch (Exception ex) {
			
			System.out.println("Policy Payor Information Not Available. " + ex.getMessage());
		}
		
		WebUI.scrollToElementAtBottom(NextStep3);
		WebUI.sleep(0.5);
		WebUI.moveToElement(NextStep3);
		WebUI.clickElement(NextStep3);
		WebUI.sleep(2);
		
	
	}

}

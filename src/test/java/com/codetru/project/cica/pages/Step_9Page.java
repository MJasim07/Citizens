package com.codetru.project.cica.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.codetru.keywords.WebUI;
import com.codetru.listeners.TestListener;
import com.codetru.project.cica.CommonPageCICA;

import net.bytebuddy.description.ModifierReviewable.OfAbstraction;


public class Step_9Page extends CommonPageCICA {
	
//	public 	WebDriver driver;
	
	
	
	private By ApplicationModule1 = By.id("applicationButton");	
//	private By Upload_Application = By.xpath("//span[.='Step 9: Upload Application ']");
	private By Upload_Application = By.xpath("//span[.='Step 10: Upload Application ']");
	private By List_application1 = By.xpath("//div[@class='applicationDropdown']/div[1]");
	private By Table_Of_Content = By.xpath("(//ion-col[@size='24' and@size-md='18' ]/ion-button[@class = 'md button button-solid ion-activatable ion-focusable hydrated'])[13]");
	private By ListEdit_application1 = By.xpath("(//td/ion-button[@title='Edit Application'])[last()]");
	
	private By ListEditButton_application1 = By.xpath("//tbody/tr/td[10]/ion-button[1]");
	private By hiddenCells = By.xpath("//tbody/tr/td[1]");
	
	private By step_1 = By.xpath("//span[.='Step 1: Product Information']");
	private By calculate = By.xpath("(//div/ion-row/ion-col/ion-button[starts-with(@class, md)])[2]");
	private By step_1_NextB = By.xpath("//p[.='Is Automatic Premium Loan Desired?']/parent::div/parent::ion-col/parent::ion-row/following::ion-row/ion-col[@size='24' and @size-md='6']/ion-button");
	private By step_2_NextB = By.xpath("//h3[.='Contact Information']/parent::div/following-sibling::ion-row/ion-col[@size='24' and @size-md='6']/ion-button");
	private By step_3_NextB = By.xpath("//h3[.='Policy Owner Information']/parent::div/following-sibling::ion-row/ion-col[@size='24' and @size-md='6']/ion-button");
	private By step_3_OwnerSSN = By.xpath("//ion-input[@formcontrolname='OwnerSSN']/input");
	private By step_4_NextB = By.xpath("//h3[.='Beneficiary Information']/parent::div/following-sibling::ion-row/ion-col[@size='24' and @size-md='6']/ion-button");
	private By step_5_NextB = By.xpath("//h3[.='Existing Insurance']/parent::div/following-sibling::ion-row/ion-col[@size='24' and @size-md='6']/ion-button");
	private By step_6_NextB = By.xpath("//h3[text()='Health Questions ']/following::ion-row/ion-col[@size='24' and @size-md='6']/ion-button");
	private By nextStepHIPAA	=	By.xpath("//h3[.='Authorization/Consent']/parent::div/following-sibling::ion-row/ion-col[@size='24' and @size-md='6']/ion-button");
	private By step_7_NextB	= By.xpath("//h3[.='Provide Any Additional Information']/parent::div/following-sibling::ion-row/ion-col[@size='24' and @size-md='6']/ion-button");	
	private By step_8_NextB = By.xpath("//h3[text()='Agent']/ancestor::ion-grid/ion-row[2]/ion-col/ion-button[text()='Next Step']");
	
	private By step3_OwnerSSN = By.xpath("//ion-input[@formcontrolname='OwnerSSN']/input");
 
    public void Edit_Submit() throws Exception
    {
    	
    	try {
    	WebUI.waitForPageLoaded(2);
    	WebUI.clickElement(ApplicationModule1);
		WebUI.sleep(2);
		WebUI.clickElement(List_application1);
		WebUI.sleep(2.5);
    	System.out.println("From Step_9Page==================================: "+Step_1Page.Randomfirstname);	
    	WebUI.clickCorrespondingElement(Step_1Page.Randomfirstname, hiddenCells, ListEditButton_application1);
    	WebUI.sleep(2);
		WebUI.clickElement(Upload_Application);
		WebUI.sleep(4);
		
    	} catch(Exception ex)
    	{
    		WebUI.clickElementWithJs(step_1);
    		WebUI.sleep(1);
    		try {
    		WebUI.scrollToElementAtBottom(calculate);
    		WebUI.clickElement(calculate);
    		WebUI.sleep(0.2);
    		}catch(Exception exe)
    		{
    			System.out.println("Calculate button is not present to recalculate. "+exe.getMessage());
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
    		
    		WebUI.scrollToElementAtBottom(step_4_NextB);
    		WebUI.sleep(0.5);
    		WebUI.moveToElement(step_4_NextB);
    		WebUI.clickElement(step_4_NextB);
    		WebUI.sleep(2.5);
    		
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
    		
    		WebUI.scrollToElementAtBottom(step_7_NextB);
    		WebUI.sleep(0.2);
    		WebUI.moveToElement(step_7_NextB);
    		WebUI.clickElement(step_7_NextB);
    		WebUI.sleep(2.5);
    		
    		WebUI.scrollToElementAtBottom(step_8_NextB);
    		WebUI.sleep(0.5);
    		WebUI.moveToElement(step_8_NextB);
    		WebUI.clickElement(step_8_NextB);
    		WebUI.sleep(2.5);
    		
    		WebUI.sleep(1);
    		WebUI.clickElement(Upload_Application);
    		WebUI.sleep(4);

    		
    	}
		
    }
    
}

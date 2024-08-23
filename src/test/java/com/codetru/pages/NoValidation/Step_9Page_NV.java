package com.codetru.pages.NoValidation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.codetru.keywords.WebUI;
import com.codetru.project.cica.CommonPageCICA;

import net.bytebuddy.description.ModifierReviewable.OfAbstraction;


public class Step_9Page_NV extends CommonPageCICA {
	
	
	private By ApplicationModule1 = By.id("applicationButton");	
	
//	private By Upload_Application = By.xpath("//span[.='Step 8: Upload Application ']");
	private By Upload_Application = By.xpath("//span[.='Step 10: Upload Application ']");
	
	private By List_application1 = By.xpath("//div[@class='applicationDropdown']/div[1]");
	private By Table_Of_Content = By.xpath("(//ion-col[@size='24' and@size-md='18' ]/ion-button[@class = 'md button button-solid ion-activatable ion-focusable hydrated'])[13]");
	private By ListEdit_application1 = By.xpath("(//td/ion-button[@title='Edit Application'])[last()]");
	

	private By ListEditButton_application1 = By.xpath("//tbody/tr/td[10]/ion-button[1]");
	private By hiddenCells = By.xpath("//tbody/tr/td[1]");
 
    public void Edit_Submit() throws Exception
    {
    	
 
    	WebUI.waitForPageLoaded();
//    	WebUI.clickElement(ApplicationModule1);
//		WebUI.sleep(2);
//		WebUI.clickElement(List_application1);
//		WebUI.sleep(2);
//    	System.out.println("From Step_9Page==================================: "+Step_1Page_NV.Randomfirstname);	
//    	WebUI.clickCorrespondingElement(Step_1Page_NV.Randomfirstname, hiddenCells, ListEditButton_application1);
    	
    	WebUI.sleep(2);
		WebUI.clickElement(Upload_Application);
		WebUI.sleep(2);
		
    }
    
}

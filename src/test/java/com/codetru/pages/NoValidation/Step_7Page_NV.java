package com.codetru.pages.NoValidation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.codetru.keywords.WebUI;
import com.codetru.project.cica.CommonPageCICA;


public class Step_7Page_NV extends CommonPageCICA{



	private By nextstep7 = By.xpath("//h3[.='Provide Any Additional Information']/parent::div/following-sibling::ion-row/ion-col[@size='24' and @size-md='6']/ion-button");	

	private By Disclosure = By.xpath("//h3[.='HIPAA Privacy Authorization']");

	public void Remarks() throws Exception {

		WebUI.waitForPageLoaded();
		WebUI.sleep(2);
		WebUI.waitForElementVisible(nextstep7);
		WebUI.moveToElement(nextstep7);
		WebUI.sleep(0.5);
		WebUI.clickElementWithJs(nextstep7);
		WebUI.sleep(0.5);
		WebUI.waitForPageLoaded();
//		WebUI.verifyElementVisible(Disclosure);
		WebUI.waitForPageLoaded(2);
				
	}


}

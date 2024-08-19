package com.codetru.pages.NoValidation;

import org.openqa.selenium.By;

import com.codetru.keywords.WebUI;
import com.codetru.project.cica.CommonPageCICA;

public class PaymentValidationPage extends CommonPageCICA {
	
	private By application_btn = By.id("applicationButton");
	private By list_application1 = By.xpath("//div[@class='applicationDropdown']/div[1]");
	private By new_application1 = By.xpath("//div[@class='applicationDropdown']/div[2]");
	private By search_box = By.xpath("(//input[@type='search'])[1]");
	private By proposed_Name = By.xpath("//tbody/tr/td[1]");
	private By ListEditButton_application1 = By.xpath("//tbody/tr/td[10]/ion-button[1]");
	
	
	
	public void Verify_Payment() throws Exception
	{
		WebUI.switchToMainWindow();
		WebUI.sleep(1);
		
		WebUI.clickElement(application_btn);
		WebUI.sleep(0.5);
		WebUI.clickElement(list_application1);
		WebUI.sleep(1.5);
		WebUI.clickElement(search_box);
		WebUI.setText(search_box, Step_10Page_NV.PolicyNumber);
		WebUI.sleep(0.5);
		
		WebUI.verifyContains(WebUI.getTextElement(proposed_Name), Step_1Page_NV.Randomfirstname);
		WebUI.clickElement(ListEditButton_application1);
		WebUI.sleep(2);
		
	}

}

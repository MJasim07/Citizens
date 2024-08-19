package com.codetru.project.cica.pages;

import static com.codetru.keywords.WebUI.getTextElement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.codetru.driver.DriverManager;
import com.codetru.keywords.WebUI;
import com.codetru.utils.DataGenerateUtils;

public class Step_6Page {

	private By NextStep6 = By.xpath("//h3[text()='Health Questions ']/following::ion-row/ion-col[@size='24' and @size-md='6']/ion-button");
	private By Error_HealthQuestions_1 = By.xpath("//div[@class='block-info-app' and @style='margin-top: 20px; margin-bottom: 20px;' ]/div[1]/ion-row/ion-col[@class='md hydrated']");
	private By Error_HealthQuestions_2 = By.xpath("//div[@class='block-info-app' and @style='margin-top: 20px; margin-bottom: 20px;' ]/div[2]/ion-row/ion-col[@class='md hydrated']");
	private By Error_HealthQuestions_3 = By.xpath("//div[@class='block-info-app' and @style='margin-top: 20px; margin-bottom: 20px;' ]/div[3]/ion-row/ion-col[@class='md hydrated']");
	private By Error_HealthQuestions_4 = By.xpath("//div[@class='block-info-app' and @style='margin-top: 20px; margin-bottom: 20px;' ]/div[4]/ion-row/ion-col[@class='md hydrated']");
	private By Error_HealthQuestions_5 = By.xpath("//div[@class='block-info-app' and @style='margin-top: 20px; margin-bottom: 20px;' ]/div[5]/ion-row/ion-col[@class='md hydrated']");
	private By Error_HealthQuestions_6 = By.xpath("//div[@class='block-info-app' and @style='margin-top: 20px; margin-bottom: 20px;' ]/div[6]/ion-row/ion-col[@class='md hydrated']");
	private By Error_HealthQuestions_7 = By.xpath("//div[@class='block-info-app' and @style='margin-top: 20px; margin-bottom: 20px;' ]/div[7]/ion-row/ion-col[@class='md hydrated']");
	private By Error_HealthQuestions_8 = By.xpath("//div[@class='block-info-app' and @style='margin-top: 20px; margin-bottom: 20px;' ]/div[8]/ion-row/ion-col[@class='md hydrated']");
	
	private By HealthQuestions1 = By.xpath("(//ion-item/ion-label[.='No']/following-sibling::ion-radio)[8]");
	private By HealthQuestions2 = By.xpath("(//ion-item/ion-label[.='No']/following-sibling::ion-radio)[9]");
	private By HealthQuestions3 = By.xpath("(//ion-item/ion-label[.='No']/following-sibling::ion-radio)[10]");
	private By HealthQuestions4 = By.xpath("(//ion-item/ion-label[.='No']/following-sibling::ion-radio)[11]");
	private By HealthQuestions5 = By.xpath("(//ion-item/ion-label[.='No']/following-sibling::ion-radio)[12]");
	private By HealthQuestions6 = By.xpath("(//ion-item/ion-label[.='No']/following-sibling::ion-radio)[13]");
	private By HealthQuestions7 = By.xpath("(//ion-item/ion-label[.='No']/following-sibling::ion-radio)[14]");
	private By HealthQuestions8 = By.xpath("(//ion-item/ion-label[.='No']/following-sibling::ion-radio)[15]");
	
	private By no_physician = By.xpath("//ion-checkbox[@formcontrolname='PhysicianNameCheckbox']");
	private By Error_NoPhysicanCheckBox = By.xpath("//ion-input[@formcontrolname='PhysicianName']/parent::ion-item/parent::ion-col");
	private By NextStep7 = By.xpath("(//ion-row[@style='padding-left: 50px;']/ion-col[@class='md hydrated']/ion-button)[6]");
	private By Physician_textbox = By.xpath("//ion-input[@formcontrolname='PhysicianName']/input");
	private By Popup_Ok_Button = By.xpath("//span[text()='Ok']/parent::button");
	
	//In Case of Extra Health Question Radio Button
	private By Additional_HQ_List = By.xpath("//h3[text()='Health Questions ']/following::div[@class='block-info-app']/div/ion-row/ion-col//ion-col/ion-item/ion-label[text()='No']/following-sibling::ion-radio");

	
	//Step-1 Locators
	private By step_1_Page = By.xpath("//h3[contains(text(),'Step 1')]");
	private By plan = By.xpath("//select[@formcontrolname='Plan']");
	private By calculate = By.xpath("(//div/ion-row/ion-col/ion-button[starts-with(@class, md)])[last()]");
	private By Nextstep_1 = By.xpath("(//ion-col/ion-button[starts-with(@class, 'md button')])[50]");

	public void Predetermination_Questions() throws Exception {

		String Mandatory_Err = "Please enter a value.";
		String Physician_MaxChar = "qwertyuiop asdfghjkl zxcvbnm poiuytrewq lkjhgfdsa mnbvcxz zxcvbnm lkjhgfdsa qwertyuiop poiuytrewq asdfghjkl";
		String Physician_MaxChar_Error = "The maximum number of characters is 90.";

//		C.Mandate_Click1(driver, act, NextStep6, e, Test.Case6(27), Test.Exp6(27));
		WebUI.moveToElement(NextStep6);
		WebUI.sleep(0.2);
		WebUI.clickElement(NextStep6);

//		C.Health_Question_M(driver, act, Error_HealthQuestions_1, Mandatory_Err, e, Test.Case6(3), Test.Exp6(3));
		WebUI.scrollToElementAtTop(Error_HealthQuestions_1);
		WebUI.sleep(0.2);
		WebUI.verifyElementVisible(Error_HealthQuestions_1);
		WebUI.verifyContains(WebUI.getTextElement(Error_HealthQuestions_1), Mandatory_Err);

//		C.Health_Question_M(driver, act, Error_HealthQuestions_2, Mandatory_Err, e, Test.Case6(6), Test.Exp6(6));
		WebUI.scrollToElementAtBottom(Error_HealthQuestions_2);
		WebUI.sleep(0.2);
		WebUI.verifyElementVisible(Error_HealthQuestions_2);
		WebUI.verifyContains(WebUI.getTextElement(Error_HealthQuestions_2), Mandatory_Err);

//		C.Health_Question_M(driver, act, Error_HealthQuestions_4, Mandatory_Err, e, Test.Case6(9), Test.Exp6(9));
		WebUI.scrollToElementAtBottom(Error_HealthQuestions_4);
		WebUI.sleep(0.2);
		WebUI.verifyElementVisible(Error_HealthQuestions_4);
		WebUI.verifyContains(WebUI.getTextElement(Error_HealthQuestions_4), Mandatory_Err);

//		C.Health_Question_M(driver, act, Error_HealthQuestions_4, Mandatory_Err, e, Test.Case6(12), Test.Exp6(12));
		WebUI.scrollToElementAtBottom(Error_HealthQuestions_4);
		WebUI.sleep(0.2);
		WebUI.verifyElementVisible(Error_HealthQuestions_4);
		WebUI.verifyContains(WebUI.getTextElement(Error_HealthQuestions_4), Mandatory_Err);

//		C.act_scroll1(driver, act, Error_HealthQuestions_7, e, Mandatory_Err, Mandatory_Err);
		WebUI.scrollToElementAtBottom(Error_HealthQuestions_7);
		WebUI.sleep(0.2);
		WebUI.verifyElementVisible(Error_HealthQuestions_7);

//		C.Health_Question_M(driver, act, Error_HealthQuestions_5, Mandatory_Err, e, Test.Case6(15), Test.Exp6(15));
		WebUI.scrollToElementAtBottom(Error_HealthQuestions_5);
		WebUI.sleep(0.2);
		WebUI.verifyElementVisible(Error_HealthQuestions_5);
		WebUI.verifyContains(WebUI.getTextElement(Error_HealthQuestions_5), Mandatory_Err);
		
		WebUI.sleep(0.4);

//		C.Health_Question_M(driver, act, Error_HealthQuestions_6, Mandatory_Err, e, Test.Case6(18), Test.Exp6(18));
		WebUI.scrollToElementAtBottom(Error_HealthQuestions_6);
		WebUI.sleep(0.2);
		WebUI.verifyElementVisible(Error_HealthQuestions_6);
		WebUI.verifyContains(WebUI.getTextElement(Error_HealthQuestions_6), Mandatory_Err);

//		C.Health_Question_M(driver, act, Error_HealthQuestions_7, Mandatory_Err, e, Test.Case6(21), Test.Exp6(21));
		WebUI.scrollToElementAtBottom(Error_HealthQuestions_7);
		WebUI.sleep(0.2);
		WebUI.verifyElementVisible(Error_HealthQuestions_7);
		WebUI.verifyContains(WebUI.getTextElement(Error_HealthQuestions_7), Mandatory_Err);
		
//		C.act_scroll1(driver, act, no_physician, e, Mandatory_Err, Mandatory_Err);
		WebUI.scrollToElementAtBottom(no_physician);
		WebUI.sleep(0.2);
		WebUI.verifyElementVisible(no_physician);
		
//		C.Health_Question_M(driver, act, Error_HealthQuestions_8, Mandatory_Err, e, Test.Case6(24), Test.Exp6(24));
		WebUI.scrollToElementAtBottom(Error_HealthQuestions_8);
		WebUI.sleep(0.2);
		WebUI.verifyElementVisible(Error_HealthQuestions_8);
		WebUI.verifyContains(WebUI.getTextElement(Error_HealthQuestions_8), Mandatory_Err);

		WebUI.sleep(1);

		
		try {
//			DriverManager.getDriver().findElement(HealthQuestions1).isDisplayed();
//			WebUI.scrollToElementAtBottom(HealthQuestions1);
//			WebUI.sleep(0.2);
//			WebUI.clickElement(HealthQuestions1);
			
			WebElement HealthQuestions1 = DriverManager.getDriver().findElement(By.xpath("(//ion-item/ion-label[.='No']/following-sibling::ion-radio)[8]"));
			WebUI.scrollToElementAtBottom(HealthQuestions1);
			WebUI.sleep(0.2);
			HealthQuestions1.click();
			
//			C.Health_Question_C(driver, act, HealthQuestions2, "2", e, Test.Case6(5), Test.Exp6(5));
			WebUI.scrollToElementAtBottom(HealthQuestions2);
			WebUI.sleep(0.2);
			WebUI.clickElement(HealthQuestions2);

//			C.Health_Question_C(driver, act, HealthQuestions3, "3", e, Test.Case6(8), Test.Exp6(8));
			WebUI.scrollToElementAtBottom(HealthQuestions3);
			WebUI.sleep(0.2);
			WebUI.clickElement(HealthQuestions3);

//			C.Health_Question_C(driver, act, HealthQuestions4, "4", e, Test.Case6(11), Test.Exp6(11));
			WebUI.scrollToElementAtBottom(HealthQuestions4);
			WebUI.sleep(0.2);
			WebUI.clickElement(HealthQuestions4);

//			C.Health_Question_C(driver, act, HealthQuestions5, "5", e, Test.Case6(14), Test.Exp6(14));
			WebUI.scrollToElementAtBottom(HealthQuestions5);
			WebUI.sleep(0.2);
			WebUI.clickElement(HealthQuestions5);

//			C.Health_Question_C(driver, act, HealthQuestions6, "6", e, Test.Case6(17), Test.Exp6(17));
			WebUI.scrollToElementAtBottom(HealthQuestions6);
			WebUI.sleep(0.2);
			WebUI.clickElement(HealthQuestions6);

//			C.Health_Question_C(driver, act, HealthQuestions7, "7", e, Test.Case6(20), Test.Exp6(20));
			WebUI.scrollToElementAtBottom(HealthQuestions7);
			WebUI.sleep(0.2);
			WebUI.clickElement(HealthQuestions7);

//			C.Health_Question_C(driver, act, HealthQuestions8, "8", e, Test.Case6(23), Test.Exp6(23));
			WebUI.scrollToElementAtBottom(HealthQuestions8);
			WebUI.sleep(0.2);
//			WebUI.clickElement(HealthQuestions8_Yes);
			WebUI.clickElement(HealthQuestions8);
			
		} catch (Exception ex) {
			
			System.out.println("Additional health question has mentioned.");
			
			List<WebElement> HQ_No_Buttons = WebUI.getWebElements(Additional_HQ_List);
			for(WebElement HQ_No_Button : HQ_No_Buttons)
			{
				WebUI.scrollToElementAtBottom(HQ_No_Button);
				WebUI.sleep(0.2);
				HQ_No_Button.click();
			}
		}
		

//		C.act_scroll1(driver, act, NextStep6, e, Test.Case6(29), Test.Exp6(29));
		WebUI.scrollToElementAtBottom(NextStep6);
		WebUI.sleep(0.2);
		WebUI.verifyElementVisible(NextStep6);

//		C.Empty_Input(driver, Error_NoPhysicanCheckBox, Mandatory_Err, e, Test.Case6(25), Test.Exp6(25));
		WebUI.verifyContains(getTextElement(Error_NoPhysicanCheckBox).trim(), Mandatory_Err);

		WebUI.setText(Physician_textbox, Physician_MaxChar);
		WebUI.verifyElementVisible(Error_NoPhysicanCheckBox);
		WebUI.verifyContains(getTextElement(Error_NoPhysicanCheckBox), Physician_MaxChar_Error);
		
		WebUI.clearAndFillText(Physician_textbox, DataGenerateUtils.randomFirstName()+" "+DataGenerateUtils.randomLastName()+" "+DataGenerateUtils.randomShortAddress());
		WebUI.sleep(0.5);
		WebUI.clickElement(no_physician);

		WebUI.scrollToElementAtBottom(NextStep6);
		WebUI.sleep(0.2);
		WebUI.moveToElement(NextStep6);
		WebUI.clickElement(NextStep6);
		WebUI.sleep(1);
		
/*		//Select 'Yes' in any of the HealthQuestions flow
		WebUI.sleep(1);
		WebUI.verifyElementVisible(Popup_Ok_Button);
		WebUI.clickElement(Popup_Ok_Button);
		WebUI.sleep(1);
		
		//Move to Step-1, select the plan, click on Calculate and click Next
		WebUI.verifyElementVisible(step_1_Page);
		WebUI.scrollToElementAtTop(plan);
		WebUI.selectOptionByIndex(plan, 1);
		WebUI.scrollToElementAtBottom(calculate);
		WebUI.sleep(0.2);
		WebUI.clickElement(calculate);
		WebUI.sleep(0.5);
		WebUI.scrollToElementAtBottom(Nextstep_1);
		WebUI.moveToElement(Nextstep_1);
		WebUI.clickElement(Nextstep_1);
//*/	

		
	}
}

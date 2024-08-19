package com.codetru.project.cica.pages;

import static com.codetru.keywords.WebUI.*;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.codetru.driver.DriverManager;
import com.codetru.keywords.WebUI;
import com.codetru.project.cica.CommonPageCICA;



public class HomePage extends CommonPageCICA{


	 
		private By application_btn = By.id("applicationButton");
		private By list_application1 = By.xpath("//div[@class='applicationDropdown']/div[1]");
		private By new_application1 = By.xpath("//div[@class='applicationDropdown']/div[2]");
		private By step1 = By.xpath("//span[.='Step 1: Product Information']");
		private By step1InsuredInfo = By.xpath("//h3[text()='Proposed Insured Info']");
		private By list_ColumnNames = By.xpath("//div[@class='table-responsive hidden-sm-down']//table//thead//tr/th");
		private By newApplication_Button_ListPage = By.xpath("//ion-buttons[@class='buttons-last-slot sc-ion-buttons-md-h sc-ion-buttons-md-s md hydrated']//ion-button[@class='md button button-clear in-toolbar in-toolbar-color ion-activatable ion-focusable hydrated'][normalize-space()='New Application']");
		private By searchBox = By.xpath("(//input[@placeholder='Search' and @type='search'])[1]");
		private By name_List = By.xpath("//tbody/tr/td[1]");
		private By applicationNum_List = By.xpath("//tbody/tr/td[8]");		
		private By noSearchItem_Element = By.xpath("//ion-col[contains(text(),'Welcome to the New Business Application section of')]");
		
		private By proposedNameCol = By.xpath("//th[normalize-space()='Proposed Name']");
		private By planDescriptionCol = By.xpath("//th[normalize-space()='Plan Description']");
		private By amountOfInsuranceCol = By.xpath("//th[normalize-space()='Amount Of Insurance']");
		private By applicationStatusCol = By.xpath("//th[normalize-space()='Application Status']");
		private By expireDateCol = By.xpath("//th[normalize-space()='Expire Date']");
		private By createdDateCol = By.xpath("//th[normalize-space()='Created']");
		private By applicationNumberCol = By.xpath("//th[normalize-space()='Application Number']");
		
		private By actions_EditApplicationButton = By.xpath("//tbody/tr/td[10]/ion-button[1]");
		private By actions_DeleteApplicationButton = By.xpath("//tbody/tr/td[10]/ion-button[2]");
		
		private By applicationNumber = By.xpath("//tbody/tr/td[8]");
		private By middleName = By.xpath("//ion-input[@formcontrolname='ProposedMiddleName']/input");
		private By cannotEditApplication_Element = By.xpath("//h2[normalize-space()='Submitted Applications Cannot Be Edited']");
		private By alert_DeleteApplication_Element = By.xpath("//div[contains(text(),'Are you sure you want to delete this application?')]");
		private By alert_DeleteApplication_Cancel = By.xpath("//span[normalize-space()='Cancel']");
		private By alert_DeleteApplication_Delete = By.xpath("//span[normalize-space()='Delete']");
		
//		----------------------------------------------------------------------------------------------------------
		private By profile_Icon = By.xpath("//ion-col[@class='ion-text-right md hydrated']//ion-button[@class='ion-color ion-color-dark md button button-clear ion-activatable ion-focusable hydrated']");
		private By licenses_Appointments_Tab = By.xpath("//ion-item[normalize-space()='Licenses & Appointments']");
		private By logout_Button = By.xpath("//ion-item[normalize-space()='Logout']");
		private By first_row_first_column = By.xpath("//tbody/tr[1]/td[1]");
//		private By lic_States = By.xpath("//th[normalize-space()='License State']/following::tbody/tr/td[6]");
		private By lic_States = By.xpath("//th[normalize-space()='License State']/following::tbody/tr[not(@style='background-color: red;')]/td[6]");
//		private By appointment_Status = By.xpath("//th[normalize-space()='License State']/following::tbody/tr/td[10]");
		private By appointment_Status = By.xpath("//th[normalize-space()='License State']/following::tbody/tr[not(@style='background-color: red;')]/td[10]");
		private By agentID_Popup_CloseButton = By.xpath("//ion-button[@class='md button button-small button-clear in-toolbar in-toolbar-color ion-activatable ion-focusable hydrated']");
		
		private By impNotice_Popup = By.xpath("//ion-backdrop/following-sibling::div/div/following-sibling::div/button");
		
		private By policypaymentBtn=By.xpath("//ion-button[text()=' Policy Payment ']");
//		----------------------------------------------------------------------------------------------------------
		
		
		public List<String> columnNames_Expected = Arrays.asList(
											"Proposed Name",
											"Plan Description",
											"Amount Of Insurance",
											"Application Status",
											"Hold Until",
											"Expire Date",
											"Created",
											"Application Number",
											"Saved Mode",
											"Actions"			
										);
		
		private String searchedItemNotFound_Message = "Welcome to the New Business Application section of the IC Portal.";
		private String cannotEditApplication_Message = "Submitted Applications Cannot Be Edited";
		private String alert_DeleteApplication_Message = "Are you sure you want to delete this application?";
		
		public static List<String> licenseStateTexts;
		public static List<String> appointmentStatusTexts;
		
		public void Open_Application_Module() throws Exception {
			
			WebUI.waitForPageLoaded();
			sleep(5);
			
//++++++++++++++++++++++++++++++++++Get License State and Appointment Status List from Lic & Apnt Tab++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
///*		
			WebUI.sleep(1);
			WebUI.clickElement(profile_Icon);
			WebUI.sleep(1);
			WebUI.clickElement(licenses_Appointments_Tab);
			WebUI.sleep(3);
			WebUI.waitForElementVisible(first_row_first_column);
			WebUI.clickElement(first_row_first_column);
			WebUI.sleep(2);
			licenseStateTexts = WebUI.getElementTextsInList(lic_States);
//			appointmentStatusTexts = WebUI.getElementTextsInList(appointment_Status);
			appointmentStatusTexts = WebUI.getElementTextsInListAndDeleteCorrespondingFromOtherList(appointment_Status, licenseStateTexts);
			
	        // Print the list size from both columns
	        System.out.println("License State texts count: " + licenseStateTexts.size());
	        System.out.println("Appointment Status texts count: " + appointmentStatusTexts.size());
	        
	        // Remove elements containing a specific String in List1 and the corresponding value from List2
	        WebUI.removeElementsContainingAndCorresponding(licenseStateTexts, "FL", appointmentStatusTexts);
	        
	        // Remove elements containing a specific String in List1 and the corresponding value from List2. -> Removing "Unrequested" from the list
	        WebUI.removeElementsContainingAndCorresponding(appointmentStatusTexts, "Unrequested",licenseStateTexts);
	        
	        // Remove elements containing a specific String in List1 and the corresponding value from List2. -> Removing "Unrequested" from the list
	        WebUI.removeElementsContainingAndCorresponding(appointmentStatusTexts, "Inactive/Cancelled",licenseStateTexts);
	        
	        // Remove elements containing null or "" String in List1 and the corresponding value from List2. -> Removing "" from the list
//	        WebUI.removeElementsContainingAndCorresponding(appointmentStatusTexts, "" ,licenseStateTexts);
	        
	        // Remove duplicate elements from both lists
	        WebUI.removeDuplicatesAndCorresponding(licenseStateTexts, appointmentStatusTexts);
	        
	        // Print the list size from both columns
	        System.out.println("License State texts count: " + licenseStateTexts.size());
	        System.out.println("Appointment Status texts count: " + appointmentStatusTexts.size());
	        // Print the texts from both columns
	        System.out.println("License State texts: " + licenseStateTexts);
	        System.out.println("Appointment Status texts: " + appointmentStatusTexts);
	        
	        WebUI.logInfoMessage("License States: " + licenseStateTexts);
	        WebUI.logInfoMessage("Appointment Status: " + appointmentStatusTexts);
	        
	        WebUI.clickElement(agentID_Popup_CloseButton);
	        
//*/		
			
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//================================= List Page Validation ===========================================================================
			
			WebUI.verifyElementPresent(application_btn);	//
			WebUI.moveToElement(application_btn);			//
			WebUI.sleep(0.2);								//
			WebUI.verifyElementPresent(list_application1);	//
			WebUI.verifyElementPresent(new_application1);	//
			WebUI.releaseElement(application_btn);			//
			WebUI.sleep(0.2);								//
			WebUI.clickElement(application_btn);			//
			WebUI.clickElement(list_application1);			//
			WebUI.sleep(3);
///*			
			List<String> columnNames_Actual = WebUI.getElementTextsInList(list_ColumnNames);	//
			
			WebUI.verifyListContains(columnNames_Expected, columnNames_Actual);	//
			WebUI.verifyElementPresent(newApplication_Button_ListPage);			//
			
			//Negative scenarios validation for Search box
			WebUI.clearAndFillText(searchBox, "    ");
			WebUI.sleep(0.4);
			WebUI.verifyContains(WebUI.getTextElement(noSearchItem_Element), searchedItemNotFound_Message);
			
			WebUI.clearTextCtrlA(searchBox);
			WebUI.sleep(1);
			WebUI.setText(searchBox, "123456");
			WebUI.sleep(0.4);
			WebUI.verifyContains(WebUI.getTextElement(noSearchItem_Element), searchedItemNotFound_Message);
			
			WebUI.clearTextCtrlA(searchBox);
			WebUI.sleep(1);
			WebUI.setText(searchBox, "1200018250");
			WebUI.sleep(0.4);
			WebUI.verifyContains(WebUI.getTextElement(noSearchItem_Element), searchedItemNotFound_Message);
			
			WebUI.clearTextCtrlA(searchBox);
			WebUI.sleep(1);
			WebUI.setText(searchBox, "Saved");
			WebUI.sleep(0.4);
			WebUI.verifyContains(WebUI.getTextElement(noSearchItem_Element), searchedItemNotFound_Message);
			
			WebUI.clearTextCtrlA(searchBox);
			WebUI.sleep(1);
			
			try {
			int count = 1;
			DriverManager.getDriver().findElement(name_List).isDisplayed();
			
			List<String> proposedNameList = WebUI.getElementTextsInList(name_List);		// Verify through Proposed Names
	
			for(int i=0; i < 6; i++) 
//			for(String name : proposedNameList)											
			{
				String [] fullName = proposedNameList.get(i).split(" ");   //name.split(" ");
				String firstName = fullName[0];
				WebUI.clearAndFillText(searchBox, firstName);
				WebUI.sleep(1);
				WebUI.verifyContains(WebUI.getTextElement(name_List), firstName);		//
				WebUI.verifyElementVisible(actions_EditApplicationButton);				//

				
				if(WebUI.getTextElement(applicationNumber)==null || WebUI.getTextElement(applicationNumber).isEmpty() )
				{
					WebUI.verifyElementVisible(actions_DeleteApplicationButton);		//
					WebUI.sleep(0.5);
					
					if(count==1)														//
					{
						WebUI.clickElement(actions_EditApplicationButton);
						WebUI.sleep(1.5);
						WebUI.verifyElementPresent(step1);
						WebUI.clickElement(step1);
						WebUI.sleep(2);
						
						try {
							DriverManager.getDriver().findElement(impNotice_Popup).isDisplayed();
							WebUI.sleep(0.5);
							WebUI.clickElement(impNotice_Popup);
							
						}catch(Exception ex)
						{
							System.out.println("Notice Popup Did Not Appear. "+ex.getMessage());
						}
						
						WebUI.sleep(1);
						WebUI.clearAndFillText(middleName, "Johhnneyy");
						WebUI.sleep(0.4);
						WebUI.verifyContains(WebUI.getAttributeElement(middleName, "value"), "Johhnneyy");
						
						DriverManager.getDriver().navigate().back();
						WebUI.sleep(0.5);
						DriverManager.getDriver().navigate().back();
						WebUI.sleep(0.5);
						
						WebUI.clickElement(actions_DeleteApplicationButton);	//
						WebUI.sleep(1);
						WebUI.verifyElementVisible(alert_DeleteApplication_Element);	//
						WebUI.verifyElementVisible(alert_DeleteApplication_Delete);		//
						WebUI.verifyElementVisible(alert_DeleteApplication_Cancel);		//
						WebUI.verifyEquals(WebUI.getTextElement(alert_DeleteApplication_Element), alert_DeleteApplication_Message);	//
						WebUI.clickElement(alert_DeleteApplication_Cancel);				
						WebUI.sleep(0.2);
					}
					
				}
				count++;
			}
			
			WebUI.clearTextCtrlA(searchBox);
			WebUI.sleep(1);
			
			List<String> applicationNumList = WebUI.getElementTextsInList(applicationNum_List);		// Verify through Application Numbers
			System.out.println("-------------------->>"+applicationNumList.isEmpty());
			
//			int count2 = 1;
//			for(String applicationNumber : applicationNumList)											
//			{
//				System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+applicationNumber);
//				WebUI.clearAndFillText(searchBox, applicationNumber);
//				WebUI.sleep(0.5);
//				WebUI.verifyContains(applicationNumber, WebUI.getTextElement(applicationNum_List));		//
//				WebUI.verifyElementVisible(actions_EditApplicationButton);								//
//				WebUI.verifyElementNotPresent(actions_DeleteApplicationButton);							//
//				
//				if(count2==1)																			//
//				{
//					WebUI.clickElement(actions_EditApplicationButton);
//					WebUI.sleep(1);
//					WebUI.clickElement(step1);
//					WebUI.sleep(1);
//					WebUI.verifyElementPresent(cannotEditApplication_Element);							//
//					WebUI.verifyContains(WebUI.getTextElement(cannotEditApplication_Element), cannotEditApplication_Message);	//
//					WebUI.verifyElementNotEnabled(middleName);												//
//					
//					DriverManager.getDriver().navigate().back();
//					WebUI.sleep(0.5);
//					DriverManager.getDriver().navigate().back();
//					WebUI.sleep(0.5);
//				}
//				count2++;
//			}
			
			WebUI.clearTextCtrlA(searchBox);
			WebUI.sleep(1);
			
//=======================================================================================
			WebUI.clickElement(proposedNameCol);
			WebUI.sleep(0.2);
			WebUI.clickElement(proposedNameCol);
			WebUI.sleep(0.4);
			
			WebUI.clickElement(planDescriptionCol);
			WebUI.sleep(0.2);
			WebUI.clickElement(planDescriptionCol);
			WebUI.sleep(0.4);
			
			WebUI.clickElement(amountOfInsuranceCol);
			WebUI.sleep(0.2);
			WebUI.clickElement(amountOfInsuranceCol);
			WebUI.sleep(0.4);
			
			WebUI.clickElement(applicationStatusCol);
			WebUI.sleep(0.2);
			WebUI.clickElement(applicationStatusCol);
			WebUI.sleep(0.4);
			
			WebUI.clickElement(expireDateCol);
			WebUI.sleep(0.2);
			WebUI.clickElement(expireDateCol);
			WebUI.sleep(0.4);
			
			WebUI.clickElement(createdDateCol);
			WebUI.sleep(0.2);
			WebUI.clickElement(createdDateCol);
			WebUI.sleep(0.4);
			
			WebUI.clickElement(applicationNumberCol);
			WebUI.sleep(0.3);
			WebUI.clickElement(applicationNumberCol);
			WebUI.sleep(0.4);
			
			}
			catch(Exception ex)
			{
				System.out.println("List not found. "+ex.getMessage());
			}
			
			clickElement(application_btn);
			sleep(1);
			
//*/
//============================================================================================================
			
			clickElement(new_application1);
			sleep(2);

			verifyElementVisible(step1, "Step-1 tab not available");
			clickElement(step1);
			sleep(2);
			
			WebUI.waitForPageLoaded();
			verifyElementVisible(step1InsuredInfo, "Insured Info not displayed");

		}
		
		public void HomePageNewApplication()
		{
			sleep(3);
			clickElement(application_btn);
			sleep(1);
			clickElement(new_application1);
			sleep(2);
		}
		
		public void logout()
		{
			WebUI.sleep(2);
			WebUI.clickElement(profile_Icon);
			WebUI.sleep(1);
			WebUI.clickElement(logout_Button);
			WebUI.sleep(3);
		}
		
		 
		public void Open_PolicyPayment_Module() throws Exception {
	 
			WebUI.waitForPageLoaded();
			sleep(15);
			WebUI.verifyElementPresent(policypaymentBtn);
			WebUI.verifyElementClickable(policypaymentBtn);
			WebUI.clickElement(policypaymentBtn);
			WebUI.sleep(2);
			
		}
	 
	}




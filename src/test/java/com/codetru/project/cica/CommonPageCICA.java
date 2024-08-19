package com.codetru.project.cica;

import com.codetru.pages.NoValidation.HomePage_NV;
import com.codetru.pages.NoValidation.Step_10PageACH;
import com.codetru.pages.NoValidation.Step_10Page_CCR_NV;
import com.codetru.pages.NoValidation.Step_10Page_NV;
import com.codetru.pages.NoValidation.Step_1Page_NV;
import com.codetru.pages.NoValidation.Step_2Page_NV;
import com.codetru.pages.NoValidation.Step_3Page_NV;
import com.codetru.pages.NoValidation.Step_4Page_NV;
import com.codetru.pages.NoValidation.Step_5Page_NV;
import com.codetru.pages.NoValidation.Step_6Page_NV;
import com.codetru.pages.NoValidation.Step_7PageHIPAA_NV;
import com.codetru.pages.NoValidation.Step_7Page_NV;
import com.codetru.pages.NoValidation.Step_8Page_NV;
import com.codetru.pages.NoValidation.Step_9Page_NV;
import com.codetru.project.cica.pages.HomePage;
import com.codetru.project.cica.pages.HomePage2;
import com.codetru.project.cica.pages.LoginPage;
import com.codetru.project.cica.pages.PolicyPaymentModule;
import com.codetru.project.cica.pages.Step_10Page;
import com.codetru.project.cica.pages.Step_10PagePaymentModule;
import com.codetru.project.cica.pages.Step_1Page;
import com.codetru.project.cica.pages.Step_2Page;
import com.codetru.project.cica.pages.Step_3Page;
import com.codetru.project.cica.pages.Step_4Page;
import com.codetru.project.cica.pages.Step_4Page2;
import com.codetru.project.cica.pages.Step_5Page;
import com.codetru.project.cica.pages.Step_6Page;
import com.codetru.project.cica.pages.Step_7Page;
import com.codetru.project.cica.pages.Step_7PageHIPAA;
import com.codetru.project.cica.pages.Step_8Page;
import com.codetru.project.cica.pages.Step_9Page;

public class CommonPageCICA {

	private LoginPage loginCICA;
	private HomePage homePage;
	private HomePage2 homePage2;
	private Step_1Page step_1Page;
	private Step_2Page step_2Page;
	private Step_3Page step_3Page;
	private Step_4Page step_4Page;
	private Step_4Page2 step_4Page2;
	private Step_5Page step_5Page;
	private Step_6Page step_6Page;
	private Step_7Page step_7Page;
	private Step_7PageHIPAA step_7PageHIPAA;
	private Step_8Page step_8Page;
	private Step_9Page step_9Page;
	private Step_10Page step_10Page;
	private Step_10PagePaymentModule step_10PagePaymentModule;
	
	//No Validation Classes
	private HomePage_NV homePage_NV;
	private Step_1Page_NV step_1Page_NV;
	private Step_2Page_NV step_2Page_NV;
	private Step_3Page_NV step_3Page_NV;
	private Step_4Page_NV step_4Page_NV;
	private Step_5Page_NV step_5Page_NV;
	private Step_6Page_NV step_6Page_NV;
	private Step_7PageHIPAA_NV step_7PageHIPAA_NV;
	private Step_7Page_NV step_7Page_NV;
	private Step_8Page_NV step_8Page_NV;
	private Step_9Page_NV step_9Page_NV;
	private Step_10Page_NV step_10Page_NV;
	private Step_10PageACH step_10Page_ACH;
	private Step_10Page_CCR_NV Step_10Page_CCR_NV;
	
	public PolicyPaymentModule policypayment;

	public LoginPage getLoginPage() {
		if (loginCICA == null) {
			loginCICA = new LoginPage();
		}
		return loginCICA;
	}
	
	public HomePage getHomePage() {
		if (homePage == null) {
			homePage = new HomePage();
		}
		return homePage;
	}
	public HomePage2 getHomePage2() {
		if (homePage2 == null) {
			homePage2 = new HomePage2();
		}
		return homePage2;
	}

	public Step_1Page getStep_1Page() {
		if (step_1Page == null) {
			step_1Page = new Step_1Page();
		}
		return step_1Page;
	}

	public Step_2Page getStep_2Page() {
		if (step_2Page == null) {
			step_2Page = new Step_2Page();
		}
		return step_2Page;
	}

	public Step_3Page getStep_3Page() {
		if (step_3Page == null) {
			step_3Page = new Step_3Page();
		}
		return step_3Page;
	}

	public Step_4Page getStep_4Page() {
		if (step_4Page == null) {
			step_4Page = new Step_4Page();
		}
		return step_4Page;
	}

	public Step_4Page2 getStep_4Page2() {
		if (step_4Page2 == null) {
			step_4Page2 = new Step_4Page2();
		}
		return step_4Page2;
	}
	
	public Step_5Page getStep_5Page() {
		if (step_5Page == null) {
			step_5Page = new Step_5Page();
		}
		return step_5Page;
	}

	public Step_6Page getStep_6Page() {
		if (step_6Page == null) {
			step_6Page = new Step_6Page();
		}
		return step_6Page;
	}
	
	public Step_7Page getStep_7Page() {
		if (step_7Page == null) {
			step_7Page = new Step_7Page();
		}
		return step_7Page;
	}
	
	public Step_7PageHIPAA getStep_7PageHIPAA() {
		if (step_7PageHIPAA == null) {
			step_7PageHIPAA = new Step_7PageHIPAA();
		}
		return step_7PageHIPAA;
	}
	
	public Step_8Page getStep_8Page() {
		if (step_8Page == null) {
			step_8Page = new Step_8Page();
		}
		return step_8Page;
	}

	public Step_9Page getStep_9Page() {
		if (step_9Page == null) {
			step_9Page = new Step_9Page();
		}
		return step_9Page;
	}
	
	public Step_10Page getStep_10Page() {
		if (step_10Page == null) {
			step_10Page = new Step_10Page();
		}
		return step_10Page;
	}
	public Step_10PagePaymentModule getStep_10PagePaymentModule() {
		if (step_10PagePaymentModule == null) {
			step_10PagePaymentModule = new Step_10PagePaymentModule();
		}
		return step_10PagePaymentModule;
	}
	
	// NO Validation Classes ******************************************************************************
	public HomePage_NV getHomePage_NV() {
		if (homePage_NV == null) {
			homePage_NV = new HomePage_NV();
		}
		return homePage_NV;
	}
	
	public Step_1Page_NV getStep_1Page_NV() {
		if (step_1Page_NV == null) {
			step_1Page_NV = new Step_1Page_NV();
		}
		return step_1Page_NV;
	}

	public Step_2Page_NV getStep_2Page_NV() {
		if (step_2Page_NV == null) {
			step_2Page_NV = new Step_2Page_NV();
		}
		return step_2Page_NV;
	}

	public Step_3Page_NV getStep_3Page_NV() {
		if (step_3Page_NV == null) {
			step_3Page_NV = new Step_3Page_NV();
		}
		return step_3Page_NV;
	}

	public Step_4Page_NV getStep_4Page_NV() {
		if (step_4Page_NV == null) {
			step_4Page_NV = new Step_4Page_NV();
		}
		return step_4Page_NV;
	}
	
	public Step_5Page_NV getStep_5Page_NV() {
		if (step_5Page_NV == null) {
			step_5Page_NV = new Step_5Page_NV();
		}
		return step_5Page_NV;
	}

	public Step_6Page_NV getStep_6Page_NV() {
		if (step_6Page_NV == null) {
			step_6Page_NV = new Step_6Page_NV();
		}
		return step_6Page_NV;
	}
	
	public Step_7PageHIPAA_NV getStep_7PageHIPAA_NV() {
		if (step_7PageHIPAA_NV == null) {
			step_7PageHIPAA_NV = new Step_7PageHIPAA_NV();
		}
		return step_7PageHIPAA_NV;
	}
	
	public Step_7Page_NV getStep_7Page_NV() {
		if (step_7Page_NV == null) {
			step_7Page_NV = new Step_7Page_NV();
		}
		return step_7Page_NV;
	}
	
	public Step_8Page_NV getStep_8Page_NV() {
		if (step_8Page_NV == null) {
			step_8Page_NV = new Step_8Page_NV();
		}
		return step_8Page_NV;
	}

	public Step_9Page_NV getStep_9Page_NV() {
		if (step_9Page_NV == null) {
			step_9Page_NV = new Step_9Page_NV();
		}
		return step_9Page_NV;
	}
	
	public Step_10Page_NV getStep_10Page_NV() {
		if (step_10Page_NV == null) {
			step_10Page_NV = new Step_10Page_NV();
		}
		return step_10Page_NV;
	}
	
	public Step_10PageACH getStep_10PageACH() {
		if (step_10Page_ACH == null) {
			step_10Page_ACH = new Step_10PageACH();
		}
		return step_10Page_ACH;
	}
	
	public PolicyPaymentModule getPolicyPaymentModule() {
			if (policypayment == null) {
				policypayment = new PolicyPaymentModule();
			}
			return policypayment;
		}
	


}

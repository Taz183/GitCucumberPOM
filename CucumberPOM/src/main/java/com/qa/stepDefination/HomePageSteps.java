package com.qa.stepDefination;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.BasePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class HomePageSteps extends BasePage{

	LoginPage loginPage = new LoginPage();
	HomePage homePage = new HomePage();
	
	@Given("^user opens browser$")
	public void user_opens_browser() {
		BasePage.initilization();
	}

	@Then("^user is on login page$")
	public void user_is_on_login_page() {
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals("CRM for any business", title);
	}
	
	@Then("^user logs into app$")
	public void user_logs_into_app() {
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Then ("^validate home page title$")
	public void validate_home_page_title() {
		String homeTitle = homePage.verifyHomePageTitle();
		Assert.assertEquals("CRM HomePage", homeTitle);
	}
	
}

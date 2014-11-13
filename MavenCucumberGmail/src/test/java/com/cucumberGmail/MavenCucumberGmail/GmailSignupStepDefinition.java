/*
<author>Dilip Shrikhande</author>
<email>dilip_gem@yahoo.com</email>
<date>13-Nov-2014</date>
<summary>Step Definition Class</summary>

<Description>  This is a Step Definition class. Feature file calls this class to check
available methods and runs then in the order set in the feature files Given,When,And,Then conditions
</Description>

 */

package com.cucumberGmail.MavenCucumberGmail;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Rule;
import org.junit.rules.ErrorCollector;
import org.openqa.selenium.WebDriver;

import com.cucumberGmail.MavenCucumberGmail.AbstractBaseClass;
import com.cucumberGmail.MavenCucumberGmail.PageObjects.LoginPage;
import com.cucumberGmail.MavenCucumberGmail.PageObjects.SignupPage;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GmailSignupStepDefinition extends AbstractBaseClass {

	WebDriver driver = getDriver();
	// @Rule
	// public ErrorCollector collector = new ErrorCollector();

	private String missingFieldMsg;

	@Given("^I am on Gmail Loginpage$")
	public void navigateToGmailLoginpage() throws Throwable {
		driver.get("http://gmail.com");

	}

	@When("^I click on the Signup page$")
	public void clickOnSignupLink() throws Throwable {
		LoginPage loginpage = new LoginPage();
		loginpage.link_SignUp(driver).click();

	}

	@When("^I click on the Next button without entering mandatory fields$")
	public void enterUserData(DataTable table) throws Throwable {

		List<List<String>> data = table.raw();

		SignupPage signuppage = new SignupPage();
		signuppage.txtbx_FirstName(driver).sendKeys(data.get(1).get(1));
		signuppage.txtbx_LastName(driver).sendKeys(data.get(2).get(1));

		signuppage.chkbox_TermsOfService(driver).click();
		signuppage.button_NextStep(driver).click();

	}

	@Then("^It should display an appropriate error message$")
	public void validateError() throws Throwable {
		SignupPage signuppage = new SignupPage();

		// try{

		missingFieldMsg = signuppage.errormsg_UserName(driver).getText();
		assertEquals("Error Message is incorrect",
				"You can't leave this empty.", missingFieldMsg);

	}

	/*
	 * } catch (Throwable t){ collector.addError(t);
	 * System.out.println("Error:"+t); }
	 * 
	 * 
	 * }
	 */

}
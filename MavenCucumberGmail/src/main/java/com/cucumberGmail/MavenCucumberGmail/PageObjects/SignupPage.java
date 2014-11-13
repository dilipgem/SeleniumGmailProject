/*
<author>Dilip Shrikhande</author>
<email>dilip_gem@yahoo.com</email>
<date>13-Nov-2014</date>
<summary>Contains page objects for the Signup Page</summary>

<Description>  This class has a list of objects on Signup page. This class takes Driver as an input parameter for each of the objects 
on the Login Page and identifies them based on id,xpath, css etc and returns the objects in the form of element.
</Description>

*/

package com.cucumberGmail.MavenCucumberGmail.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignupPage {
	public WebElement element = null;

	public WebElement txtbx_FirstName(WebDriver driver) {
		element = driver.findElement(By.id("FirstName"));
		return element;

	}
	
	public WebElement txtbx_LastName(WebDriver driver) {
		element = driver.findElement(By.id("LastName"));
		return element;

	}
	
	public WebElement txtbx_UserName(WebDriver driver) {
		element = driver.findElement(By.id("GmailAddress"));
		return element;

	}
	
	public WebElement txtbx_Password(WebDriver driver) {
		element = driver.findElement(By.id("Passwd"));
		return element;

	}
	
	public WebElement txtbx_ConfirmPassword(WebDriver driver) {
		element = driver.findElement(By.id("PasswdAgain"));
		return element;

	}
	
	public WebElement list_BirthMonth(WebDriver driver) {
		element = driver.findElement(By.id("HiddenBirthMonth"));
		return element;

	}
	
	public WebElement text_BirthDay(WebDriver driver) {
		element = driver.findElement(By.id("birthday-placeholder"));
		return element;

	}
	
	public WebElement text_BirthYear(WebDriver driver) {
		element = driver.findElement(By.id("birthday-yearplaceholder"));
		return element;

	}
	
	public WebElement text_Phone(WebDriver driver) {
		element = driver.findElement(By.id("RecoveryPhoneNumber"));
		return element;

	}
	
	public WebElement text_email(WebDriver driver) {
		element = driver.findElement(By.id("RecoveryEmailAddress"));
		return element;

	}
	
	public WebElement button_NextStep(WebDriver driver) {
		element = driver.findElement(By.id("submitbutton"));
		return element;

	}
	
	public WebElement errormsg_UserName(WebDriver driver) {
		element = driver.findElement(By.id("errormsg_0_GmailAddress"));
		return element;

	}
	
	public WebElement chkbox_TermsOfService(WebDriver driver) {
		element = driver.findElement(By.id("TermsOfService"));
		return element;

	}
}


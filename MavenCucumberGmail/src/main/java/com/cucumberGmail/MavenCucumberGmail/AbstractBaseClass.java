/*
<author>Dilip Shrikhande</author>
<email>dilip_gem@yahoo.com</email>
<date>13-Nov-2014</date>
<summary>Contains a base, abstract class for an GmailSignupStepDefinition</summary>

<Description> This class checks existence of a WebDriver object & creates it if not already found. It sets the driver to the 
required browser (Firefox Browser in this case). </Description>

*/
package com.cucumberGmail.MavenCucumberGmail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class AbstractBaseClass {
	protected static WebDriver driver;

	protected WebDriver getDriver() {
		if (driver == null) {
			driver = new FirefoxDriver();
		}

		return driver;
	}

}

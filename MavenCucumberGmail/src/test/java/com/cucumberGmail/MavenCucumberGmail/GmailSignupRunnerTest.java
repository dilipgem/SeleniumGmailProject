/*
<author>Dilip Shrikhande</author>
<email>dilip_gem@yahoo.com</email>
<date>13-Nov-2014</date>
<summary>Runner Class</summary>

<Description>  This is a Runner class. Here were define which features to run and what type of 
reports to generate</Description>

 */

package com.cucumberGmail.MavenCucumberGmail;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(format = { "pretty", "json:target/json/cucumber.json",
		"html:target/html/cucumber.html" }, features = { "src/test/resource/" })
public class GmailSignupRunnerTest {

}

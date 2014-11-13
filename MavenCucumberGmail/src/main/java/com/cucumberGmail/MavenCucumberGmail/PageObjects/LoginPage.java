/*
<author>Dilip Shrikhande</author>
<email>dilip_gem@yahoo.com</email>
<date>13-Nov-2014</date>
<summary>Contains page objects for the Login Page</summary>

<Description>  This class has a list of objects on Login page. This class takes Driver as an input parameter for each of the objects 
on the Login Page and identifies them based on id,xpath, css etc and returns the objects in the form of element.
</Description>

*/

package com.cucumberGmail.MavenCucumberGmail.PageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
public  WebElement element = null;
	

	public  WebElement txtbx_UserName(WebDriver driver){
		element = driver.findElement(By.id("Email"));
		return element;
		
	}
	public  WebElement txtbx_Password(WebDriver driver){
		element = driver.findElement(By.id("Passwd"));
		return element;
		
	}
	
	public  WebElement btn_Login(WebDriver driver){
		element = driver.findElement(By.id("signIn"));
		return element;
		
	}
	
	public  WebElement error_msg(WebDriver driver){
		element = driver.findElement(By.id("errormsg_0_Passwd"));
		return element;
	}
	
	public  WebElement link_SignUp(WebDriver driver){
		element = driver.findElement(By.id("link-signup"));
		return element;
	}
}


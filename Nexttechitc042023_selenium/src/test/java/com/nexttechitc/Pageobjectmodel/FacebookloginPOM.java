package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookloginPOM {

	
	WebDriver driver;
	 public  FacebookloginPOM (WebDriver driver) {
		   this.driver=driver;
		   PageFactory.initElements(driver, this);
	 }
	 //web elements for email 
	 @FindBy(name="email")
	 
	 WebElement Type_emailaddress;
	 
	 public WebElement Fblogin_email() {
		 return Type_emailaddress;
	 }
	 //web element for password
	 @FindBy(id="pass")
	 
	 WebElement Type_password;
	 
	 public WebElement Fblogin_password() {
		 return Type_password;
	 }
	 //web element for click login bottom
	 @FindBy(name="login")
	 
	 WebElement click_login;
	 
	 public WebElement Fblogin_bottom() {
		 return click_login;
	 }
}

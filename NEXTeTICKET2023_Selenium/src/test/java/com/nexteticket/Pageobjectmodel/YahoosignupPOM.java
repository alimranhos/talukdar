package com.nexteticket.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YahoosignupPOM {

	WebDriver driver;
	public YahoosignupPOM (WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="usernamereg-firstName")
	WebElement type_firstname;	
	public WebElement firstname() {
		return type_firstname;
	}
	
	@FindBy(name="lastName")
	WebElement type_surname;	
	public WebElement surname() {
		return type_surname;
	}
	
	@FindBy(name="userId")
	WebElement type_email;	
	public WebElement emailadress() {
		return type_email;
	}
	
	@FindBy(name="password")
	WebElement type_password;	
	public WebElement password() {
		return type_password;
	}
	
	@FindBy(id="usernamereg-month")
	public WebElement click_month;
	
	@FindBy(name="dd")
	public WebElement type_day;
	
	@FindBy(name="yyyy")
	public WebElement type_year;
	
	@FindBy(name="signup")
	WebElement click_continue;	
	public WebElement clickcontinue() {
		return click_continue;
	}
	
	
}

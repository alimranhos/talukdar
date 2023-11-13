package com.nexteticket.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class learnmorebuttonPOM {

	WebDriver driver;
	public learnmorebuttonPOM (WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}	
	
	@FindBy(xpath="/html/body/div[1]/section/div/div[3]/div/div/div/div/div/a")
	WebElement click_learnmorebutton;
	public WebElement learnmorebutton() {
		return click_learnmorebutton;
	}
	
}

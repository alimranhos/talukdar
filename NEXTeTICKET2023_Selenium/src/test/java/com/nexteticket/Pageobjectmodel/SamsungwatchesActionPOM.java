package com.nexteticket.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SamsungwatchesActionPOM {

	WebDriver driver;
	public SamsungwatchesActionPOM(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"component-id\"]/div[1]/div[5]/ul[1]/li[2]/button")
	WebElement mobile;
	public WebElement option_mobile() {
	return mobile;
	}

	@FindBy(xpath="//a[@an-la=\"mobile:watches\"]")
	WebElement watches;
	public WebElement click_watches() {
	return watches;	
	}
}

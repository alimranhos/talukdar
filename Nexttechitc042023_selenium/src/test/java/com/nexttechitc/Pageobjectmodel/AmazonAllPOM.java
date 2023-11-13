package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonAllPOM {

	WebDriver driver;
	 public  AmazonAllPOM (WebDriver driver) {
		   this.driver=driver;
		   PageFactory.initElements(driver, this);
		   }
	
	
	@FindBy(id="searchDropdownBox")
	
	WebElement click_All;
	public WebElement All() {
		return click_All;
	}
	@FindBy(id="searchDropdownBox")
	public WebElement click_alldepartments;
	
	@FindBy(id="searchDropdownBox")
	public WebElement click_alexaskills;
	
	@FindBy(id="searchDropdownBox")
	public WebElement click_amazondevices;
	
}

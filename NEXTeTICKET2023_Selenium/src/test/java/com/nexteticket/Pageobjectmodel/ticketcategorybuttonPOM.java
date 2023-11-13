package com.nexteticket.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ticketcategorybuttonPOM {

	
	WebDriver driver;
	public ticketcategorybuttonPOM (WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"price\"]/div/div[1]/div/div/div/div/a")
	WebElement click_earlybirdbuyticket;
	public WebElement earlybirdbuyticket() {
		return click_earlybirdbuyticket;
	}
	
	@FindBy(xpath="//*[@id=\"price\"]/div/div[2]/div/div/div/div/a")
	WebElement click_regular;
	public WebElement regular() {
	return click_regular;
		}
	@FindBy(xpath="//*[@id=\"price\"]/div/div[3]/div/div/div/div/a")
	WebElement click_platinum;
	public WebElement platinum() {
		return click_platinum;
	}
}

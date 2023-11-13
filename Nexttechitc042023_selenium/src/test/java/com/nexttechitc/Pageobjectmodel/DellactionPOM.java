package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DellactionPOM {

	WebDriver driver;
	public DellactionPOM (WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);

	}

	@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[4]/button/span")
	WebElement service;

	public WebElement nav_service() {
	return service;
	}

	@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[4]/ul/li[3]/a")
	WebElement All_service;

	public WebElement nav_Allservice() {
	return All_service;
	}
	@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[2]/button/span")
	WebElement IT_infrastructure;

	public WebElement nav_ITinfrastructure() {
	return IT_infrastructure;
	}
	@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[2]/ul/li[8]/a")
	WebElement Devops;

	public WebElement nav_Devops() {
	return Devops;
	}
	@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[4]/ul/li[4]/a")
	WebElement security;

	public WebElement nav_securityservice() {
	return security;
	}
	@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[5]/button/span")
	WebElement support;

	public WebElement nav_support() {
	return support;
	}

	@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[5]/ul/li[3]/a")
	WebElement support_home;

	public WebElement nav_supporthome() {
	return support_home;
	}
	
	@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[3]/a")
	
	WebElement services;

	public WebElement nav_services() {
	return services;
	}
	@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[6]/button/span")
	WebElement featured;

	public WebElement nav_featured() {
	return featured;
	}
	@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[6]/ul/li[3]/a")
	WebElement clearence;

	public WebElement nav_clearence() {
	return clearence;
	}

}

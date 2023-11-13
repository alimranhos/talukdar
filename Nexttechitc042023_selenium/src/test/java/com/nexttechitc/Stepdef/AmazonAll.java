package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.nexttechitc.Pageobjectmodel.AmazonAllPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmazonAll {

	WebDriver driver;
	
	@Given("^user visits amazon homepage$")
	public void user_visits_amazon_homepage() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com.au/");
	   
	}

	@When("^user go to search in all and click all options$")
	public void user_go_to_search_in_all_and_click_all_options() throws Throwable {
	   
		AmazonAllPOM obj=new AmazonAllPOM(driver);
		obj.All().click();
		obj.click_alexaskills.clear();
	}

	@Then("^user select dropdown all departments and dropdown alexa skills and amazon devices$")
	public void user_select_dropdown_all_departments_and_dropdown_alexa_skills_and_amazon_devices() throws Throwable {
	   
		AmazonAllPOM obj=new AmazonAllPOM(driver);
		Select dropdown=new Select(obj.click_alldepartments);
		dropdown.selectByVisibleText("All Departments");
		
		Select dropdown1=new Select(obj.click_alexaskills);
		dropdown1.selectByVisibleText("Alexa Skills");
		
		Select dropdown2=new Select(obj.click_amazondevices);
		dropdown2.selectByVisibleText("Amazon Devices");
	}
}

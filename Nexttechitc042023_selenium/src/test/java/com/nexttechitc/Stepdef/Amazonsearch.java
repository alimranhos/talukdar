package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechitc.Pageobjectmodel.AmazonsearchPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Amazonsearch {
    
	WebDriver driver;
    
	@Given("^user visit amazon homepage$")
	public void user_visit_amazon_homepage() throws Throwable {
		
		//How to open the browser
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		//How to open URL
		driver.get("https://www.amazon.com/");
	    
	}

	@When("^user type \"([^\"]*)\" and click search icon$")
	public void user_type_and_click_search_icon(String arg1) throws Throwable {
	    
	
 
	//create the object of pom class
		
	AmazonsearchPOM obj=new AmazonsearchPOM(driver);
	obj.Amazonsearch().sendKeys(arg1);
	obj.searchicon().click();
	}
	
	@Then("^user should able to see the expected product$")
	public void user_should_able_to_see_the_expected_product() throws Throwable {
	   
		//how to close window
		driver.quit();
	}

	
	
	
	
}

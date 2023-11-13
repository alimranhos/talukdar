package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechitc.Pageobjectmodel.FacebookloginPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Facebooklogin {

	WebDriver driver;
	
	@Given("^users visit facebook homepage$")
	public void users_visit_facebook_homepage() throws Throwable {
	  
		//How to open the browser
				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win32\\chromedriver.exe");
				driver = new ChromeDriver();
				
				//How to open URL
				driver.get("https://www.facebook.com/");	
	}

	@When("^users type \"([^\"]*)\" and \"([^\"]*)\" and click login$")
	public void users_type_and_and_click_login(String arg1, String arg2) throws Throwable {
	    
		//create the object of POM
		FacebookloginPOM obj=new FacebookloginPOM(driver);
		obj.Fblogin_email().sendKeys(arg1);
		obj.Fblogin_password().sendKeys(arg2);
		obj.Fblogin_bottom().click();
	    }

	@Then("^users should be able to login facebook$")
	public void users_should_be_able_to_login_facebook() throws Throwable {
	    
		//how to quit window
		driver.quit();
	}

}

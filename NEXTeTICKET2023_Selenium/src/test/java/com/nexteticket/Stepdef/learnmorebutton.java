package com.nexteticket.Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexteticket.Pageobjectmodel.learnmorebuttonPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class learnmorebutton {

	WebDriver driver;
	
	@Given("^User visits nexteticket homepage$")
	public void user_visits_nexteticket_homepage() throws Throwable {
	   try {
		//how to open the browser 
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		 //how to open URL
		driver.get("https://nexteticket.com/");
		driver.manage().window().maximize();
		//Thread.sleep(2000);
	   }
		catch(Exception e) {
			System.out.println("Browser not opening");
		}
	}

	@When("^User click learn more button$")
	public void user_click_learn_more_button() throws Throwable {
	   
		try {
		
		learnmorebuttonPOM obj=new learnmorebuttonPOM(driver);
		obj.learnmorebutton().click();
		WebDriverWait wait=new WebDriverWait(driver,30);
		
		}
		catch(Exception e) {
			System.out.println("element not found");
			
		}
		
	}

	@Then("^User able to see event details$")
	public void user_able_to_see_event_details() throws Throwable {
	    
	}
}

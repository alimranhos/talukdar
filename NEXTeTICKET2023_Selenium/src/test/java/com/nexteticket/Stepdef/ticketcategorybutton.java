package com.nexteticket.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexteticket.Pageobjectmodel.ticketcategorybuttonPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ticketcategorybutton {

	
	WebDriver driver;

@Given("^User goes to nexteticket homepage$")
public void user_goes_to_nexteticket_homepage() throws Throwable {
    
	//how to open the browser 
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver.exe");
	driver = new ChromeDriver();
	
	 //how to open URL
	driver.get("https://nexteticket.com/");
	driver.manage().window().maximize();
	//Thread.sleep(2000);
	
	
}

@When("^User click on EARLY BIRD buy ticket and REGULAR buy ticket and PLATINUM buy ticket$")
public void user_click_on_EARLY_BIRD_buy_ticket_and_REGULAR_buy_ticket_and_PLATINUM_buy_ticket() throws Throwable {
    
 
	ticketcategorybuttonPOM obj=new ticketcategorybuttonPOM(driver);
	obj.earlybirdbuyticket().click();
	
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	
	Thread.sleep(2000);
	obj.regular().click();
	Thread.sleep(2000);
	
	driver.navigate().back();
	obj.platinum().click();
}

@Then("^User is able to see schedule multi speaker page$")
public void user_is_able_to_see_schedule_multi_speaker_page() throws Throwable {
    
}
}

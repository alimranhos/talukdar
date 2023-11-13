package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.nexttechitc.Pageobjectmodel.DellactionPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Dellaction {

	
	WebDriver driver;
	
	@Given("^user visits Dell homepage$")
	public void user_visits_Dell_homepage() throws Throwable {
	  
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win32\\chromedriver.exe");
		driver = new ChromeDriver();

		// how to open the url..
		driver.get("https://www.dell.com/en-au");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		}
	

	@When("^user go to service menu and click on View All service$")
	public void user_go_to_service_menu_and_click_on_View_All_service() throws Throwable {
	    
		Actions act= new Actions(driver);
		DellactionPOM obj = new DellactionPOM(driver);
		
		act.moveToElement(obj.nav_service()).build().perform();
		Thread.sleep(2000);
		obj.nav_Allservice().click();
		
		Thread.sleep(2000);
		act.moveToElement(obj.nav_ITinfrastructure()).build().perform();
		obj.nav_Devops().click();
		
		Thread.sleep(2000);
		act.moveToElement(obj.nav_service()).build().perform();
		obj.nav_securityservice().click();
		
		Thread.sleep(2000);
		act.moveToElement(obj.nav_support()).build().perform();
		obj.nav_supporthome().click();
		obj.nav_services().click();
		
		Thread.sleep(2000);
		act.moveToElement(obj.nav_featured()).build().perform();
		obj.nav_clearence().click();
		
	}

	@Then("^user redirects to view all service page$")
	public void user_redirects_to_view_all_service_page() throws Throwable {
	    
	}
}

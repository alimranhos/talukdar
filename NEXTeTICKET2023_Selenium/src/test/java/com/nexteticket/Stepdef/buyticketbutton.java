package com.nexteticket.Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexteticket.Pageobjectmodel.buyticketbuttonPOM;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class buyticketbutton {

	WebDriver driver;
	
	@Given("^User visit nexteticket homepage$")
	public void user_visit_nexteticket_homepage() throws Throwable {
	    
		try {
		//how to open the browser 
				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win32\\chromedriver.exe");
				driver = new ChromeDriver();
				
				driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				
				 //how to open URL
				driver.get("https://nexteticket.com/");
				driver.manage().window().maximize();
			
	}
		catch(Exception e){
			System.out.println("Browser not opening");
			}
		}

	@When("^User clicks Buy Ticket$")
	public void user_clicks_Buy_Ticket() throws Throwable {
	   
		try {
		
		buyticketbuttonPOM obj=new buyticketbuttonPOM(driver);
		obj.buyticketbutton().click();
		Thread.sleep(2000);
		
		obj.earlybirdbuyticket().click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(3000);
		
		//Thread.sleep(2000);
		obj.regular().click();
		driver.navigate().back();
		Thread.sleep(3000);
		
		obj.platinum().click();
		
		WebDriverWait wait=new WebDriverWait (driver,30);
		}
		
		catch(Exception e){
			System.out.println("Element not found");
		}
	
	}

	@Then("^User is able to see ticket catagory like  EARLY BIRD , REGULAR, PLATINUM$")
	public void user_is_able_to_see_ticket_catagory_like_EARLY_BIRD_REGULAR_PLATINUM() throws Throwable {
	   
	}
}

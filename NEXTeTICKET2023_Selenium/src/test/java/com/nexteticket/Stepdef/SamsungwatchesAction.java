package com.nexteticket.Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexteticket.Pageobjectmodel.SamsungwatchesActionPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SamsungwatchesAction {

	WebDriver driver;
	
	@Given("^User visits Samsung homepage$")
	public void user_visits_Samsung_homepage() throws Throwable {
	  
		try {
		
		//how to open the browser 
				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win32\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				
				 //how to open URL
				driver.get("https://www.samsung.com/au/");
				driver.manage().window().maximize();
				//Thread.sleep(2000);
		}
		catch(Exception e) {
			System.out.println("Browser not opening");
		}
		
	}

	@When("^User goes to mobile and click on watches$")
	public void user_goes_to_mobile_and_click_on_watches() throws Throwable {
	    
		try {
		
		Actions act= new Actions(driver);
		SamsungwatchesActionPOM obj=new SamsungwatchesActionPOM(driver);
		act.moveToElement(obj.option_mobile()).build().perform();
		Thread.sleep(2000);
		obj.click_watches().click();
		
		WebDriverWait wait=new WebDriverWait(driver,30);
		}
		catch(Exception e) {
			System.out.println("Element not found");
		}
	}

	@Then("^User able to see the all Watches$")
	public void user_able_to_see_the_all_Watches() throws Throwable {
	    
	}


}

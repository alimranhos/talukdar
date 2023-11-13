package com.nexteticket.Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexteticket.Pageobjectmodel.ticketinfoPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ticketinfo {

	WebDriver driver;
	@Given("^Users visit nexteticket homepage$")
	public void users_visit_nexteticket_homepage() throws Throwable {
		
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

	@When("^Users scroll down the homepage$")
	public void users_scroll_down_the_homepage() throws Throwable {
	   
		try {
			JavascriptExecutor jsx = (JavascriptExecutor)driver;
		    jsx.executeScript("window.scrollBy(0,7500)");
		    
		    WebDriverWait wait=new WebDriverWait(driver,30);
		}
		catch(Exception e) {
			System.out.println("Element not found");
		}
			
	}

	@Then("^Users able to see the ticket info$")
	public void users_able_to_see_the_ticket_info() throws Throwable {
		try {
		
		ticketinfoPOM obj=new ticketinfoPOM(driver);
		System.out.println(obj.ticket_info.getText());
		
		WebDriverWait wait=new WebDriverWait(driver,30);
		
		}
		
		catch(Exception e) {
			System.out.println("Element not found one");
			}
		
	}
}


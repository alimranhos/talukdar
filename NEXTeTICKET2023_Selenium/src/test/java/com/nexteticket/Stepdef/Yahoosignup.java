package com.nexteticket.Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexteticket.Pageobjectmodel.YahoosignupPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Yahoosignup {

	WebDriver driver;
	
	@Given("^Users visit yahoo homepage$")
	public void users_visit_yahoo_homepage() throws Throwable {
	    
		try {
		
		//how to open the browser 
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		 //how to open URL
		driver.get("https://login.yahoo.com/account/create");
		driver.manage().window().maximize();
		}
		catch(Exception e) {
			System.out.println("Browser not opening");
		}
	}


   @When("^Users type \"([^\"]*)\" \"([^\"]*)\" and \"([^\"]*)\" \"([^\"]*)\"$")
   public void users_type_and(String arg1, String arg2, String arg3, String arg4) throws Throwable {
	
	   try {
	   
	   YahoosignupPOM obj=new YahoosignupPOM(driver);
	   obj.firstname().sendKeys(arg1);
	   obj.surname().sendKeys(arg2);
	   obj.emailadress().sendKeys(arg3);
	   obj.password().sendKeys(arg4);
	   
	   WebDriverWait wait=new WebDriverWait(driver,30);
	   }
	   catch(Exception e) {
		   System.out.println("Element not found");
	   }
	   
    }
    


   @Then("^Users select dropdown month and type \"([^\"]*)\" \"([^\"]*)\" and click on continue buttom$")
   public void users_select_dropdown_month_and_type_and_click_on_continue_buttom(String arg1, String arg2) throws Throwable {
       
	   try {
	   
	   YahoosignupPOM obj=new YahoosignupPOM(driver);
	   Select dropdown=new Select (obj.click_month);
	   dropdown.selectByIndex(5);
	   obj.type_day.sendKeys(arg1);
	   obj.type_year.sendKeys(arg2);
	   obj.clickcontinue().click();
	    
	   WebDriverWait wait=new WebDriverWait(driver,30);
	   }
	   catch(Exception e) {}
	   System.out.println("Element not found one");
	}


}

package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import AppElements.Login_PageObjects;
import AppUtilities.BrowserDriver;
import AppUtilities.Property_Loader;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_Service {
	
	
	static WebDriver driver;
	static BrowserDriver browser = new BrowserDriver();
	static Property_Loader prop = new Property_Loader();
	static Login_PageObjects loginpage;
	
	@BeforeStep
	public void stepsuite() {
		loginpage = PageFactory.initElements(driver, Login_PageObjects.class);
	}
	
	
	@Given("user start home page")
	public void user_start_home_page() {
	    
		driver = browser.startBrowser(prop.getbrowserType(),prop.geturl());
		
	}
	
	@When("user insert username and password")
	public void user_insert_username_and_password() {
	    
		loginpage.getUsername(prop.getusername()).getPassword(prop.getpassword());
		
	}
	
	@Then("click submit")
	public void click_submit() throws InterruptedException {
	    loginpage.getLoginButton();
		Thread.sleep(5000);
		loginpage.getSignOut();
	}
	
	

	
	
	
	
	@After
	public void CloseDriver() {
		driver.close();
	}
	

	

}

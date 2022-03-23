package WebTest;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import AppElements.WebLogin_Page;
import AppUtilities.BrowserDriver;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class WebOrder_Test {

	static WebDriver driver;
	static BrowserDriver browser = new BrowserDriver();
	static Webproperty_Loader prop = new Webproperty_Loader();
	static WebLogin_Page loginpage;
	
	@BeforeStep
	public void stepsuite() {
		loginpage= PageFactory.initElements(driver, WebLogin_Page.class);
	}
	
	@Given("user start launch")
	public void user_start_launch() {
	   driver = browser.startBrowser(prop.getbrowserType(), prop.geturl());
		
	}
	@When("user insert username and password")
	public void user_insert_username_and_password() {
	   loginpage.getUsername(prop.getusername()).getpassword(prop.getpassword());
	}
	@When("click submit")
	public void click_submit() throws InterruptedException {
	 loginpage.getloginButton();
	 Thread.sleep(5000);
	 loginpage.getselect();
	 loginpage.getdelete();
	}
	@Then("click signout")
	public void click_signout()  {
	   
		loginpage.getsignout();
		
		
	}
	
	
	@After
	public void CloseDriver() {
		driver.close();
	}
	
}

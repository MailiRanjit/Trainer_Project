package Webfiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class webFilesRun {
	
	static WebDriver driver;
	


	

	
	@Given("^User Start home page$")
	public void user_start_home_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	    driver.get("http://www.mycontactform.com");
	}
	@When("^User insert \"(.*)\" and \"(.*)\"$")
	public void user_insert_username_and_password(String username,String password) {
		
		driver.findElement(By.name("user")).sendKeys(username);
		driver.findElement(By.name("pass")).sendKeys(password);
	}
	@When("^User Click Submit button$")
	public void user_click_submit_button() {
	
	driver.findElement(By.name("btnSubmit")).click();
	}
	
	
	
	
	
	@After
	public void CloseDriver() {
		driver.close();
	}
	
	
	
}




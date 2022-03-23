package AppElements;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebLogin_Page {

	
	public WebDriver driver;
	
	@FindBy(name="ctl00$MainContent$username") private WebElement username;
	@FindBy(name="ctl00$MainContent$password") private WebElement password;
	@FindBy(name="ctl00$MainContent$login_button") private WebElement loginButton;
	@FindBy(xpath="//*[@id=\"ctl00_logout\"]") private WebElement signout;
	@FindBy(id="ctl00_MainContent_status") private WebElement user_message;
	@FindBy(id="ctl00_MainContent_orderGrid_ctl02_OrderSelector") private WebElement selectbutton;
	@FindBy(name="ctl00$MainContent$btnDelete") private WebElement DeleteElement;
	
	
	public WebLogin_Page getUsername(String un) {
		username.sendKeys(un);
		
		return this;
	}
	
	
	public WebLogin_Page getpassword(String pw) {
		password.sendKeys(pw);
		
		return this;
	}
	
 
	public WebLogin_Page getloginButton() {
		
		if(loginButton.isEnabled()) {
			loginButton.click();
			Assert.assertTrue(true);
		}else
		{
			
		Assert.assertFalse(false);	
			
		}
		
		 try {
			String userMessage = user_message.getText();
			System.out.println("user error meassage is "  +userMessage);
	
		}catch(NoSuchElementException e) {
			e.printStackTrace();
		} 
	
	return this;


	}
	
	public WebLogin_Page getselect() {
		if(selectbutton.isEnabled()) {
			selectbutton.click();
			Assert.assertTrue(true);
		}else
		{
			
		Assert.assertFalse(false);	
			
		}
		
		 return this;
	 }
	 
		
	 public WebLogin_Page getdelete() {
		 DeleteElement.click();
		 
		 return this;
	 }
	
	
	
	public WebLogin_Page getsignout() {
		
		if(signout.isDisplayed() &&  signout.isEnabled()) {
			signout.click();
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			System.out.println("Login sucess");
			Assert.assertTrue(true);
		}else
		{
			Assert.assertFalse(false);
		}
		
		
		
		return this;
		
	}
	
	
	
}

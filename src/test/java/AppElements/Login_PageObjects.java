package AppElements;

import java.time.Duration;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;




public class Login_PageObjects {
 
public WebDriver driver;
	
	@FindBy(name="user") private WebElement username;
	@FindBy(name="pass") private WebElement password;
	@FindBy(name="btnSubmit") private WebElement loginButton;
	@FindBy(xpath="//*[@id=\"user_bar\"]/ul/li[1]/a") private WebElement signout;
	@FindBy(id="right_col_top_err") private WebElement user_message;
	
	
	
	public Login_PageObjects getUsername(String un) {
		username.sendKeys(un);
		
		return this;
	}
	
	
	public Login_PageObjects getPassword(String pw) {
		password.sendKeys(pw);
		return this;
	}
	
	public Login_PageObjects getLoginButton() {
		
		if(loginButton.isEnabled()) {
			loginButton.click();
			Assert.assertTrue(true);
		}else
		{
			Assert.assertFalse(false);
		}
		
		try {
			
			String userMessage = user_message.getText();
			System.out.println("user_error_message_is  "+userMessage);
			
		}catch(NoSuchElementException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		return this;
	}
	
	
	public Login_PageObjects getSignOut() {
		
		if(signout.isDisplayed() && (signout.isEnabled())) {
			signout.click();
			
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			
			System.out.println("Login success");
			Assert.assertTrue(true);
		}else
		{
			Assert.assertFalse(false);
		}
		
		
		
		
		return this;
	}
	

	
	
	
}

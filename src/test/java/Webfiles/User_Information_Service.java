package Webfiles;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class User_Information_Service {
	
	
	
	@When("user click my user information")
	public void user_click_my_user_information() {
	    System.out.println("click user information");
	}
	
	
	@When("user click add email address")
	public void user_click_add_email_address() {
	   System.out.println("user click add email");
	}
	
	
	@Then("user insert email")
	public void user_insert_email() {
	   
		System.out.println("insert mail");
		
	}
	
	
	@Then("user click add email address button")
	public void user_click_add_email_address_button() {
	    
		System.out.println("click email button");
	}

}

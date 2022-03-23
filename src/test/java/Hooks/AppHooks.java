package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class AppHooks {
	

	@Before("@Test2,@Test3")
	public void startBrowser() {
		System.out.println("Start Chrome Browser");
	}
	
	@Before(order=0)
	public void click_sample_link() {
		System.out.println("click sample");
	}
	
	
	
	
	@After(order=1)
	public void generate_extentReport() {
		System.out.println("Report");
	}
	
	@After("@Test4")
	public void CloseTest() {
		System.out.println("Close Browser");
	}
	

}

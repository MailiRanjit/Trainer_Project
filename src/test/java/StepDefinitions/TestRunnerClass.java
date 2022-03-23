package StepDefinitions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		
		features = {"D:\\Selenium 4.1.2\\MavenProject\\src\\test\\resources\\AppFeatures\\LoginTest.feature"},
		glue = {"StepDefinitions"},
				//plugin = { "pretty", "html:target/cucumber-reports" }
				//plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json"},
				//plugin = { "pretty", "junit:target/cucumber-reports/Cucumber.xml" },
		
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
				monochrome = true,
				publish = true
		
		
		
		//tags = "@Test2 or @Test1"
		
		
		)


public class TestRunnerClass extends AbstractTestNGCucumberTests {
	
	

}

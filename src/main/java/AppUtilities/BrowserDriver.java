package AppUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserDriver {

	static WebDriver driver;
	public WebDriver startBrowser(String Browsertype,String appurl){
		
		if(Browsertype.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if(Browsertype.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		
		driver.get(appurl);
		driver.manage().window().maximize();
		
		return driver;
		
	}
	
	
	
}

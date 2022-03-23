package WebTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Webproperty_Loader {

	public  Properties prop;
	
	public Webproperty_Loader() {
		

		File file = new File("D:\\Selenium 4.1.2\\MavenProject\\src\\test\\resources\\Appfiles\\Weborder.properties");
		
		try {
			
		FileInputStream fis = new FileInputStream(file);
		
		prop = new Properties();
		
		prop.load(fis);
		
	
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}
		
			
	}
	public String getbrowserType() {
		return prop.getProperty("browsertype");
	}
	
	public String geturl() {
		return prop.getProperty("Searchurl");
	}
	public String getusername() {
		return prop.getProperty("username");
	}
	
	public String getpassword() {
		return prop.getProperty("password");
	}
	
	public String getInvalidPasword() {
		return prop.getProperty("invalid_password");
	}
	
	
	
	public String getunelement() {
		return prop.getProperty("unelement");
	}
	
	public String getpwelement() {
		return prop.getProperty("pwelement");
	}
	
	public String getsubmitbutton() {
		return prop.getProperty("submitbutton");
	}
	public String getselectbutton() {
		return prop.getProperty("selectbutton");
	}
	public String getdeleteElement() {
		
		return prop.getProperty("DeleteElement");
	}
	public String getsignoutbutton() {
		return prop.getProperty("signoutbutton");
	}
	
	
	
	
	
}

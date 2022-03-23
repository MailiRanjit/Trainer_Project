package AppUtilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Property_Loader {

	
	
		public  Properties prop;
		
		//Create constructor class 
		
		public Property_Loader() {
			

			File file = new File("D:\\Selenium 4.1.2\\MavenProject\\src\\test\\resources\\Appfiles\\Login.properties");
			
			try {
				
			FileInputStream fis = new FileInputStream(file);
			
			prop = new Properties();
			
			prop.load(fis);
			
		
				
			} catch (IOException e) {
				
				e.printStackTrace();
				
			}
			
				
		}
		
		
		
		//create methods for sql
		public String get_sql_setup() {
			return prop.getProperty("my_sql_setup");
		}
		
		public String get_sql_connection() {
			return prop.getProperty("my_sql_connection");
		}
		
		public String get_sql_username() {
			return prop.getProperty("my_sql_username");
		}
		
		public String get_sql_password() {
			return prop.getProperty("my_sql_password");
		}
		
		public String get_sql_query() {
			return prop.getProperty("my_sql_query");
		}
		
		
		
		
		
		
		
		//Create methods for amazon search
		public String getamazonurl() {
			return prop.getProperty("amazon_url");
		}
		
		public String getsearchelement() {
			return prop.getProperty("search_products_element");
		}
		
		public String getsearchButton() {
			return prop.getProperty("search_button");
		}
		
		
		//create a default method for property
		public String getbrowserType() {
			return prop.getProperty("browsertype");
		}
		
		
		public String geturl() {
			
			return prop.getProperty("Browserurl");
			
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
		
		public String getsubmitelement() {
			return prop.getProperty("submitelement");
		}
		
		
		
		
	
	
}

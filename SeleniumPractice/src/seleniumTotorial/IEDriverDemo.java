package seleniumTotorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class IEDriverDemo {

	public static void main(String[] args) {
	
		String baseURL = "https://www.google.com";
		WebDriver driver;
		
		//System.setProperty("webdriver.ie.driver", "c:\\webdrivers\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.get(baseURL);

	}

}

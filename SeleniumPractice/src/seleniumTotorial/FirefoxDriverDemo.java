package seleniumTotorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverDemo {

	public static void main(String[] args) {
		
	//System.setProperty("webdriver.gecko.driver", "c:\\webdrivers\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	
	driver.get("http://www.google.com");
		

		
		
		

	}

}

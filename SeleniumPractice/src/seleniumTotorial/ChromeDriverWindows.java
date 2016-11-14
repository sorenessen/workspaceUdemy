package seleniumTotorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverWindows {

	public static void main(String[] args) {


		String baseURL = "https://www.google.com";
		WebDriver driver;
		
		//System.setProperty("webdriver.chrome.driver", "c:\\webdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(baseURL);
		

	}

}

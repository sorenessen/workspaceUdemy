package basicweb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DesiredCapabilitiesDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "c:\\webdrivers\\geckodriver.exe");
		WebDriver driver;
		String baseURL = "https://letskodeit.teachable.com/pages/practice";
		DesiredCapabilities caps = DesiredCapabilities.firefox();
		caps.setBrowserName("firefox");
		caps.setPlatform(Platform.WIN10);
		
		driver = new FirefoxDriver(caps);
		driver.manage().window().maximize();
		driver.get(baseURL);

	}

}

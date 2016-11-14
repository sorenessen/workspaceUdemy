package basicweb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class IEIssue {
	/***
	 *1. Even if you have win64, you should use IEDriverServer 32.
	 *2. All protected zone settings should be same (Disabled/Enabled)
	 *3. Zoom level should be 100%(maximize)
	 *4. Use Desired Capabilities class to set IE properties.
	 * @param args
	 */
	public static void main(String[] args) {
		WebDriver driver;
		String baseURL = "https://letskodeit.teachable.com/pages/practice";
		
		DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
		caps.setCapability(InternetExplorerDriver.NATIVE_EVENTS, false);
		caps.setCapability(InternetExplorerDriver.ENABLE_PERSISTENT_HOVERING, false);
		caps.setCapability(InternetExplorerDriver.REQUIRE_WINDOW_FOCUS, false);
		caps.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
		caps.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
		caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		System.setProperty("webdriver.ie.driver", "C:\\webdrivers\\IEDriverServer.exe");
	driver = new InternetExplorerDriver(caps);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseURL);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

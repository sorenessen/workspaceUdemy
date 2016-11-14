package basicweb;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigatingBetweenPages {

	WebDriver driver;
	String baseUrl;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "http://letskodeit.teachable.com/";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();		
	}

	@Test
	public void test() throws InterruptedException {
		driver.get(baseUrl);
		String title = driver.getTitle();
		System.out.println("Title of the page is: " + title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL is: " + currentUrl);
		
		String urlToNavigate = "https://sso.teachable.com/secure/42299/users/sign_in?reset_purchase_session=1";
		driver.navigate().to(urlToNavigate);
		System.out.println("navigating to login page");
		
		currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		System.out.println("navigate back");
		currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		Thread.sleep(2000);
		
		driver.navigate().forward();
		System.out.println("navigate forward");
		currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		System.out.println("navigate back");
		currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		driver.navigate().refresh();
		System.out.println("navigate refresh!");
		driver.get(currentUrl);
		System.out.println("navigate refresh!!");
		
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		
	}
	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}


}

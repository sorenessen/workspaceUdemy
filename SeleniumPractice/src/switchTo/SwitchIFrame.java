package switchTo;



import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchIFrame {
	private WebDriver driver;
	private String baseUrl;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseUrl = "https://letskodeit.teachable.com/pages/practice";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseUrl);
		
	}

	@Test
	public void test() throws InterruptedException {
		Thread.sleep(3000);
		//you can use either ID or name attribute to access .frame(String).
		//driver.switchTo().frame("courses-iframe"); //using iframe ID
		//driver.switchTo().frame("iframe-name");	   //using iframe name
		//or you can use .frame(Int) to use it's index #. Since it's only one IFrame, it's index is '0'
		driver.switchTo().frame(0);
		
		WebElement searchBox = driver.findElement(By.id("search-courses"));
		searchBox.sendKeys("Python");
		//to switch back to the main window use 'switchTo().defaultContent();'
		driver.switchTo().defaultContent();
		Thread.sleep(6000);
		driver.findElement(By.id("name")).sendKeys("Test Successful");
	
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}


}

package usefulMethods;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import usefulMethods.GenericMethods;

public class ElementListDemo {
	private WebDriver driver;
	private String baseUrl;
	private GenericMethods gm;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "https://letskodeit.teachable.com/pages/practice";
		gm = new GenericMethods(driver);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().window().maximize();	
	}
	@Test
	public void testMethod() throws Exception {
		driver.get(baseUrl);
		
		List<WebElement> elementList = gm.getElementList("//input[@type='text']", "xpath");
		
		int size = elementList.size();
		System.out.println("Size of the element list is: " + size);
		
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		//driver.quit();
	}

}

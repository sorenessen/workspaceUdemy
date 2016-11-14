package advancedSeleniumTutorial;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalanderSelection {
	private WebDriver driver;
	private String baseUrl;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseUrl = "http://www.expedia.com";
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

//	@Test
//	public void test1() throws Exception {
//		driver.get(baseUrl);
//		driver.findElement(By.id("tab-flight-tab")).click();
//		WebElement departingField = driver.findElement(By.id("flight-departing"));
//		departingField.click();
//		Thread.sleep(3000);
//		WebElement dateToSelect = driver.findElement(By.xpath("//button[text()='31']"));
//		dateToSelect.click();
//	}
	@Test
	public void test2() throws Exception {
		driver.get(baseUrl);
		driver.findElement(By.id("tab-flight-tab")).click();
		WebElement departingField = driver.findElement(By.id("flight-departing"));
		departingField.click();
		WebElement calMonth = driver.findElement(By.xpath(" //div[@class='datepicker-cal-month'][position()=1]"));
		
		List<WebElement> allValidDates = calMonth.findElements(By.tagName("td"));
		
		Thread.sleep(3000);
		
		for (WebElement date : allValidDates){
			if (date.getText().equals("31")){
				date.click();
				break;
			}
		}
		
	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}



}

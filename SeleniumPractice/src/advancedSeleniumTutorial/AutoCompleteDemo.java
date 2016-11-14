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

public class AutoCompleteDemo {
	private WebDriver driver;
	private String baseUrl;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseUrl = "https://www.southwest.com";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	@Test
	public void autocomplete() throws Exception {
		driver.get(baseUrl);
		String searchingText = "New York/Newark, NJ - EWR";
		String partialText = "New York";
		
		WebElement text = driver.findElement(By.id("air-city-departure"));
		text.sendKeys(partialText);
		
		WebElement element = driver.findElement(By.xpath("//div[@class='js-overlay-container overlay--container ']"));
		List<WebElement> results = element.findElements(By.tagName("li"));
		int size = results.size();
		
		
		
		for (int i = 0; i<size; i++){
			System.out.println(results.get(i).getText());
		}
		System.out.println("The size of the list is: "+size);
		
		Thread.sleep(3000);
		for (WebElement result : results){
			if (result.getText().equals(searchingText)){
				result.click();
			}
		}
	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	
	}



}

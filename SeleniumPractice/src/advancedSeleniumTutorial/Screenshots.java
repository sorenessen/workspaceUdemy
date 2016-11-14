package advancedSeleniumTutorial;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class Screenshots {
	private WebDriver driver;
	private String baseUrl;
	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseUrl = "http://www.expedia.com";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public void testScreenshots() throws Exception {
		driver.get(baseUrl);
		driver.findElement(By.id("tab-flight-tab")).click();
		//find elements
		WebElement flight_origin = driver.findElement(By.id("flight-origin"));
		WebElement flight_destination = driver.findElement(By.id("flight-destination"));
		WebElement departure_date = driver.findElement(By.id("flight-departing"));
		WebElement return_date = driver.findElement(By.id("flight-returning"));
		WebElement search = driver.findElement(By.id("search-button"));	
		//send data to elements
		flight_origin.sendKeys("New York");
		departure_date.sendKeys("11/10/2016");
		//return_date.clear();
		return_date.sendKeys("11/10/2016");
		flight_destination.sendKeys("New York");
		search.click();
	}
	public static String getRandomString(int length){
		StringBuilder sb = new StringBuilder();
		String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		for (int i = 0; i < length; i++){
			int index = (int) Math.random()*characters.length();
			sb.append(characters.charAt(index));
		}
		return sb.toString();
	}
	@After
	public void tearDown() throws Exception {
		String fileName = getRandomString(10)+ ".png";
		String directory = "C:\\Users\\soren\\Desktop\\test\\";
		
		File sourceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourceFile, new File(directory + fileName));
	}

}
